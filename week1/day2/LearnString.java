package week1.day2;

/*
 * length() - to find the number of characters
 * equals() - to compare values of 2 strings
 * equalsIgnoreCase() - to compare 2 string values by ignoring case
 * charAt() - to get single character from String
 */



public class LearnString {

	public static void main(String[] args) {
	//  dataType variable = "value";
		//declare using String literal
		String str1 = "welcome";
		String str2 = "WELCOME";
		
		//method to find the characters in a String
		System.out.println(str1.length());
		
		// to find last index 
		System.out.println(str1.length()-1);
		
		
		//to compare the 2 string values
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		//to get single character from String
		System.out.println(str1.charAt(0));
		
		//System.out.println(str1.charAt(str1.length()-1));
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(str1 == str2);
		 * 
		 * 
		 * //Declare using new keyword String str3 = new String("welcome");
		 * 
		 * String str4 = new String("welcome");
		 * 
		 * System.out.println(str1 == str3);
		 * 
		 * System.out.println(str3 == str4);
		 */
		
		
		
		
		
		
		
		

	}

}
