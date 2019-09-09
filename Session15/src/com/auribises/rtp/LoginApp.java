package com.auribises.rtp;

import java.util.Scanner;

// Inheritance : Generalization
class Login{
	
	Login(){
		System.out.println(">> Login Object Constructed");
	}
	
	void loginUser(){
		System.out.println(">> Login User");
	}
	
}

class LoginWithFaceBook extends Login{
	
}

class LoginWithGoogle extends Login{
	
}

class LoginWithTwitter extends Login{
	
}

class LoginWithEmail extends Login{
	
}

class LoginWithPhone extends Login{
	
}


public class LoginApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> Enter You Login Method: ");
		int typeOfLoginMethod = scanner.nextInt();
		
		Login lRef=null;
		
		switch (typeOfLoginMethod) {
			case 1:
				lRef = new LoginWithFaceBook();
				break;
	
			case 2:
				lRef = new LoginWithGoogle();
				break;
				
			case 3:
				lRef = new LoginWithTwitter();
				break;
				
			case 4:
				lRef = new LoginWithEmail();
				break;
				
			case 5:
				lRef = new LoginWithPhone();
				break;
		}
		
		lRef.loginUser();
	}

}
