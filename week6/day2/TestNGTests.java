package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGTests {
	@Test
	public void createLead() {
		System.out.println("create lead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException();
	}
	
	@Test
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}
	
	
	
	
	
}
