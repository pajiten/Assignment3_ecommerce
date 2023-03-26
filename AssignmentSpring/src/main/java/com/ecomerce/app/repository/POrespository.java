package com.ecomerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.app.model.product_order;
 
public interface POrespository  extends JpaRepository<product_order, Integer> {

}
