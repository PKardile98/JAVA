package Encapsulation;

public class ClassB {

	public static void main(String[] args) {


//		ClassA A1 = new ClassA();
//		A1.value=100;
//		
//		System.out.println(A1.value);
		
		ClassA A1 = new ClassA();
		
		A1.setName("Pradeep");
		
		System.out.println(A1.getName());
		
		// Value
		
		A1.setvalue(1000);
		
		System.out.println(A1.getvalue());
		

	}

}
