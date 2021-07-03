package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		
		// Implicit wait-one time call
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// driver.findElement(By.id("Click")).click(); -- NoSuchElementException
		
		// Enter into the frame
		// Select the frame on Zero-based index
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		
		// To come out of the current frame/ reach the main dcument
		driver.switchTo().defaultContent();
		
		// Nested Frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
