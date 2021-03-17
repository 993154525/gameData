package com.st.test;

import com.st.test.utils.JdbcUtils;

import java.sql.*;

/**
 * @author shaotian
 * @date 2021-03-08 18:35
 */
public class test {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://root:play800@10.0.1.220:3306/play800test?&rewriteBatchedStatements=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false");
            pre = connection.prepareStatement("select id,aid,dsp " +
                    "from adv_click_new_log_? " +
                    "FORCE index(time) where " +
                    "`ip` = ? " +
                    "AND channel != 'default' " +
                    "AND time BETWEEN ? AND ? " +
                    "ORDER BY time desc ");
            String start = "2021-03-04 13:15:58";
            String end = "2021-03-11 13:15:58";
            pre.setInt(1, 3);
            pre.setString(2, "223.104.65.150");
            pre.setString(3, start);
            pre.setString(4, end);
            rs = pre.executeQuery();

            if (rs != null && rs.next()) {
                System.out.println("1");
                System.out.println(rs);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.jdbcClose(rs, pre, connection);
        }

    }

}
