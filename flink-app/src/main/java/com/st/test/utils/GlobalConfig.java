package com.st.test.utils;

public class GlobalConfig {
    public static final String MYSQL_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public static final int EXECUTOR_NUMBER = 8;

    public static final int POOL_INIT_SIZE = 6;

    public static final int POOL_MAX_SIZE = 8;

    public static final int POOL_STEP_SIZE = 1;

    public static final int POOL_TIME_OUT = 2000;

    public static final int REG_IDFA_LENGTH = 100;

    public static final int REG_OAID_LENGTH = 100;

    public static final int REG_DEVICE_LENGTH = 100;

    public static final int CLICK_DEVICE_LENGTH = 50;

    public static final int LOGIN_IP_LENGTH = 15;

    public static final int LOGIN_LEVEL_LENGTH = 10;

    public static final int LOGIN_DEVICE_BRAND = 50;

    public static final int LOGIN_MODEL_TYPE = 30;

    public static final int LOGIN_DEVICE_NET = 30;

    public static final int SDK_VERSION = 30;

    public static void main(String[] args) {
        String s = "'36', '93659817315832958', 'cx047269898', 'x210309000044027j3', '', 'x210309000044027j3', '', 'cx047269898', '12095231887716', '房映波', 119, '889CD456-D0B9-4FA0-B71D-6DEBFD76C5D4', '124.160.217.124', 'cx', '', 30.00, 'success', '2021-03-20 00:00:00', '2021-03-20', 1, '93659817315832958', 0, 0, 'CNY', ''";
        String[] split = s.split(",");

        for (int i = 0; i < split.length; i++) {
            System.out.print("?" + ",");
        }
        System.out.println(split.length);
    }

}
