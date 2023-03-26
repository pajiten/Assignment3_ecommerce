package com.ecomerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecomerce.app.model.product; 
import java.util.List;

public interface ProductRepository extends JpaRepository<product, Integer>   /*product is class name in model */
{

	 @Query("SELECT p FROM product p WHERE " +
	            "p.season LIKE CONCAT('%',:season, '%')" )
	    List<product> searchProducts(String season);
	    
	   
	    @Query("SELECT p FROM product p WHERE " +
	            "p.category LIKE CONCAT('%',:category, '%')" )
		List<product> searchProdCatg(String category);   
   
}  

