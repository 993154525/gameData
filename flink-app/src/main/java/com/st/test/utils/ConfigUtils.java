package com.st.test.utils;

import java.util.Properties;

/**
 * @author shaotian
 * @date 2021-04-26 18:37
 */
public class ConfigUtils {

    public static Properties initProperties(String input, String groupId, String heartbeat, String sessionTimeOut) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", input);
        properties.put("group.id", groupId);
        properties.put("heartbeat.interval.ms", heartbeat);
        properties.put("session.timeout.ms", sessionTimeOut);
        properties.put("enable.auto.commit", "true");
        properties.put("auto.commit.interval.ms", "30000");
        properties.put("fetch.min.bytes", "1048576");
        properties.put("fetch.max.wait.ms", "6000");
        properties.put("max.partition.fetch.bytes", "2097152");
        properties.put("max.poll.records", "10000");
        return properties;
    }

    public static Properties initProduceProperties(String input) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", input);
        properties.put("batch.size", 163840);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put("acks", "1");
        properties.put("request.timeout.ms", "60000");
        properties.put("compression.type", "lz4");

        return properties;
    }

}
