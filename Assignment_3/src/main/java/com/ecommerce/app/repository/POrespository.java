package com.ecommerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.app.model.product_order;
 
public interface POrespository  extends JpaRepository<product_order, Integer> {

}