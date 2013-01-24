/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.INewsDAO;
import com.ibm.IServices.INewsService;
import com.ibm.model.News;

/**
 * @author admin
 * 
 */
public class NewsService extends BaseService implements INewsService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public NewsService(INewsDAO basedao) {
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
	 * @return INewsDAO
	 */
	@Override
	public INewsDAO getDao() {
		return (INewsDAO) super.getDao();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.INewsService#selectByKeywords(java.lang.String)
	 */
	public List<News> selectByKeywords(String keywords) {
		return getDao().selectByKeywords(keywords);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.INewsService#selectByTypeId(java.lang.String)
	 */
	public List<News> selectByTypeId(int typeId) {
		return getDao().selectByTypeId(typeId);
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

	public int getCountByTypeId(int typeId) {
		return getDao().getCountByTypeId(typeId);
	}

	public List<News> selectTop(int number) {
		return getDao().select(number);
	}

	public List<News> selectTop(int number, int typeId) {
		return getDao().select(number, typeId);
	}

	public List<News> selectByKeywords(String keywords, int newstypeId) {
		return getDao().selectByKeywords(keywords, newstypeId);
	}

}
