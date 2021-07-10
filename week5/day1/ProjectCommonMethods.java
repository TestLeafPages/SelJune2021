package week5.day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectCommonMethods {
	
	@BeforeMethod
	public void preCondition() {
		System.out.println("Common precondition");

	}
	
	@AfterMethod
	public void postCondition() {
		System.out.println("Common postcondition");

	}

}
