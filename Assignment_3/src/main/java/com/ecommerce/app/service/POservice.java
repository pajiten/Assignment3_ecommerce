package com.ecommerce.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.model.product_order;
import com.ecommerce.app.model.user;
import com.ecommerce.app.repository.POrespository;


//defining the business logic  
@Service  
public class POservice {
	@Autowired  
	POrespository PORepo;

	public List<product_order> getall() {
		// TODO Auto-generated method stub
		List<product_order> po = new ArrayList<product_order>();  
		PORepo.findAll().forEach(po1 -> po.add(po1));  
		return po;  
	}  

}
