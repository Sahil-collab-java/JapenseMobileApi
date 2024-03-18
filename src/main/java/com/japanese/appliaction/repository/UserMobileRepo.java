package com.japanese.appliaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.User;

@Repository
public interface UserMobileRepo extends JpaRepository<User, Long> {

	Boolean existsByEmail(String email);

	Boolean existsByEmailAndPassword(String email, String pass);

	User findByEmailAndPassword(String email, String pass);

}
