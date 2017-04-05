package com.iss.finanframe.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_HMS = "yyyyMMddHHmmss";
	public static final String FORMAT_YMD = "yyyy-MM-dd";
	public static final String FORMAT_yyyyMMdd = "yyyyMMdd";
	public static final String FORMAT_YMDHM = "yyyy-MM-dd HH:mm";

	/**
	 * 解析字符串为日期对象
	 * 
	 * @param value
	 *            日期字符串
	 * @param format
	 *            日期格式,缺省为"yyyy-MM-dd HH:mm:ss"
	 * @return Date 转化后的日期值
	 */
	public static Date format(String value, String format) {
		if (value == null || value.length() == 0)
			return null;
		if (format == null || format.length() == 0)
			format = DEFAULT_DATE_FORMAT;

		if (format.length() > value.length()) {
			format = format.substring(0, value.length());
		}

		Date result = null;
		SimpleDateFormat df = null;
		if (format != null && format.length() > 0) {
			df = new SimpleDateFormat(format);
			try {
				result = df.parse(value);
			} catch (ParseException pe) {
				result = null;
			}
			if (result != null)
				return result;
		}

		return result;
	}

	/**
	 * 将日期转化为字符串
	 * 
	 * @param value
	 *            日期值
	 * @param format
	 *            日期格式,缺省为"yyyy-MM-dd HH:mm:ss"
	 * @return 转化后的字符串
	 */
	public static String format(Date value, String format) {
		if (value == null)
			return "";
		if (format == null || format.length() == 0)
			format = DEFAULT_DATE_FORMAT;
		DateFormat df = new SimpleDateFormat(format);
		String result = df.format(value);
		// if (result.length() != format.length()) {
		// DevLog.debug(result + " is not equals date format " + format);
		// }
		return result;
	}

	/**
	 * 获取当前时间
	 * 
	 * @return 转化后的字符串
	 */
	public static String getNow(String format) {
		if (format == null) {
			format = DEFAULT_DATE_FORMAT;
		}
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String dtStr = sdf.format(now);
		return dtStr;

	}

	/**
	 * 比较两个日期的相差毫秒数,如果开始日期比结束日期早，则返回正数，否则返回负数。
	 * 
	 * @param start
	 *            开始日期
	 * @param end
	 *            结束日期
	 * @return
	 */
	public static long compareDate(Date start, Date end) {
		long temp = 0;
		Calendar starts = Calendar.getInstance();
		Calendar ends = Calendar.getInstance();
		starts.setTime(start);
		ends.setTime(end);
		temp = ends.getTime().getTime() - starts.getTime().getTime();
		return temp;
	}

	/**
	 * 比较两个日期的相差天数,如果开始日期比结束日期早，则返回正数，否则返回负数。 返回end - start的分钟
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static long compareHours(Date start, Date end) {
		long day = compareDate(start, end);
		return day / 1000 / 60;
	}
	
	public static String getYesterday(){
		Calendar cal = Calendar.getInstance();
		cal.add(cal.DATE, -1);
		Date date = cal.getTime();
		return DateUtil.format(date, FORMAT_yyyyMMdd);
	}
	
	public static void main(String[] args) {
		System.out.println(DateUtil.getNow(DateUtil.FORMAT_yyyyMMdd));
	}

}
