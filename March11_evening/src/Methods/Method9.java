package Methods;

public class Method9 {

	public static void main(String[] args) {
		System.out.println("Start of the main methods:");
		
		// 1. Object creation for the non static method
		
		Method9 Number1= new Method9();
		System.out.println();
		
		Number1.Addtion1();
		System.out.println();
		Number1.Substration1();
		
		// 2. Calling by same class name , because static method 
		
		System.out.println();
		Method9.Multiplication1();
		
		
		System.out.println();
		System.out.println("End of the main methods:");
	}
	
	public void Addtion1() 
	{ // Non Static Method 1
		
		int A= 100;
		int B= 200;
		
		int R= A+B;
		
		System.out.println("Addtion of the two No.:"+R);	
		
	}
	
	public void Substration1() 
	{  // Non Static Method 2
		
		
		int A= 100;
		int B= 200;
		
		int R= A-B;
		
		System.out.println("Substration of the two No.:"+R);
		
		
	}
	
	public static void Multiplication1() 
	{ // Static method 
		
		
		int A= 100;
		int B= 200;
		
		int R= A*B;
		
		System.out.println("Multiplication of the two No.:"+R);
		
		
	}
	
	
	
	

}
