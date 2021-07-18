package week6.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void login() {
		String expTitle = "LeafTaps";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		String actTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actTitle, expTitle);
		
		
		
		//Assert.assertFalse(displayed);
		//Assert.assertTrue(displayed);
		//Assert.assertEquals(actTitle, expTitle );
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Title is matching");
		 * }else { System.out.println("Title is not matching"); }
		 */
		
		
		System.out.println("End of program");
		
		
		//mandatory step
		softAssert.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
