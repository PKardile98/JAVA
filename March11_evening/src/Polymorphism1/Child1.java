package Polymorphism1;

public class Child1 extends Father1{

	public void Bike() {
		
		System.out.println("Bike ---> FZ");
	}
	
	@Override
	public void car() { // Method dec
		
		System.out.println("Car ---> Swift"); // <ethod Def
	}
	
	@Override
	public void home() {
		
		System.out.println(" Home --> 4BHK");
		
	}
	
	public static void main(String[] args) {
		
		Father1  F1 = new Father1();
		F1.car();
		F1.home();
		F1.Money();
		F1.test();
		
		System.out.println();
		
		Child1 C1 = new Child1();
		C1.Bike();
		C1.car();
		C1.home();
		C1.home();
		
		System.out.println();
		
		Father1 F2 = new Child1(); // Child class object can be refereed by the parent ref variable 
		// Dynamic poly/ run time poly / Maruti/ swift 
		F2.car(); // overriden method 
		F2.home();
		F2.Money();
		F2.test();
		
		
		
	}

}
