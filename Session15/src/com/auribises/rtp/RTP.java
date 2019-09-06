package com.auribises.rtp;

class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destination){
		System.out.println(">> Cab Booked from "+source+" to "+destination);
	}
}

class MicroCab extends Cab{ // Parent Child Relationship
	
	MicroCab() {
		System.out.println(">> MicroCab Object Constructed");
	}
	
	// Overriding
	void bookCab(String source, String destination){
		System.out.println(">> Micro Cab Booked from "+source+" to "+destination);
	}
	
}

class MiniCab extends Cab{ // Parent Child Relationship
	
	MiniCab() {
		System.out.println(">> MiniCab Object Constructed");
	}
	
	// Overriding
	void bookCab(String source, String destination){
		System.out.println(">> Mini Cab Booked from "+source+" to "+destination);
	}
	
}

class SedanCab extends Cab{ // Parent Child Relationship
	
	SedanCab() {
		System.out.println(">> SedanCab Object Constructed");
	}
	
	// Overriding
	void bookCab(String source, String destination){
		System.out.println(">> Sedan Cab Booked from "+source+" to "+destination);
	}
	
}

public class RTP {

	public static void main(String[] args) {
		
		//Cab cRef = new Cab(); // Object Construction Statement
		
		/*Cab cRef;
		cRef = new Cab();
		
		cRef.bookCab("Country Homes", "Pristine Magnum");*/
		
		/*MicroCab mRef;
		mRef = new MicroCab();
		
		mRef.bookCab("Country Homes", "Pristine Magnum");*/
		
		/*
		SedanCab sRef;
		sRef = new SedanCab();
		sRef.bookCab("Country Homes", "Pristine Magnum");*/
		
		// Reference variable belongs to Parent 
		Cab cRef;
		
		// Reference variable of Parent is pointing to the Object of Child
		cRef = new MicroCab(); // Object belongs to Child | Polymorphic Statement
		cRef.bookCab("Country Homes", "Pristine Magnum");
		
		System.out.println();
		
		cRef = new MiniCab();
		cRef.bookCab("Country Homes", "Pristine Magnum");
		
		System.out.println();
		
		cRef = new SedanCab();
		cRef.bookCab("Country Homes", "Pristine Magnum");
	}

}
