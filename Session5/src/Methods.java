import org.omg.PortableInterceptor.DISCARDING;

public class Methods {
	
	// Method or Procedure or Function or Routine
	// f(x) = x*x | f(1) = 1 | f(2) = 4
	
	// addNumbers is name of method
	// void is acknowledgement | it means do not acknowledge | Hence do not return
	// num1 and num2 are single value containers of type int
	// num1 and num2 are inputs to the method (We can pass n number of inputs)
	
	// Why We Need Methods : So that some repeated logic may not be repeated again and again
	// We will create a block and re use it again and again
	
	// NON - STATIC METHOD :)
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
	}
	
	// STATIC METHOD :)
	static void addNumbers(int num1, int num2, int num3){
		int num4 = num1 + num2 + num3;
		System.out.println(">> Sum of "+num1+" and "+num2+" and "+num3+" is "+num4);
	}
	
	// We can create same Method Again with Different type of Inputs
	void addNumbers(double num1, double num2){
		double num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
	}
	
	void addNumbers(int num1, double num2){
		double num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
	}
	
	void addNumbers(double num1, int num2){
		double num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
	}
	
	void addNumbers(int num1, int num2, double num3){
		double num4 = num1 + num2 + num3;
		System.out.println(">> Sum is "+num4);
	}
	
	// Overloading 
	/*
	 	1. Inputs of Method should be unique
	 		1.1 Number of Inputs
	 		1.2 Type of Inputs
	 		1.3 Sequence of Inputs
	 	2. Method Name should be same
	 	3. Acknowledgement plays no role
	 	
	 	
	 */
	
	// Ack is int instead of void, hence we must return some integer value at the end
	double calculateDiscount(double amount){
		
		if(amount > 500){
			amount = amount - (20.0/100.0)*amount;
		}else{
			amount = amount - (10.0/100.0)*amount;
		}
		
		return amount;
	}

	// main method : whatever we write in the main will be executed automatically in a sequence
	public static void main(String[] args) {
		
		/*
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
		
		num1 = 11;
		num2 = 33;
		
		num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
		
		num1 = 45;
		num2 = 77;
		
		num3 = num1 + num2;
		System.out.println(">> Sum of "+num1+" and "+num2+" is "+num3);
		*/
		
		// 1. Execution of Non Static Method
		//    We have to create an Object of our Class 
		Methods mRef = new Methods(); // new creates an Object for us
		mRef.addNumbers(10, 20);
		mRef.addNumbers(11, 33);
		mRef.addNumbers(45, 77);
		
		mRef.addNumbers(2.2, 3.3);
		mRef.addNumbers(12.33, 13.39);
		
		mRef.addNumbers(10, 20, 13.77);
		
		// 1. Execution of Static Method
		Methods.addNumbers(11, 22, 33);
				
		
		double discountedAmount = mRef.calculateDiscount(2200);
		System.out.println(">> Dicounted Amount is "+discountedAmount);
		
		System.out.println(">> Dicounted Amount for 5600 will be "+mRef.calculateDiscount(70));

	}

}

// Assignment:
// Create a Method called applyPromoCode
// double applyPromoCode(double amount, int promoCode){
//
// }
// 1. Input -> Amount
// 2. PromoCode -> 10, 20, 30, 40, 50
// 3. 10- 500 ~ 999 | 20- 1000 ~ 1999 | 30- 2000 ~ 3000 | 40- 3001 ~ 5000 | 50- > 5000
// applyPromoCode(3570, 50);
// applyPromoCode(1520, 10);
// For a wrong Promo Code -> Suggest User the Right Promo Code !! :)



