package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.ConHouseUserLog;
import com.dlfc.zfgj.entity.ConHouseUserLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface ConHouseUserLogMapper extends MyMapper<ConHouseUserLog> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int countByExample(ConHouseUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int deleteByExample(ConHouseUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int insert(ConHouseUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int insertSelective(ConHouseUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    List<ConHouseUserLog> selectByExample(ConHouseUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    ConHouseUserLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") ConHouseUserLog record, @Param("example") ConHouseUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByExample(@Param("record") ConHouseUserLog record, @Param("example") ConHouseUserLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByPrimaryKeySelective(ConHouseUserLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_user_log
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByPrimaryKey(ConHouseUserLog record);
}