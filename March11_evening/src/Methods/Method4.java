package Methods;

public class Method4 {
// Static Regular method calling from the different Class
	public static void main(String[] args) {
		
		// start of program 
		
				System.out.println(" Start of the Main Method ---:");
				
				// 1. Direct calling is not allowed when calling from the different class  
				// Syntax Methodname();
				   pp1();  // PP1 is from the same class 
				
				
	
				// 2. Calling by the class Name.
				// Syntax ClassName.MethodName();
				
				Method2.Test1();
				Method2.Test2();
				Method3.Test9();
				Method3.Test10();
				
			
				System.out.println(" End of the Main Method ---:");
	
		
	}
	
	    public static void pp1() {
	    	
	    	System.out.println("Calling from the same Method 4:");
	    }

}
