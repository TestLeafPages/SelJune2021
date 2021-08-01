package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWithPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step1: Set up the file path
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		
		//step2: Create object for Properties
		Properties prop = new Properties();
		
		//Step3: Load the properties files
		prop.load(fis);
		
		//System.out.println(prop.getProperty("password"));
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
