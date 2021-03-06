package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.ConRentstaging;
import com.dlfc.zfgj.entity.ConRentstagingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface ConRentstagingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int countByExample(ConRentstagingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int deleteByExample(ConRentstagingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int insert(ConRentstaging record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int insertSelective(ConRentstaging record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	List<ConRentstaging> selectByExample(ConRentstagingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	ConRentstaging selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ConRentstaging record,
                                 @Param("example") ConRentstagingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int updateByExample(@Param("record") ConRentstaging record, @Param("example") ConRentstagingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int updateByPrimaryKeySelective(ConRentstaging record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table con_rentstaging
	 * @mbggenerated  Fri Dec 30 13:53:54 CST 2016
	 */
	int updateByPrimaryKey(ConRentstaging record);

	ConRentstaging getConRentstagingByCid(String cid);
	
	List<ConRentstaging> getRentstagingListByCid(String Cid);
}