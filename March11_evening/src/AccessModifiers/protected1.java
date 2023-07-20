package AccessModifiers;

public class protected1 {
	
	protected int A=150;

	public static void main(String[] args) {
		//The access level of a protected modifier is within the package and outside the package through child class.
		//If you do not make the child class, it cannot be accessed from outside the package.
		
		protected1 PPP1 = new protected1();
		
		PPP1.demo1();
		PPP1.demo1();
		System.out.println(PPP1.A);
		

	}
	
	protected void demo1() {
		
		System.out.println("Protected method 1:");
		
	}
	protected void demo2() {
			
			System.out.println("Protected method 2:");
			
		}

}
