package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//declare the array with max limit
		//int[] nums = new int[6];
		
		//index starts with 0
		int[] nums = {20,30,10,50,60};
		
		//index starts with 0
		/*
		 * nums[0] = 10; nums[1] = 20; nums[2] = 40; nums[3] = 50; nums[4] = 30; nums[5]
		 * = 70;
		 */
		
		//to get single data
		//System.out.println(nums[0]);
		
		//to get the size of the array
		//System.out.println(nums.length);
		
		//to find the last index
	//	int lastIndex = nums.length - 1;
	//	System.out.println(lastIndex);
		
		//to get the last data
		//System.out.println(nums[lastIndex]);
		
		//System.out.println(nums[6]);
		
		//to sort the array data
		Arrays.sort(nums);
			
		
		//0 -> 5 ; i < 6 -> 5
		for (int i = nums.length-1; i >= 0; i--) {
			System.out.println(nums[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
