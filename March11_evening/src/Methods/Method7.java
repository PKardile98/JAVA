package Methods;

public class Method7 {

	//Non static method calling from the different class
	public static void main(String[] args) {
		
		System.out.println("Main method started:");
		
		
		// 1. Object creation
		
		Method6 EG1= new Method6();
		EG1.Test(); // Called from the different class Method6.
		EG1.Test1();
		
		// 2. creation of new object for calling the function within the same class.
		
		Method7 EG2= new Method7();
		EG2.Demo69();  // Called from the same class Method7.
		
		
		System.out.println("Main method ended:");
		
		
	}
	
	public void Demo69() {
		
		System.out.println("Non static method calling from the same class:69");
		
	}

}
