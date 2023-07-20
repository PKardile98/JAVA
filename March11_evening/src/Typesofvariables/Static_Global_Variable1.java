package Typesofvariables;

public class Static_Global_Variable1 {
	
	static int N1= 700;  // Static global variable

	public static void main(String[] args) {
		
		Static_Global_Variable1 Test1 = new Static_Global_Variable1();
		
		Test1.M1();
		Test1.M2();
		
		System.out.println(Static_Global_Variable1.N1); // Static Variable calling from same class
		
	}
	
	public void M1() {
		
		System.out.println(N1); // 700
		
		N1=500; 
		
	}
	
	public void M2() {
		
		System.out.println(N1); // 500
		
	}

}
