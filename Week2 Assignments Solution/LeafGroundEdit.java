package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("saheel1410@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Testleaf");
		String text = driver.findElementByXPath("//input[@name='username']").getAttribute("value");
		System.out.println(text);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		//driver.close();
		

	}

}
