package com.auribises.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import com.auribises.model.Product;

// File -> Which points to a file on our computer
// FileWriter -> Writes in File 	(Text)
// FileReader -> Reads from File	(Text)
// FileOutputStream -> Writes in File (byte)
// FileInputStream -> Reads from File (byte)

public class FileWriterApp {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "iPhoneXI", 90000);
		Product p2 = new Product(201, "AlphaBounce", 9000);
		
		//System.out.println(p1);
		//System.out.println(p1.toString());
		
		//Scanner scanner = new Scanner(System.in);
		
		// We wish to save data of Object in File
		// To Handle Errors at Run Time
		try{
			
			//File file = new File("/Users/ishantkumar/Downloads/products_11_9.csv");

			File file = new File("/Users/ishantkumar/Downloads","my_products_11_9.csv");
			/*
			if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" Does Not Exists !!");
			}*/
			
			//FileWriter writer = new FileWriter(file);
			//FileWriter writer = new FileWriter(file, true); // enable append mode
			//String data = p1.toString();
			//writer.write(data);
			
			//writer.close();
			
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);
			String data = p2.toString();
			stream.write(data.getBytes()); // write data in the form of bytes
			stream.close();
			
			System.out.println(">> Data Saved in File !!");
			
			
		}catch(Exception e){
			System.out.println("Some Error: "+e);
		}
		
	}

}
