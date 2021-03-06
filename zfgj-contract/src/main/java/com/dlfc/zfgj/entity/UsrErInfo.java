package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class UsrErInfo extends MyDataEntity<UsrErInfo> implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.PINDEX
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.USER_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.NO
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.ER_TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Short erType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.MONEY
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.STATE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Short state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.DCRP
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private String dcrp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usr_er_info.LINK_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private Integer linkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.PINDEX
     *
     * @return the value of usr_er_info.PINDEX
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.PINDEX
     *
     * @param pindex the value for usr_er_info.PINDEX
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.USER_ID
     *
     * @return the value of usr_er_info.USER_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.USER_ID
     *
     * @param userId the value for usr_er_info.USER_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.NO
     *
     * @return the value of usr_er_info.NO
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.NO
     *
     * @param no the value for usr_er_info.NO
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.TYPE
     *
     * @return the value of usr_er_info.TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.TYPE
     *
     * @param type the value for usr_er_info.TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.ER_TYPE
     *
     * @return the value of usr_er_info.ER_TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Short getErType() {
        return erType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.ER_TYPE
     *
     * @param erType the value for usr_er_info.ER_TYPE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setErType(Short erType) {
        this.erType = erType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.MONEY
     *
     * @return the value of usr_er_info.MONEY
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.MONEY
     *
     * @param money the value for usr_er_info.MONEY
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.STATE
     *
     * @return the value of usr_er_info.STATE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.STATE
     *
     * @param state the value for usr_er_info.STATE
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.DCRP
     *
     * @return the value of usr_er_info.DCRP
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public String getDcrp() {
        return dcrp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.DCRP
     *
     * @param dcrp the value for usr_er_info.DCRP
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setDcrp(String dcrp) {
        this.dcrp = dcrp == null ? null : dcrp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usr_er_info.LINK_ID
     *
     * @return the value of usr_er_info.LINK_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usr_er_info.LINK_ID
     *
     * @param linkId the value for usr_er_info.LINK_ID
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pindex=").append(pindex);
        sb.append(", userId=").append(userId);
        sb.append(", no=").append(no);
        sb.append(", type=").append(type);
        sb.append(", erType=").append(erType);
        sb.append(", money=").append(money);
        sb.append(", state=").append(state);
        sb.append(", dcrp=").append(dcrp);
        sb.append(", linkId=").append(linkId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}