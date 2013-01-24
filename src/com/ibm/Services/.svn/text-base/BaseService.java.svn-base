/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.IBaseDAO;
import com.ibm.IServices.IBaseService;

/**
 * @author admin
 * 
 */
public class BaseService implements IBaseService {

	private IBaseDAO dao = null;

	public BaseService(IBaseDAO basedao) {
		dao = basedao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#add(java.lang.Object)
	 */
	public boolean add(Object entity) {
		return dao.add(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#delete(java.lang.Object)
	 */
	public boolean delete(Object entity) {
		return dao.delete(entity);
	}

	public IBaseDAO getDao() {
		return dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#select()
	 */
	@SuppressWarnings("unchecked")
	public List select() {
		return dao.select();
	}

	public void setDao(IBaseDAO dao) {
		this.dao = dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#update(java.lang.Object)
	 */
	public boolean update(Object entity) {
		return dao.update(entity);
	}

}
