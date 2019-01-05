package net.pro.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.pro.shoppingbackend.dao.CategoryDAO;
import net.pro.shoppingbackend.dto.Category;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	static{
		
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Description");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Description");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Description");
		category.setImageURL("CAT_3.png");
		categories.add(category);
	}
	
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories){
			
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
