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
 * @example ʹ�ò���
 *   1.�������ݿ��������
 */
public class MySqlConnectionUtil {
    
	private static final String remoteUrl1 = "jdbc:mysql://10.55.5.123:3306/newsmanager";
	
//	private static final String remoteUrl2 = "jdbc:mysql://10.55.5.142:3306/newsmanager";
	
	private static final String username = "root";
	private static final String password = "136799711";
	
	//�������ݿ����Ӷ���
	private Connection conn = null;
	
	
	/**
	 * �������ݿ����ӵķ���
	 * @return Connection
	 */
	public Connection getConnection(){
		try{
			//�������ݿ���������
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
