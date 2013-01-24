package com.ibm.IServices;

import java.util.List;

import com.ibm.model.News;

public interface INewsService extends IBaseService {
	public List<News> selectByKeywords(String keywords);

	public List<News> selectByKeywords(String keywords, int newstypeId);

	public int getCountByTypeId(int typeId);

	public List<News> selectByTypeId(int typeId);

	public List<News> selectTop(int number);

	public List<News> selectTop(int number, int typeId);
}
