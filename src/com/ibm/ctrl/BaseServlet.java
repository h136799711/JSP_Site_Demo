/**
 * 
 */
package com.ibm.ctrl;

import javax.servlet.http.HttpServlet;

import com.ibm.IServices.IBaseService;
import com.ibm.MySqlDao.BaseDAO;
import com.ibm.Services.BaseService;

/**
 * @author admin
 * 
 */
public class BaseServlet extends HttpServlet {

	/**
	 * 1
	 */
	private static final long serialVersionUID = 1L;
	protected IBaseService service = null;

	public BaseServlet() {

	}

	public IBaseService NewService() {
		service = new BaseService(new BaseDAO());
		return service;
	}

	public IBaseService NewService(boolean isNew) {
		if (isNew || service == null) {
			service = new BaseService(new BaseDAO());
		}
		return service;
	}

}
