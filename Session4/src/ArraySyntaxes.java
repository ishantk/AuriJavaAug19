
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Array : Multi Value Container
		// Syntax #1 | Implicit Way of creating Array
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println(">> arr is: "+arr); // HashCode
		// arr is reference variable which holds HashCode of Array in memory !!

		/*
		System.out.println(">> Element at 0 index is: "+arr[0]);
		System.out.println(">> Element at 1 index is: "+arr[1]);
		System.out.println(">> Element at 2 index is: "+arr[2]);
		System.out.println(">> Element at 3 index is: "+arr[3]);
		System.out.println(">> Element at 4 index is: "+arr[4]);
		*/
		
		for(int i=0;i<arr.length;i++){
			System.out.println(">> Element at "+i+" index is: "+arr[i]);
		}
		
		System.out.println();
		
		// Syntax #2 | Explicit Way of creating Array
		int[] arr2 = new int[]{10, 20, 30, 40, 50};
		// new means construct something in the heap i.e. at run time
		// int[] after new means create an integer array in the memory
		
		// Syntax #3
		int arr3[] = {10, 20, 30, 40, 50};
		
		// Syntax #4
		int arr4[] = new int[]{10, 20, 30, 40, 50};
		
		System.out.println();
		
		// Syntax #5 : We mention Size of Array but not values in Array
		int[] arr5 = new int[5];
		System.out.println(">> arr5 is: "+arr5); // HashCode
		
		// Updation of data in Array
		arr5[2] = 222;
		arr5[3] = 333;
		
		for(int i=0;i<arr.length;i++){
			System.out.println(">> Element at "+i+" index is: "+arr5[i]);
		}
		
		
	}

}
