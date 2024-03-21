package com.japanese.appliaction.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.japanese.appliaction.model.Course;
import com.japanese.appliaction.service.CourseServiceImpl;

@RestController
public class CourseController {

	@Autowired
	CourseServiceImpl courseService;

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> courses = courseService.getAllCourses();
		return ResponseEntity.ok(courses);
	}
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<?> getCoursesById(@PathVariable Long id) {
	    Optional<Course> course = courseService.getCoursesById(id);
	    if (course.isPresent()) {
	        return ResponseEntity.ok(course.get());
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course with ID: " + id + " not found.");
	    }
	}
	
	// SAVE
	@PostMapping("/saveCourse")
	public ResponseEntity<Course> addCourse(@RequestBody Course course) {
		Course saveCourse = courseService.saveCourse(course);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveCourse);
	}

	// UPDATE
	@PutMapping("/updateCourse/{id}")
	public ResponseEntity<?> updateCourse(@PathVariable Long id, @RequestBody Course course) {
	    try {
	        Course updatedCourse = courseService.updateCourse(id, course);
	        if (updatedCourse != null) {
	            return ResponseEntity.ok(updatedCourse);
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course with ID: " + id + " not found.");
	        }
	    } catch (NoSuchElementException e) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course with ID: " + id + " not found.");
	    }
	}

	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
	    try {
	        courseService.deleteCourse(id);
	        return ResponseEntity.ok("Course with ID: " + id + " has been deleted successfully.");
	    } catch (EmptyResultDataAccessException e) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course with ID: " + id + " not found.");
	    }
	}

}
