package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private	Logger[] loggers;
	private Course[] courses;
	
	public CourseManager() {

	}
	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	public void add(Course course) throws Exception {
		for(Course courses : courses) {
			if(course.getCoursePrice() < 10) {
				throw new Exception("Course price cannot be less than 10!");
			}
			if(courses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name cannot be the same!");
			}
		}
		courseDao.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	

}
