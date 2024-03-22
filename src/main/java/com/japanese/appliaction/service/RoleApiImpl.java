package com.japanese.appliaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japanese.appliaction.model.Roles;
import com.japanese.appliaction.repository.RolesRepo;
import com.japanese.appliaction.service.serviceInterface.RoleApi;


@Service
public class RoleApiImpl implements RoleApi {

	@Autowired RolesRepo rolesRepo ;

	@Override
	public void save(Roles roles) {
		rolesRepo.save(roles);
	}

	@Override
	public List<Roles> findAll() {
		return rolesRepo.findAll();
	}

	@Override
	public Roles findById(Long id) {
		return rolesRepo.findById(id).orElse(null);
	}

	@Override
	public boolean editRole(Long id, Roles roles) {
		if (rolesRepo.existsById(id)) {
            roles.setId(id);
            rolesRepo.save(roles);
            return true;
        }
		return false;
	}

	 

}
