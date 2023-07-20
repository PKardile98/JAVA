package AccessModifiers;

public class Default1 {
	
	int num=120;

	public static void main(String[] args) {
		//The access level of a default modifier is only within the package. It cannot be accessed from outside the 
		//package. If you do not specify any access level, it will be the default.
		
		Default1 DD1 = new Default1();
		DD1.D1();
		DD1.D2();
		System.out.println(DD1.num);

	}
	
	void D1() {
		
		System.out.println("Default 1:");
	}
	
	void D2() {
		
		System.out.println("Default 2:");
	}

}
