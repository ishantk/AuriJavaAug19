import java.util.Scanner; // Scanner is a built in class and to use it we need to import it

public class Conditions {

	// whatever we will write in main will be executed in a sequence
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> Enter an Amount: ");
		
		int amount = scanner.nextInt(); // Read Data from User on Console
		System.out.println(">> You Entered "+amount);

		// Taxation Slabs !!
		// 1. 1000 ~ 2000 | 18% Taxes
		// 2. > 2000      | 22% Taxes
		
		// Regular if/else
		/*
		if(amount>=1000 && amount<=2000){
			double finalAmount = amount + amount * 0.18;
			System.out.println(">> Please Pay Amount with Taxes @ 18% :"+finalAmount);
		}else{
			System.out.println(">> We have no taxes !!");
		}*/
		
		// Ladder if/else
		if(amount>=1000 && amount<=2000){
			double finalAmount = amount + amount * 0.18;
			System.out.println(">> Please Pay Amount with Taxes @ 18% :"+finalAmount);
		}else if(amount >2000){
			double finalAmount = amount + amount * 0.22;
			System.out.println(">> Please Pay Amount with Taxes @ 22% :"+finalAmount);
		}else{
			System.out.println(">> We have no taxes !!");
		}
		
		// Nested if/else
		boolean internet = true;
		boolean gps = false;
		
		if(internet){
			System.out.println(">> You can browse Google Maps");
			if(gps){
				System.out.println(">> You can navigate on Google Maps");
			}else{
				System.out.println(">> Please connect to GPS for Navigation");
			}
		}else{
			System.out.println(">> Please connect to Internet and try again");
		}
	}
	
	// Explore -> switch case in Java :)
	// Program : compare five numbers and tell who is largest !!
	// 			 take inputs for five numbers from User.
	// int num1, num2, num3, num4, num5;
	// user may enter 2 equal numbers
	// Nested if/else
	
}
