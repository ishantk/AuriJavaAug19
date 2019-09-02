package com.auribises.model; // To Organize our Code which enhanced Modularity :)

import java.util.Date;

public class Restaurant {

	String name;
	String phone;
	String email;
	Date openingHours;
	Date closingHours;
	
	Menu menu;	// Has-A 1 to 1 Relationship
	
	public Restaurant() {
	}

	public Restaurant(String name, String phone, String email, Date openingHours, Date closingHours, Menu menu) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", email=" + email + ", openingHours=" + openingHours
				+ ", closingHours=" + closingHours + ", menu=" + menu + "]";
	}
	
}
