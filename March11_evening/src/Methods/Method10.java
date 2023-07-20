package Methods;

public class Method10 {

	public static void main(String[] args) {
		
		// Method with Parameter/ Zero Parameters.
		// Static method calling 

		Method10.Addition1(20, 10);
		System.out.println();
		Method10.Substration1(30, 10);
		Method10.Addition1(100, 200);
		Method10.Substration1(500, 250);
		Method10.Multiplication1(5, 5);
		System.out.println();
		Method10.StudentInfo("Pradeep", 02);
		Method10.StudentInfo("Prashant", 9);
		
	}
	
	public static void Addition1(int A, int B) { // Two input method.
		
		int C= A+B;
		System.out.println("Addition of two No.---->"+C);
		
		
	}
	
	public static void Substration1(int J, int K) {
		
		int R= J-K;
		System.out.println("Substration1 of two No.---->"+R);
		
		
	}
	
	public static void Multiplication1(int J, int K) {
		
		int R= J*K;
		System.out.println("Multiplication1 of two No.---->"+R);
		
	}
	
	public static void StudentInfo(String Name, int K) {
		
		System.out.println(" Student name---> "+Name +" "+K);
		
		
	}
	
	

}
