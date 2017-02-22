package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.MyMapper;
import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.ConHouseItems;
import com.dlfc.zfgj.entity.ConHouseItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface ConHouseItemsMapper extends MyMapper<ConHouseItems> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int countByExample(ConHouseItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int deleteByExample(ConHouseItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int insert(ConHouseItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int insertSelective(ConHouseItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    List<ConHouseItems> selectByExample(ConHouseItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    ConHouseItems selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") ConHouseItems record, @Param("example") ConHouseItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByExample(@Param("record") ConHouseItems record, @Param("example") ConHouseItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByPrimaryKeySelective(ConHouseItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table con_house_items
     *
     * @mbggenerated Mon Dec 14 11:05:12 CST 2015
     */
    int updateByPrimaryKey(ConHouseItems record);
}