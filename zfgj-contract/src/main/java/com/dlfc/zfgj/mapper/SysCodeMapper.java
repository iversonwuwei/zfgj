package com.dlfc.zfgj.mapper;


import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysCode;
import com.dlfc.zfgj.entity.SysCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@MyBatisDao
public interface SysCodeMapper extends MyMapper<SysCode> {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int countByExample(SysCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int deleteByExample(SysCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int insert(SysCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int insertSelective(SysCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	List<SysCode> selectByExample(SysCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	SysCode selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int updateByExampleSelective(@Param("record") SysCode record, @Param("example") SysCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int updateByExample(@Param("record") SysCode record, @Param("example") SysCodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int updateByPrimaryKeySelective(SysCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_code
	 * @mbggenerated  Tue Nov 10 13:48:30 CST 2015
	 */
	int updateByPrimaryKey(SysCode record);
	
	/**
	 * 取得数据库时间
	 * @return
	 */
	Date getDBDateTime();
	
	String selectCycleName(SysCode record);
}