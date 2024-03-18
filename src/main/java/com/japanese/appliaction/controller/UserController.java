package com.japanese.appliaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.japanese.appliaction.model.User;
import com.japanese.appliaction.service.MobileApiImpl;

@RestController
public class UserController {
	
	@Autowired
	private MobileApiImpl mobileApiImpl;
	
	
	
	 @PostMapping("/register")
	    public ResponseEntity<String> registerUser(@RequestBody User user) {
	        // Check if the email already exists
	        if (mobileApiImpl.existByEmail(user.getEmail())) {
	           return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already registered. Please Login The App");
	           
	        } else {
	        	mobileApiImpl.saveTheUser(user);
	            // Email does not exist, send notification and prompt to create a password
	        	mobileApiImpl.sendNotification(user.getEmail());
	            return ResponseEntity.status(HttpStatus.OK).body("Data Saved SucessFully !!!");
	        }
	    }
	 
	 
	 @PostMapping("/login")
	    public ResponseEntity<String> loginUser(@RequestBody User user) {
	        // Check if the email exists
	        if (mobileApiImpl.existByEmail(user.getEmail())) {
	            // Email exists, check password
	            if (mobileApiImpl.checkTheEmailAndPassword(user.getEmail(), user.getPassword()) != null) {
	                // Password is correct
	                return ResponseEntity.status(HttpStatus.OK).body("Login successful");
	            } else {
	                // Incorrect password
	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect password");
	            }
	        } else {
	            // Email does not exist
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email not registered");
	        }
	    }

}
