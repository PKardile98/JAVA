package Methods;

public class Method12 {

	public static void main(String[] args) {
		// With parameter Non static calling method.
		// Need to create the object 
		
		// Method refvarName(Naming) = new methodsName();
		Method12 Access = new Method12();
		Access.Addtion1(50, 20, 10);
		Access.Addtion1(100, 60, 10);
		Access.DataBase1("Prashant", 34, 'a');

		Method11.StudentInfo1("Vikas Mall", 8, 'F', 98.76f); // Static Method calling for Different class.
		
	}
	
	public void Addtion1(int A, int B, int C) {
		
		int R= A+B-C;
		System.out.println("Sum of the Following:"+R);
		
	}
	
	public void DataBase1(String Employee,int code , char rating ) {
		
		System.out.println("Eyployee Name--> "+Employee +" " + "Employee Code---> "+code +" " +"Employee rating---> "+rating);
		
		
		
		
	}

}
