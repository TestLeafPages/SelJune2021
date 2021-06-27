package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Integer> values = new LinkedList<Integer>();
		
		//to find the list size
		System.out.println(values.size());
		
		//all the data in list is saved based on index; index starts with 0
		
			
		//to add data into list
		values.add(100); //index starts with 0
		values.add(500);
		values.add(200);
		values.add(400);
		values.add(700);
		values.add(600);
		values.add(100); //last index is size()-1
		
		
		
		//to get single data from list
		//System.out.println(values.get(2));
		
		//to remove data from list
		values.remove(4);
		
		//to find the list size
		System.out.println(values.size());
		
		//to sort the values in the list
		Collections.sort(values);
		
		for (int i = values.size()-1 ; i >= 0 ; i--) {
			System.out.println(values.get(i));
		}
		
		
		
		
		

	}

}
