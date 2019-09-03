package com.auribises.main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.auribises.model.Order;

public class OrderApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Order order = new Order();
		System.out.println(">> Enter Order Id:");
		order.oid = scanner.nextInt();
		
		System.out.println(">> Enter Order Price:");
		order.price = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(">> Enter Customer Name:");
		order.name = scanner.nextLine();
		
		String orderData = "\n"+order.oid+","+order.name+","+order.price;
		
		System.out.println(">> "+orderData);
		
		System.out.println(">> Would You Like to Save Order data: (Yes/No)");
		String choice = scanner.nextLine();
		
		if(choice.equalsIgnoreCase("yes")){
			
			
			// Exception Handling Block
			try {
				
				File file = new File("/Users/ishantkumar/Downloads/orders.csv");
				//FileWriter writer = new FileWriter(file);     // overwrite
				FileWriter writer = new FileWriter(file, true); // true : append mode
				writer.write(orderData);
				
				writer.close();
				
			} catch (Exception e) {
				System.out.println(">> Some Error Occurred"+e);
			}
			
			System.out.println(">> Order Saved in File !!");
			
		}else{
			System.out.println(">> Thank you !!");
		}
		
		
		

	}

}
