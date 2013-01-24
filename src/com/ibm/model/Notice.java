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
public class Notice {
	private String noContent;
	private int noId;
	private Timestamp noPubtime;
	private String noTitle;
	private int userId;

	/**
	 * @return the noContent
	 */
	public String getNoContent() {
		return noContent;
	}

	/**
	 * @return the noId
	 */
	public int getNoId() {
		return noId;
	}

	/**
	 * @return the noPubtime
	 */
	public Timestamp getNoPubtime() {
		return noPubtime;
	}

	/**
	 * @return the noTitle
	 */
	public String getNoTitle() {
		return noTitle;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param noContent
	 *            the noContent to set
	 */
	public void setNoContent(String noContent) {
		this.noContent = noContent;
	}

	/**
	 * @param noId
	 *            the noId to set
	 */
	public void setNoId(int noId) {
		this.noId = noId;
	}

	/**
	 * @param noPubtime
	 *            the noPubtime to set
	 */
	public void setNoPubtime(Timestamp noPubtime) {
		this.noPubtime = noPubtime;
	}

	/**
	 * @param noTitle
	 *            the noTitle to set
	 */
	public void setNoTitle(String noTitle) {
		this.noTitle = noTitle;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
