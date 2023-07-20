package Typesofvariables;

public class Non_static_Global_variable_1 {
	
	int I1=20;
	String Naam="Prashant kardile";

	public static void main(String[] args) {
		// Calling non static global variable from same class 
        // We have to create object 
		// Syntax classname refvarName= new classname();
		
		
		Non_static_Global_variable_1 NSV = new Non_static_Global_variable_1(); // This is object Name, NSV is refvarname.
				
		Different_class NSG1 = new Different_class();
		System.out.println(NSG1.M2);      // // Non static global variable call from different class 
		System.out.println(NSG1.Name123); // Non static global variable call from different class 
		
		
		
		System.out.println(NSV.I1); // calling NSGV with object creation
		System.out.println(NSV.Naam);
		NSV.Demo1();
		NSV.Demo2();
		
		
	}
	
	
     public void Demo1() {
    	 
    	 int K1=50;
    	 
    	 Naam="Pradeep";
    	 
    	 System.out.println(K1);
    	 System.out.println(Naam);
    	 
     }
     
     public void Demo2() {
    	 
    	 I1=30;
    	 
    	 Naam="Sharda";
    	 
    	 System.out.println(I1);
    	 System.out.println(Naam);
    	 
    	 
     }
	
	

}
