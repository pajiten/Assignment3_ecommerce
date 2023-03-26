package com.ecomerce.app.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "user") /*table name in MySQL*/
@EnableTransactionManagement
public class user {
	
	@Id
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private int phone_number;
	
	 @OneToMany(targetEntity = product_order.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinColumn(name = "userid")
	 private List<product_order> product_order;  
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public Collection<? extends com.ecomerce.app.model.product_order> getorders() {
		// TODO Auto-generated method stub
		return product_order ;
	}


	
}
