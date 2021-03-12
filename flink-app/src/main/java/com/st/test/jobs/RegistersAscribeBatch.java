package com.st.test.jobs;

import com.st.test.utils.GlobalConfig;
import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.typeutils.RowTypeInfo;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.connector.jdbc.JdbcInputFormat;
import org.apache.flink.connector.jdbc.JdbcOutputFormat;
import org.apache.flink.types.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Types;

/**
 * @author shaotian
 * @date 2021-03-09 20:17
 */
public class RegistersAscribeBatch {

    private final Logger log = LoggerFactory.getLogger(RegistersAscribeBatch.class);

    public static void main(String[] args) throws Exception {

        ParameterTool params = ParameterTool.fromArgs(args);
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        String jobName = params.get("job-name", "注册归因 -> Mysql");
        String input = params.get("input", "jdbc:mysql://pc-bp1ud9ri1s3uiw1bb.rwlb.rds.aliyuncs.com:3306/test_data_log?&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false");
        String username = params.get("username", "shaotian");
        String password = params.get("password", "sHAoTian@plAy800!#");

        TypeInformation[] fieldTypes = new TypeInformation[]{
                BasicTypeInfo.STRING_TYPE_INFO,
                BasicTypeInfo.STRING_TYPE_INFO,
                BasicTypeInfo.STRING_TYPE_INFO,
                BasicTypeInfo.STRING_TYPE_INFO,
                BasicTypeInfo.BOOLEAN_TYPE_INFO
        };

        RowTypeInfo rowTypeInfo = new RowTypeInfo(fieldTypes);

        DataSource<Row> rowDataSource = env.createInput(JdbcInputFormat.buildJdbcInputFormat()
                .setDrivername(GlobalConfig.MYSQL_DRIVER_NAME)
                .setDBUrl(input)
                .setPassword(password)
                .setUsername(username)
                .setQuery("select aid,device,time,ip,type from `2428_act_5-26`")
                .setFetchSize(200)
                .setRowTypeInfo(rowTypeInfo)
                .finish());

        int[] sqlTypes = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.BOOLEAN};
        rowDataSource.output(JdbcOutputFormat
                .buildJdbcOutputFormat()
                .setDrivername(GlobalConfig.MYSQL_DRIVER_NAME)
                .setDBUrl(input)
                .setPassword(password)
                .setUsername(username)
                .setSqlTypes(sqlTypes)
                .setQuery("insert into `2428_act_5-26_test`(aid,device,time,ip,type) VALUE(?,?,?,?,?)")
                .setBatchSize(200)
                .finish());

        env.execute(jobName);

    }

}
