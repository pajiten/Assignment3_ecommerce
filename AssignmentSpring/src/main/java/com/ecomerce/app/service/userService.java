package com.ecomerce.app.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.ecomerce.app.model.user;

import com.ecomerce.app.repository.userRepository;

//defining the business logic  
@Service 
public class userService {
	@Autowired  
	userRepository UsrRepo;  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<user> getAllUsers()   
	{
		List<user> users = new ArrayList<user>();  
		UsrRepo.findAll().forEach(user1 -> users.add(user1));  
		return users;  
	}
	
}
