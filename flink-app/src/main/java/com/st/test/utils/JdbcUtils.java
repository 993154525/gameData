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

    public static <T> T getObjectByQuery(T entity, String sql, String url, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        T richEntity = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url);
            pst = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            rs = pst.executeQuery();
            List<String> colNames = JdbcUtils.getColNames(rs);
            richEntity = ObjectUtils.setEntityPropertyValue(entity, rs, colNames);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.jdbcClose(rs, pst, conn);
        }
        return richEntity;
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
        PreparedStatement pre2 = null;
        try {
//            conn = DriverManager.getConnection("jdbc:mysql://root:kuafugame2018@39.108.210.120:3306/ygwtest?&rewriteBatchedStatements=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false");
            pre = conn.prepareStatement(null);

            pre.setObject(1, "5");
            pre.setObject(2, "16620");
            pre.setObject(3, "2020-08-16 00:00:00.0");
            pre.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcClose(null, pre, conn);
        }

    }
}

