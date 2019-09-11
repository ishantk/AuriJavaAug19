package com.auribises.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import com.auribises.model.Product;

public class FileReaderApp {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","my_products_11_9.csv");
			
			/*
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			while( (line = buffer.readLine()) != null ){
				//System.out.println(line);
				
				String[] strArr = line.split(",");
				//System.out.println(strArr[0] + " | "+strArr[1]+" | "+strArr[2]);
				
				Product pRef = new Product();
				pRef.pid = Integer.parseInt(strArr[0]);
				pRef.name = strArr[1];
				pRef.price = Integer.parseInt(strArr[2]);
				
				pRef.showProduct();
				
			}
			
			buffer.close();
			reader.close();
			*/
			
			/*
			FileInputStream stream = new FileInputStream(file);
			
			int b = -1;
			
			while((b = stream.read()) != -1){ // -1 means end of file
				char ch = (char)b;
				System.out.print(ch);
			}
			
			stream.close();
			
			*/
			
		} catch (Exception e) {
			System.out.println(">> Exception: "+e);
		}

	}

}

// PS: Read data of Students from User and save it in csv file
//     Read that csv file and find the Student whose age is maximum and whose age is minimum 


