package com.auribises.inheritance;

public class Block {

	// Constructor
	Block(){
		System.out.println(">> Block Constructor Executed");
	}
	
	// Initialization Block : Gets Executed Before Constructor
	{
		System.out.println(">> Initialization Block Executed 2");
	}
	
	{
		System.out.println(">> Initialization Block Executed 1");
	}
	
	// Static Initialization Block : Gets Executed When class loads 
	static {
		System.out.println(">> static Initialization Block Executed 2");
	}
	
	static {
		System.out.println(">> static Initialization Block Executed 1");
	}
	
	// main method
	public static void main(String[] args) {
		
		System.out.println(">> main Executed");
		
		Block b1 = new Block(); // Object Construction Statement
		
		System.out.println();
		
		Block b2 = new Block(); // Object Construction Statement
		
	}

}
