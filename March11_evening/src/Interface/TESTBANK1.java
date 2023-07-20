package Interface;

public class TESTBANK1 {

	public static void main(String[] args) {
		
		HSBCBank B1 = new HSBCBank();    // Static binding CTP
		B1.CreditCard();  // RBI
		B1.DebitCard();
		B1.TransferMoney();
		
	    System.out.println( " MINBAL--"+B1.MINBalance);
	    
	    B1.BikeLoan(); // US
	    B1.PersonalLoan();
	    
	    B1.MutalFunds(); // Brazil
	    B1.Carloan();
	    
	    B1.Homeloan(); // HSBC
	    B1.Goldloan();
	    
	    System.out.println();
	    
	    RBIBank B2 = new HSBCBank(); //Dynamic Binding RTP
	    B2.CreditCard();
	    B2.DebitCard();
	    B2.TransferMoney();
	    
	    System.out.println();
	    
	    USBank B3 = new HSBCBank();
	    B3.BikeLoan();
	    B3.PersonalLoan();
	    
	    System.out.println();
	    
	    BrazilBank B4 = new HSBCBank();
	    B4.MutalFunds();
	    B4.Carloan();
	    
	    
	    
	    

	}

}
