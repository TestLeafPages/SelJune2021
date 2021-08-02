package challenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunInCloud {

	public static void main(String[] args) throws MalformedURLException {
		
		/*
		 * MutableCapabilities sauceOptions = new MutableCapabilities();
		 * sauceOptions.setCapability("browserName", "safari");
		 * 
		 * SafariOptions browserOptions = new SafariOptions();
		 * browserOptions.setCapability("platformName", "macOS 10.15");
		 * browserOptions.setCapability("browserVersion", "latest");
		 * browserOptions.setCapability("sauce:options", sauceOptions);
		 */
		
				  
		  MutableCapabilities sauceOptions = new MutableCapabilities();
		  sauceOptions.setCapability("browserName", "chrome");
		  ChromeOptions browserOptions = new ChromeOptions();
		  browserOptions.setExperimentalOption("w3c", true);
		  browserOptions.setCapability("platformName", "Windows 10");
		  browserOptions.setCapability("browserVersion", "latest-1");
		  browserOptions.setCapability("sauce:options", sauceOptions);
		 
		
	
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("https://a389862:924f8895-cd5f-404c-821f-50b2a8567d71@ondemand.us-west-1.saucelabs.com:443/wd/hub"), sauceOptions);
		
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		

	}

}
