import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Number 1");
		int num1 = scanner.nextInt();
		
		System.out.println(">> Enter Number 2");
		int num2 = scanner.nextInt();
		
		// Regular if/else
		if(num1 > num2){
			System.out.println(">> num1 is greater than num2");
		}else{
			System.out.println(">> num2 is greater than num1");
		}
		
		int ph = 90;
		int ch = 80;
		int mt = 85;
		
		int avg = (ph + ch + mt)/3;
		
		// ladder if/else
		if(avg >= 90){
			System.out.println("Grade A for "+avg);
		}else if(avg >=80 && avg<90){
			System.out.println("Grade B for "+avg);
		}else if(avg >=60 && avg<80){
			System.out.println("Grade C for "+avg);
		}else{
			System.out.println(">> No Grade Awarded");
		}
		
		// nested if/else
		/*if(){
			if(){
				
			}else{
				
			}
		}else{
			if(){
				
			}else{
				
		}*/
	}

}

// Ask User to enter an amount | 1180 (Inclusive of Taxes)
// Ask User to enter taxes	   | 18
// Split on Taxes 			   | Amount : 1000
//							   | Taxes  : 180
//					           | SGST   : 90
//							   | CGST   : 90

// Promo Codes
// Take Amount as Input from User
// 500 			 40%
// 300 ~ 499 	 20%
// Less than 	 10%
