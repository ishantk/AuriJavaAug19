// Understand Requirements in developing the Software from Client :)
// When we open Zomato App we see restaurants
// Restaurant is an Object 
// Because Restaurant has so many details (data) linked with it
// Restaurant : name, phone, address, type, rating
// PS : More the objects and more the data associated with objects will help us to make a better software solution

// 1. THINK OF AN OBJECT :)
//    OBJECT : Multi Value Container

// 2. Create Representation of Object i.e. Class
// Textual Representation of an Object in memory
// Whatever we write in class belongs to Object
class Restaurant{
	// Attributes of Object
	String name;
	String phone;
	String address;
	int type; // 1 Veg, 2 Non Veg, 3 Both, 4 Club, 5 Buffet
	double rating;
	
	// Default Constructor : Automatically executes when we create object in memory 
	Restaurant(){
		name = "NA";
		phone = "NA";
		address = "Ludhiana";
		type = 3;
		rating = 3.0;
	}
	
	// Parmeterized Constructor : executes when we create object in memory with inputs
	Restaurant(String nm, String ph, String ad, int ty, double ra){
		name = nm;
		phone = ph;
		address = ad;
		type = ty;
		rating = ra;
	}
	
	void showRestaurant(){
		System.out.println("======"+name+"======");
		System.out.println("Phone: "+phone);
		System.out.println("Address: "+address);
		System.out.println("Type: "+type);
		System.out.println("Rating: "+rating);
		System.out.println("====================");
	}
}

public class ZomatoApp {

	// main is a method or function
	// whatever we write in main will be executed in a sequence
	public static void main(String[] args) {
	
		System.out.println(">> Welcome to Zomato");
		
		// 3. Create Object in Memory
		Restaurant r1 = new Restaurant(); // Object Construction Statement
		Restaurant r2 = new Restaurant(); // Restaurant(); -> Execution of Constructor
		
		Restaurant r3 = new Restaurant("Belfrance", "+91 99999 88888", "Sarabha Nagar", 3, 4.5);
		
		Restaurant r4 = r2; // Reference Copy
		
		//System.out.println(">> r1 is: "+r1);
		//System.out.println(">> r2 is: "+r2);
		// r1 is not an object, it is a reference variable which points to the object in memory
		
		
		// 4. Write data in Object
		// 	  . operator with reference variable of object
		r1.name = "Hot Breads";
		r1.phone = "+91 98765 90909";
		r1.address = "Sarabha Nagar";
		r1.type = 3;
		r1.rating = 4.5;
		
		// 5. Update Data in Object
		r1.phone = "+91 99999 90909";
		
		r4.name = "Yellow Chillies";
		r4.address = "Sarabha Nagar";
		r2.rating = 2.5;
		
		// 6. View the data from Object
		//System.out.println(">> "+r1.name+" | "+r1.rating);
		//System.out.println(">> "+r2.name+" | "+r2.rating);
		//System.out.println(">> "+r3.name+" | "+r3.rating);
		
		r1.showRestaurant();
		r2.showRestaurant();
		r3.showRestaurant();
		r4.showRestaurant();
		
		// Write Code to filter all the restaurants with contains operation
		// Create an Object called Menu for Restaurant 
	}

}
