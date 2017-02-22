package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.CucNumPool;
import com.dlfc.zfgj.entity.CucNumPoolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface CucNumPoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int countByExample(CucNumPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int deleteByExample(CucNumPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int insert(CucNumPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int insertSelective(CucNumPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    List<CucNumPool> selectByExample(CucNumPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    CucNumPool selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int updateByExampleSelective(@Param("record") CucNumPool record, @Param("example") CucNumPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int updateByExample(@Param("record") CucNumPool record, @Param("example") CucNumPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int updateByPrimaryKeySelective(CucNumPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cuc_num_pool
     *
     * @mbggenerated Thu Sep 29 11:05:49 CST 2016
     */
    int updateByPrimaryKey(CucNumPool record);
    
    List<CucNumPool> getPoolList(String lockTime);
    
    void updateLockToUnlock(CucNumPool record);
    
    int lockPhone(CucNumPool record);
    
    CucNumPool getStatusByNum(String phone);
    
    int isLockSelf(CucNumPool record);
    
    void updateSold(CucNumPool record);
    
    CucNumPool getInfoByNum(String phone);
}