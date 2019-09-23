
public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		int a = 10, b=0, c=0;
		
		// Due to below instruction program will CRASH. i.e. it will terminate abnormally
		try{
			System.out.println(">> arr[10] is: "+arr[10]); // control from here will go to catch block
			c = a/b;
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println(">> Something Went Wrong: "+aRef);
		}catch(ArithmeticException aRef){
			System.out.println(">> Something Went Wrong: "+aRef);
		}*/
		catch(Exception eRef){
			System.out.println(">> Something Went Wrong: "+eRef);
			eRef.printStackTrace(); // Give us file name and line number where error is generated
		}finally{
			System.out.println(">> This must be executed");
		}
		
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finished");

	} // main is terminated normally/gracefully i.e. every instruction in main is executed in a sequence

}


/*
 		Throwable
 			Exception | RTP : Parent's Ref Var can point to any Child Object
 				RuntimeException			| 	UNCHECKED EXCEPTION
 					ArrayIndexOutOfBoundsException
 					ArithmeticException
 					.
 					..
 				IOException					| CHECKED EXCEPTION
 					FileNotFoundException
 					.
 					...
 				SQLException
 					.
 					..
 					...
 				.
 				..
 				....
 			Error	// Memory Related and we cannot handle them
 				StackOverFlowError
  
 */

/*
 		// try alone cannot exist
 		try{
 		
 		} error
 		
 		// Basic Try Catch
 		try{
 		
 		}catch(){
 		
 		}
 		
 		// try finally : Program will Crash
 		try{
 		
 		}finally{
 		
 		}
 		
 		// try catch finally
 		try{
 		
 		}catch(){
 		
 		}finally{
 		
 		}
 		
 		// Nested try catch
 		try{
 			try{
 		
			}catch(){
			
			}finally{
			
			}
 		}catch(){
 		 	try{
 		
			}catch(){
			
			}finally{
			
			}
 		}finally{
 			 try{
 		
			}catch(){
			
			}finally{
			
			}
 		}
 		
 		
 */
