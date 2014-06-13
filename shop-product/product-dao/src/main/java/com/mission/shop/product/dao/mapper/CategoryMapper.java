package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.Category;
import com.mission.shop.product.dao.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int countByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int deleteByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int deleteByPrimaryKey(Long catId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int insert(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int insertSelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	List<Category> selectByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	Category selectByPrimaryKey(Long catId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Category record,
			@Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByExample(@Param("record") Category record,
			@Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByPrimaryKeySelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	int updateByPrimaryKey(Category record);
}