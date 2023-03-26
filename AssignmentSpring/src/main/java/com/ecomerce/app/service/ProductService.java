package com.ecomerce.app.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;  
import com.ecomerce.app.model.product;
import com.ecomerce.app.repository.ProductRepository;

//defining the business logic  
@Service  
public class ProductService {

	@Autowired  
	ProductRepository PrdRepo;  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<product> getAllProducts()   
	{
		List<product> prods = new ArrayList<product>();  
		PrdRepo.findAll().forEach(prod1 -> prods.add(prod1));  
		return prods;  
	}

	public product getProductsById(int prodid) {
		// TODO Auto-generated method stub
		return PrdRepo.findById(prodid).get();
	}

// Season
	public List<product> searchProducts(String season) {
        List<product> products = PrdRepo.searchProducts(season);
        return products;
    }
	
// Search Category	
	public List<product> searchProdCatg(String category) {
        List<product> products = PrdRepo.searchProdCatg(category);
        return products;
    }

	public product saveProduct(product prod) {
		return PrdRepo.save(prod);
	}

	public product updprod(product prod) {
		// TODO Auto-generated method stub
		return PrdRepo.save(prod);
	}

	public ResponseEntity<HttpStatus> delprod(int prod_id) {
		// TODO Auto-generated method stub
		
		PrdRepo.deleteById(prod_id);
		return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}



}
