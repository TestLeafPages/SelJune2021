package week3.day2;

public class IOB implements RBI{
	
	public void eduLoan() {
		System.out.println("50000");

	}
	
	public void fixedDeposit() {
		System.out.println("6%");		
	}

	public void savingsAccount() {
		System.out.println("4%");	
	}

	public static void main(String[] args) {
		IOB iob = new IOB();
		
		iob.savingsAccount();
		iob.fixedDeposit();
		iob.eduLoan();
		
		
	}
	
	
	
	

}
