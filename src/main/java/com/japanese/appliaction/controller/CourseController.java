package com.japanese.appliaction.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.japanese.appliaction.utils.Constant;

@RestController
public class CourseController {

	@Autowired
	CourseServiceImpl courseService;

	// GET ALL COURSES
	@GetMapping("/courses")
	public ResponseEntity<Object> getAllCourses() {
		try {
			List<Course> courses = courseService.getAllCourses();

			// Construct a success response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
			response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
			response.put("message", "All courses fetched successfully");
			response.put("data", courses);

			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (Exception e) {
			// Construct an error response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Failed to fetch courses data");
			response.put("data", Collections.emptyList());

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	// GET ALL COURSES BY ID
	@GetMapping("/courses/{id}")
	public ResponseEntity<Object> getCourseById(@PathVariable Long id) {
	    try {
	        Optional<Course> optionalCourse = courseService.getCoursesById(id);
	        if (optionalCourse.isPresent()) {
	            Course course = optionalCourse.get();
	            
	            // Construct a success response
	            Map<String, Object> response = new HashMap<>();
	            response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
	            response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
	            response.put("message", "Course fetched successfully");
	            response.put("data", course);

	            return ResponseEntity.status(HttpStatus.OK).body(response);
	        } else {
	            // Construct an error response if the course is not found
	            Map<String, Object> response = new HashMap<>();
	            response.put("status", Constant.ERROR_RESPONSE_STATUS);
	            response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
	            response.put("message", "Course not found with ID: " + id);
	            response.put("data", Collections.emptyList());

	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	        }
	    } catch (Exception e) {
	        // Construct an error response for unexpected errors
	        Map<String, Object> response = new HashMap<>();
	        response.put("status", Constant.ERROR_RESPONSE_STATUS);
	        response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
	        response.put("message", "Failed to fetch course data");
	        response.put("data", Collections.emptyList());

	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	    }
	}

	// SAVE
	@PostMapping("/saveCourse")
	public ResponseEntity<Object> addCourse(@RequestBody Course course) {
		try {
			Course savedCourse = courseService.saveCourse(course);

			// Construct a success response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
			response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
			response.put("message", "Course saved successfully");
			response.put("data", savedCourse);

			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			// Construct an error response for unexpected errors
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Failed to save course");
			response.put("data", Collections.emptyList());

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	// UPDATE
	@PutMapping("/updateCourse/{id}")
	public ResponseEntity<Object> updateCourse(@PathVariable Long id, @RequestBody Course course) {
		try {
			Course updatedCourse = courseService.updateCourse(id, course);
			if (updatedCourse != null) {
				// Construct a success response
				Map<String, Object> response = new HashMap<>();
				response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
				response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
				response.put("message", "Course updated successfully");
				response.put("data", updatedCourse);

				return ResponseEntity.status(HttpStatus.OK).body(response);
			} else {
				// Construct an error response if the course is not found
				Map<String, Object> response = new HashMap<>();
				response.put("status", Constant.ERROR_RESPONSE_STATUS);
				response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
				response.put("message", "Course with ID: " + id + " not found.");
				response.put("data", Collections.emptyList());

				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
			}
		} catch (NoSuchElementException e) {
			// Construct an error response if the course is not found
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Course with ID: " + id + " not found.");
			response.put("data", Collections.emptyList());

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
	}

	// DELETE
	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<Object> deleteCourse(@PathVariable Long id) {
		try {
			courseService.deleteCourse(id);

			// Construct a success response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
			response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
			response.put("message", "Course with ID: " + id + " has been deleted successfully.");

			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (EmptyResultDataAccessException e) {
			// Construct an error response if the course is not found
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Course with ID: " + id + " not found.");
			response.put("data", Collections.emptyList());

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
	}

}
