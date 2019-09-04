package com.auribises.inheritance;

public class WrapperApp {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type : It contains Value i.e. Data

		// Convert Primitive type into an Object : BOXING
		Integer iRef = new Integer(i);
		
		// Get Primitive Back from Object : UNBOXING
		int j = iRef.intValue();
		

		Integer jRef = j; // AUTO-BOXING
		int k = jRef;	  // AUTO-UNBOXING
		
		char ch = 'A';
		Character cRef = ch;	// AUTO-BOXING   | Character cRef = new Character(ch);
		
		char dh = cRef; 		// AUTO-UNBOXING | char dh = cRef.charValue(); 		
		
	}

}
