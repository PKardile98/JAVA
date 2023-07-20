package Interface;

public class HSBCBank  implements RBIBank,USBank,BrazilBank{  // Complete the abstract method present in the interface with implements keyword.
	
	public void Homeloan() {
		
		System.out.println(" HSBC-- HomeLoan");
	}
	
	public void Goldloan() {
		
		System.out.println(" HSBC-- GoldLoan");
		
	}

	@Override
	public void MutalFunds() { // BrazilBank
		System.out.println(" HSBC-- MutalFunds");
		
	}

	@Override
	public void Carloan() {
		System.out.println(" HSBC-- Carloan");
		
	}

	@Override
	public void BikeLoan() { // USBank
		System.out.println(" HSBC-- BikeLoan");
		
	}

	@Override
	public void PersonalLoan() {
		System.out.println(" HSBC-- PersonalLoan");
		
	}

	@Override
	public void CreditCard() {  // RBIBank
		System.out.println(" HSBC-- CreditCard");
		
	}

	@Override
	public void DebitCard() {
		System.out.println(" HSBC-- DebitCard");
		
	}

	@Override
	public void TransferMoney() {
		System.out.println(" HSBC-- TransferMoney");
		
	}


}


