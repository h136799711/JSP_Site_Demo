package com.ibm.IDao;

import java.util.List;

import com.ibm.model.Notice;

public interface INoticeDAO extends IBaseDAO {
	public Notice selectById(int no_id);

	@SuppressWarnings("unchecked")
	public List selectTop(int number);
}
