package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		
		int orgNum = input;
		
		//initial value for the sum
		int total = 0;
		
		while(input > 0) {
			
			int rem = input % 10;
			
			total = total + (rem*rem*rem);
			
			input = input / 10; 
			
			
		}
		
		if (total == orgNum) {
			System.out.println("Given number is armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
