package com.dlfc.zfgj.entity;

import com.dlfc.admin.common.persistence.MyDataEntity;

import java.io.Serializable;

public class CmsVoteType extends MyDataEntity<CmsVoteType> implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_vote_type.PINDEX
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_vote_type.VOTE_ID
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private String voteId;
    
    private String num;

    public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_vote_type.TYPE
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_vote_type.LABEL
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private String label;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_vote_type.REMARKS
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_vote_type
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_vote_type.PINDEX
     *
     * @return the value of cms_vote_type.PINDEX
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_vote_type.PINDEX
     *
     * @param pindex the value for cms_vote_type.PINDEX
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_vote_type.VOTE_ID
     *
     * @return the value of cms_vote_type.VOTE_ID
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public String getVoteId() {
        return voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_vote_type.VOTE_ID
     *
     * @param voteId the value for cms_vote_type.VOTE_ID
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public void setVoteId(String voteId) {
        this.voteId = voteId == null ? null : voteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_vote_type.TYPE
     *
     * @return the value of cms_vote_type.TYPE
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_vote_type.TYPE
     *
     * @param type the value for cms_vote_type.TYPE
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_vote_type.LABEL
     *
     * @return the value of cms_vote_type.LABEL
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_vote_type.LABEL
     *
     * @param label the value for cms_vote_type.LABEL
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_vote_type.REMARKS
     *
     * @return the value of cms_vote_type.REMARKS
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_vote_type.REMARKS
     *
     * @param remarks the value for cms_vote_type.REMARKS
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_vote_type
     *
     * @mbggenerated Tue Jun 07 16:51:32 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pindex=").append(pindex);
        sb.append(", voteId=").append(voteId);
        sb.append(", type=").append(type);
        sb.append(", label=").append(label);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}