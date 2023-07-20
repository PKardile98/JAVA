package ThisandSuper;

public class Sample1 {
	
	int Number = 200;
	int Num =800;
	
	String Name = "Pradeep";

	public static void main(String[] args) {
		// use of this key word
		
		Sample1 S1 = new Sample1();
		S1.test1();

	}
	
	public void test1() {
		
		int Number = 500;
		int Num =100;
		
		// This keyword is use to access Global variable from the same class
		
		System.out.println(Number);
		System.out.println(Num);
		System.out.println(this.Number);
		System.out.println(this.Num);
		System.out.println(this.Name);
		
	}


}
