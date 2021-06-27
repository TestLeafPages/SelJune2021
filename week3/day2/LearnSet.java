package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> values = new LinkedHashSet<String>();
			
					
		//to add data into set
		System.out.println(values.add("Hari")); //index starts with 0
		values.add("Babu");
		values.add("Sheriba");
		values.add("Dhivya");
		System.out.println(values.add("Hari"));
		values.add("Vidya"); //last index is size()-1
		
		//to find the set size
		System.out.println(values.size());
		
		//copy data from one collection to another collection
		List<String> listValues = new ArrayList<String>();
		
		
		
		
		//type foreach and ctrl+space
		for(String eachData : values) {
			System.out.println(eachData);
		}
		
		
		

	}

}
