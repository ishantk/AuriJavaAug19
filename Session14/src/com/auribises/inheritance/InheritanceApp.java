package com.auribises.inheritance;

class CA{
	
	int a; // attribute of CA Object
	
	CA(){
		a = 10;
		System.out.println(">> CA Object Constructed");
	}
	
	void showCAsA(){
		System.out.println(">> a in CA is: "+a);
	}
}

class CB extends CA{ // Inheritance Relationship : CB is Child of CA
	
	int a; // attribute of CB object
	
	CB(){
		a = 11;
		System.out.println(">> CB Object Constructed");
	}
	
	void showCBsA(){
		System.out.println(">> a in CB is: "+a);
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		//CA cRef = new CA();
		
		// Rule# 1 : Before the Object of Child, Parent Object is constructed on the memory
		CB cRef = new CB();
		
		// Rule# 2 : Reference Variable of Child Object can access Properties of Parent Object
		cRef.a = 111; // manipulating a of Parent
		
		cRef.showCAsA();
		cRef.showCBsA();

	}

}

/*
 
 	1. Single Level
 	CA
 	|
 	CB
 	
 	class CA{}
 	class CB extends CA{}
 	
 	2. Multi Level
 	
 	CA
 	|
 	CB
 	|
 	CC
 	
 	class CA{}
 	class CB extends CA{}
 	class CC extends CB{}
 	
 	3. Hierarchy
 	CA
 	|
 CB  CC
 	
 	class CA{}
 	class CB extends CA{}
 	class CC extends CA{}
 	
 	4. Hybrid
 	1 + 2 + 3 -> Any combination
 	
 	// PS: NOT SUPPORTED : error
 	5. Multiple Inheritance : This is not supported in Java
 	CA   CB
 	   |
 	   CC
 	   
 	class CA{}
 	class CB{}
 	class CC extends CA, CB{}   
 	
 	
 
 */
