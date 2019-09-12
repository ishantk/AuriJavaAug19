package com.auribises.model;

/*
 	ORM : Object Relational Mapping
 		  Object Structure Type Name becomes Table Name
 		  Attributes of Object becomes Columns of Table
 
 		  Table 	: Customer
 		  Columns	: | 	cid		|	name	|	phone	|	email	|
 		  
 		  JAVA
 		  class Customer {
 		  	int cid;
			String name;
			String phone;
			String email;
 		  }
 		  
 		  Customer cRef = new Customer(1, "John", "+91 99999 88888", "john@example.com");
 		  
 		  SQL
 		  create table Customer(
 		  	cid int primary key auto_increment,
 		  	name varchar(256),
 		  	phone varchar(256),
 		  	email varchar(256)		  	
 		  )
 		  
 		  insert into Customer values(null, 'John', '+91 99999 88888', 'john@example.com')
 
 */

public class Customer {
	
	public int cid;
	public String name;
	public String phone;
	public String email;
	
	public Customer() {
	
	}

	public Customer(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	

}
