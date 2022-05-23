package com.cts.processPension.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class to convert string to date in yyyy-MM-dd format
 * 
 *  @author Srikant Babu
 *  @author 894137
 *
 */
public class DateUtil {
	private DateUtil() {
	}

	public static Date parseDate(String date) throws ParseException {
		return new SimpleDateFormat("yyyy-MM-dd").parse(date);
	}
}