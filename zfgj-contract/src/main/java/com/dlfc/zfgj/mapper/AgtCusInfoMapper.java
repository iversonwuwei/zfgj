package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.AgtCusInfo;
import com.dlfc.zfgj.entity.AgtCusInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface AgtCusInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int countByExample(AgtCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int deleteByExample(AgtCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int insert(AgtCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int insertSelective(AgtCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    List<AgtCusInfo> selectByExample(AgtCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    AgtCusInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int updateByExampleSelective(@Param("record") AgtCusInfo record, @Param("example") AgtCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int updateByExample(@Param("record") AgtCusInfo record, @Param("example") AgtCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int updateByPrimaryKeySelective(AgtCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agt_cus_info
     *
     * @mbggenerated Tue Dec 15 10:35:16 CST 2015
     */
    int updateByPrimaryKey(AgtCusInfo record);
}