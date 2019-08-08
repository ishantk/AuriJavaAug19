
public class Arrays {

	public static void main(String[] args) {
		
		int[] votes = {10551, 65451, 13432, 23421, 34212};
		
		int sum = 0;
		
		// Basic For Loop
		/*
		for(int i=0;i<votes.length;i++){
			sum = sum + votes[i];
		}
		*/
		
		// Enhanced For Loop : Focuses on data in the Array not on indexes
		for(int element : votes){
			System.out.println(">> element "+element);
			sum = sum + element;
		}
		System.out.println("================");
		System.out.println(">> sum is: "+sum);
		System.out.println("================");
	}

}
