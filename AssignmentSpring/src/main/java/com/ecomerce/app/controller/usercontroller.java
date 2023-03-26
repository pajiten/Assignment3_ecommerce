package com.ecomerce.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ecomerce.app.model.product;
import com.ecomerce.app.model.user;
import com.ecomerce.app.service.userService;

@RestController
@RequestMapping("users")
public class usercontroller {

	@Autowired    
	userService userServ;
		
	// retrieve all products from database
		@GetMapping("all")
		private List<user> getAlluserdetail()
		{
			return userServ.getAllUsers();
		}    

}
