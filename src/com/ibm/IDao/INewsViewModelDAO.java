/**
 * 
 */
package com.ibm.IDao;

import com.ibm.ViewModel.NewsViewModel;

/**
 * @author admin
 * 
 */
public interface INewsViewModelDAO extends IMultiTableDAO {
	public NewsViewModel selectByNewsId(int newsId);
}
