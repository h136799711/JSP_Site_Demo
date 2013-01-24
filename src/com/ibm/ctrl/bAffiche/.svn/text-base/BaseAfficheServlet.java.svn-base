package com.ibm.ctrl.bAffiche;

import com.ibm.IServices.INoticeService;
import com.ibm.MySqlDao.NoticeDAO;
import com.ibm.Services.NoticeService;
import com.ibm.ctrl.BaseServlet;

public class BaseAfficheServlet extends BaseServlet {

	private static final long serialVersionUID = 779889876237295026L;

	@Override
	public INoticeService NewService() {
		if (service == null) {
			service = new NoticeService(new NoticeDAO());
		}

		return (INoticeService) service;
	}

	@Override
	public INoticeService NewService(boolean isNew) {
		if (isNew || service == null) {
			service = new NoticeService(new NoticeDAO());
		}

		return (INoticeService) service;
	}

}
