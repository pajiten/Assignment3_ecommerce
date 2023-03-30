package com.ecommerce.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;



@Entity
@Table(name = "product_order") /*table name in MySQL*/
@IdClass(po_user.class)
@EnableTransactionManagement
public class product_order {
	@Id
	@Column(name = "userid")
	private int userid;
	
	@Id
	@Column(name = "prod_id")
	private int prod_id;
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	
	


}