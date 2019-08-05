
public class NestedLoops {

	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=5;i++){
			System.out.println(">> i is: "+i);
			System.out.println(":) Hello");
			System.out.println();
		}
		*/
		
		for(int i=1;i<=5;i++){
			//System.out.println(">> i is: "+i);
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		/*
		 1
		 2 3
		 3 4 5
		 4 5 6 7
		 5 6 7 8 9
		 */

		/*
		 
		 |1| 1 2 3 4 5
		 |2| 1 2 3 4 5
		 |3| 1 2 3 4 5
		 |4| 1 2 3 4 5
		 |5| 1 2 3 4 5
		 
		 */
		
	}

}
