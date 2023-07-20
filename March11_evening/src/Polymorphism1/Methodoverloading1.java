package Polymorphism1;

public class Methodoverloading1 {

	public static void main(String[] args) { // Method overloading non static method
		
		Methodoverloading1 OBJ1 = new Methodoverloading1();
		
		OBJ1.M1();  // With no parameter
		OBJ1.M1(30); //With one parameter:
		OBJ1.M1("Pradeep"); //Different Data type parameter:
		OBJ1.M1(90, 40); //Two parameter:
		
		Methodoverloading1.M1(100, 200, 300);  //3 parameter Static method:

	}
	
	public void M1() {
		
		System.out.println("With no parameter:");
		
	}
	
	public void M1(int i) {
		
		System.out.println("With one parameter:");
		
	}
	
	public void M1(String S1) {
		
		System.out.println("Different Data type parameter:");
	}
	
	public void M1( int i , int j) {
		
		System.out.println("Two parameter:");
		
	}
	
	public static void M1(int i, int j, int k) {
		
		System.out.println("3 parameter Static method:");
	}

}
