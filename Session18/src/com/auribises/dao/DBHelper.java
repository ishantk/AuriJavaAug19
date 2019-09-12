package com.auribises.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.auribises.model.Customer;

/*
 	
 	Step1:
 		Load the Driver
 		1.1 Download Type4 Driver i.e. Jar File from MySQL Web-site | Explore -> Type 1 to Type 3
 		1.2 Link Jar file with your Java Project
 		1.3 Use Class.forname API to load the Driver
 		
 	Step2:
 		Create Connection with DataBase
 		2.1 URL to DataBase
 		2.2 User		root
 		2.3 Password	
 		2.4 DataBase Name
 		2.4 Connection and DriverManager APIs to create connection
 	
 	Step3:
 		Write SQL Statement and Execute it
 		3.1 Create a String which is SQL Statement
 		3.2 Use API Statement or PreparedStatement to execute SQL Statement
 	
 	Step4:
 		Close Connection
 		4.1 Use API close() to close the connection :)
 */

public class DBHelper {
	
	Connection con; // con is a reference variable which is by default null
	Statement stmt;
	PreparedStatement pStmt;
	
	
	public DBHelper(){
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void createConnection(){
		try {
		
			String user = "root";
			String password = "";
			String dbName = "auridb";
			String url = "jdbc:mysql://localhost/"+dbName;
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println(">> 2. Connection Created");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// Method Takes Input as Reference to Customer Object
	public void saveCustomerInDB(Customer customer){
		try {
			
			/*
			// Dynamic SQL Statement : Substitution of Data in SQL Statement
			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"')";
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			*/
			
			String sql = "insert into Customer values(null, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, customer.name);
			pStmt.setString(2, customer.phone);
			pStmt.setString(3, customer.email);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+customer.name+" Saved in DataBase");
			}else{
				System.out.println(">> "+customer.name+" Not Saved in DataBase");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	
	public void closeConnection(){
		try {
			
			con.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}

}
