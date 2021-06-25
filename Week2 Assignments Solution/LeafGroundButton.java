  
package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Button.html");

		driver.findElementById("home").click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("TestLeaf")) {
			System.out.println("HomePage is Displayed");
		}else {
			System.out.println("HomePage is Not Displayed");
		}		
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		Point location = driver.findElementByClassName("innerblock").getLocation();
		System.out.println("(x,y)"+location);
		
		 String cssValue = driver.findElementById("color").getCssValue("background-color");
		 System.out.println("(R,G,B)"+cssValue);
	Dimension size = driver.findElementById("size").getSize();
	System.out.println("(width,height)"+size);
	
	driver.close();
	
	}

}
