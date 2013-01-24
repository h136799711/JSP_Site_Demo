/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.INewsTypeDAO;
import com.ibm.IServices.INewsTypeService;
import com.ibm.model.NewsType;

/**
 * @author admin
 * 
 */
public class NewsTypeService extends BaseService implements INewsTypeService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public NewsTypeService(INewsTypeDAO basedao) {
		super(basedao);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#add(java.lang.Object)
	 */
	@Override
	public boolean add(Object entity) {
		return getDao().add(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Object entity) {
		return getDao().delete(entity);
	}

	/**
	 * ��д�����е�getDao
	 * 
	 * @return INewsTypeDAO
	 */
	@Override
	public INewsTypeDAO getDao() {
		return (INewsTypeDAO) super.getDao();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#select()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List select() {
		return getDao().select();
	}

	public NewsType selectById(int newstypeId) {
		return getDao().selectById(newstypeId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#update(java.lang.Object)
	 */
	@Override
	public boolean update(Object entity) {
		// TODO Auto-generated method stub
		return getDao().update(entity);
	}

}
