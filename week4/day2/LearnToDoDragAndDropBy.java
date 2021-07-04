package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDoDragAndDropBy {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup(); 
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  ChromeDriver driver = new ChromeDriver(options); 
		  
		  driver.get("https://jqueryui.com/sortable/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.switchTo().frame(0);
		  
		  WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		  WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		  
		  Point location = item4.getLocation();
		  int x = location.getX();
		  int y = location.getY();
		  
		 
		  //create object for Actions class and pass the driver as argument
		  Actions builder = new Actions(driver);
		  builder.dragAndDropBy(item1, x, y).perform();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
