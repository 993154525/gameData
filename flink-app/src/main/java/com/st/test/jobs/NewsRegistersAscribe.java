package com.st.test.jobs;

import com.st.test.models.UserReg;
import com.st.test.sources.EventStreamManager;
import com.st.test.utils.GlobalConfig;
import com.st.test.utils.JdbcUtils;
import com.st.test.utils.ObjectUtils;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcExecutionOptions;
import org.apache.flink.connector.jdbc.JdbcSink;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.sql.*;
import java.util.Properties;

import static com.st.test.utils.GlobalConfig.REG_SQL;

/**
 * @author shaotian
 * @date 2021-03-09 9:55
 */
public class NewsRegistersAscribe {

    public static void main(String[] args) throws Exception {
        ParameterTool params = ParameterTool.fromArgs(args);
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        String jobName = params.get("job-name", "注册归因 -> Mysql");
        String groupId = params.get("group-id", "RegistersAscribe_Production");
        String input = params.get("input", "121.196.46.197:9092");
        String output = params.get("output", "jdbc:mysql://root:play800@10.0.1.220:3306/data_log?&rewriteBatchedStatements=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&connectTimeout=720000&socketTimeout=720000");

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", input);
        properties.setProperty("group.id", groupId);

        EventStreamManager eventStreamManager = EventStreamManager.getInstance();
        DataStream<UserReg> registerStream = eventStreamManager.createRegister(env, properties);

        DataStream<UserReg> registerAscribeStream = registerStream.map(register -> {
            Connection connection = null;
            PreparedStatement pre = null;
            ResultSet resultSet = null;
            try {
                connection = DriverManager.getConnection(output);
                pre = connection.prepareStatement("select id,aid from log_activate_1 where device = ?");
                pre.setString(1, register.getIdfa());
                resultSet = pre.executeQuery();

                if (resultSet.next()) {
                    register.setActivateId(resultSet.getInt(1));
                    register.setExt1(resultSet.getString(2));
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            } finally {
                JdbcUtils.jdbcClose(resultSet, pre, connection);
            }
            return register;
        });

        registerAscribeStream.addSink(JdbcSink.sink(REG_SQL, (ps, t) -> {
                    Object[] entityPropertyValue = ObjectUtils.getEntityPropertyValue(t);
                    for (int i = 0; i < entityPropertyValue.length; i++) {
                        ps.setObject(i + 1, entityPropertyValue[i]);
                    }
                }, JdbcExecutionOptions.builder().withBatchSize(50).withMaxRetries(3).withBatchIntervalMs(60).build(),
                new JdbcConnectionOptions.JdbcConnectionOptionsBuilder()
                        .withUrl(output)
                        .withDriverName(GlobalConfig.MYSQL_DRIVER_NAME)
                        .build()));

        env.execute(jobName);

    }

}
