package com.pers.yefei.supper.stock.utils;
/**
 * Copyright    : Copyright (c) 2014. Kanebay Corp. All rights reserved
 * auth: sunny
 * File Summary :
 * Create time  : 2014-12-16
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理日期的工具类
 *
 * @author robert
 *
 */
public class DateUtils {

    private static Map<String, SimpleDateFormat> formatMap = new HashMap<String, SimpleDateFormat>();

    // 日期的格式
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static final SimpleDateFormat orderSnDateFormat = new SimpleDateFormat("yyyyMMdd");

    // 时间的格式
    public static final SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 时间的精简格式
    public static final SimpleDateFormat datetimeLiteFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    public static final String TODAY_STR = "today";

    /**
     * 获得指定日期的前一天的Date对象
     *
     * @param dateStr
     * @return
     */
    public static Date getYesterdayFor(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        if (!TODAY_STR.equals(dateStr)) {
            Date date = null;
            try {
                date = parseDate(dateStr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (null == date) {
                return null;
            }
            calendar.setTime(date);
        }
        calendar.add(Calendar.DATE, -1);
        Date yesterday = calendar.getTime();
        return yesterday;
    }

    /**
     * 获得当前日期前一天的Date对象
     *
     * @return
     */
    public static Date getYesterday() {
        return getYesterdayFor(TODAY_STR);
    }

    /**
     * 获得距现在days天的数据，days可以为负
     *
     * @param days
     * @return
     */
    public static Date getDateAfterDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * 获得距d的months月的数据，months可以为负
     *
     * @param months
     * @return
     */
    public static Date getDateAfterMonths(Date d, int months) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.MONTH, months);
        return calendar.getTime();
    }

