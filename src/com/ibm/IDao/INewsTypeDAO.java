package com.ibm.IDao;

import com.ibm.model.NewsType;

public interface INewsTypeDAO extends IBaseDAO {
	public NewsType selectById(int newstypeId);
}
