package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class SssPrizeInfo extends MyDataEntity<SssPrizeInfo> implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.PINDEX
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private Integer pindex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.NAME
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.CHANCE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private Float chance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private Integer count;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.TOTAL_COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private Integer totalCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.ISGOODS
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private String isgoods;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sss_prize_info.ISREALPRIZE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private String isrealprize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.PINDEX
	 * @return  the value of sss_prize_info.PINDEX
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public Integer getPindex() {
		return pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.PINDEX
	 * @param pindex  the value for sss_prize_info.PINDEX
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setPindex(Integer pindex) {
		this.pindex = pindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.NAME
	 * @return  the value of sss_prize_info.NAME
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.NAME
	 * @param name  the value for sss_prize_info.NAME
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.CHANCE
	 * @return  the value of sss_prize_info.CHANCE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public Float getChance() {
		return chance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.CHANCE
	 * @param chance  the value for sss_prize_info.CHANCE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setChance(Float chance) {
		this.chance = chance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.COUNT
	 * @return  the value of sss_prize_info.COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.COUNT
	 * @param count  the value for sss_prize_info.COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.TOTAL_COUNT
	 * @return  the value of sss_prize_info.TOTAL_COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.TOTAL_COUNT
	 * @param totalCount  the value for sss_prize_info.TOTAL_COUNT
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.ISGOODS
	 * @return  the value of sss_prize_info.ISGOODS
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public String getIsgoods() {
		return isgoods;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.ISGOODS
	 * @param isgoods  the value for sss_prize_info.ISGOODS
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setIsgoods(String isgoods) {
		this.isgoods = isgoods == null ? null : isgoods.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sss_prize_info.ISREALPRIZE
	 * @return  the value of sss_prize_info.ISREALPRIZE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public String getIsrealprize() {
		return isrealprize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sss_prize_info.ISREALPRIZE
	 * @param isrealprize  the value for sss_prize_info.ISREALPRIZE
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	public void setIsrealprize(String isrealprize) {
		this.isrealprize = isrealprize == null ? null : isrealprize.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", pindex=").append(pindex);
		sb.append(", name=").append(name);
		sb.append(", chance=").append(chance);
		sb.append(", count=").append(count);
		sb.append(", totalCount=").append(totalCount);
		sb.append(", isgoods=").append(isgoods);
		sb.append(", isrealprize=").append(isrealprize);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}