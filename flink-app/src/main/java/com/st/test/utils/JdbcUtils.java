package com.st.test.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggengwei
 * @date 2020/7/23 11:33
 */
public class JdbcUtils {
    private static final Logger logger = LoggerFactory.getLogger(JdbcUtils.class);


    public static List<String> getColNames(ResultSet rs) {
        ArrayList<String> colNames = new ArrayList<>();
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            //获取查询的列数
            int count = rsmd.getColumnCount();
            for (int i = 1; i <= count; i++) {
                colNames.add(rsmd.getColumnLabel(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return colNames;
    }

    public static <T> T getObjectByQuery(T entity, String sql, Connection conn, Object... params) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            rs = pst.executeQuery();
            List<String> colNames = JdbcUtils.getColNames(rs);
            com.play800.marketing.utils.ObjectUtils.setEntityPropertyValue(entity, rs, colNames);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.jdbcClose(rs, pst, null);
        }
        return entity;
    }

    public static Connection getConnection(String input) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(input);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static Connection getConnection(String input, String username, String password) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(input, username, password);
        } catch (SQLException throwables) {
            logger.info("连接异常，地址为：" + input);
            logger.info(throwables.getMessage());
        }
        return conn;
    }

    /**
     * 关闭jdbc相关连接
     *
     * @param rs
     * @param pst
     * @param conn
     */
    public static void jdbcClose(ResultSet rs, PreparedStatement pst, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            logger.warn(se.getMessage());
        }
    }


    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pre = null;
        String sql = "INSERT INTO `play800test`.`pay_types`(`name`, `code`, `sort_weight`, `created_at`, `updated_at`, `status`) " +
                "VALUES (?,?,?,?,?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://root:play800@10.0.1.220:3306/play800test?&rewriteBatchedStatements=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&connectTimeout=720000&socketTimeout=720000");

            pre = conn.prepareStatement(sql);
            pre.setString(1, "NULL");
            pre.setString(2, "1754");
            pre.setInt(3, 22);
            pre.setString(4, "2021-04-01 00:00:00");
            pre.setString(5, "2021-04-01 11:00:00");
            pre.setInt(6, 1);
            System.out.println(pre.execute());
//            ResultSet resultSet = pre.executeQuery();
//            if (resultSet != null && resultSet.next()) {
//                System.out.println(resultSet.getDouble(1));
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcClose(null, pre, conn);
        }

    }
}

