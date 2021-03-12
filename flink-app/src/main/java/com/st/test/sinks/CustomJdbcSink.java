package com.st.test.sinks;

import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcExecutionOptions;
import org.apache.flink.connector.jdbc.JdbcStatementBuilder;
import org.apache.flink.connector.jdbc.internal.GenericJdbcSinkFunction;
import org.apache.flink.connector.jdbc.internal.JdbcBatchingOutputFormat;
import org.apache.flink.connector.jdbc.internal.connection.SimpleJdbcConnectionProvider;
import org.apache.flink.connector.jdbc.internal.executor.JdbcBatchStatementExecutor;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.util.Preconditions;

import java.util.function.Function;

/**
 * @author shaotian
 * @date 2021-03-09 10:21
 */
public class CustomJdbcSink {

    public static <T> SinkFunction<T> sink(String sql, JdbcStatementBuilder<T> statementBuilder, JdbcConnectionOptions connectionOptions) {
        return sink(sql, statementBuilder, JdbcExecutionOptions.defaults(), connectionOptions);
    }

    /**
     * Create a JDBC sink.
     * <p>
     * Note: the objects passed to the return sink can be processed in batch and retried.
     * Therefore, objects can not be {@link org.apache.flink.api.common.ExecutionConfig#enableObjectReuse() reused}.
     * </p>
     *
     * @param sql               arbitrary DML query (e.g. insert, update, upsert)
     * @param statementBuilder  sets parameters on {@link java.sql.PreparedStatement} according to the query
     * @param <T>               type of data in {@link org.apache.flink.streaming.runtime.streamrecord.StreamRecord StreamRecord}.
     * @param executionOptions  parameters of execution, such as batch size and maximum retries
     * @param connectionOptions parameters of connection, such as JDBC URL
     */
    public static <T> SinkFunction<T> sink(
            String sql,
            JdbcStatementBuilder<T> statementBuilder,
            JdbcExecutionOptions executionOptions,
            JdbcConnectionOptions connectionOptions) {
        return new GenericJdbcSinkFunction<>(new JdbcBatchingOutputFormat<>(
                new SimpleJdbcConnectionProvider(connectionOptions),
                executionOptions,
                context -> {
                    Preconditions.checkState(!context.getExecutionConfig().isObjectReuseEnabled(),
                            "objects can not be reused with JDBC sink function");
                    return JdbcBatchStatementExecutor.simple(sql, statementBuilder, Function.identity());
                },
                JdbcBatchingOutputFormat.RecordExtractor.identity()
        ));
    }

    private CustomJdbcSink() {
    }

}
