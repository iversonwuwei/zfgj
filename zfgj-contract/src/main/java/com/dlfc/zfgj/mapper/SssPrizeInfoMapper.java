package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SssPrizeInfo;
import com.dlfc.zfgj.entity.SssPrizeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SssPrizeInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int countByExample(SssPrizeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int deleteByExample(SssPrizeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int insert(SssPrizeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int insertSelective(SssPrizeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	List<SssPrizeInfo> selectByExample(SssPrizeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	SssPrizeInfo selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int updateByExampleSelective(@Param("record") SssPrizeInfo record, @Param("example") SssPrizeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int updateByExample(@Param("record") SssPrizeInfo record, @Param("example") SssPrizeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int updateByPrimaryKeySelective(SssPrizeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sss_prize_info
	 * @mbggenerated  Thu Oct 27 11:13:14 CST 2016
	 */
	int updateByPrimaryKey(SssPrizeInfo record);
}