/**
 * 
 */
package com.ibm.Services;

import java.util.List;

import com.ibm.IDao.INewsViewModelDAO;
import com.ibm.IServices.INewsViewModelService;
import com.ibm.MySqlDao.NewsViewModelDAO;
import com.ibm.ViewModel.NewsViewModel;

/**
 * @author admin
 * 
 */
public class NewsViewModelService extends BaseService implements
		INewsViewModelService {

	public static void main(String[] args) {
		NewsViewModel nvm = (new NewsViewModelService(new NewsViewModelDAO()))
				.selectByNewsId(6);
		System.out.println(" : " + nvm.getNewsContent());
	}

	public NewsViewModelService(INewsViewModelDAO basedao) {
		super(basedao);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��д�����е�getDao
	 * 
	 * @return INewsTypeDAO
	 */
	@Override
	public INewsViewModelDAO getDao() {
		return (INewsViewModelDAO) super.getDao();
	}

	public NewsViewModel selectByNewsId(int newsId) {
		return getDao().selectByNewsId(newsId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IServices.IMultiTableService#selectFromTables()
	 */
	@SuppressWarnings("unchecked")
	public List selectFromTables() {
		return getDao().selectFromTables();
	}
}
