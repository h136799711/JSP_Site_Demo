/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.IFocusnewsDAO;
import com.ibm.IServices.IFocusnewsService;
import com.ibm.model.Focusnews;

/**
 * @author admin
 * 
 */
public class FocusnewsService extends BaseService implements IFocusnewsService {

	public FocusnewsService(IFocusnewsDAO focusenewsDao) {
		super(focusenewsDao);
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
	 * ��д����
	 * 
	 * @return IFocusnewsDAO
	 */
	@Override
	public IFocusnewsDAO getDao() {
		return (IFocusnewsDAO) super.getDao();
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

	public Focusnews selectById(int id) {
		return getDao().selectById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ibm.IServices.IFocusnewsServices#selectByKeywords(java.lang.String)
	 */
	public List<Focusnews> selectByKeywords(String keywords) {
		return getDao().selectByKeywords(keywords);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IFocusnewsServices#selectTop(int)
	 */
	public List<Focusnews> selectTop(int number) {
		return getDao().selectTop(number);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IBaseService#update(java.lang.Object)
	 */
	@Override
	public boolean update(Object entity) {
		return getDao().update(entity);
	}

}
