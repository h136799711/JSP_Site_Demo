/**
 * 
 */
package com.ibm.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.mysql.jdbc.Connection;

/**
 * 
 * @author admin
 */
public class MySqlUtil {

	private MySqlUtil() {

	}

	// private static final String remoteUrl2 =
	// "jdbc:mysql://10.55.5.142:3306/newsmanager";

	private static final String remoteUrl1 = "jdbc:mysql://10.55.5.122:3306/newsmanager";
	// private static final String remoteUrl2 =
	// "jdbc:mysql://10.55.5.122:3306/newsmanager";
	private static final String password = "root";
	private static final String username = "root";

	/**
	 * test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Timestamp timestamp = TimeParser.getNow();
		System.out.println("Start Time = " + timestamp);
		MySqlUtil.getConnection();
		Timestamp timestamp2 = TimeParser.getNow();
		System.out.println("end Time = " + timestamp2);
		System.out.println("cost Time = "
				+ (timestamp2.getTime() - timestamp.getTime()));
	}

	// 数据库连接
	private static Connection conn = null;

	/**
	 * 获得数据库连接
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(remoteUrl1,
					username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
