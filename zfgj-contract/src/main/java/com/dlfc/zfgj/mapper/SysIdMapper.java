package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysId;
import com.dlfc.zfgj.entity.SysIdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysIdMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int countByExample(SysIdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int deleteByExample(SysIdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int insert(SysId record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int insertSelective(SysId record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	List<SysId> selectByExample(SysIdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	SysId selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByExampleSelective(@Param("record") SysId record, @Param("example") SysIdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByExample(@Param("record") SysId record, @Param("example") SysIdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByPrimaryKeySelective(SysId record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_id
	 * @mbggenerated  Thu Dec 24 09:13:03 CST 2015
	 */
	int updateByPrimaryKey(SysId record);

	SysId findById(String id);
}