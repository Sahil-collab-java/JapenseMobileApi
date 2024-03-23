package com.japanese.appliaction.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japanese.appliaction.model.Course;
import com.japanese.appliaction.repository.CourseRepo;
import com.japanese.appliaction.service.serviceInterface.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepo courseRepo;

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public Optional<Course> getCoursesById(Long id) {
		return courseRepo.findById(id);
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}

	@Override
    public Course updateCourse(Long id, Course course) {
        Optional<Course> existingCourseOptional = courseRepo.findById(id);
        if (existingCourseOptional.isPresent()) {
            course.setId(id); 
            return courseRepo.save(course);
        } else {
        	throw new NoSuchElementException("Course not found with ID: " + id); 
        }
    }

	@Override
	public void deleteCourse(Long id) {
		courseRepo.deleteById(id);
	}

}
