package AccessModifiers;

public class Private1 {
	
	private int a =100;
	

	public static void main(String[] args) {
		// The access level of a private modifier is only within the class. It cannot be accessed from outside the class/Package.
		
		Private1 PR1 = new Private1();
		PR1.Test();
		PR1.Test1();
		System.out.println(PR1.a);
		
		Default1 DD1 = new Default1();
		DD1.D1();
		DD1.D2();
		System.out.println(DD1.num);
		

	}
	
	private void Test() {
		
		System.out.println("Private method 1 :");
		
	}
	
	private void Test1() {
		
		System.out.println("Private method 2 :");
		
	}
	
	
	

}
