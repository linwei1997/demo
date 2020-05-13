package com.demo.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 项目名称：framework
 * 类描述：
 * 创建人：QiuYu
 * 创建时间：2017/12/22 16:47
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class DateUtil {

    public final static String YEAR_FORMAT = "yyyy";

    public final static String MONTH_FORMAT = "MM";

    public final static String DAY_FORMAT = "dd";

    public final static String DATE_FORMAT = "yyyy-MM-dd";

    public final static String DATE_TIME_SS_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public final static String DATE_TIME_MM_FORMAT = "yyyy-MM-dd HH:mm";

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:22
     * @description  获取今天日期
     * @return java.lang.String
     */
    public static String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(new Date());
    }
}
