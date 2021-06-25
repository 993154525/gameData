package com.st.test.druid;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {

    private HikariDataSource ds;

    /**
     * 初始化连接池
     *
     * @param minimum
     * @param Maximum
     */
    public void init(int minimum, int Maximum) {
        //连接池配置
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://root:play800@10.0.1.220:3306/play800test?&rewriteBatchedStatements=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&connectTimeout=720000&socketTimeout=720000");
        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 500);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        config.setUsername("shaotian");
        config.setPassword("sHAoTian@plAy800!#");
        config.setConnectionTestQuery("SELECT 1");
        config.setAutoCommit(true);
        //池中最小空闲链接数量
        config.setMinimumIdle(minimum);
        //池中最大链接数量
        config.setMaximumPoolSize(Maximum);

        ds = new HikariDataSource(config);

    }

    /**
     * 销毁连接池
     */
    public void close() {
        ds.close();
    }

    /**
     * 从连接池中获取链接
     *
     * @return
     */
    public Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        DataSource ds = new DataSource();
        ds.init(2, 4);
        Connection conn = ds.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("select * from log_activate_3 limit 100");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet != null && resultSet.next()) {
            System.out.println(resultSet.getString(4));
        }
        //最后关闭链接
        conn.close();
        ds.close();
    }

}
