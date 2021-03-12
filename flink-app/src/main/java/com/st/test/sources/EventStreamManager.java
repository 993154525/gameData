package com.st.test.sources;

import com.st.test.models.UserReg;
import com.st.test.utils.JsonUtils;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.TimeZone;

/**
 * @author shaotian
 * @date 2021-03-09 10:00
 */
public class EventStreamManager {

    public static final String PLAY800_AD_REPORTS = "play800_test";

    public static final String MY_ALI_TOPIC = "reg_r1p2";

    private static final EventStreamManager ourInstance = new EventStreamManager();

    public static EventStreamManager getInstance() {
        return ourInstance;
    }

    private EventStreamManager() {
    }

    public DataStream<UserReg> createRegister(StreamExecutionEnvironment env, Properties consumerProps) {
        FlinkKafkaConsumer<String> consumer = new FlinkKafkaConsumer<>(PLAY800_AD_REPORTS, new SimpleStringSchema(), consumerProps);
        SimpleDateFormat simpleDateDay = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateDay.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        consumer.setStartFromGroupOffsets();

        return env.addSource(consumer).map(value ->{
            UserReg userReg = JsonUtils.fromJson(value, UserReg.class);
            return userReg;
        });
    }

    public FlinkKafkaProducer<String> createKafkaProduceStream(StreamExecutionEnvironment env, Properties consumerProps) {
        FlinkKafkaProducer<String> producer = new FlinkKafkaProducer<>(PLAY800_AD_REPORTS, new SimpleStringSchema(), consumerProps);
        producer.ignoreFailuresAfterTransactionTimeout();


        return producer;
    }

}
