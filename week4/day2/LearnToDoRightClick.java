package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDoRightClick {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup(); 
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  ChromeDriver driver = new ChromeDriver(options); 
		  
		  driver.get("https://www.snapdeal.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		  
		  //create object for Actions class and pass the driver as argument
		  Actions builder = new Actions(driver);
		  builder.contextClick(mensFashion).perform();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
