
class WhatsAppGroup{

	// static attribute : property of class
	static String title;

	// static method : property of class
	static void showGroupTitle(){
		System.out.println(">> Title is: "+title);
	}
}

class WhatsAppUser{
	
	// non static : property of Object
	String status;
	
	// non static : property of Object
	void showStatus(){
		System.out.println(">> status is "+status+" and group title is: "+WhatsAppGroup.title);
	}
	
	void changeGroupTitle(String newTitle){
		WhatsAppGroup.title = newTitle;
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		WhatsAppUser john = new WhatsAppUser();
		WhatsAppUser jennie = new WhatsAppUser();
		
		john.status = "This is Awesome";
		jennie.status = "Be Exceptional";
		
		WhatsAppGroup.title = "ABC Group";
		
		john.showStatus();
		jennie.showStatus();
		
		john.changeGroupTitle("XYZ Group");
		
		john.showStatus();
		jennie.showStatus();
		
		
	}

}
