package week3.day2;

public class IndianBank implements CIBIL{

	
	
	public static void main(String[] args) {
		IndianBank ib = new IndianBank();
		ib.fixedDeposit();
		ib.savingsAccount();
		ib.creditScore();
		
		
		
	}

	public void creditScore() {
		System.out.println("90");
		
	}

	public void fixedDeposit() {
		System.out.println("7%");		
	}

	public void savingsAccount() {
		System.out.println("6%");
		
	}


}
