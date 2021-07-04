package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenshot {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		System.out.println(date);
		String newDate = date.toString().replace(":", "");
		System.out.println(newDate);
				
		  WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		  ChromeDriver(); driver.get("http://leafground.com/");
		  driver.manage().window().maximize();
		  
		  WebElement ele = driver.findElementByXPath("//h5[text()='Edit']");
		  //to take the screenshot of element
		  File source = ele.getScreenshotAs(OutputType.FILE);
		  
		  //to take the screen shot of the window
		  //File source = driver.getScreenshotAs(OutputType.FILE);
		  
		  File target = new File("./snaps/screenshot/edit_"+newDate+".png");
		  
		  FileUtils.copyFile(source, target);
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
