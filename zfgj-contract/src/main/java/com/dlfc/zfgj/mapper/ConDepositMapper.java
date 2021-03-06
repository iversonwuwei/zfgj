package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.domain.ConDepositListCondition;
import com.dlfc.zfgj.entity.ConDeposit;
import com.dlfc.zfgj.entity.ConDepositExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@MyBatisDao
public interface ConDepositMapper extends MyMapper<ConDeposit> {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int countByExample(ConDepositExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int deleteByExample(ConDepositExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int insert(ConDeposit record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int insertSelective(ConDeposit record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	List<ConDeposit> selectByExample(ConDepositExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	ConDeposit selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ConDeposit record, @Param("example") ConDepositExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByExample(@Param("record") ConDeposit record, @Param("example") ConDepositExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByPrimaryKeySelective(ConDeposit record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_deposit
	 * @mbggenerated  Mon Oct 24 16:44:11 CST 2016
	 */
	int updateByPrimaryKey(ConDeposit record);

	List<Map<String,Object>> findByPidList(ConDepositListCondition record);
	
	ConDeposit findByCid(String cid);
}