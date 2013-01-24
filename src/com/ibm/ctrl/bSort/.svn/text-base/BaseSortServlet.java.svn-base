package com.ibm.ctrl.bSort;

import com.ibm.IServices.INewsTypeService;
import com.ibm.MySqlDao.NewsTypeDAO;
import com.ibm.Services.NewsTypeService;
import com.ibm.ctrl.BaseServlet;

public class BaseSortServlet extends BaseServlet {

	private static final long serialVersionUID = 779889876237295026L;

	@Override
	public INewsTypeService NewService() {
		if (service == null) {
			service = new NewsTypeService(new NewsTypeDAO());
		}

		return (INewsTypeService) service;
	}

	@Override
	public INewsTypeService NewService(boolean isNew) {
		if (isNew || service == null) {
			service = new NewsTypeService(new NewsTypeDAO());
		}

		return (INewsTypeService) service;
	}

}
