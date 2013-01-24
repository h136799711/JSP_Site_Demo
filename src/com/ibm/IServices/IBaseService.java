package com.ibm.IServices;

import java.util.List;

public interface IBaseService {

	/**
	 * ��Ӷ���
	 * 
	 * @param entity
	 * @return boolean
	 */
	public boolean add(Object entity);

	/**
	 * ɾ�����
	 * 
	 * @param entity
	 * @return boolean
	 */
	public boolean delete(Object entity);

	/**
	 * ��ѯ���
	 * 
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List select();

	/**
	 * ������ݶ���
	 * 
	 * @param entity
	 * @return boolean
	 */
	public boolean update(Object entity);
}
