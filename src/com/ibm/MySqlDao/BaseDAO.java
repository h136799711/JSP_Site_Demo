/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.ibm.IDao.IBaseDAO;


/**
 * @author admin
 * 在JDBC中完成数据操作的步骤
 * 1. 定义连接
 * 2. 创建数据的处理对象（Statement接口，PreparedStatement接口）
 * 3. 获取处理的结果(ResultSet 接口)
 */
public class BaseDAO implements IBaseDAO {

	protected Connection conn = null;
	protected PreparedStatement pst = null;
	protected ResultSet rs = null;
	
	/* (non-Javadoc)
	 * @see com.ibm.IDao.IBaseDAO#add(java.lang.Object)
	 */
	public boolean add(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.ibm.IDao.IBaseDAO#delete(java.lang.Object)
	 */
	public boolean delete(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.ibm.IDao.IBaseDAO#select()
	 */
	@SuppressWarnings("unchecked")
	public List select() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ibm.IDao.IBaseDAO#update(java.lang.Object)
	 */
	public boolean update(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
