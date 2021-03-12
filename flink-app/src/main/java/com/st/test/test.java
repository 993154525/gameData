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
            pre = connection.prepareStatement("INSERT INTO test_?(id_?) values(?)");
            pre.setInt(1, 1);
            pre.setInt(2, 2);
            pre.setInt(3, 6);
            boolean execute = pre.execute();
            System.out.println(execute);

//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.jdbcClose(rs, pre, connection);
        }

    }

}
