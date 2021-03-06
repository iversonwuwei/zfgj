package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;
import java.util.List;

public class CmsAdposition extends MyDataEntity<CmsAdposition> implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.PINDEX
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private Integer pindex;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.NAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.ENNAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private String enname;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.CONTENT
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private String content;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.DISPLAY_NUMBER
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private Integer displayNumber;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.STATUS
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private Integer status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cms_adposition.TYPE
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private Integer type;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.PINDEX
	 * @return  the value of cms_adposition.PINDEX
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public Integer getPindex() {
		return pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.PINDEX
	 * @param pindex  the value for cms_adposition.PINDEX
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setPindex(Integer pindex) {
		this.pindex = pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.NAME
	 * @return  the value of cms_adposition.NAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.NAME
	 * @param name  the value for cms_adposition.NAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.ENNAME
	 * @return  the value of cms_adposition.ENNAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public String getEnname() {
		return enname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.ENNAME
	 * @param enname  the value for cms_adposition.ENNAME
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setEnname(String enname) {
		this.enname = enname == null ? null : enname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.CONTENT
	 * @return  the value of cms_adposition.CONTENT
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.CONTENT
	 * @param content  the value for cms_adposition.CONTENT
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.DISPLAY_NUMBER
	 * @return  the value of cms_adposition.DISPLAY_NUMBER
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public Integer getDisplayNumber() {
		return displayNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.DISPLAY_NUMBER
	 * @param displayNumber  the value for cms_adposition.DISPLAY_NUMBER
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setDisplayNumber(Integer displayNumber) {
		this.displayNumber = displayNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.STATUS
	 * @return  the value of cms_adposition.STATUS
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.STATUS
	 * @param status  the value for cms_adposition.STATUS
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_adposition.TYPE
	 * @return  the value of cms_adposition.TYPE
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_adposition.TYPE
	 * @param type  the value for cms_adposition.TYPE
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", pindex=").append(pindex);
		sb.append(", name=").append(name);
		sb.append(", enname=").append(enname);
		sb.append(", content=").append(content);
		sb.append(", displayNumber=").append(displayNumber);
		sb.append(", status=").append(status);
		sb.append(", type=").append(type);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	private List<CmsAdHouse> houses;
    
    private List<CmsAdMedia> medias;

	public List<CmsAdMedia> getMedias() {
		return medias;
	}

	public void setMedias(List<CmsAdMedia> medias) {
		this.medias = medias;
	}

	public List<CmsAdHouse> getHouses() {
		return houses;
	}

	public void setHouses(List<CmsAdHouse> houses) {
		this.houses = houses;
	}
	
	private String statusName;

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
    
    
}