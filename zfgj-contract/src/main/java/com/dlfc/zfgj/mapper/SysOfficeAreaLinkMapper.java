package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysOfficeAreaLink;
import com.dlfc.zfgj.entity.SysOfficeAreaLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysOfficeAreaLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int countByExample(SysOfficeAreaLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int deleteByExample(SysOfficeAreaLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int insert(SysOfficeAreaLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int insertSelective(SysOfficeAreaLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    List<SysOfficeAreaLink> selectByExample(SysOfficeAreaLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    SysOfficeAreaLink selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysOfficeAreaLink record, @Param("example") SysOfficeAreaLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int updateByExample(@Param("record") SysOfficeAreaLink record, @Param("example") SysOfficeAreaLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int updateByPrimaryKeySelective(SysOfficeAreaLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_office_area_link
     *
     * @mbggenerated Wed Jan 13 13:08:30 CST 2016
     */
    int updateByPrimaryKey(SysOfficeAreaLink record);
}