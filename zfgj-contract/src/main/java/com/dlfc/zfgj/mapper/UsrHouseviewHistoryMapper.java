package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.UsrHouseviewHistory;
import com.dlfc.zfgj.entity.UsrHouseviewHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface UsrHouseviewHistoryMapper  extends MyMapper<UsrHouseviewHistory> {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int countByExample(UsrHouseviewHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int deleteByExample(UsrHouseviewHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int insert(UsrHouseviewHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int insertSelective(UsrHouseviewHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	List<UsrHouseviewHistory> selectByExample(UsrHouseviewHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	UsrHouseviewHistory selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int updateByExampleSelective(@Param("record") UsrHouseviewHistory record,
                                 @Param("example") UsrHouseviewHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int updateByExample(@Param("record") UsrHouseviewHistory record,
                        @Param("example") UsrHouseviewHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int updateByPrimaryKeySelective(UsrHouseviewHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr_houseview_history
	 * @mbggenerated  Fri Feb 19 20:08:45 CST 2016
	 */
	int updateByPrimaryKey(UsrHouseviewHistory record);

	String selectLid(UsrHouseviewHistory record);
}