package com.auribises.packone;

// public class
public class One {
	
	// attributes and methods cane be : default, private, protecetd or public
	
	int a1;
	private int a2;
	public int a3;
	protected int a4;

	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}
	
}


// default class
class Two{
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}
}


// In 1 .java file we can have only 1 public class
// because name of .java file should be same as that of public class name
/*
public class Three{
	
}
*/

// private keyword not allowed with class
//private class Four{ // err
	
//}

//protected keyword not allowed with class
//protected class Five{ // err
	
//}