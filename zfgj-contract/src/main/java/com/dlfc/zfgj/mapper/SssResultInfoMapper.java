package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.SssResultInfo;
import com.dlfc.zfgj.entity.SssResultInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface SssResultInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int countByExample(SssResultInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int deleteByExample(SssResultInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int insert(SssResultInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int insertSelective(SssResultInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    List<SssResultInfo> selectByExample(SssResultInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    SssResultInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int updateByExampleSelective(@Param("record") SssResultInfo record, @Param("example") SssResultInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int updateByExample(@Param("record") SssResultInfo record, @Param("example") SssResultInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int updateByPrimaryKeySelective(SssResultInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_result_info
     *
     * @mbggenerated Tue Oct 25 16:40:15 CST 2016
     */
    int updateByPrimaryKey(SssResultInfo record);
    
    List<SssResultInfo> findByExample(SssResultInfoExample example);
}