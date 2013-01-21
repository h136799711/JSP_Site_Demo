/**
 * 
 */
package com.ibm.model;

import java.sql.Date;

/**
 * 公告模型类
 * @author admin
 *
 */
public class Notice {
	private int noId;
	private int userId;
	private String noTitle;
	private String noContent;
	private Date noPubtime;
	/**
	 * @param noId the noId to set
	 */
	public void setNoId(int noId) {
		this.noId = noId;
	}
	/**
	 * @return the noId
	 */
	public int getNoId() {
		return noId;
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
	 * @param noTitle the noTitle to set
	 */
	public void setNoTitle(String noTitle) {
		this.noTitle = noTitle;
	}
	/**
	 * @return the noTitle
	 */
	public String getNoTitle() {
		return noTitle;
	}
	/**
	 * @param noContent the noContent to set
	 */
	public void setNoContent(String noContent) {
		this.noContent = noContent;
	}
	/**
	 * @return the noContent
	 */
	public String getNoContent() {
		return noContent;
	}
	/**
	 * @param noPubtime the noPubtime to set
	 */
	public void setNoPubtime(Date noPubtime) {
		this.noPubtime = noPubtime;
	}
	/**
	 * @return the noPubtime
	 */
	public Date getNoPubtime() {
		return noPubtime;
	}
}
