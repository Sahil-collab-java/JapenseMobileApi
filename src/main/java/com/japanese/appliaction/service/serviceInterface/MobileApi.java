package com.japanese.appliaction.service.serviceInterface;

import com.japanese.appliaction.model.User;

public interface MobileApi {
	
 public  Boolean existByEmail(String email);
 
 public void sendNotification(String email);
 
 public void saveTheUser(User user);
 
 public User checkTheEmailAndPassword(String email, String pass);
}
