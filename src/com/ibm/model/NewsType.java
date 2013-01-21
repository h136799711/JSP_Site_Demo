/**
 * 
 */
package com.ibm.model;

/**
 * 新闻类别模型类
 * @author admin
 * 
 */
public class NewsType {
	private int newstypeId;
	private String newstypeName;
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
	/**
	 * @param newstypeName the newstypeName to set
	 */
	public void setNewstypeName(String newstypeName) {
		this.newstypeName = newstypeName;
	}
	/**
	 * @return the newstypeName
	 */
	public String getNewstypeName() {
		return newstypeName;
	}
	
}
