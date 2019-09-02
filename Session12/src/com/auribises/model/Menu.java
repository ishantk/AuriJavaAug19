package com.auribises.model;

import java.util.Arrays;

// Model or Bean or POJO(Plain Old Java Object) or Object Structure
public class Menu {

	// Menu HAS Food Items
	FoodItem[] items; // Has-A 1 to many Relationship
	
	public Menu() {
		
	}

	public Menu(FoodItem[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Menu [items=" + Arrays.toString(items) + "]";
	}
	
}
