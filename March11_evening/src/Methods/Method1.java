package Methods;

public class Method1 { // Class body
     // static regular method calling from the same class 
	public static void main(String[] args) { // Main method 
		
	// start of program 
		
		System.out.println(" Start of the Main Method ---:");
		
		// 1. Direct calling 
		// Syntax Methodname();
		
		Demo1();
		
		// 2. Calling by the class Name.
		// Syntax ClassName.MethodName();
		
		Method1.Demo1();
		
	
		System.out.println(" End of the Main Method ---:");
	} // Main Method ended
	
	public static void Demo1() {
		
		System.out.println("static regular method calling from the same class");
	}

}
