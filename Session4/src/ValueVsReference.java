
public class ValueVsReference {

	public static void main(String[] args) {
		
		// Single Value Container | Primitives
		int x = 10;
		int y = x;	// Value Copy
		
		System.out.println(">> x is "+x);
		System.out.println(">> y is "+y);
		
		x++; // x = x + 1;
		
		System.out.println(">> x is "+x); // 11 11 
		System.out.println(">> y is "+y); // 10 11
		
		// Multi Value Container	| References
		// Array
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = a1;	// Reference Copy
		
		System.out.println(">> a1 is: "+a1);
		System.out.println(">> a2 is: "+a2);
		
		a2[3] = 333;
		
		System.out.println(">> a1[3] is: "+a1[3]);
		

	}

}
