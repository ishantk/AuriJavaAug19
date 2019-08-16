
public class MutablStrings {

	public static void main(String[] args) {
		
		
		String fname1 = "John";
		String newfname1 = fname1.concat(" Watson"); // Strings are IMMUTABLE
		
		System.out.println(">> fname1 is: "+fname1);
		System.out.println(">> newfname1 is: "+newfname1);
		
		//StringBuffer fname2 = "Jennie"; // error : Cannot create it as interned way
		
		// StringBuffer is MUTABLE (We can change the data/contents)
		// THREAD-SAFE
		StringBuffer fname2 = new StringBuffer("Jennie");
		fname2.append(" Watson");
		System.out.println(">> fname2 is: "+fname2);
		
		// NOT THREAD-SAFE
		StringBuilder fname3 = new StringBuilder("Fionna");
		fname3.append(" Flynn");
		System.out.println(">> fname3 is: "+fname3);

	}

}
