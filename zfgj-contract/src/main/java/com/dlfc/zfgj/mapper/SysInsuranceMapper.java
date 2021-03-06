package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysInsurance;
import com.dlfc.zfgj.entity.SysInsuranceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysInsuranceMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int countByExample(SysInsuranceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int deleteByExample(SysInsuranceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int insert(SysInsurance record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int insertSelective(SysInsurance record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	List<SysInsurance> selectByExample(SysInsuranceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	SysInsurance selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int updateByExampleSelective(@Param("record") SysInsurance record,
                                 @Param("example") SysInsuranceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int updateByExample(@Param("record") SysInsurance record,
                        @Param("example") SysInsuranceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int updateByPrimaryKeySelective(SysInsurance record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_insurance
	 * @mbggenerated  Wed Sep 14 09:27:26 CST 2016
	 */
	int updateByPrimaryKey(SysInsurance record);

	List<SysInsurance> selectAllList(SysInsurance record);
    
    SysInsurance selectInfoById(String id);
    
    SysInsurance selectAllByPrimaryKey(String id);
}