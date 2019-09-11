package com.auribises.model;

public class Product {

	// Attributes : Property of Object
	public int pid;
	public String name;
	public int price;
	
	public Product() {
	
	}

	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return pid+","+name+","+price+"\n";
	}
	
	public void showProduct(){
		System.out.println("===========================");
		System.out.println("PID\t"+pid);
		System.out.println("NAME\t"+name);
		System.out.println("PRICE\t"+price);
		System.out.println("===========================");
	}
}
