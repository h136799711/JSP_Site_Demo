/**
 * 
 */
package com.ibm.model;

import java.sql.Date;

/**
 * 新闻模型类
 * @author admin
 *
 */
public class News {
	private int newsId;
	private int userId;
	private String newsTitle;
	private String newsContent;
	private Date newsPubtime;
	private int newstypeId;
	/**
	 * @param newsId the newsId to set
	 */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	/**
	 * @return the newsId
	 */
	public int getNewsId() {
		return newsId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param newsTitle the newsTitle to set
	 */
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	/**
	 * @return the newsTitle
	 */
	public String getNewsTitle() {
		return newsTitle;
	}
	/**
	 * @param newsContent the newsContent to set
	 */
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	/**
	 * @return the newsContent
	 */
	public String getNewsContent() {
		return newsContent;
	}
	/**
	 * @param newsPubtime the newsPubtime to set
	 */
	public void setNewsPubtime(Date newsPubtime) {
		this.newsPubtime = newsPubtime;
	}
	/**
	 * @return the newsPubtime
	 */
	public Date getNewsPubtime() {
		return newsPubtime;
	}
	/**
	 * @param newstypeId the newstypeId to set
	 */
	public void setNewstypeId(int newstypeId) {
		this.newstypeId = newstypeId;
	}
	/**
	 * @return the newstypeId
	 */
	public int getNewstypeId() {
		return newstypeId;
	}
	
}
