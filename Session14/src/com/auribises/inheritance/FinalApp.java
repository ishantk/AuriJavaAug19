package com.auribises.inheritance;

final class P{
	final void show(){ // which cannot be over-rided by Child
		System.out.println(">> This is show of P");
	}
}

class Q{ // error -> extends P{
	//void show(){ // error
	//	System.out.println(">> This is show of Q");
	//}
}

public class FinalApp {

	public static void main(String[] args) {
		
		int x = 10;		// Create Operation
		x = 100; 		// Update Operation
		
		final int y = 10; // Create Operation -> FINAL
		//y = 100;		  // Update operation -> ERROR
		
		

	}

}
