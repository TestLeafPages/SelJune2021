package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
	public static ChromeDriver driver;
	
	public void switchToWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(index));

	}

	

	public static void main(String[] args) throws InterruptedException {
		LearnWindowHandling lwh = new LearnWindowHandling();
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//current window reference
		//String firstWindowHandle = driver.getWindowHandle();
		
		driver.findElementById("home").click();
		lwh.switchToWindow(1);
		
		System.out.println(driver.getTitle());
		
		//will close the current window
		driver.close();
			
		//to move the control to the first window
		lwh.switchToWindow(0);
		System.out.println(driver.getTitle());
		
		
		
		//to move the control to the first window
		//lwh.switchToWindow(0);
		
		//to close all the windows opened by selenium
		//driver.quit();
		
		//System.out.println(driver.getTitle());
		
		
		
		
		
		
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		
		//to get the current window reference (first window)
		/*
		 * String firstWindowHandle = driver.getWindowHandle();
		 * System.out.println(firstWindowHandle);
		 */
		
		//System.out.println("***************************************");
		
		
		
		
		
		/*
		 * 
		 * for (String eachHandle : windowHandles) { System.out.println(eachHandle); }
		 * 
		 * System.out.println("********************************************");
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
