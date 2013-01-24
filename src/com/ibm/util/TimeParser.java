/**
 * 
 */
package com.ibm.util;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * @author admin
 * 
 */
public class TimeParser {

	public static Timestamp getNow() {
		Calendar now = Calendar.getInstance();
		Timestamp timestamp = new Timestamp(now.getTimeInMillis());
		return timestamp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
