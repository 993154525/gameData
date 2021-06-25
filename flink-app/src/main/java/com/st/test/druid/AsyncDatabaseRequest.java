package com.st.test.druid;

import com.st.test.models.UserLog;
import com.st.test.utils.JdbcUtils;
import com.st.test.utils.SqlStore;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.async.ResultFuture;
import org.apache.flink.streaming.api.functions.async.RichAsyncFunction;

import java.sql.Connection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class AsyncDatabaseRequest extends RichAsyncFunction<UserLog, UserLog> {

    /**
     * The database specific client that can issue concurrent requests with callbacks
     */
    private transient DataSource dataSource;

    private transient Connection connection;

    @Override
    public void open(Configuration parameters) {
        dataSource = new DataSource();
        dataSource.init(1, 2);
        connection = dataSource.getConnection();
    }

    @Override
    public void close() {
        if (dataSource != null) {
            dataSource.close();
        }
        JdbcUtils.jdbcClose(null, null, connection);
    }

    @Override
    public void asyncInvoke(UserLog input, ResultFuture<UserLog> resultFuture) {
        CompletableFuture.supplyAsync(() -> JdbcUtils.getObjectByQuery(input, SqlStore.SELECT_LOGIN_MATCH_REG,
                connection, input.getUid(), input.getInitAid()))
                .thenAcceptAsync(entity -> {
                    resultFuture.complete(Collections.singleton(entity));
                });
    }

    @Override
    public void timeout(UserLog input, ResultFuture<UserLog> resultFuture) throws Exception {
        System.out.println(input.toString());
    }
}
