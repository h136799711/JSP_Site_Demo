package com.ibm.IDao;

import com.ibm.model.UserInfo;

public interface IUserInfoDAO extends IBaseDAO{
	public UserInfo selectById(int id);	
}
