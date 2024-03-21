package com.japanese.appliaction.service;

import java.util.List;

import com.japanese.appliaction.model.Roles;

public interface RoleApi {
	
	public void save(Roles roles) ;
	
	public List<Roles> findAll();
	
	public Roles findById(Long id);
	
	public boolean editRole(Long id ,Roles roles);

}
