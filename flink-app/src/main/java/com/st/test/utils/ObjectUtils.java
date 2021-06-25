package com.st.test.utils;


import com.play800.marketing.models.log.AdvClickNewLog;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcExecutionOptions;
import org.apache.flink.connector.jdbc.JdbcSink;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yanggengwei
 * @date 2020/7/23 11:33
 */
public class ObjectUtils implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(ObjectUtils.class);

    private static final Pattern pattern = Pattern.compile("[\u4e00-\u9fa5]");

    /**
     * 判断字符串是否为空
     *
     * @param value
     * @return
     */
    public static boolean isString(String value) {
        return value == null || value.length() == 0 || "0".equals(value) || "(null)".equalsIgnoreCase(value)
                || "null".equalsIgnoreCase(value) || com.play800.marketing.utils.SqlStore.NO_PRINT.equals(value) || "nil".equalsIgnoreCase(value);
    }

    /**
     * 仅检测字符串是否为空
     *
     * @param value
     * @return
     */
    public static boolean isNull(String value) {
        return value == null || "null".equalsIgnoreCase(value) || "nil".equalsIgnoreCase(value) || "(null)".equalsIgnoreCase(value);
    }

    private static boolean isEmojiCharacter(char codePoint) {
        return codePoint == 0x0 || codePoint == 0x9 || codePoint == 0xA || codePoint == 0xD || codePoint >= 0x20 && codePoint <= 0xD7FF || codePoint >= 0xE000 && codePoint <= 0xFFFD;
    }


    /**
     * 过滤emoji或者其他非文字类型的字符
     *
     * @param source
     * @return
     */
    public static String filterEmoji(String source) {
        if (isString(source)) {
            return source;
        }
        StringBuilder buf = null;
        int len = source.length();
        for (int i = 0; i < len; i++) {
            char codePoint = source.charAt(i);
            if (isEmojiCharacter(codePoint)) {
                if (buf == null) {
                    buf = new StringBuilder(source.length());
                }
                buf.append(codePoint);
            }
        }
        if (buf == null) {
            return "";
        } else {
            if (buf.length() == len) {
                return source;
            } else {
                return buf.toString();
            }
        }
    }

    /**
     * 判断字符串是否包含中文
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Matcher m = pattern.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    /**
     * 字符串是空串或含有中文处理
     *
     * @param value
     * @return
     */
    public static Long isNullOrLength(String value, int length) {
        if (isString(value) || isNumeric(value)) {
            return 0L;
        } else if (value.length() > length) {
            log.info("level,onlineTime,vip长度异常: " + value);
            return Long.parseLong(value.substring(0, length));
        } else {
            return Long.parseLong(value);
        }
    }

    /**
     * 获得MD5值
     *
     * @param str
     * @return
     */
    public static String getMD5String(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            log.info("转md5值错误；" + str);
            return "1234";
        }
    }

    /**
     * 字段处理，如果超出长度截到最大长度前
     * undefined
     *
     * @param str
     * @param length
     * @return
     */
    public static String exceedLength(String str, int length) {
        if (isNull(str)) {
            return "0";
        }
        if (str.length() > length) {
            log.info("数据长度异常:" + str + " " + length);
            return str.substring(0, length);
        }
        return str;
    }

    /**
     * 判断字符串是否为英文
     *
     * @param str
     * @return
     */
    public static boolean isLetterDigitOrChinese(String str) {
        String regex = "^[a-zA-Z\\s]+$";
        return str != null && str.matches(regex);
    }

    /**
     * 传入一个实体，返回该实体所有属性的值
     *
     * @param entity
     * @param ignores 忽略的属性
     * @param <T>
     * @return
     * @throws IllegalAccessException
     */
    public static <T> Object[] getEntityPropertyValue(T entity, String... ignores) {
        List<String> ignoresList = Arrays.asList(ignores);
        Class<?> clazz = entity.getClass();
        if ("org.apache.flink.types.Row".equals(clazz.getName())) {
            try {
                Field field = clazz.getDeclaredField("fields");
                field.setAccessible(true);
                Object o = field.get(entity);
                return (Object[]) o;
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        Field[] fields = clazz.getDeclaredFields();
        List<Object> params = new ArrayList<>();
        for (Field field : fields) {
            if (!ignoresList.contains(field.getName())) {
                try {
                    field.setAccessible(true);
                    Object o = field.get(entity);
                    params.add(o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return params.toArray();
    }

    /**
     * 将数据库查询结果放入某个对象中
     *
     * @param entity
     * @param rs
     * @param <T>
     * @return
     */
    public static <T> void setEntityPropertyValue(T entity, ResultSet rs, List<String> colNames) {
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            if (rs.next()) {
                for (Field field : fields) {
                    String fieldName = restoreData(field.getName()).toLowerCase();
                    if (colNames.contains(fieldName)) {
                        field.setAccessible(true);
                        if ("java.lang.Double".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, Double.parseDouble(ob.toString()));
                        } else if ("java.lang.Long".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, Long.parseLong(ob.toString()));
                        } else if ("java.lang.Integer".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            if ("false".equals(ob.toString())) {
                                field.set(entity, 0);
                            } else if ("true".equals(ob.toString())) {
                                field.set(entity, 1);
                            } else {
                                field.set(entity, Integer.parseInt(ob.toString()));
                            }
                        } else if ("java.lang.Float".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, Float.parseFloat(ob.toString()));
                        } else if ("java.lang.Boolean".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, Boolean.getBoolean(ob.toString()));
                        } else if ("java.lang.String".equalsIgnoreCase(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, ob.toString());
                        } else {
                            Object ob = rs.getObject(fieldName);
                            field.set(entity, ob);
                        }
                    }
                }
            }
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 传入一个实体，返回该实体所有属性的值
     *
     * @param entity
     * @param contains 包含的属性
     * @param <T>
     * @return
     * @throws IllegalAccessException
     */
    public static <T> Object[] getEntityPropertyContains(T entity, String... contains) {
        List<String> ignoresList = Arrays.asList(contains);
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<Object> params = new ArrayList<>();
        for (Field field : fields) {
            if (ignoresList.contains(field.getName())) {
                try {
                    field.setAccessible(true);
                    Object o = field.get(entity);
                    params.add(o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return params.toArray();
    }

    /**
     * pre的注入
     *
     * @param pre
     * @param values
     */
    public static void setPre(PreparedStatement pre, Integer gid, Object... values) {
        try {
            pre.setInt(1, gid);
            for (int i = 1; i <= values.length; i++) {
                pre.setObject(i + 1, values[i - 1]);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * pre的注入
     *
     * @param pre
     * @param values
     */
    public static void setPre(PreparedStatement pre, Object... values) {
        try {
            for (int i = 0; i < values.length; i++) {
                pre.setObject(i + 1, values[i]);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public static String restoreData(String name) {
        char[] toCharArray = name.toCharArray();
        char[] chars = new char[name.length() + 10];

        for (int i = 0, j = 0; i < toCharArray.length; i++, j++) {
            if (toCharArray[i] >= 'A' && toCharArray[i] <= 'Z') {
                chars[j] = '_';
                chars[++j] = toCharArray[i];
            } else {
                chars[j] = toCharArray[i];
            }
        }

        return String.valueOf(chars).trim();
    }


    public static <T> void addSink(String sql, String output, String username, String password, int batchSize, DataStream<T> dataStream, String analysisType, String... ignores) throws Exception {
        dataStream.addSink(JdbcSink.sink(sql, (ps, t) -> {
                    Object[] entityPropertyValue;
                    if ("contains".equals(analysisType)) {
                        entityPropertyValue = ObjectUtils.getEntityPropertyContains(t, ignores);
                    } else {
                        entityPropertyValue = ObjectUtils.getEntityPropertyValue(t, ignores);
                    }
                    for (int i = 0; i < entityPropertyValue.length; i++) {
                        ps.setObject(i + 1, entityPropertyValue[i]);
                    }
                }, JdbcExecutionOptions.builder().withBatchSize(batchSize).withMaxRetries(3).withBatchIntervalMs(60).build(),
                new JdbcConnectionOptions.JdbcConnectionOptionsBuilder()
                        .withUrl(output)
                        .withUsername(username)
                        .withPassword(password)
                        .withDriverName(GlobalConfig.MYSQL_DRIVER_NAME)
                        .build()));
    }


    /**
     * 判断类的类型返回sql
     *
     * @param result
     * @param <T>
     * @return
     */
    public static <T> String objectValidate(T result) {
        if (result.getClass().getGenericSuperclass() instanceof AdvClickNewLog) {
            return com.play800.marketing.utils.SqlStore.INSERT_CLINK_SQL;
        }
        return null;
    }

    /**
     * 增量更新的sql拼接
     *
     * @param fields    插入的字段
     * @param tableName 插入的表名
     * @param keyIgnore 增量更新忽略的主键
     * @return
     */
    public static String getInsertSql(String[] fields, String tableName, String... keyIgnore) {
        StringBuilder fieldBuilder = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        StringBuilder incrementBuilder = new StringBuilder();
        List<String> keyList = Arrays.asList(keyIgnore);
        fieldBuilder.append("insert into ").append(tableName).append("(");
        builder.append("VALUES(");
        incrementBuilder.append("ON DUPLICATE KEY UPDATE ");
        for (int i = 0; i < fields.length; i++) {
            String param = String.format("%s%s%s", "`", fields[i], "`");
            builder.append("?").append(",");
            fieldBuilder.append(param).append(",");
            if (!keyList.contains(fields[i])) {
                incrementBuilder.append(param).append("=").append("VALUES(").append(param).append("),");
            }
        }
        fieldBuilder.deleteCharAt(fieldBuilder.length() - 1).append(") ");
        fieldBuilder.append(builder.deleteCharAt(builder.length() - 1).append(") "))
                .append(incrementBuilder.deleteCharAt(incrementBuilder.length() - 1));

        return fieldBuilder.toString();
    }

    public static void getCreateSql() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i <= 150; i++) {
            String value = String.format("`income_%d` decimal(10, 2) NULL DEFAULT 0.00", i);
            buffer.append(value).append(",").append("\n");
        }
        System.out.println(buffer.toString());
    }

    public static void main(String[] args) throws JsonProcessingException, SQLException {
        String[] fields = new String[]{"period", "game_id", "server_id", "login_user_cnt", "register_cnt", "pay_user_cnt", "income_money", "new_pay_user_cnt", "new_income_money", "keep_1", "keep_3", "keep_7", "f_game_name", "f_channel_name"};
//        getCreateSql();
        System.out.println(getInsertSql(fields, "tp_data_single_server_new", "period", "game_id", "channel_id"));
    }

}
