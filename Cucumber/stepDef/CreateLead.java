package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
		
	@When("Click on {string} link")
	public void clickLink(String locatorValue) {
		driver.findElement(By.linkText(locatorValue)).click();

	}

}
