
public class Operators {

	public static void main(String[] args) {
		/*
		 	Arithmetic Operators
		 	Assignment Operators
		 	Conditional Operators
		 	Increment and Decrement Operators ++, --
		 	Logical Operators && || !
		 	Bitwise Operators
		 	Shift Operators 
		 */
		
		int a = 10;
		a+=1; // a = a + 1
		System.out.println(">> a is: "+a);
		
		int x = 10;
		x++; //x = x + 1	Postfix
		++x; //x = x + 1	Prefix
		System.out.println(">> x is: "+x);
		
		System.out.println("============");
		
		//int y = ++x;	// Increment and Assign
		int y = x++;	// Assign and Increment
		System.out.println(">> x is: "+x);
		System.out.println(">> y is: "+y);

		// && ||  !
		
		int age = 19;
		char gender = 'M';
		
		System.out.println("Is this a male child: "+(age<18 && gender=='M'));
		
		// >> << | Shift 
		// & | ^ | Bitwise
		
		int p = 12;		// 1 1 0 0 >> 3	-> _ _ _ 1 -> 0 0 0 1	| Explore for Negative Numbers as well
		int q = p >> 3; // divide p by 2 pow 3
		
	}

}
