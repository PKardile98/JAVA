package Interface;

public class Testclas11 {

	public static void main(String[] args) {
		
		
		AdvanceCalculator AD1 = new AdvanceCalculator();  // static Binding / CPT
		AD1.Addtion();
		AD1.Substration(); // Calculator methods
		AD1.Multiplication();
		AD1.Multiplication(30);
		
		System.out.println();
		
		AD1.log();
		AD1.sin();
		AD1.cos(); // Casio methods 
		AD1.tan();
		
		System.out.println();
		
		
		Calculator C1 = new AdvanceCalculator(); // Dynamic Binding / RTP
		C1.Addtion();
		C1.Substration();
		C1.Multiplication();
		
		System.out.println();
		
		Casio C2 = new AdvanceCalculator();
		C2.log();
		C2.sin();

		
		
	}

}
