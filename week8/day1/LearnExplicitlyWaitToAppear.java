package week8.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWaitToAppear {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		//create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		
		/*
		 * Wait wait = new FluentWait(driver) .withTimeout(Duration.ofSeconds(10))
		 * .pollingEvery(Duration.ofMillis(250));
		 */
					
			
		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("btn")));
		
		String text = driver.findElementById("btn").getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
