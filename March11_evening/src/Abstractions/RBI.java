package Abstractions;

public abstract class RBI {

	public void Loan() { // Non abstract Method 
		
		System.out.println("RBI -- Loan ");
	}
	
	public abstract void creditcard(); // abstract method 
	public abstract void debitcard();
}
