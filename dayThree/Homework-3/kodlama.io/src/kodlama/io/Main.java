package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoryDao;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.dataAccess.JdbcInstructorDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		// Instructor
		Instructor instructor = new Instructor(1, "Melih", "Kocabiyik");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		// Category
		Category category1 = new Category(1, "Kodlama");
		Category category2 = new Category(2, "Kodlama");
		Category[] categories = {category1, category2};
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		for(Category category : categories) {
			categoryManager.add(category);
		}
		
		// Course
		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2, "C++", 150);
		Course[] courses = {course1, course2};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		for(Course course : courses) {
			courseManager.add(course);
		}
	}
}
