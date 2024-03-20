package com.japanese.appliaction.controller;

import java.util.List;

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

import com.japanese.appliaction.model.AddStudentSub;
import com.japanese.appliaction.service.AddStudentImp;

@RestController
public class AddStudentSubController {
	
	    @Autowired
	    private AddStudentImp addStudentImp;

	    @PostMapping("/saveStudent")
	    public ResponseEntity<String> createContact(@RequestBody AddStudentSub addStudentSub){
	        String status =  addStudentImp.save(addStudentSub);
	        return new ResponseEntity<>(status, HttpStatus.CREATED);
	    }

	    @GetMapping("/getAllStudent")
	    public ResponseEntity<List<AddStudentSub>> getAllStudent(){
	       List<AddStudentSub> add = addStudentImp.getAllStudents();
	       return new ResponseEntity<>(add,HttpStatus.OK);
	    }


	    @GetMapping("/getStudentById/{sid}")
	    public ResponseEntity<AddStudentSub> getById(@PathVariable("sid") Long sid){
	    	AddStudentSub add =  addStudentImp.getById(sid);
	       return new ResponseEntity<>(add,HttpStatus.OK);
	    }

	    @DeleteMapping("/deleteStudentById/{sid}")
	    public ResponseEntity<String> deleteById(@PathVariable("sid") Long sid){
	        String add =  addStudentImp.deleteById(sid);
	        return new ResponseEntity<>(add,HttpStatus.OK   );
	    }


	    @PutMapping("/updateStudent")
	    public ResponseEntity<String> update(@RequestBody AddStudentSub addStudentSub){
	    	  System.out.println(addStudentSub.getNote() != null);
	        String upsert =  addStudentImp.update(addStudentSub);
	        return new ResponseEntity<>(upsert,HttpStatus.OK);
	    }

}
