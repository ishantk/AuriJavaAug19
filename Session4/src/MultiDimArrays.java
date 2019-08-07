
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Array
		int[] a1 = {10, 20, 30, 40, 50};
		System.out.println(">> a1 is: "+a1);				// HashCode
		System.out.println(">> a1 length is: "+a1.length);	// 5
		
		System.out.println();
		
		// Array of Arrays
		int[][] a2 = {
						{10, 99, 30},				// 0
						{10, 20},					// 1
						{10, 20, 30, 66, 50},		// 2
						{77},						// 3
						{10, 20, 30, 40},			// 4
						{11, 22, 33, 44, 55}		// 5
					 };
		
		System.out.println(">> a2 is: "+a2);				// HashCode
		System.out.println(">> a2 length is: "+a2.length);	// 5
		
		System.out.println();
		
		System.out.println(">> a2[1] is: "+a2[1]);					//  HashCode
		System.out.println(">> a2[1] length is: "+a2[1].length);	//	2
		
		System.out.println(">> a2[5][2] is: "+a2[5][2]);	// 33

		// ArrayIndexOutOfBoundsException : Error will occur at run time
		// System.out.println(">> a2[4][4] is: "+a2[4][4]);	// Here no element at 4th index
		
		// Nested Loops for Multi Dim Array
		// Find Maximum Number and Minimum Number in 2-D Array :)
		for(int i=0;i<a2.length;i++){ // 0 to 5
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
