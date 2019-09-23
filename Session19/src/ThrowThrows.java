import java.io.IOException;

// MyBankingException IS-A RuntimeException | UNCHECKED
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

// YourBankingException IS-AN Exception	| CHECKED
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class BankAccount{
	
	int balance = 10000;
	int minBalance = 2000;
	
	int attempts = 0;
	
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance = balance - amount;
		
		if(balance <= minBalance){
			balance = balance + amount; // Roll back Changes
			System.out.println(">> Withdraw Failed and Balance is Low: "+balance);
			
			attempts++;
			
		}else{
			System.out.println(">> Withdraw Successfull and New Balance is: "+balance);
		}
		
		// Throwing a built in Exception
		if(attempts == 3){
			
			// UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Balance is LOW: "+balance);
			//throw aRef;
			
			// CHECKED EXCEPTION
			//IOException io = new IOException("Balance is LOW: "+balance);
			//throw io;
			
			// UNCHECKED EXCEPTION
			//MyBankingException mRef = new MyBankingException("Illegal Attempts: "+attempts);
			//throw mRef;
			
			// CHECKED EXCEPTION
			YourBankingException yRef = new YourBankingException("Illegal Attempts: "+attempts);
			throw yRef;
		}
	}
}


public class ThrowThrows {

	public static void main(String[] args) {
	
		System.out.println(">> Banking Started");
		
		BankAccount account = new BankAccount();
		
		try{
			for(int i=0;i<500;i++){
				account.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println(">> Some Error: "+e);
		}
		
		
		System.out.println(">> Banking Finished");

	}

}
