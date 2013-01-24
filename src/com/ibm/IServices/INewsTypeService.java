package com.ibm.IServices;

import com.ibm.model.NewsType;

public interface INewsTypeService extends IBaseService {
	public NewsType selectById(int newstypeId);
}
