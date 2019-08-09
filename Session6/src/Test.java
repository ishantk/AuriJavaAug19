
public class Test {

	// Method : Non Static
	// Get Indexes of those elements whose value sums to target :)
	int[] getIndexes(int[] array, int sum){
		
		int[] arr = new int[2];
		
		// Code Goes Here :)
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		// Object Construction Statement
		Test tRef = new Test();
	
		int[] numbers = {11, 12, 33, 67, 99};
		int target = 44;
		
		int[] result = tRef.getIndexes(numbers, target);
		System.out.println(">> result[0] is: "+result[0]); // 0
		System.out.println(">> result[1] is: "+result[1]); // 2
	}
	

}
