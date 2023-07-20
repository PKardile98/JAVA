package Constructor;

public class Needofconstructor {
	
	public Needofconstructor(String Name , int R1){
		
		System.out.println(Name+" "+R1);
		
		
	}
	
	String Name; // non static global variable
	int R1;
	static int R2 = 40;
	

	public static void main(String[] args) {
		
		System.out.println(Needofconstructor.R2);
		
		Needofconstructor RV1 = new Needofconstructor("Pradeep" , 21);
		Needofconstructor RV2 = new Needofconstructor("Neha" , 22);
		Needofconstructor RV3 = new Needofconstructor("Prashant",23);
		Needofconstructor RV4 = new Needofconstructor("Deppak", 24);
		
		
		// Purpose of constructor
		// 1. Once we create object compulsory we required to perform initialization for the object
		// 2. Constructor is designed to perform initialization of the object
		// 3. Constructor is special type of method 
		// 4. Every time an object is created using new key word at least one constructor is called 
		
		
		
		
	}

}
