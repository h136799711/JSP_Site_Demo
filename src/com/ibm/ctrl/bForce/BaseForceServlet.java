package com.ibm.ctrl.bForce;

import com.ibm.IServices.IFocusnewsService;
import com.ibm.MySqlDao.FocusnewsDAO;
import com.ibm.Services.FocusnewsService;
import com.ibm.ctrl.BaseServlet;

public class BaseForceServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IFocusnewsService NewService() {
		service = new FocusnewsService(new FocusnewsDAO());
		return (IFocusnewsService) service;
	}

	@Override
	public IFocusnewsService NewService(boolean isNew) {
		if (isNew || service == null) {
			service = new FocusnewsService(new FocusnewsDAO());
		}
		return (IFocusnewsService) service;
	}
}
