package Abstractions;

public class AbstractClassConstrctor {
	
	public  AbstractClassConstrctor() {
		
		
		
		this(300);
		
		
		//System.out.println("Abstract Class Constrctor");
	}
	
	private AbstractClassConstrctor(int i) {
		
		System.out.println("One input Para Constrctor");
	}
	
	private AbstractClassConstrctor(int i, int j) {
		
		System.out.println("Two input Para Constrctor");
		
	}
	
	private AbstractClassConstrctor(int i, int j, int k) {
			
			System.out.println("Three input Para Constrctor");
			
		}
	

}
