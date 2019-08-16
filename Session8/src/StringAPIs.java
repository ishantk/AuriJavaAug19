
public class StringAPIs {

	public static void main(String[] args) {
		
		// Interned Way
		String s1 = "Hello";
		String s2 = "Hello";
		
		// Object Way
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		if(s1 == s2){
			System.out.println(">> s1 == s2");
		}else{
			System.out.println(">> s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println(">> s3 == s4");
		}else{
			System.out.println(">> s3 != s4");
		}
		
		if(s1.equals(s2)){
			System.out.println(">> s1 equals s2");
		}else{
			System.out.println(">> s1 not equals s2");
		}
		
		if(s3.equals(s4)){
			System.out.println(">> s3 equals s4");
		}else{
			System.out.println(">> s3 not equals s4");
		}
		
		String email = "john@example.com";
		String password = "john123";
		
		if(email.equals("john@3xample.com") && password.equals("john123")){
			System.out.println(">> Email ands Password are Correct");
		}else{
			System.out.println(">> Incorrect Email or Password");
		}

		String names = "John, Jennie, Jim, Jack, Joe";
		System.out.println(">> names is: "+names);
		System.out.println(">> names length is: "+names.length());		// 28
		System.out.println(">> Character at 3 is: "+names.charAt(3));	// n
		
		System.out.println("char is: "+names.charAt(names.length()-1)); // e
		
		// Strings are IMMUTABLE
		// Manipulation on Strings ill give a new String and old will not be changed
		String newNames = names.toUpperCase();
		System.out.println(">> names now is: "+names);
		System.out.println(">> newNames is: "+newNames);
		
		String subName = names.substring(3, 7); // start from 3 less than 7 i.e. till 6
		System.out.println(">> subName is: "+subName);
		
		String toSearch = "oe";
		
		System.out.println(toSearch+" found "+names.contains(toSearch));
		System.out.println(toSearch+" found from beginning "+names.startsWith(toSearch));
		System.out.println(toSearch+" found from ending "+names.endsWith(toSearch));
	
		String[] allNames = names.split(",");
		
		for(int i=0;i<allNames.length;i++){
			System.out.println(">> "+allNames[i].trim()); // trim removes sapce from front and end
		}
		
		// PS : Explore more String APIs (Application Programming Interfaces - Built In Codes)
	}

}
