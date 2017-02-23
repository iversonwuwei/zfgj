package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SysInfoAtt;
import com.dlfc.zfgj.entity.SysInfoAttExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SysInfoAttMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int countByExample(SysInfoAttExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int deleteByExample(SysInfoAttExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int insert(SysInfoAtt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int insertSelective(SysInfoAtt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    List<SysInfoAtt> selectByExample(SysInfoAttExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    SysInfoAtt selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysInfoAtt record, @Param("example") SysInfoAttExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int updateByExample(@Param("record") SysInfoAtt record, @Param("example") SysInfoAttExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int updateByPrimaryKeySelective(SysInfoAtt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_info_att
     *
     * @mbggenerated Tue Dec 15 11:33:31 CST 2015
     */
    int updateByPrimaryKey(SysInfoAtt record);
    
    List<SysInfoAtt> findByLid(String lid);
}