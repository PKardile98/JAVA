package Methods;

public class Method8 {
// Method without Parameter/ Zero Parameters.
	public static void main(String[] args) {
		
		// Method without Parameter/ Zero Parameters.
		
		System.out.println("Main method started:");
		
		// 1. Object Creation
		
		Method8 Add1= new Method8();
		Add1.PK1();    // Non static method called from same class by creating the object.
		
		Method8.PK2(); // Static Method Called from the same Class
		
		
		
		System.out.println("Main method Ended:");
		
		
		
	}
	
	public void PK1() { // Non static
		
		int a= 80;
		int b= 20;
		
		int c= a+b;
		
		System.out.println("Addtion of two no:"+c);
		
		
	}
	
	public static void PK2() {
		
		int a= 80;
		int b= 20;
		
		int c= a-b;
		
		System.out.println("substration of two no:"+c);
		
		
	}

}
