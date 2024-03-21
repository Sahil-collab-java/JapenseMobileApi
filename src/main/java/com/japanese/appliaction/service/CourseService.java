package com.japanese.appliaction.service;

import java.util.List;
import java.util.Optional;

import com.japanese.appliaction.model.Course;

public interface CourseService {

	List<Course> getAllCourses();
	
	Optional<Course> getCoursesById(Long id);
	
	Course saveCourse(Course course);
	
	Course updateCourse(Long id, Course course);
	
	void deleteCourse(Long id);
	
}
