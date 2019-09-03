package com.auribises.packtwo;

import com.auribises.packone.One;
//import com.auribises.packone.Two; // err

// Two is default class.
// PS: default(protected) cannot be accessed outside the package and only within the same package
//     public is accessible within and outside the package
//     private is only accessible within the same class

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		
		//oRef.pvtShow();
		//oRef.defShow();
		//oRef.protShow();
		oRef.pubShow();

	}

}
