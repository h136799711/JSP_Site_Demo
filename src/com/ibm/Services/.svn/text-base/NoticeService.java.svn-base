/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.INoticeDAO;
import com.ibm.IServices.INoticeService;
import com.ibm.model.Notice;

/**
 * @author admin
 * 
 */
public class NoticeService extends BaseService implements INoticeService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public NoticeService(INoticeDAO basedao) {
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
	 * ��д����
	 * 
	 * @return INoticeDAO
	 */
	@Override
	public INoticeDAO getDao() {
		return (INoticeDAO) super.getDao();
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

	public Notice selectById(int no_id) {
		return getDao().selectById(no_id);
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

	@SuppressWarnings("unchecked")
	public List selectTop(int number) {
		return getDao().selectTop(number);
	}

}
