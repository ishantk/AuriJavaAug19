
public class Loops {

	// method : anything which we write in the main method will be executed
	// main will be executed automatically when we will run the program !!
	public static void main(String[] args) {
		
		System.out.println("This is my first statement");
		
		// Creating a storage container
		// age is name of storage container
		// 10 is literal or data
		// int is data type
		// assuming in years
		int age = 10;
		
		// Updating a storage container
		age = 20;
		
		// Reading a storage container
		// + is concatenating
		System.out.println("Age is: "+age);
		
		int number = 17;
		int i = 1;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;//i = i + 1; // increment by 1
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are "+(number*i));
		
		// In Programming we can find a situation where we have to write same statements again and again
		// We can use Loops so that we can write statements just once !!
		
		System.out.println(">> i is: "+i);
		
		System.out.println();
		
		System.out.println(">> while Loop");
		
		
		// Update number and i
		number = 9;
		i = 101;
		
		// Condition is checked in the beginning
		while(i<=10){
			System.out.println(number+" "+i+"'s are "+(number*i));
			i++;
		}
		
		System.out.println();
		
		System.out.println(">> do while Loop");
		
		number = 7;
		i = 101;
		
		// Condition is checked in the end
		do{
			System.out.println(number+" "+i+"'s are "+(number*i));
			i++;
		}while(i<=10); // in do while ; is in the end
		
		System.out.println();
		System.out.println(">> for Loop");
		
//		number = 11;
//		i = 1;
		// n and j will be created when loop will start
		// n and j will be deleted from memory when loop will finish
		for(int n=8, j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		System.out.println("This is my last statement");

	} // when main will finish number, i and age will be deleted

}
