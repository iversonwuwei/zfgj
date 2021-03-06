package com.dlfc.zfgj.mapper;

import com.dlfc.admin.common.persistence.annotation.MyBatisDao;
import com.dlfc.zfgj.entity.CmsArticleData;
import com.dlfc.zfgj.entity.CmsArticleDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface CmsArticleDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int countByExample(CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int deleteByExample(CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int insert(CmsArticleData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int insertSelective(CmsArticleData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    List<CmsArticleData> selectByExampleWithBLOBs(CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    List<CmsArticleData> selectByExample(CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    CmsArticleData selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") CmsArticleData record, @Param("example") CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") CmsArticleData record, @Param("example") CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByExample(@Param("record") CmsArticleData record, @Param("example") CmsArticleDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByPrimaryKeySelective(CmsArticleData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(CmsArticleData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_data
     *
     * @mbggenerated Fri Feb 19 14:01:54 CST 2016
     */
    int updateByPrimaryKey(CmsArticleData record);
}