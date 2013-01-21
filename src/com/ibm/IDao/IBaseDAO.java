/**
 * 
 */
package com.ibm.IDao;

import java.util.List;

/**
 * @author admin
 * ����Dao�ӿ�
 */
public interface IBaseDAO {
	/**
	 * ��Ӷ���
	 * @param entity
	 * @return Boolean
	 */
	public boolean add(Object entity);
	
	/**
	 * ɾ������
	 * @param entity
	 * @return Boolean
	 */
	public boolean delete(Object entity);
	
	/**
	 * �������ݶ���
	 * @param entity
	 * @return Boolean
	 */
	public boolean update(Object entity);
	
	/**
	 * ��ѯ����
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List select();
}
