package AccessModifiers;

public class Public1 {
	
	 public int i =90;
	 public int j =30;

	public static void main(String[] args) {
		
		Public1 PU1 = new Public1();
		PU1.P1();
		PU1.P2();
		System.out.println(PU1.i);
		System.out.println(PU1.j);
	}
	
	public void P1() {
		
		System.out.println("Public Method access:");
	}
	public void P2() {
		
		System.out.println("Public Method 2 access:");
		
	}

}
