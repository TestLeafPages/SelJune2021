package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDoKeyDownAndKeyUP {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup(); 
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  ChromeDriver driver = new ChromeDriver(options); 
		  
		  driver.get("https://jqueryui.com/selectable/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.switchTo().frame(0);
		  
		  WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		  WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		  WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		  WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
				  
		 
		  //create object for Actions class and pass the driver as argument
		  Actions builder = new Actions(driver);
		  builder
		  .keyDown(Keys.CONTROL)
		  .click(item1)
		  .click(item2)
		  .click(item3)
		  .click(item4)
		  .perform();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
