package com.auribises.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.auribises.model.FoodItem;
import com.auribises.model.Menu;
import com.auribises.model.Restaurant;

public class ZomatoApp {

	public static void main(String[] args) {
		
		//FoodItem item1 = new FoodItem("Paneer Tikka", "Achari Paneer Tikka", 300, 10, 1);
		//FoodItem item2 = new FoodItem("Soya Champ", "Achari Soya Champ", 100, 8, 1);
		//......
		
		// Created an Array of FoodItems
		FoodItem[] items = new FoodItem[5];
		items[0] = new FoodItem("Paneer Tikka", "Achari Paneer Tikka", 300, 10, 1);
		items[1] = new FoodItem("Soya Champ", "Achari Soya Champ", 100, 8, 1);
		
		Menu menu = new Menu(items);
		
		Date date1=null, date2=null;
		
		
		// SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("hh:mm");
		try{
			date1 = format.parse("10:30");
			date2 = format.parse("23:00");
		}catch(Exception e){
			System.out.println(">> Some Exception");
		}
		
		Restaurant restaurant = new Restaurant("Veggies Delight", "+91 99999 88888", 
				"veggies@example.com", date1, date2, menu);
		

		System.out.println(restaurant);
		
	}

}
