package com.ibm.IDao;

import java.util.List;

import com.ibm.model.News;

public interface INewsDAO extends IBaseDAO {
	public List<News> selectByKeywords(String keywords);

	public List<News> selectByKeywords(String keywords, int newstypeId);

	public int getCountByTypeId(int typeId);

	public List<News> selectByTypeId(int typeId);

	public List<News> select(int number);

	public List<News> select(int number, int typeId);
	
	public List<News> selectAt(int start,int limit);
}
