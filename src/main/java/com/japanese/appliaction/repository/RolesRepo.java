package com.japanese.appliaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles,Long> {

}
