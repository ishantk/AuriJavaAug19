package com.auribises.inheritance;

class Parent{
	
	Parent(){
		System.out.println(">> Parent Object Constructed");
	}
	
	void purchaseBike(){
		System.out.println(">> Lets Purchase Bajaj Pulsar");
	}
}

class Child extends Parent{
	
	Child(){
		System.out.println(">> Child Object Constructed");
	}
	
	// Overriding
	// When in Child we re-define a function with same signature again
	// Access Modifier or Child is either same of Parent or more !!
	public void purchaseBike(){
		System.out.println(">> Lets Purchase Royal Enfield");
	}
	
}

public class OverridingApp {

	public static void main(String[] args) {
		
		Child cRef = new Child();
		cRef.purchaseBike();

	}

}
