/**
 * 
 */
package com.ibm.IDao;

import java.util.List;

import com.ibm.model.Focusnews;

/**
 * @author admin
 * 
 */
public interface IFocusnewsDAO extends IBaseDAO {
	public Focusnews selectById(int id);

	public List<Focusnews> selectByKeywords(String keywords);

	public List<Focusnews> selectTop(int number);
}
