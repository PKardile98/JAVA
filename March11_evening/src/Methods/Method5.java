package Methods;

public class Method5 {
 // Non static method calling form the same class 
	public static void main(String[] args) {
		
		System.out.println("Main method started:");
		
		// We can't Call using className.methodname.
		
		// 1. Object creation
		//   Syntax--> MethodName RefVarName = new MethodName();
		
		Method5 obj1 = new Method5();
		
		// Using the RefVarName "obj1" for calling the non static methods D1,D2
		
		obj1.D1();
		obj1.D2();
		
		// Can we access static method using object reference? 
		// Yes we can but it will show the waring  message
		
		
		System.out.println("Main method ended:");
	}
	
	public void D1() { // non static method 
		
		System.out.println("Non static regular method calling from same class: D1");
		
		
	}
	
	public void D2() {
		
		System.out.println("Non static regular method calling from same class: D2");
		
	}
	
	

	
}
