package week5.day2;

import org.testng.annotations.Test;

public class TestNGTestCases {
	
	//packagename.ClassName.methodName
	@Test(dependsOnMethods = "week5.day2.LeafTapsTestCases.createLead")
	public void editLead() {
		System.out.println("edit lead");

	}

}
