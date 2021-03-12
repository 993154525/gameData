package com.st.test.utils;

public class GlobalConfig {
    public static final String MYSQL_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public static final int EXECUTOR_NUMBER = 8;

    public static final int POOL_INIT_SIZE = 6;

    public static final int POOL_MAX_SIZE = 8;

    public static final int POOL_STEP_SIZE = 1;

    public static final int POOL_TIME_OUT = 2000;

    public static final String REG_SQL = "INSERT INTO `user_reg_test` " +
            "(`gid`, `aid`, `sid`, `uid`, `username`, " +
            "`roleid`, `rolename`, `ip`, `idfa`, `oaid`, " +
            "`device_type`, `time`, `mac`, `keyword_id`, " +
            "`ext2`, `activate_id`, `ext1`, `dsp`) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static void main(String[] args) {
        Object o = 3;
        int i = (int) o;
        System.out.println(i);
    }

}
