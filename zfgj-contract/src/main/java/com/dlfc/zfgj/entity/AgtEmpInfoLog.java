package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;
import java.util.Date;

public class AgtEmpInfoLog extends MyDataEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.PINDEX
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.OPERATOR
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.OPT_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Date optTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.OPT_EVENT
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Integer optEvent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.DCRP
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String dcrp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.AVATAR_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String avatarId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.COMPANY_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.OFFICE_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String officeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.ROLE_CODE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String roleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.PID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.USER_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.STATUS
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.STATUS_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Date statusTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_emp_info_log.GRADE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table agt_emp_info_log
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.PINDEX
     *
     * @return the value of agt_emp_info_log.PINDEX
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.PINDEX
     *
     * @param pindex the value for agt_emp_info_log.PINDEX
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.OPERATOR
     *
     * @return the value of agt_emp_info_log.OPERATOR
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.OPERATOR
     *
     * @param operator the value for agt_emp_info_log.OPERATOR
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.OPT_TIME
     *
     * @return the value of agt_emp_info_log.OPT_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Date getOptTime() {
        return optTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.OPT_TIME
     *
     * @param optTime the value for agt_emp_info_log.OPT_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.OPT_EVENT
     *
     * @return the value of agt_emp_info_log.OPT_EVENT
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Integer getOptEvent() {
        return optEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.OPT_EVENT
     *
     * @param optEvent the value for agt_emp_info_log.OPT_EVENT
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setOptEvent(Integer optEvent) {
        this.optEvent = optEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.DCRP
     *
     * @return the value of agt_emp_info_log.DCRP
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getDcrp() {
        return dcrp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.DCRP
     *
     * @param dcrp the value for agt_emp_info_log.DCRP
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setDcrp(String dcrp) {
        this.dcrp = dcrp == null ? null : dcrp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.AVATAR_ID
     *
     * @return the value of agt_emp_info_log.AVATAR_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getAvatarId() {
        return avatarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.AVATAR_ID
     *
     * @param avatarId the value for agt_emp_info_log.AVATAR_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId == null ? null : avatarId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.COMPANY_ID
     *
     * @return the value of agt_emp_info_log.COMPANY_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.COMPANY_ID
     *
     * @param companyId the value for agt_emp_info_log.COMPANY_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.OFFICE_ID
     *
     * @return the value of agt_emp_info_log.OFFICE_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.OFFICE_ID
     *
     * @param officeId the value for agt_emp_info_log.OFFICE_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.ROLE_CODE
     *
     * @return the value of agt_emp_info_log.ROLE_CODE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.ROLE_CODE
     *
     * @param roleCode the value for agt_emp_info_log.ROLE_CODE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.PID
     *
     * @return the value of agt_emp_info_log.PID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.PID
     *
     * @param pid the value for agt_emp_info_log.PID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.USER_ID
     *
     * @return the value of agt_emp_info_log.USER_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.USER_ID
     *
     * @param userId the value for agt_emp_info_log.USER_ID
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.STATUS
     *
     * @return the value of agt_emp_info_log.STATUS
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.STATUS
     *
     * @param status the value for agt_emp_info_log.STATUS
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.STATUS_TIME
     *
     * @return the value of agt_emp_info_log.STATUS_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Date getStatusTime() {
        return statusTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.STATUS_TIME
     *
     * @param statusTime the value for agt_emp_info_log.STATUS_TIME
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_emp_info_log.GRADE
     *
     * @return the value of agt_emp_info_log.GRADE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_emp_info_log.GRADE
     *
     * @param grade the value for agt_emp_info_log.GRADE
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_emp_info_log
     *
     * @mbggenerated Wed Apr 06 14:51:39 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pindex=").append(pindex);
        sb.append(", operator=").append(operator);
        sb.append(", optTime=").append(optTime);
        sb.append(", optEvent=").append(optEvent);
        sb.append(", dcrp=").append(dcrp);
        sb.append(", avatarId=").append(avatarId);
        sb.append(", companyId=").append(companyId);
        sb.append(", officeId=").append(officeId);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", pid=").append(pid);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", statusTime=").append(statusTime);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}