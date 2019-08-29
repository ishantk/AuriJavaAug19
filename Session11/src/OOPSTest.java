// Object Counter Structure
class Counter{
	
	// Attribute : Property of Object (non-static)
	int count;
	
	// Attribute : Property of Class (static)
	// static is global/common property of all objects
	static int sCount; 
	
	// Default Constructor : Property of Object 
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Methods : Property of Object
	void incrementCount(){
		count++;  // count = count + 1
		sCount++; // sCount = sCount + 1
	}
	
	void showCount(){
		System.out.println(">> count is: "+count+" and sCount is: "+sCount);
	}
}


public class OOPSTest {

	public static void main(String[] args) {
		
		// Q. How Many Objects are in Memory ? A.   
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1; // Reference Copy
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c3.incrementCount();
		c2.incrementCount();
		c2.incrementCount();
		c1.incrementCount();
		c1.incrementCount();
		
		Counter c4 = new Counter();
		c4.incrementCount();
		
		c1.showCount(); // >> count is: 6 and sCount is: 10 2 
		c2.showCount(); // >> count is: 4 and sCount is: 10 2
		c3.showCount(); // >> count is: 6 and sCount is: 10 2
		 
		c4.showCount(); // >> count is: 2 and sCount is: 10 2
	

	}

}
