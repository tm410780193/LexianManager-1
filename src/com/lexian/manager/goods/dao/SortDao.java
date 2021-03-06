package com.lexian.manager.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lexian.manager.goods.bean.Category;
import com.lexian.web.ResultHelper;

public interface SortDao {

	public List<Category> getAllCategories();
	
	public Category getCategoryByCategoryName(String categoryName);
	
	public void updateCategoryById(@Param("id")int id,@Param("categoryname")String categoryName);
	
	public void addCategory(Category category);
	
	public void deleteCategory(int id);
	
}
