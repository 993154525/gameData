package com.st.test.utils;


import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author yanggengwei
 * @date 2020/7/23 11:33
 */
public class ObjectUtils implements Serializable {

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
    public static <T> T setEntityPropertyValue(T entity, ResultSet rs, List<String> colNames) {
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            if (rs.next()) {
                for (Field field : fields) {
                    String fieldName = field.getName();
                    if (colNames.contains(fieldName)) {
                        field.setAccessible(true);
                        if ("double".equals(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.setDouble(entity, Double.parseDouble(ob.toString()));
                        } else if ("long".equals(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.setLong(entity, Long.parseLong(ob.toString()));
                        } else if ("int".equals(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.setInt(entity, Integer.parseInt(ob.toString()));
                        } else if ("float".equals(field.getAnnotatedType().getType().getTypeName())) {
                            Object ob = rs.getObject(fieldName);
                            field.setFloat(entity, Float.parseFloat(ob.toString()));
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
        return entity;
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
                incrementBuilder.append(param).append("=").append("VALUES(").append(param).append(") ");
            }
        }
        fieldBuilder.deleteCharAt(fieldBuilder.length() - 1).append(") ");
        fieldBuilder.append(builder.deleteCharAt(builder.length() - 1).append(") "))
            .append(incrementBuilder.deleteCharAt(incrementBuilder.length() - 1));

        return fieldBuilder.toString();
    }

    public static void main(String[] args) {

        List<Object> aList = new ArrayList<>();
        aList.add("20");
        aList.add(7);

        Object[] objects = aList.toArray();

        System.out.println(objects);

    }

}
