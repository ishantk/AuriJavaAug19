class Student{
	
	static void showNumberOfStudents(){
		//System.out.println(">> Number of Students are: "+);
	}
	
}


public class ObjectCounter {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = s3;
		Student s6 = s1;
		Student s7 = new Student();
		
		Student.showNumberOfStudents(); // >> Number of Students are: 5
		
	}

}
