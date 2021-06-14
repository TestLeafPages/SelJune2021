package week1.assignments;

//13? prime or not
public class PrimeNumber {

	public static void main(String[] args) {
		//input to find the given number is prime or not
		int input = 13;
		
		//prime - should be divisible only by 1 and 13 
		
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			
			if(input % i == 0) {
				count = count+1;
			}
			
		}
		
		if(count == 2) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}
		
		
		
		
		
		

	}

}
