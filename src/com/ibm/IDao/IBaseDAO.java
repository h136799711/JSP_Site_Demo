/**
 * 
 */
package com.ibm.IDao;

import java.util.List;

/**
 * @author admin
 * 基础Dao接口
 */
public interface IBaseDAO {
	/**
	 * 添加对象
	 * @param entity
	 * @return Boolean
	 */
	public boolean add(Object entity);
	
	/**
	 * 删除对象
	 * @param entity
	 * @return Boolean
	 */
	public boolean delete(Object entity);
	
	/**
	 * 更新数据对象
	 * @param entity
	 * @return Boolean
	 */
	public boolean update(Object entity);
	
	/**
	 * 查询数据
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List select();
}
