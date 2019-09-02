package com.auribises.model;

public class FoodItem {

	String name;
	String desription;
	int price;
	int quantity;
	int category;	// 1 - Starter 2 - Beverage
	
	public FoodItem(){
		
	}
	
	public FoodItem(String name, String desription, int price, int quantity, int category) {
		this.name = name;
		this.desription = desription;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", desription=" + desription + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
	
}
