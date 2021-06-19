package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		String property = System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step 8: Verify if the login process is successful
		String welcomeText = driver.findElement(By.tagName("h2")).getText();

		if (welcomeText.contains("Welcome"))
			System.out.println(" Login succesful");
		else
			System.out.println("Login failed");

		// Step 9: Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Step10: Click Leads tab
		driver.findElement(By.linkText("Leads")).click();
		// Step11: Click CreateLead

		driver.findElement(By.linkText("Create Lead")).click();
		// Step12: Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Step13: Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		// Step14: Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabha");

		// DROP DOWN
		WebElement webEleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDown = new Select(webEleSource);
		// Select drpDown = new Select(webEleSource);
		// drpDown.selectByValue("LEAD_DIRECTMAIL");
		drpDown.selectByIndex(3);
		drpDown.selectByVisibleText("Direct Mail");

		// Step15: Click CreateLead button
		driver.findElement(By.className("smallSubmit")).click();
		// Step 16: Verify if we are in view Leads page

		String titleView = driver.getTitle();

		if (titleView.equals("View Lead | opentaps CRM"))
			System.out.println(" In the view Page");
		else
			System.out.println(" Not in View Page");

		// Step 17: Get the Company Name
		String cmpnyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(" cmpnyName:" + cmpnyName);
		// //D --> all non Integer values

		System.out.println(cmpnyName.replaceAll("\\D", ""));

		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
