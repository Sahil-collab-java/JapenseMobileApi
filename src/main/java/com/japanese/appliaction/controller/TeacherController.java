package com.japanese.appliaction.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.japanese.appliaction.model.Teacher;
import com.japanese.appliaction.service.TeacherServiceImpl;
import com.japanese.appliaction.utils.Constant;

@RestController
public class TeacherController {

	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	// SAVE	
	@PostMapping("/saveTeacher")
    public ResponseEntity<Object> saveTeacher(@RequestBody Teacher teacher) {
        try {
            // Generate uniqueId using UUID
            teacher.setUniqueId(UUID.randomUUID().toString());
            Teacher savedTeacher = teacherServiceImpl.save(teacher);

            // Construct a success response
            Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
            response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
            response.put("message", "Teacher information is saved successfully");
            response.put("data", savedTeacher);

            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            // Construct an error response
            Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.ERROR_RESPONSE_STATUS);
            response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
            response.put("message", "Failed to save teacher information");
            response.put("data", Collections.emptyList());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
	
	// UPDATE
	@PutMapping("/updateTeacher/{id}")
	public ResponseEntity<Object> updateTeacherById(@PathVariable Long id, @RequestBody Teacher teacher){
		try {
			Teacher updateTeacher = teacherServiceImpl.update(id, teacher);
			
			// Construct a success response
			Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
            response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
            response.put("message", "Teacher information is updated successfully for Id : " + id);
            response.put("data", updateTeacher);
            
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
		}catch(Exception e) {
			// Construct an error response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Failed to update teacher information for Id : " + id);
			response.put("data", Collections.emptyList());
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
	
	// DELETE
	@DeleteMapping("/deleteTeacher/{id}")
	public ResponseEntity<Object> deleteTeacherById(@PathVariable Long id){
		try {
			teacherServiceImpl.deleteTeacher(id);
			
			// Construct a success response
            Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
            response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
            response.put("message", "Teacher is deleted successfully for Id : " + id);

            return ResponseEntity.status(HttpStatus.OK).body(response);
		}catch(Exception e) {
			// Construct an error response
			Map<String, Object> response = new HashMap<>();
			response.put("status", Constant.ERROR_RESPONSE_STATUS);
			response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
			response.put("message", "Failed to delete teacher for Id : " + id);
			response.put("data", Collections.emptyList());
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
	
	// FETCH ALL TEACHER
	@GetMapping("/getAllTeacher")
	public ResponseEntity<Object> getAllTeacher(){
		try {
			List<Teacher> teachers = teacherServiceImpl.getAllTeacher();
			
			// Construct a success response
            Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.SUCCESS_RESPONSE_STATUS);
            response.put("statusCode", Constant.SUCCESS_RESPONSE_CODE);
            response.put("message", "All teachers fetched successfully");
            response.put("data", teachers);

            return ResponseEntity.status(HttpStatus.OK).body(response);
		}catch (Exception e) {
            // Construct an error response
            Map<String, Object> response = new HashMap<>();
            response.put("status", Constant.ERROR_RESPONSE_STATUS);
            response.put("statusCode", Constant.ERROR_RESPONSE_CODE);
            response.put("message", "Failed to fetch teachers data");
            response.put("data", Collections.emptyList());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
	}
	
}
