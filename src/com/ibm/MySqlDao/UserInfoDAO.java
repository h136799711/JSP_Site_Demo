/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.IUserInfoDAO;
import com.ibm.model.UserInfo;
import com.ibm.util.MySqlConnectionUtil;



/**
 * @author admin
 * 
 */
public class UserInfoDAO extends BaseDAO implements IUserInfoDAO{
	
	private MySqlConnectionUtil util = null;
	/**
	 * 根据ID选择用户信息
	 * @param id 
	 */
	public UserInfo selectById(int id) {
		util = new MySqlConnectionUtil();
		
		//获取数据库的连接
		conn = util.getConnection();
		try{
			//获取数据库的预处理对象；"?"占位符
			pst =  conn.prepareStatement("select * from Users where user_id = ? ");
			
			pst.setInt(1,id);
			rs = pst.executeQuery();
			UserInfo info = null;
			if(rs.next()){
				info = new UserInfo();
				info.setUserId(rs.getInt("user_id"));
				info.setUserName(rs.getString("user_name"));
				info.setUserAccount(rs.getString("user_account"));	
				info.setUserPassword(rs.getString("user_password"));				
			}
			return info;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * 添加用户信息
	 * @param Object
	 */
	public boolean add(Object entity) {
		util = new MySqlConnectionUtil();
		conn = util.getConnection();
		UserInfo info = (UserInfo) entity;
		
		try {
			pst = conn.prepareStatement("insert into Users(user_id,user_name,user_account,user_password) values(?,?,?,?) ");

			pst.setLong(1, info.getUserId());
			pst.setString(2, info.getUserName());
			pst.setString(3, info.getUserAccount());
			pst.setString(4,info.getUserPassword());
			
			return (pst.executeUpdate() != 0);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public boolean delete(Object entity) {
		
		util = new MySqlConnectionUtil();
		conn = util.getConnection();
		String sql = "delete  from users where user_id = ? ";
		UserInfo userInfo = (UserInfo) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setLong(1, userInfo.getUserId());
			return (pst.executeUpdate() != 0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public List select() {

		util = new MySqlConnectionUtil();
		conn = util.getConnection();
		String sql = "select *  from users ";
		List<UserInfo> list = new ArrayList<UserInfo>();
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				UserInfo info = new UserInfo();
				info.setUserId(rs.getInt("user_id"));
				info.setUserName(rs.getString("user_name"));
				info.setUserAccount(rs.getString("user_account"));
				info.setUserPassword(rs.getString("user_password"));
				list.add(info);
			}
			return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	public boolean update(Object entity) {

		util = new MySqlConnectionUtil();
		conn = util.getConnection();
		String sql = "update   users set user_name = ? ,user_account = ? , user_password = ? where user_id = ? ";
		UserInfo userInfo = (UserInfo) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, userInfo.getUserName());
			pst.setString(2, userInfo.getUserAccount());
			pst.setString(3, userInfo.getUserPassword());
			pst.setLong(4, userInfo.getUserId());
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 把名字改成自己的名字，执行一次。
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		UserInfo info1 = new UserInfo();
	//	UserInfo info2 = new UserInfo();
	//	UserInfo info3 = new UserInfo();
		IUserInfoDAO dao = new UserInfoDAO();

		info1.setUserId(123);
		info1.setUserName("hebidu");
		info1.setUserAccount("hebidu");
		info1.setUserPassword("12622");
		
/*		info2.setUserId(123);
		info2.setUserName("hebidu2");
		info2.setUserAccount("hebidu2");
		info2.setUserPassword("123456");
		
		info3.setUserName("hebidu3");
		info3.setUserAccount("hebidu3");
		info3.setUserPassword("123456");
		
		dao.add(info1);
		dao.add(info2);
		dao.add(info3);*/
		
	//	System.out.println("执行结果 "+dao.delete(info1));
	//	System.out.println("执行结果 "+dao.selectById(123).getUserName());
	//	System.out.println("执行结果 "+dao.select().size());
		System.out.println("执行结果 "+dao.update(info1));
	}
	
}
