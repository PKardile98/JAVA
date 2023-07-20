package Constructor;

public class Userdefined_constructor {
	
	int Num1;
	int Num2; // Non static global variable.
	
	public Userdefined_constructor() { // constructor without parameter
		
		Num1=10;
		Num2=20;
		int Add = Num1+Num1;
		System.out.println(Add);
		
		
	}
	
	public Userdefined_constructor(int a, int b) { // constructor with 2 parameter
		
		Num1=a;
		Num2=b;
		int Add = Num1+Num1;
		System.out.println(Add);
		
		
	}
	
	public void Addtion1() {
		
		Num1=20;
		Num2=80;
		int Add = Num1+Num1;
		System.out.println(Add);
		
	}
	

	public static void main(String[] args) {
		
		Userdefined_constructor UD = new Userdefined_constructor();
		Userdefined_constructor UD1 = new Userdefined_constructor(30,40);
		UD.Addtion1();

	}

}
