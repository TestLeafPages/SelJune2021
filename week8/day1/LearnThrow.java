package week8.day1;

public class LearnThrow {
	
	public static int divide(int num1, int num2) {
		int result;
		if(num1 < num2) {
			throw new RuntimeException("Invalid Input - First number is smaller");
		}else {
			result = num1 / num2; // 5 / 10
		}
		
		return result;
	}

	public static void main(String[] args) {
		try {
			int res = divide(5, 10);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("end of program");
	}

}
