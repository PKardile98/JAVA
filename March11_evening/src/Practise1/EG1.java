package Practise1;

import Methods.Method10;
import Methods.Method12;
import Methods.Method9;

public class EG1 {

	public static void main(String[] args) {
		
		
		EG1.test1();
		EG1.PK1();
		Method10.Addition1(12, 8); // called from the different class
		
		// We have to create object for calling non static regular method
		
		EG1 ABC1 = new EG1(); // called from the same class
		ABC1.PK2(50, 100);
		
		// No static method calling from the different class--"Method9"
		Method9 XYZ1 = new Method9();
		XYZ1.Addtion1();
		
		// No static method with parameter calling from the different class--"Method9"
		
		Method12 JK1 =new Method12();
		JK1.Addtion1(20, 30, 40);
		
		
	}
	
	public static void PK1() {
		
		int k=20;
		int j=30;
		int R1= k+j;
		
		String Name123="Pradeep";
		System.out.println("Sum is-->"+R1);
		System.out.println("Name is -->"+Name123);
		
	}
	public void PK2(int j1 , int k1 ) {
		
		int sum = j1+k1;
		System.out.println("Sum of the no. is -->"+sum);
		
		
	}
	public static void test1(){

		   int o1=20;
		   int o2=40;
		   int Add1= o1+o2;
		   System.out.println(Add1);




		}
	

}
