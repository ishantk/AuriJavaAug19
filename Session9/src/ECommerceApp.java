// 1. Think of an Object
//    Product : pid, name, brand, price, description

// 2. Draw an Object i.e. Create class :)
// Representation of Object | Textual Representation
class Product{
	// Attributes: Property of Object
	int pid;
	String name;
	String brand;
	int price;
	String description;
}


public class ECommerceApp {

	// main is executed when we run the program
	// whatever we have written in main shall be executed
	public static void main(String[] args) {
		
		// 3. Create a Real Object in memory
		Product p1 = new Product(); // Object Construction Statement
		Product p2 = new Product(); // Object Construction Statement
		
		// Print Reference Variables p1 and p2 to know where real objects are in the memory
		System.out.println("p1 is: "+p1); // displaying what is in p1
		System.out.println("p2 is: "+p2); // displaying what is in p2

		// 3.1 Write Data in Object
		//     to write data we will use reference variable of object with . operator
		p1.pid = 101;
		p1.name = "iPhoneX";
		p1.brand = "Apple";
		p1.price = 70000;
		p1.description = "Apples's iPhoneX with latest AI";
		
		p2.pid = 201;
		p2.name = "Alpha Bounce";
		p2.brand = "Adidas";
		p2.price = 10000;
		p2.description = "Adidas latest shoe !!";
		
		// 3.2 Update Data in Object
		p1.name = "iPhone XS";
		p2.price = 12000;
		
		// 3.3 Read Data From Object
		System.out.println(">> "+p1.name+" belongs to "+p1.brand+" and is available at \u20b9"+p1.price);
		System.out.println(">> "+p2.name+" belongs to "+p2.brand+" and is available at \u20b9"+p2.price);
				
		
	}

}
