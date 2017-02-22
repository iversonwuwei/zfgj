package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.CmsAdposition;
import com.dlfc.zfgj.entity.CmsAdpositionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface CmsAdpositionMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int countByExample(CmsAdpositionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int deleteByExample(CmsAdpositionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int insert(CmsAdposition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int insertSelective(CmsAdposition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	List<CmsAdposition> selectByExample(CmsAdpositionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	CmsAdposition selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int updateByExampleSelective(@Param("record") CmsAdposition record, @Param("example") CmsAdpositionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int updateByExample(@Param("record") CmsAdposition record, @Param("example") CmsAdpositionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int updateByPrimaryKeySelective(CmsAdposition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cms_adposition
	 * @mbggenerated  Fri Jan 08 11:33:09 CST 2016
	 */
	int updateByPrimaryKey(CmsAdposition record);

	//查询广告
    List<CmsAdposition> findList(CmsAdposition cmsAdposition);
    
    //删除广告
    void delete(CmsAdposition cmsAdposition);
    
    //通过ID获取广告
    CmsAdposition getAdById(String id);
    
    //通过enname获取广告
    CmsAdposition getAdByEnname(String enname);
    
}