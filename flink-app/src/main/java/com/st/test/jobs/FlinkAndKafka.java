package com.st.test.jobs;

import com.st.test.sources.EventStreamManager;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.util.Properties;

/**
 * @author shaotian
 * @date 2021-03-10 10:04
 */
public class FlinkAndKafka {

    public static void main(String[] args) throws Exception {

        ParameterTool params = ParameterTool.fromArgs(args);
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        String jobName = params.get("job-name", "kafka连接flink测试");
        String groupId = params.get("group-id", "play800_test");
        String input = params.get("input", "172.16.0.135:9092,172.16.0.137:9092,172.16.0.136:9092");
        String output = params.get("output", "172.16.0.135:9092,172.16.0.137:9092,172.16.0.136:9092");

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", input);

        DataStream<String> myInts = env.fromElements("1", "2", "3", " 4", " 5");

        EventStreamManager streamManager = EventStreamManager.getInstance();
        FlinkKafkaProducer<String> kafkaProduceStream = streamManager.createKafkaProduceStream(env, properties);

        myInts.addSink(kafkaProduceStream);

        env.execute();

    }

}
