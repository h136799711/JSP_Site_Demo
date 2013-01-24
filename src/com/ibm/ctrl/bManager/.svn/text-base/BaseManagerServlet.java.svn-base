package com.ibm.ctrl.bManager;

import com.ibm.IServices.IUserInfoService;
import com.ibm.MySqlDao.UserInfoDAO;
import com.ibm.Services.UserInfoService;
import com.ibm.ctrl.BaseServlet;

public class BaseManagerServlet extends BaseServlet {

	private static final long serialVersionUID = 779889876237295026L;

	@Override
	public IUserInfoService NewService() {
		if (service == null) {
			service = new UserInfoService(new UserInfoDAO());
		}

		return (IUserInfoService) service;
	}

}
