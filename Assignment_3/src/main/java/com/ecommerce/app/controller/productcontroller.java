package com.ecommerce.app.controller;

import java.util.ArrayList;
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

import com.ecommerce.app.model.product;
import com.ecommerce.app.model.product_order;
import com.ecommerce.app.model.user;
import com.ecommerce.app.repository.POrespository;
import com.ecommerce.app.repository.ProductRepository;
import com.ecommerce.app.service.ProductService;
import com.ecommerce.app.service.userService;

@RestController
@RequestMapping("products")
public class productcontroller {

	@Autowired    
	ProductService prodServ;
	@Autowired    
	userService userServ;
	
	@Autowired
	  private ProductRepository PrdRepo;

	  @Autowired
	  private POrespository POrepo;
		
	// retrieve all products from database
		@GetMapping("all")
		private List<product> getAllProducts()
		{
			return prodServ.getAllProducts();
		}	
		
	//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/product/{prod_id}")  
		private product getProducts(@PathVariable("prod_id") int prod_id)   
		{  
		return prodServ.getProductsById(prod_id);  
		}  
		

	    @GetMapping("/search")
	    public ResponseEntity<List<product>> searchProducts(@RequestParam("season") String season){
	        return ResponseEntity.ok(prodServ.searchProducts(season));
	    }
		
	    @GetMapping("/search1")
	    public ResponseEntity<List<product>> searchProdCatg(@RequestParam("category") String category){
	        return ResponseEntity.ok(prodServ.searchProdCatg(category));
	    }

		// insert new product into database
		@PostMapping("add")
		private product addProduct(@RequestBody product prod)
		{
			return prodServ.saveProduct(prod);
		}
	
	
		// update existing student 
		@PutMapping("update/{prod_id}")
		public product updateProduct(@RequestBody product prod)
		{
			return prodServ.updprod(prod);
		}
		
		// delete particular student from database
		@DeleteMapping("delete/{prod_id}")
		public ResponseEntity<HttpStatus> deleteProduct(@PathVariable int prod_id)
		{
			return prodServ.delprod(prod_id);
		}

		
}