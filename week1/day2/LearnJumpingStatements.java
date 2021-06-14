package week1.day2;

public class LearnJumpingStatements {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("Three");
				//continue;
				break;
			}
			
			System.out.println(i);
		}

	}

}
