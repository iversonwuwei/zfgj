package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.UsrErInfo;
import com.dlfc.zfgj.entity.UsrErInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface UsrErInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int countByExample(UsrErInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int deleteByExample(UsrErInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int insert(UsrErInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int insertSelective(UsrErInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    List<UsrErInfo> selectByExample(UsrErInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    UsrErInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int updateByExampleSelective(@Param("record") UsrErInfo record, @Param("example") UsrErInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int updateByExample(@Param("record") UsrErInfo record, @Param("example") UsrErInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int updateByPrimaryKeySelective(UsrErInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_er_info
     *
     * @mbggenerated Tue Dec 22 13:54:25 CST 2015
     */
    int updateByPrimaryKey(UsrErInfo record);
}