package Methods;

public class Method2 {
//static regular method calling from the same class 
	public static void main(String[] args) { // Main Method
		
		
		System.out.println("Main Method Started:");
		
		// 1. Direct calling 
		// Syntax Methodname();
		
		Test1();
		Test2();
		
		// 2. Calling by the class Name.
	    // Syntax ClassName.MethodName();
		
		Method2.Test1();
		Method2.Test2();
		
		System.out.println("Main Method Ended:");
	}
	
	public static void Test1() {
		
		int i1= 20;
		int i2= 30;
		int R= i1+i2;
		
		System.out.println("Additon of the no:"+R);
	
	}
	
	public static void Test2() {
		
		char C1 ='A';
		System.out.println("Print the Charater :"+C1);
		
	}

}
