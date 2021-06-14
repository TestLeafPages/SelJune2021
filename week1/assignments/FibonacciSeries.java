package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21,34....
		int first = 0;
		int second = 1;
		
		int nextNum = 0;
		
		System.out.println(first);
		System.out.println(second);
		
		for (int i = 1; i <= 8; i++) {
			
			nextNum = first + second;
			System.out.println(nextNum);
			
			//swapping the numbers
			first = second;
			second = nextNum;
			
		}
		
		
		
		

	}

}
