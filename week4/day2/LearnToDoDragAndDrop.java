package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToDoDragAndDrop {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup(); 
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  ChromeDriver driver = new ChromeDriver(options); 
		  
		  driver.get("http://leafground.com/pages/drop.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  WebElement source = driver.findElementById("draggable");
		  
		  WebElement target = driver.findElementById("droppable");
		  
		 
		  //create object for Actions class and pass the driver as argument
		  Actions builder = new Actions(driver);
		  builder.dragAndDrop(source, target).perform();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
