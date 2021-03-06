package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class SysBank extends MyDataEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_bank.BANK_NAME
     *
     * @mbggenerated Mon Dec 21 20:28:28 CST 2015
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_bank
     *
     * @mbggenerated Mon Dec 21 20:28:28 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_bank.BANK_NAME
     *
     * @return the value of sys_bank.BANK_NAME
     *
     * @mbggenerated Mon Dec 21 20:28:28 CST 2015
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_bank.BANK_NAME
     *
     * @param bankName the value for sys_bank.BANK_NAME
     *
     * @mbggenerated Mon Dec 21 20:28:28 CST 2015
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_bank
     *
     * @mbggenerated Mon Dec 21 20:28:28 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bankName=").append(bankName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}