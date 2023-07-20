package Interface;

public class AdvanceCalculator implements Calculator,Casio{

	@Override
	public void log() {
		
		System.out.println("log Method");
		
	}

	@Override
	public void sin() {
		
		System.out.println("Sin Method");
		
	}
	public void cos() {
			
			System.out.println("cos Method");
			
		}
	public void tan() {
		
		System.out.println("Tan Method");
		
	}
	

	@Override
	public void Addtion() {
		
		System.out.println("Additon Method");
		
	}

	@Override
	public void Substration() {
		
		System.out.println("Substraction Method");
		
	}

	@Override
	public void Multiplication() {

		System.out.println("Multiplication Method");
		
	}
	public void Multiplication(int i) {

		System.out.println("Multiplication Method");
		
	}
	
	

	

}
