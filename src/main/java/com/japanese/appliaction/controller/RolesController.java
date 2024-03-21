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

import com.japanese.appliaction.model.Roles;
import com.japanese.appliaction.service.RoleApiImpl;

@Controller
public class RolesController {
	
	@Autowired RoleApiImpl roleApiImpl ;
	
	//Save Role
	@PostMapping("/saveRoles")
	public ResponseEntity<String> saveRoleData(@RequestBody Roles roles){
		roleApiImpl.save(roles);
		return ResponseEntity.status(HttpStatus.OK).body("Data Saved SucessFully !!!");
	}
	
	//Find All Roles 
	@GetMapping("/getRolesData")
	@ResponseBody
	public List<Roles> getAllRoles(){
		return roleApiImpl.findAll();
	}
	
	//Find Role by Id 
	@PostMapping("/getRolesDataById/{id}")
	   public ResponseEntity<Roles> getRoleData(@PathVariable("id") Long id){
		Roles role = roleApiImpl.findById(id);
		if(role != null) {
			 return ResponseEntity.status(HttpStatus.OK).body(role);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
	}
	
	//Update Roles Data
	@PostMapping("/editRoles/{id}")
	public ResponseEntity<String> editRoleDetails(@PathVariable ("id") Long id,@RequestBody Roles roles ){
		boolean updateRole = roleApiImpl.editRole(id,roles);
		if(updateRole) {
			 return ResponseEntity.status(HttpStatus.OK).body("Data Deleted Successfully");
	     } else {
	         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Batch not found or delete failed");
	     }
	}
	
	

	
}
