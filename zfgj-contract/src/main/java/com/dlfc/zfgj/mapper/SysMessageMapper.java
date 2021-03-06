package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysMessage;
import com.dlfc.zfgj.entity.SysMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysMessageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int countByExample(SysMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int deleteByExample(SysMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int insert(SysMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int insertSelective(SysMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	List<SysMessage> selectByExampleList(SysMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	SysMessage selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int updateByExampleSelective(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int updateByExample(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int updateByPrimaryKeySelective(SysMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_message
	 * @mbggenerated  Tue Apr 12 14:32:45 CST 2016
	 */
	int updateByPrimaryKey(SysMessage record);
	
	SysMessage selectUpMsg(SysMessage record);
}