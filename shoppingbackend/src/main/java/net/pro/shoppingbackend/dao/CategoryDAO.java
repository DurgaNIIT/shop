package net.pro.shoppingbackend.dao;

import java.util.List;

import net.pro.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	
	List<Category> list();
	Category get(int id);
	
	
}
