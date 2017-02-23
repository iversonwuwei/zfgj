package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.HouCoOwnerLog;
import com.dlfc.zfgj.entity.HouCoOwnerTemp;
import com.dlfc.zfgj.entity.HouCoOwnerTempExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface HouCoOwnerTempMapper extends MyMapper<HouCoOwnerTemp> {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int countByExample(HouCoOwnerTempExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int deleteByExample(HouCoOwnerTempExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int insert(HouCoOwnerTemp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int insertSelective(HouCoOwnerTemp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	List<HouCoOwnerTemp> selectByExample(HouCoOwnerTempExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	HouCoOwnerTemp selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int updateByExampleSelective(@Param("record") HouCoOwnerTemp record,
                                 @Param("example") HouCoOwnerTempExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int updateByExample(@Param("record") HouCoOwnerTemp record,
                        @Param("example") HouCoOwnerTempExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int updateByPrimaryKeySelective(HouCoOwnerTemp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hou_co_owner_temp
	 * @mbggenerated  Tue Mar 15 10:50:14 CST 2016
	 */
	int updateByPrimaryKey(HouCoOwnerTemp record);

	void saveCoOwnerLog(HouCoOwnerLog record);
    
	List<HouCoOwnerTemp> findCoOwner(HouCoOwnerTemp coOwner);
}