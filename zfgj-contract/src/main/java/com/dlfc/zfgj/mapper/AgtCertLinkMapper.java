package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.AgtCertLink;
import com.dlfc.zfgj.entity.AgtCertLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface AgtCertLinkMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int countByExample(AgtCertLinkExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int deleteByExample(AgtCertLinkExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int insert(AgtCertLink record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int insertSelective(AgtCertLink record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	List<AgtCertLink> selectByExample(AgtCertLinkExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	AgtCertLink selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByExampleSelective(@Param("record") AgtCertLink record, @Param("example") AgtCertLinkExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByExample(@Param("record") AgtCertLink record, @Param("example") AgtCertLinkExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByPrimaryKeySelective(AgtCertLink record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agt_cert_link
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByPrimaryKey(AgtCertLink record);

	AgtCertLink findById(String id);
}