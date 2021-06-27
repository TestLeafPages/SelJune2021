package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CopyDataFromSetToList {

	public static void main(String[] args) {
		Set<String> values = new LinkedHashSet<String>();

		//to add data into set
		values.add("HARI"); 
		values.add("Babu");
		values.add("Sheriba");
		values.add("Hari");
		values.add("Dhivya");
		values.add("Vidya"); 
		
		System.out.println(values.size());
						
		//copy data from one collection to another collection
		List<String> listValues = new ArrayList<String>(values);
		
		System.out.println(listValues.get(2));
		
		
		
		
		
		

	}

}
