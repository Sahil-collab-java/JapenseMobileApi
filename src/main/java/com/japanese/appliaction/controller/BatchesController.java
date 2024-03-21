package com.japanese.appliaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.japanese.appliaction.model.Batches;
import com.japanese.appliaction.service.BatchesImpl;



@Controller
public class BatchesController {

	@Autowired BatchesImpl batchesImpl;
	
	//Save Add Batches
	@PostMapping("/saveBatches")
	public ResponseEntity<String> saveBatchDetails(@RequestBody Batches batches){
		batchesImpl.saveBatches(batches);
		return ResponseEntity.status(HttpStatus.OK).body("Data Saved SucessFully !!!");
	}
	
	//Baches List
	@GetMapping("/getAllBatchesData")
	@ResponseBody
    public List<Batches> getAllData() {
        return batchesImpl.findAll();
    }
	
	//update Batches
	 @PostMapping("/editBatches/{id}")
	    public ResponseEntity<String> editBatchDetails(@PathVariable("id") Long id, @RequestBody Batches batches) {
	        boolean updated = batchesImpl.editBatches(id, batches);
	        if (updated) {
	            return ResponseEntity.status(HttpStatus.OK).body("Data Updated Successfully !!!");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch not found or update failed");
	        }
	    }
	//delete Batches
	 @PostMapping("/deleteBatches/{id}")
	 public ResponseEntity<String> deleteBatch(@PathVariable("id") Long id) {
	     boolean deleted = batchesImpl.deleteBatches(id);
	     if (deleted) {
	         return ResponseEntity.status(HttpStatus.OK).body("Data Deleted Successfully");
	     } else {
	         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch not found or delete failed");
	     }
	 }


	 
	 //Find Batch By id
	 @PostMapping("/getBatchesDataById/{id}")
	    public ResponseEntity<?> getBatchDataById(@PathVariable("id") Long id) {
	        Batches batch = batchesImpl.findById(id);
	        if (batch != null) {
	            return ResponseEntity.status(HttpStatus.OK).body(batch);
	        } else {

	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch with ID " + id + " not found");

	        }
	    }
	
}
