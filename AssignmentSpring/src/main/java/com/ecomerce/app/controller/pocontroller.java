package com.ecomerce.app.controller;

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

import com.ecomerce.app.model.product;
import com.ecomerce.app.model.product_order;
import com.ecomerce.app.model.user;
import com.ecomerce.app.repository.POrespository;
import com.ecomerce.app.repository.ProductRepository;
import com.ecomerce.app.repository.userRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class pocontroller {

	@Autowired
	  private userRepository UsrRepo;
	
	@Autowired
	  private ProductRepository PrdRepo;

	  @Autowired
	  private POrespository POrepo;

	  
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

