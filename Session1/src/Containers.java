
public class Containers {

	// Whatever we write in the main method is executed in a sequence
	public static void main(String[] args) {

		// Single Value Container
		// Primitive Data Types
		
		// Integer : byte (8bits), short(16bits), int(32bits), long(64bits)
		int a = 10; // ; means termination of statement
		short s = 100;
		byte b = 120;
		long l = 127276416L;
		
		// Container Creation
		byte age = 127; // 2 pow 8 -> 256 / 2 -> -128 to 0 to 127
		// Update operation
		age = 27; 
		// Read Operation
		System.out.println("age is:"+age);
		// Deletion Happens automatically -> i.e when main will finish, containers will be deleted from memory 
		
		// Floating Points : float(32bits), double(64bits)
		float pi = 3.14f;
		double taxes = 18.50;
		
		// Characters 16bits
		char ch = 'A'; // single quotes
		System.out.println(">> ch is:"+ch);
		ch = 98;	   // ascii value
		System.out.println(">> ch is:"+ch);
		ch = '\u20b9';	// Unicode
		System.out.println(">> ch is:"+ch);
		
		// Logical : boolean 8bits (true or false)
		boolean isInternetOn = true;
		isInternetOn = false; // Update operation
		
		System.out.println(">> Is Internet Connected: "+isInternetOn);
		
		// Multi Value Container
		// Textual : String 
		String name = "John Watson";
		System.out.println(">> Hello, "+name);
	}

}
