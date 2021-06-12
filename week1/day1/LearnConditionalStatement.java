package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int age = 60; // local variable
		
		if(age < 18) {
			System.out.println("minor");
		}
		else if(age >= 18 && age < 60){
			System.out.println("adult");
		}
		else {
			System.out.println("senior citizen");
		}
			
		

	}

}
