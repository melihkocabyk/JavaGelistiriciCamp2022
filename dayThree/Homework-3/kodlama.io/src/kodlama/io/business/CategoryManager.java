package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	
	public CategoryManager() {

	}
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}	
	public void add(Category category) throws Exception {
		for(Category categoryName : categories) {
			if(categoryName.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name cannot be the same!");
			}
		}
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
