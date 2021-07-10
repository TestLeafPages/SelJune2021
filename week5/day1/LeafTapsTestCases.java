package week5.day1;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test(priority = -1, enabled = false)
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(priority = 2)
	public void deleteLead() {
		System.out.println("delete lead");

	}
	

}
