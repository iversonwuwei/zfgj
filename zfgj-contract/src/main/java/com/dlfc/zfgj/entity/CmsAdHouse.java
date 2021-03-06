package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class CmsAdHouse extends MyDataEntity<CmsAdHouse> implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.PINDEX
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private Integer pindex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.ad_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private String adId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.house_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private String houseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.title
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.sort
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private Integer sort;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_ad_house.link
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private String link;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cms_ad_house
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.PINDEX
	 * @return  the value of cms_ad_house.PINDEX
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public Integer getPindex() {
		return pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.PINDEX
	 * @param pindex  the value for cms_ad_house.PINDEX
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setPindex(Integer pindex) {
		this.pindex = pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.ad_id
	 * @return  the value of cms_ad_house.ad_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public String getAdId() {
		return adId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.ad_id
	 * @param adId  the value for cms_ad_house.ad_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setAdId(String adId) {
		this.adId = adId == null ? null : adId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.house_id
	 * @return  the value of cms_ad_house.house_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public String getHouseId() {
		return houseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.house_id
	 * @param houseId  the value for cms_ad_house.house_id
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setHouseId(String houseId) {
		this.houseId = houseId == null ? null : houseId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.title
	 * @return  the value of cms_ad_house.title
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.title
	 * @param title  the value for cms_ad_house.title
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.sort
	 * @return  the value of cms_ad_house.sort
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.sort
	 * @param sort  the value for cms_ad_house.sort
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_ad_house.link
	 * @return  the value of cms_ad_house.link
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public String getLink() {
		return link;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_ad_house.link
	 * @param link  the value for cms_ad_house.link
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	public void setLink(String link) {
		this.link = link == null ? null : link.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_ad_house
	 * @mbggenerated  Fri Jan 08 11:31:49 CST 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", pindex=").append(pindex);
		sb.append(", adId=").append(adId);
		sb.append(", houseId=").append(houseId);
		sb.append(", title=").append(title);
		sb.append(", sort=").append(sort);
		sb.append(", link=").append(link);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	private String filePath;
	
	private String houseAddr;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getHouseAddr() {
		return houseAddr;
	}

	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}
    
}