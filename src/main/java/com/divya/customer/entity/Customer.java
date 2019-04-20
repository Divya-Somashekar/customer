package com.divya.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customertab")
public class Customer {
	
	@Id
	public int id;
	@Column
	public String customer_name;
	@Column
	public String customer_email;
	@Column public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customer_name=" + customer_name + ", customer_email=" + customer_email + "]";
	}
	
	
	
}
