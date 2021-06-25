package com.st.test.utils;

import org.apache.flink.calcite.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.databind.DeserializationFeature;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author ShaoTian
 * @date 2020/11/14 10:16
 */
public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,
                false);
    }

    public static JsonNode toJsonNode(String value) throws JsonProcessingException {
        return objectMapper.readTree(value);
    }

    public static String toJson(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, clazz);
    }

    public static <T> List<T> fromJsonList(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, objectMapper.getTypeFactory()
                .constructCollectionType(List.class, clazz));
    }

    public static String toJsonOneValue(String value, String str) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(value);

        return jsonNode.get(str).asText();
    }

    public static void main(String[] args) throws JsonProcessingException {
    }


}
