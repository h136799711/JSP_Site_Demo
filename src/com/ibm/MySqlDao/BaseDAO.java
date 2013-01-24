/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.IBaseDAO;

/**
 * @author admin ��JDBC�������ݲ����Ĳ��� 1. �������� 2.
 *         ������ݵĴ������Statement�ӿڣ�PreparedStatement�ӿڣ� 3.
 *         ��ȡ����Ľ��(ResultSet �ӿ�)
 */
public class BaseDAO implements IBaseDAO {

	protected Connection conn = null;
	protected PreparedStatement pst = null;
	protected ResultSet rs = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IDao.IBaseDAO#add(java.lang.Object)
	 */
	public boolean add(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IDao.IBaseDAO#delete(java.lang.Object)
	 */
	public boolean delete(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IDao.IBaseDAO#select()
	 */
	@SuppressWarnings("unchecked")
	public List select() {
		// TODO Auto-generated method stub
		return new ArrayList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IDao.IBaseDAO#update(java.lang.Object)
	 */
	public boolean update(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
