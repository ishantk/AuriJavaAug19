package com.auribises.packone;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); err
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); err
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

		
		// PS: private cannot be accessed outside the boundary of class
	}

}
