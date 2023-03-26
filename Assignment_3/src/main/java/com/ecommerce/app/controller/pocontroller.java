package com.ecommerce.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.model.product;
import com.ecommerce.app.model.product_order;
import com.ecommerce.app.model.user;
import com.ecommerce.app.repository.POrespository;
import com.ecommerce.app.repository.ProductRepository;
import com.ecommerce.app.repository.userRepository;
import com.ecommerce.app.service.POservice;
import com.ecommerce.app.service.userService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class pocontroller {

	@Autowired
	  private userRepository UsrRepo;

	  @Autowired
	  private POrespository POrepo;

		@Autowired    
		POservice POServ;
		
		@GetMapping("all")
		public List<product_order> getAllpos()
		{
			return POServ.getall();
		}
	  
	  @GetMapping("/{userid}/products")
	  public ResponseEntity<List<product_order>> getAllProductsByUserId(@PathVariable("userid") int userid) {
	/*		  throws RelationNotFoundException {    */
		  
	    user user = UsrRepo.findById(userid).get();
    
	    /*	   .orElseThrow(() -> new RelationNotFoundException("Not found user with id = " + userid)); */

	    List<product_order> po = new ArrayList<product_order>();
	    po.addAll(user.getorders());
	    
	    return new ResponseEntity<>(po, HttpStatus.OK);
	  
	  }
	  
	  
	  
}
