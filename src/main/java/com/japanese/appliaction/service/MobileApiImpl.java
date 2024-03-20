package com.japanese.appliaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japanese.appliaction.model.User;
import com.japanese.appliaction.repository.UserMobileRepo;
import com.japanese.appliaction.service.serviceInterface.MobileApi;

@Service
public class MobileApiImpl implements MobileApi {
	
	@Autowired
	UserMobileRepo userMobileRepo;
	

	@Override
	public Boolean existByEmail(String email) {
			return userMobileRepo.existsByEmail(email);
	}



	@Override
	public void sendNotification(String email) {
		// TODO Auto-generated method stub
		}

	@Override
	public void saveTheUser(User user) {
		user.setRole("student");
		userMobileRepo.save(user);
}

	@Override
	public User checkTheEmailAndPassword(String email, String pass) {
		// TODO Auto-generated method stub
		return userMobileRepo.findByEmailAndPassword(email, pass);
	}

}
