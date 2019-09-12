package com.auribsies.main;

import java.util.Scanner;

import com.auribises.dao.DBHelper;
import com.auribises.model.Customer;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		
		System.out.println(">> Add Customer Details: ");
		System.out.println("========================");
		System.out.println(">> Enter Customer Name:");
		customer.name = scanner.nextLine();
		System.out.println(">> Enter Customer Phone:");
		customer.phone = scanner.nextLine();
		System.out.println(">> Enter Customer Email:");
		customer.email = scanner.nextLine();
		
		System.out.println(">> Details Enetered are as Following:");
		System.out.println(customer);

		System.out.println(">> Would you like to save the customer(yes/no)");
		String choice = scanner.nextLine();
		
		if(choice.equals("yes")){
			
			DBHelper db = new DBHelper();
			db.createConnection();
			db.saveCustomerInDB(customer);
			db.closeConnection();
			
			System.out.println(">> Thank You !! We have Added Customer "+customer.name);
		}else{
			System.out.println(">> Thank You !! We have Not Added Customer "+customer.name);
		}
		
		// PS: Data Must be Saved in DataBase
			
		

	}

}
