package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysSpecialAuditLog;
import com.dlfc.zfgj.entity.SysSpecialAuditLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysSpecialAuditLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int countByExample(SysSpecialAuditLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int deleteByExample(SysSpecialAuditLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int insert(SysSpecialAuditLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int insertSelective(SysSpecialAuditLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	List<SysSpecialAuditLog> selectByExample(SysSpecialAuditLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	SysSpecialAuditLog selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int updateByExampleSelective(@Param("record") SysSpecialAuditLog record,
                                 @Param("example") SysSpecialAuditLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int updateByExample(@Param("record") SysSpecialAuditLog record,
                        @Param("example") SysSpecialAuditLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int updateByPrimaryKeySelective(SysSpecialAuditLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_special_audit_log
	 * @mbggenerated  Mon Dec 21 11:22:53 CST 2015
	 */
	int updateByPrimaryKey(SysSpecialAuditLog record);
	
	List<SysSpecialAuditLog> findByExample(SysSpecialAuditLogExample example);
}