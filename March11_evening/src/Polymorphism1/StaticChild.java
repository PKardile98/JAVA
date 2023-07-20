package Polymorphism1;

public class StaticChild extends Static1 {

	public static void main(String[] args) {
		
		
		StaticChild V1 = new StaticChild();
		V1.Demo2();
		V1.Demo3();
		
		Static1.Demo1(); // Static method Called by the class name
		StaticChild.Demo4();
		
	}
	
	public void Demo3() {
		
		System.out.println(" Child Method ");
	}
	
	public static void Demo4() {
		
		System.out.println(" Child class static method :");
	}

}
