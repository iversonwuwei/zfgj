package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class ConHouseUserLog extends MyDataEntity<ConHouseUserLog> implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.PINDEX
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.CON_LOG_ID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String conLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.NAME
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.CID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.CO_PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String coPid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.ID_TYPE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private Integer idType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.ID_NO
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.MOBILE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_house_user_log.SORT
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private Short sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.PINDEX
     *
     * @return the value of con_house_user_log.PINDEX
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.PINDEX
     *
     * @param pindex the value for con_house_user_log.PINDEX
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.CON_LOG_ID
     *
     * @return the value of con_house_user_log.CON_LOG_ID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getConLogId() {
        return conLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.CON_LOG_ID
     *
     * @param conLogId the value for con_house_user_log.CON_LOG_ID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setConLogId(String conLogId) {
        this.conLogId = conLogId == null ? null : conLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.PID
     *
     * @return the value of con_house_user_log.PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.PID
     *
     * @param pid the value for con_house_user_log.PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.NAME
     *
     * @return the value of con_house_user_log.NAME
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.NAME
     *
     * @param name the value for con_house_user_log.NAME
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.CID
     *
     * @return the value of con_house_user_log.CID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.CID
     *
     * @param cid the value for con_house_user_log.CID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.CO_PID
     *
     * @return the value of con_house_user_log.CO_PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getCoPid() {
        return coPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.CO_PID
     *
     * @param coPid the value for con_house_user_log.CO_PID
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setCoPid(String coPid) {
        this.coPid = coPid == null ? null : coPid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.ID_TYPE
     *
     * @return the value of con_house_user_log.ID_TYPE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.ID_TYPE
     *
     * @param idType the value for con_house_user_log.ID_TYPE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.ID_NO
     *
     * @return the value of con_house_user_log.ID_NO
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.ID_NO
     *
     * @param idNo the value for con_house_user_log.ID_NO
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.MOBILE
     *
     * @return the value of con_house_user_log.MOBILE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.MOBILE
     *
     * @param mobile the value for con_house_user_log.MOBILE
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_house_user_log.SORT
     *
     * @return the value of con_house_user_log.SORT
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public Short getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_house_user_log.SORT
     *
     * @param sort the value for con_house_user_log.SORT
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pindex=").append(pindex);
        sb.append(", conLogId=").append(conLogId);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", cid=").append(cid);
        sb.append(", coPid=").append(coPid);
        sb.append(", idType=").append(idType);
        sb.append(", idNo=").append(idNo);
        sb.append(", mobile=").append(mobile);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}