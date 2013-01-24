/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.IUserInfoDAO;
import com.ibm.model.UserInfo;
import com.ibm.util.MySqlUtil;

/**
 * @author admin
 * 
 */
public class UserInfoDAO extends BaseDAO implements IUserInfoDAO {

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("START");
		UserInfo info1 = new UserInfo();
		// UserInfo info2 = new UserInfo();
		// UserInfo info3 = new UserInfo();
		IUserInfoDAO dao = new UserInfoDAO();

		info1.setUserId(123);
		info1.setUserAccount("hebidu");
		info1.setUserPassword("hebidu");
		UserInfo info = new UserInfo();
		System.out.println("checkBy");
		dao.checkBy(info1.getUserAccount(), info1.getUserPassword(), info);
		System.out
				.println(info.getUserAccount() + " 用户名 " + info.getUserName());
		System.out.println("END");

		/*
		 * info2.setUserId(123); info2.setUserName("hebidu2");
		 * info2.setUserAccount("hebidu2"); info2.setUserPassword("123456");
		 * 
		 * 
		 * info3.setUserName("hebidu3"); info3.setUserAccount("hebidu3");
		 * info3.setUserPassword("123456");
		 * 
		 * dao.add(info1); dao.add(info2); dao.add(info3);
		 */

		// System.out.println("ִ�н�� "+dao.delete(info1));
		// System.out.println("ִ�н�� "+dao.selectById(123).getUserName());
		// System.out.println("ִ�н�� "+dao.select().size());
		// System.out.println("ִ�н�� " + dao.update(info1));
	}

	/**
	 * ����û���Ϣ
	 * 
	 * @param Object
	 */
	@Override
	public boolean add(Object entity) {

		conn = MySqlUtil.getConnection();
		UserInfo info = (UserInfo) entity;

		try {
			pst = conn
					.prepareStatement("insert into Users(user_name,user_account,user_password) values(?,?,?) ");

			// pst.setLong(1, info.getUserId());
			pst.setString(1, info.getUserName());
			pst.setString(2, info.getUserAccount());
			pst.setString(3, info.getUserPassword());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(Object entity) {

		conn = MySqlUtil.getConnection();
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

	@Override
	@SuppressWarnings("unchecked")
	public List select() {

		conn = MySqlUtil.getConnection();
		String sql = "select *  from users ";
		List<UserInfo> list = new ArrayList<UserInfo>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				UserInfo info = new UserInfo();
				info.setUserId(rs.getInt("user_id"));
				info.setUserName(rs.getString("user_name"));
				info.setUserAccount(rs.getString("user_account"));
				info.setUserPassword(rs.getString("user_password"));
				list.add(info);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 根据ID选择用户信息
	 * 
	 * @param id
	 */
	public UserInfo selectById(int id) {

		conn = MySqlUtil.getConnection();
		UserInfo info = new UserInfo();
		try {

			pst = conn
					.prepareStatement("select * from Users where user_id = ? ");

			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				info.setUserId(rs.getInt("user_id"));
				info.setUserName(rs.getString("user_name"));
				info.setUserAccount(rs.getString("user_account"));
				info.setUserPassword(rs.getString("user_password"));
			} else {
				info.setUserId(Integer.MIN_VALUE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return info;
	}

	@Override
	public boolean update(Object entity) {

		conn = MySqlUtil.getConnection();
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
	 * 返回0,表示验证正确
	 */
	public int checkBy(String username, String password, UserInfo userInfo) {

		conn = MySqlUtil.getConnection();
		//System.out.println("get Connection");
		String sql = "select * from Users  where user_account = ? and user_password = ? ";

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if (rs.next()) {
				if (userInfo != null) {
					userInfo.setUserId(rs.getInt("user_id"));
					userInfo.setUserAccount(rs.getString("user_account"));
					userInfo.setUserName(rs.getString("user_name"));
					userInfo.setUserPassword(rs.getString("user_password"));
				}
				return 0;
			}
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

}
