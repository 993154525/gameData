package com.st.test.utils;

import org.apache.commons.lang3.time.DateUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author yanggengwei
 * @date 2020/7/23 11:33
 */
public class TimeUtils {

    public static final SimpleDateFormat MARKET_PARSE_TIME = new SimpleDateFormat("yyyy-MM-dd 00:00:00");

    private static final String TODAY = "today";

    private static final String YESTERDAY = "yesterday";

    private static final Integer ONE_DAY = 24 * 60 * 60 * 1000;

    /**
     * 获取当前日期,格式:2020-07-22
     *
     * @return
     */
    public static String getToday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(new Date());
    }

    public static String getYesterday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(new Date(System.currentTimeMillis() - ONE_DAY));
    }

    /**
     * 获取当前日期,格式:2020-07-22 00:00:00
     *
     * @return
     */
    public static String getTodaySecond() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(new Date());
    }

    /**
     * 获取时间的毫秒数
     * 格式： yyyy-MM-dd HH:mm:ss
     *
     * @param time
     * @return
     */
    public static Long getMilliSecond(String time) {
        return Timestamp.valueOf(time).getTime();
    }

    /**
     * 验证时间是否小于1970年
     *
     * @param time
     * @return
     */
    public static String verifyTime(String time) throws ParseException {
        Long mill = getMilliSecond("1970-01-01 00:00:00");
        Long dayMill = getMilliSecond(TimeUtils.addDay(getToday(), 7) + " 00:00:00");
        Long toMill = getMilliSecond(time);
        if (toMill < mill || toMill > dayMill) {
            return getTodaySecond();
        } else {
            return time;
        }
    }

    public static Boolean diffTimeCheck(String str1, String str2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);

        return date2.getTime() > date1.getTime();
    }

    public static int diffTimeDay(String str1, String str2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        if (com.play800.marketing.utils.ObjectUtils.isString(str2)) {
            str2 = sdf.format(new Date(System.currentTimeMillis() + ONE_DAY));
        }
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);

        return (int) ((date2.getTime() - date1.getTime()) / ONE_DAY);
    }

    public static String addDay(String value, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Date date = sdf.parse(value);

        return sdf.format(DateUtils.addDays(date, i));
    }

    public static String diffDay(String value, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Date date = sdf.parse(value);

        return sdf.format(date.getTime() - (long) ONE_DAY * i);
    }

    /**
     * 市场时表开始时间参数解析
     *
     * @param time
     * @return
     */
    public static Timestamp getParseStartTime(String time) {
        Timestamp timestamp = null;
        if (TODAY.equalsIgnoreCase(time)) {
            timestamp = Timestamp.valueOf(MARKET_PARSE_TIME.format(getCurrentTimestamp()));
        } else if (YESTERDAY.equalsIgnoreCase(time)) {
            timestamp = Timestamp.valueOf(MARKET_PARSE_TIME.format(getCurrentTimestamp() - 24 * 60 * 60 * 1000));
        } else {
            try {
                timestamp = new Timestamp(MARKET_PARSE_TIME.parse(time).getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return timestamp;
    }

    /**
     * 市场时表结束时间参数解析
     *
     * @param time
     * @return
     */
    public static Timestamp getParseEndTime(String time) {
        Timestamp timestamp = null;
        if (TODAY.equals(time.toLowerCase())) {
            timestamp = Timestamp.valueOf(MARKET_PARSE_TIME.format(getCurrentTimestamp() + 24 * 60 * 60 * 1000));
        } else if (YESTERDAY.equals(time.toLowerCase())) {
            timestamp = Timestamp.valueOf(MARKET_PARSE_TIME.format(getCurrentTimestamp()));
        } else {
            try {
                timestamp = new Timestamp(MARKET_PARSE_TIME.parse(time).getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return timestamp;
    }

    /**
     * 拿到当前时间的时间戳,毫秒为单位:1595398045091
     *
     * @return
     */
    public static Long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }


    public static void main(String[] args) throws ParseException {
        System.out.println(diffDay("2021-04-18", 5));
    }

}
