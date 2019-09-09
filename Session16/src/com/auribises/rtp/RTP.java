package com.auribises.rtp;

/*class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed...");
	}
	
	void bookCab(){
		System.out.println(">> Cab Booked !!");
	}
}*/

// For which we cannot create objects !!
// But as per Rule of Inheritance Objects will be constructed by JVM i.e. RTE
/*
abstract class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed...");
	}
	
	// abstract function has no definition
	// its is created only within abstract class
	// This will act as a RULE by PARENT
	abstract void bookCab();
	
	// if we have n-number of abstract functions in Parent, all Children must define all of them
}
*/

// Neither we nor JVM i.e. RTE can create objects of interface
interface Cab{
	/*
	Cab(){
		System.out.println(">> Cab Object Constructed...");
	}*/
	
	void bookCab(); // public abstract void bookCab();
	
}

class MiniCab implements Cab{//extends Cab{
	MiniCab(){
		System.out.println(">> MiniCab Object Constructed...");
	}
	
	public void bookCab(){
		System.out.println(">> MiniCab Booked !!");
	}
}

class SedanCab implements Cab{//extends Cab{
	SedanCab(){
		System.out.println(">> SedanCab Object Constructed...");
	}
	
	public void bookCab(){
		System.out.println(">> SedanCab Booked !!");
	}
}

class Bike implements Cab{//extends Cab{
	Bike(){
		System.out.println(">> Bike Object Constructed...");
	}
	
	public void bookCab(){
		System.out.println(">> Bike Booked !!");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		// RTP with Parent Object    -> Ref Variable of Parent can Point to Object of Child
		// RTP without Parent Object -> Ref Variable of Interface can Point to Object which implements it 
		
		Cab cRef;
		
		cRef = new MiniCab();
		cRef.bookCab();
		
		System.out.println();
		
		cRef = new SedanCab();
		cRef.bookCab();
		
		System.out.println();
		
		cRef = new Bike();
		cRef.bookCab();
		
		System.out.println();
		
		//cRef = new Cab();   // Creating Object of Cab by User will not make any sense
		//cRef.bookCab();		// Executing bookCab method on Cab Object again makes no sense

	}

}
