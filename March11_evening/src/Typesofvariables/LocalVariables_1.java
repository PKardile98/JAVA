package Typesofvariables;

public class LocalVariables_1 {

	public static void main(String[] args) {
		
		
		LocalVariables_1.T1(); // 
		LocalVariables_1.T2();
		
		
		

	}
	
	public static void T1() {
		
		int N1=30;   // non static local variable
		System.out.println(N1);
		
	}
	
	public static void T2() {
		
		int N1=30;   // non static local variable
		int N2=50;
		
		int R= N1+N2;
		
		System.out.println(R);
		
	}
	

}
