package com.ibm.model;

/**
 * 焦点新闻模型类
 * @author admin
 * 
 */
public class Focusnews {
	private int focusId;
	private int userId;
	private String focusTitle;
	private String focusContent;
	private String focusPubtime;
	/**
	 * @param focusId the focusId to set
	 */
	public void setFocusId(int focusId) {
		this.focusId = focusId;
	}
	/**
	 * @return the focusId
	 */
	public int getFocusId() {
		return focusId;
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
	 * @param focusTitle the focusTitle to set
	 */
	public void setFocusTitle(String focusTitle) {
		this.focusTitle = focusTitle;
	}
	/**
	 * @return the focusTitle
	 */
	public String getFocusTitle() {
		return focusTitle;
	}
	/**
	 * @param focusContent the focusContent to set
	 */
	public void setFocusContent(String focusContent) {
		this.focusContent = focusContent;
	}
	/**
	 * @return the focusContent
	 */
	public String getFocusContent() {
		return focusContent;
	}
	/**
	 * @param focusPubtime the focusPubtime to set
	 */
	public void setFocusPubtime(String focusPubtime) {
		this.focusPubtime = focusPubtime;
	}
	/**
	 * @return the focusPubtime
	 */
	public String getFocusPubtime() {
		return focusPubtime;
	}
	
}
