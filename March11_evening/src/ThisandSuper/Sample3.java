package ThisandSuper;

public class Sample3 extends Sample2 {
	
	int NO1 = 10;
	int NO2 = 800; // Non Static GV
	String Naam = "Prashant";
	
	
	public void demo1() {
		
		int NO1 = 30;
		int NO2 = 90;
		String Naam = "Ruhi";
		
		System.out.println(NO1); 
		System.out.println(NO2);
		System.out.println(Naam);
		
		System.out.println();
		
		
		System.out.println(this.NO1); // Using this Key word to access the GB from the Same Class
		System.out.println(this.NO2);
		System.out.println(this.Naam);
		
		System.out.println();
		
		System.out.println(super.NO1);
		System.out.println(super.NO2);
		System.out.println(super.Naam);
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		Sample3 S5 = new Sample3();
		S5.demo1();

	}

}
