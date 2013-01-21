/**
 * 
 */
package com.ibm.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * 
 * @author admin
 * @example 使用步骤
 *   1.加载数据库的驱动类
 */
public class MySqlConnectionUtil {
    
	private static final String remoteUrl1 = "jdbc:mysql://10.55.5.123:3306/newsmanager";
	
//	private static final String remoteUrl2 = "jdbc:mysql://10.55.5.142:3306/newsmanager";
	
	private static final String username = "root";
	private static final String password = "136799711";
	
	//定义数据库连接对象
	private Connection conn = null;
	
	
	/**
	 * 创建数据库连接的方法
	 * @return Connection
	 */
	public Connection getConnection(){
		try{
			//加载数据库驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(remoteUrl1,username,password);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	/**
	 * test
	 * @param args
	 */
	public static void main(String[] args){
		new MySqlConnectionUtil().getConnection();
	}
}
