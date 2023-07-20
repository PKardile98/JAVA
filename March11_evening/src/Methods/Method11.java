package Methods;

public class Method11 {

	public static void main(String[] args) {
		
		// Student Information storage.

		Method11.StudentInfo1("Pradeep", 2, 'A', 93.89f);
		Method11.StudentInfo1("Prashant", 9, 'D', 78.90f);
		Method11.StudentInfo1("Aryan", 29, 'B', 86.90f);
		Method11.StudentInfo1("Shravan", 22, 'C', 93.98f);
		Method11.StudentInfo1("Athrav", 5, 'A', 45.90f);
	}
	
	public static void StudentInfo1(String Name , int RollNo , char Grade , float percentage ) {
		
		
		System.out.println("Student Name--->"+Name +"  "+" Roll Number:"+RollNo +" "+"Grade:"+Grade +" "+" Student Percentage:"+percentage);
		
		
		
	}
	

}
