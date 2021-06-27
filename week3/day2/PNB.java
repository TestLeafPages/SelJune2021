package week3.day2;

public class PNB implements RBI {

	public void agriLoan() {
		System.out.println("30000");

	}
	
	public void fixedDeposit() {
		System.out.println("7%");	
	}

	public void savingsAccount() {
		System.out.println("5%");
		
	}
	
	
	public static void main(String[] args) {
		PNB pnb = new PNB();
		
		pnb.savingsAccount();
		pnb.fixedDeposit();
		pnb.agriLoan();
		
	}
	
	
	
	
	
	
	

}
