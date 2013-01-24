package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.IUserInfoDAO;
import com.ibm.IServices.IUserInfoService;
import com.ibm.model.UserInfo;

public class UserInfoService extends BaseService implements IUserInfoService {

	public UserInfoService(IUserInfoDAO basedao) {
		super(basedao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Object entity) {
		return getDao().add(entity);
	}

	@Override
	public boolean delete(Object entity) {
		return getDao().delete(entity);
	}

	/**
	 * ��д����getDao
	 * 
	 * @return IUserInfoDAO
	 */
	@Override
	public IUserInfoDAO getDao() {
		return (IUserInfoDAO) super.getDao();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List select() {
		return getDao().select();
	}

	public UserInfo selectById(int id) {
		return getDao().selectById(id);
	}

	@Override
	public boolean update(Object entity) {
		return getDao().update(entity);
	}

	public int checkBy(String username, String password, UserInfo userInfo) {
		return getDao().checkBy(username, password, userInfo);
	}

}
