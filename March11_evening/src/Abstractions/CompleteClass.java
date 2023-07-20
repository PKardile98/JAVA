package Abstractions;

public class CompleteClass {

	public static void main(String[] args) {
		
		CompleteClass V1 = new CompleteClass();
		V1.Test1();
		V1.Test1(60);

	}
	
	public void Test1() {
		
		System.out.println("Demo Method:");
	}
	
	public void Test1(int i) {
			
			System.out.println("Demo Method 2:");
		}

}
