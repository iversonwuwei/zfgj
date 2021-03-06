package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.ConDepositLog;
import com.dlfc.zfgj.entity.ConDepositLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface ConDepositLogMapper extends MyMapper<ConDepositLog> {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int countByExample(ConDepositLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int deleteByExample(ConDepositLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int insert(ConDepositLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int insertSelective(ConDepositLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	List<ConDepositLog> selectByExample(ConDepositLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	ConDepositLog selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ConDepositLog record, @Param("example") ConDepositLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByExample(@Param("record") ConDepositLog record, @Param("example") ConDepositLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByPrimaryKeySelective(ConDepositLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit_log
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByPrimaryKey(ConDepositLog record);
}