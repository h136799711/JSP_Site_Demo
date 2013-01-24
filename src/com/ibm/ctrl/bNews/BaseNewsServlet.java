package com.ibm.ctrl.bNews;

import com.ibm.IServices.INewsService;
import com.ibm.MySqlDao.NewsDAO;
import com.ibm.Services.NewsService;
import com.ibm.ctrl.BaseServlet;

public class BaseNewsServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public INewsService NewService() {
		service = new NewsService(new NewsDAO());
		return (INewsService) service;
	}

	@Override
	public INewsService NewService(boolean isNew) {
		if (isNew || service == null) {
			service = new NewsService(new NewsDAO());
		}
		return (INewsService) service;
	}

}