    /**
     * 获得距d的days天的数据，days可以为负
     *
     * @param days
     * @return
     */
    public static Date getDateAfterDays(Date d, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * 获得距现在minutes天的数据，minutes可以为负
     *
     * @param minutes
     * @return
     */
    public static Date getDateAfterMinutes(Date d, int minutes) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + minutes);
        return now.getTime();
    }

    /**
     * 获得当前日期前一天的字符串形式
     *
     * @return
     */
    public synchronized static String getYesterdayStrFor(String dateStr) {
        return dateFormat.format(getYesterdayFor(dateStr));
    }

    /**
     * 获得当前日期前一天的字符串形式
     *
     * @return
     */
    public synchronized static String getYesterdayStr() {
        return dateFormat.format(getYesterday());
    }

    /**
     * 获得当前日期
     *
     * @return
     */
    public synchronized static Date getToday() {
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        return today;
    }

    /**
     * 获得当前日期的字符串形式
     *
     * @return
     */
    public synchronized static String getTodayStr() {
        return dateFormat.format(getToday());
    }

    /**
     * 转换字符串到Date对象
     *
     * @param dateStr
     * @return
     * @throws Exception
     */
    public synchronized static Date parseDate(String dateStr) throws Exception {
        return dateFormat.parse(dateStr);
    }

    /**
     * 获得当前时间起hour小时之后的时间
     * @param hour
     * @return
     */
    public static Date getDateAfterHours(int hour) {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.HOUR, hour);
        return now.getTime();
    }

    public static Date getDateAfterMinutes(Date date, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hours);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    /**
     * 获得以秒计时的时间差
     *
     * @param parseDate1
     * @param parseDate2
     * @return
     */
    static public long differenceInSecond(Date parseDate1, Date parseDate2) {
        // 日期相减得到相差的日期
        long diff = 0;
        diff = (parseDate1.getTime() - parseDate2.getTime()) / (1000);
        return diff;
    }

    /**
     * 获得以分钟计时的时间差
     *
     * @param parseDate1
     * @param parseDate2
     * @return
     */
    static public long differenceInMinute(Date parseDate1, Date parseDate2) {
        // 日期相减得到相差的日期
        long diff = 0;
        diff = (parseDate1.getTime() - parseDate2.getTime()) / (60 * 1000);
        return diff;
    }

    /**
     * 获得以分钟计时的时间差
     *
     * @param parseDate1
     * @param parseDate2
     * @return
     */
    static public long differenceInDay(Date parseDate1, Date parseDate2) {
        // 日期相减得到相差的日期
        long diff = 0;
        diff = (parseDate1.getTime() - parseDate2.getTime()) / (60 * 1000 * 60 * 24);
        return diff;
    }

    static public int getDiffYear(Date before, Date after) {
        try {
            int diff = after.getYear() - before.getYear();
            if (diff == 0) {
                return 1;
            }
            int dateDiff = getDateDiff(before, after);

            return dateDiff / 365;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    static public int differenceInMonth(Date before, Date after) {
        int dateDiff = getDateDiff(before, after);

        return dateDiff / 30;
    }

    /**
     * 获得以日计时的时间差
     *
     * @param parseDate1
     * @param parseDate2
     * @return
     */
    static public int differenceInDays(Date parseDate1, Date parseDate2) {
        // 日期相减得到相差的日期
        long diff = 0;
        diff = (parseDate1.getTime() - parseDate2.getTime()) / (60 * 1000 * 60 * 24);
        return (int) diff;
    }

    /**
     * 获取当前日期中的月
     *
     * @return java.lang.String
     */
    public static int getCurrentMonth() {
        String month;
        SimpleDateFormat df = new SimpleDateFormat("MM");
        month = df.format(new Date());
        return Integer.parseInt(month);
    }

    /**
     * 获取当前日期中的年
     *
     * @return java.lang.String
     */
    public static int getCurrentYear() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return Integer.parseInt(df.format(new Date()));
    }

    /**
     * 获取两个日期的相差天数
     *
     * @param before:
     *            2010-04-15 13:17:01
     * @param after:
     *            2013-04-23 15:38:21
     * @return
     */
    public static int getDateDiff(Date before, Date after) {
        return (int) (-(before.getTime() - after.getTime()) / (3600L * 1000 * 24));
    }

    public static Date parseDate(String str, String format) throws Exception {
        if (str == null || "".equals(str)) {
            return null;
        }
        SimpleDateFormat sdf = formatMap.get(format);
        if (null == sdf) {
            /*
             * sdf = new SimpleDateFormat(format, Locale.ENGLISH);
             * sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
             */
            sdf = new SimpleDateFormat(format);
            formatMap.put(format, sdf);
        }
        try {
            synchronized (sdf) {
                // SimpleDateFormat is not thread safe
                return sdf.parse(str);
            }
        } catch (ParseException pe) {
            throw new Exception("Unexpected format(" + str + ") returned from sina.com.cn");
        }
    }

    public static void main(String[] args) throws ParseException {
        Date bf22 = getDateAfterDays(-22);
        // System.out.println(bf22);
        // System.out.println(getDateAfterDays(bf22, 29));

        try {
            System.out.println(parseDate("1992-04-28"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /************
     * 根据字符串格式时间获取时间 字符串格式 yyyy-MM-dd
     *
     * @param pTime
     * @return
     * @throws Exception
     */
    public static int dayForWeek(String pTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    /************
     * 根据日期类型获取星期几
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static int dayForWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    /****************
     * ' 获取时间 格式 09:18
     *
     * @param date
     * @return
     */
    public static String getHHMMSSTime(Date date) {
        Calendar ca = Calendar.getInstance();

        ca.setTime(date);

        int hours = ca.get(Calendar.HOUR_OF_DAY);
        int minute = ca.get(Calendar.MINUTE);
        int second = ca.get(Calendar.SECOND);
        return hours < 10 ? "0"
                : "" + hours + ":" + (minute < 10 ? "0" : "") + minute + ":" + (second < 10 ? "0" : "") + second;
    }

    /*************
     * 将日期转化成字符串格式的日期 格式为yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String transformDate2Y_M_DStr(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }

    /************
     * 获取指定年周的 所在周的第一天
     * @param year
     * @param week
     * @return
     */
    public static Date getFirstDayOfWeek(int year, int week) {

        return getFirstDayOfWeek(initCal(year, week));
    }


    private static Date initCal(int year, int week) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DATE, 1);
        Calendar cal = (GregorianCalendar) c.clone();
        cal.add(Calendar.DATE, week * 7);
        return cal.getTime();
    }

    /***********
     * 获取指定年和周的最后一天
     * @param year
     * @param week
     * @return
     */
    public static Date getLastDayOfWeek(int year, int week) {
        return getLastDayOfWeek(initCal(year, week));
    }


    /***********
     * 获取当前日期所在年的第一天
     * @param date
     * @return
     */
    public static Date getFirstDayOfYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        //c.set(Calendar.MONTH, 0); // Monday
        c.set(Calendar.DAY_OF_YEAR, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }
    /***********
     * 获取当前日期所在周的第一天
     * @param date
     * @return
     */
    public static Date getFirstDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
        return c.getTime();
    }

    /*******
     * 获取当前日期的所在周的最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
        return c.getTime();
    }

    /************
     * 根据日期类型获取星期几
     * @param date
     * @return
     * @throws Exception
     */
    public static String dayForWeekChina(Date date) {
        String dayForWeekChinna = "";
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }

        switch (dayForWeek) {
            case 1:
                dayForWeekChinna = "一";
                break;
            case 2:
                dayForWeekChinna = "二";
                break;
            case 3:
                dayForWeekChinna = "三";
                break;
            case 4:
                dayForWeekChinna = "四";
                break;
            case 5:
                dayForWeekChinna = "五";
                break;
            case 6:
                dayForWeekChinna = "六";
                break;
            case 7:
                dayForWeekChinna = "日";
                break;

            default:
                dayForWeekChinna = "输入异常";
                break;
        }
        return dayForWeekChinna;
    }

    /****************'
     * 获取时间 格式 09:18
     * @param date
     * @return
     */
    public static String getHHMMTime(Date date) {
        Calendar ca = Calendar.getInstance();

        ca.setTime(date);

        int hours = ca.get(Calendar.HOUR_OF_DAY);
        int minute = ca.get(Calendar.MINUTE);
        return hours < 10 ? "0":""+hours + ":" + (minute < 10 ? "0":"" + minute);
    }

    /**********
     * 根据指定日期返回是一年中的第几周  字符串类型 2016-W2  h5页面统一格式
     * @param date
     * @return
     */
    public static String getYearAndWeek(Date date) {
        Calendar ca = Calendar.getInstance();
        ca.setFirstDayOfWeek(Calendar.MONDAY);
        ca.setMinimalDaysInFirstWeek(7);
        ca.setTime(date);
        int year = ca.get(Calendar.YEAR);
        int week = ca.get(Calendar.WEEK_OF_YEAR);
        return year+"-W"+(week);
    }

    /**************
     * 根据这周的第一天查询这周的全部日期。。按周一到周日排序
     * @param firstDate
     * @return
     */
    public static List<Date> getOneWeekDateByFirstDayOfWeek(Date firstDate) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(firstDate);
        List<Date> list = new ArrayList<>();
        for (int i = 0; i< 7; i++) {
            cl.setTime(firstDate);
            cl.set(Calendar.DAY_OF_MONTH, cl.get(Calendar.DAY_OF_MONTH)+i);
            list.add(cl.getTime());
        }
        return list;
    }

    /**
     * 取得0点的日期
     * @param date
     * @return
     * @throws ParseException
     */
    static public Date getZeroDate(Date date){
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        //c.set(Calendar.MONTH, 0); // Monday
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 取得相差的天数，只考虑填，不考虑时分秒。如2016-10-10 23:59 与2016-10-11 00:01 相差一天
     * @param beforeDate
     * @param afterDate
     * @return
     * @throws ParseException
     */
    static public int getDiffDays(Date beforeDate, Date afterDate){
        return DateUtils.differenceInDays(DateUtils.getZeroDate(beforeDate), DateUtils.getZeroDate(afterDate));
    }
}