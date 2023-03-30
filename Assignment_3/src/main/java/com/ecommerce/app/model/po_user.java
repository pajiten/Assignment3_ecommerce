package com.ecommerce.app.model;

import java.io.Serializable;

public class po_user implements Serializable {
    private int userid;
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