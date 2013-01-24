/**
 * 
 */
package com.ibm.model;

import java.sql.Timestamp;

/**
 * ����ģ����
 * 
 * @author admin
 * 
 */
public class News {
	private String newsContent;
	private int newsId;
	private Timestamp newsPubtime;
	private String newsTitle;
	private int newstypeId;
	private int userId;

	/**
	 * @return the newsContent
	 */
	public String getNewsContent() {
		return newsContent;
	}

	/**
	 * @return the newsId
	 */
	public int getNewsId() {
		return newsId;
	}

	/**
	 * @return the newsPubtime
	 */
	public Timestamp getNewsPubtime() {
		return newsPubtime;
	}

	/**
	 * @return the newsTitle
	 */
	public String getNewsTitle() {
		return newsTitle;
	}

	/**
	 * @return the newstypeId
	 */
	public int getNewstypeId() {
		return newstypeId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param newsContent
	 *            the newsContent to set
	 */
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	/**
	 * @param newsId
	 *            the newsId to set
	 */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	/**
	 * @param newsPubtime
	 *            the newsPubtime to set
	 */
	public void setNewsPubtime(Timestamp newsPubtime) {
		this.newsPubtime = newsPubtime;
	}

	/**
	 * @param newsTitle
	 *            the newsTitle to set
	 */
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	/**
	 * @param newstypeId
	 *            the newstypeId to set
	 */
	public void setNewstypeId(int newstypeId) {
		this.newstypeId = newstypeId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
