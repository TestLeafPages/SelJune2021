package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Selenium Internal Architecture

// SeleniumJavaCodes --> REST API Calls --> chromeDriver.exe(local machine)
//		   --> ChromeBrowser

// SeleniumJavaCodes --> REST API Calls --> GeckoDriver.exe(local machine)
//		   --> FireFox Browser

// SeleniumJavaCodes --> REST API Calls --> EdgeDriver.exe(local machine)
//		   --> Edge Browser

		// Download the chromedriver exe and set its path
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximise ( Best Practise)
		driver.manage().window().maximize();
		// Locate the username and type
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Locate the password and type
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Get the title
		String title = driver.getTitle();
		System.out.println("title:" + title);

		driver.findElement(By.linkText("CRM/SFA")).click();

	}

}
