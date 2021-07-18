package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test(groups = "smoke", dependsOnMethods = "login")
	public void createLead() {
		System.out.println("create lead");
	
	}
	
	@Test(groups = "smoke", priority = -1)
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException();

	}
	
	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(groups = "functional" , dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("delete lead");

	}
	
	@Test(groups = "regression" )
	public void duplicateLead() {
		System.out.println("duplicate lead");

	}
	
	@Test(groups = "regression" )
	public void mergeLead() {
		System.out.println("merge lead");

	}
	
	
	
	
	


}
