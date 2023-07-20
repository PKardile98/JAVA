package AccessModifiers;

public class DifferentClass1 {

	public static void main(String[] args) {

		Public1 PO1 = new Public1(); // Public access in diffrent classes 
		PO1.P1();
		PO1.P2();
		System.out.println(PO1.i);
		System.out.println(PO1.j);
		
		// default access modifier can access with in the package
		
		System.out.println();
		
		Default1 DD1 = new Default1();
		DD1.D1();
		DD1.D2();
		System.out.println(DD1.num);

	
	}

}
