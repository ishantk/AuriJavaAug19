
public class Query {

	public static void main(String[] args) {

		int x = 10;
		x++; // x = x + 1; -> x = 10 + 1 -> x = 11
		++x; // x = x + 1; -> x = 11 + 1 -> x = 12
		
		System.out.println(">> x is: "+x);
		
		x--; // x = x - 1;	-> x = 12 -1 -> x = 11
		--x; // x = x - 1;	-> x = 11 -1 -> x = 10

		System.out.println(">> x now is: "+x);
		
		int y = x % 3; // Remainder
		System.out.println(">> y is: "+y);
		
		char ch = 66; // 66 is ASCII Code
		System.out.println(">> ch is: "+ch);
	}

}
