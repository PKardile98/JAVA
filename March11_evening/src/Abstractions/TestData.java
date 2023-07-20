package Abstractions;

public class TestData {

	public static void main(String[] args) {
		
		HDFC H1 = new HDFC(); // HDFC credit card  + CTP | Static Binding 
		H1.creditcard();
		H1.debitcard();
		H1.Funds();
		H1.Loan();
		
		//RBI R1 = new RBI(); // Can't Create obj of the abstract Class 

		
		RBI R1 = new HDFC(); // Dynamic Binding | RTP
		R1.Loan();
		R1.creditcard();
		R1.debitcard();
		
	}

}
