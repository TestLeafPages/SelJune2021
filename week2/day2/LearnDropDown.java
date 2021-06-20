package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByIndex(3);

		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select dd2 = new Select(dropDown2);
		dd2.selectByVisibleText("Appium");

		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select dd3 = new Select(dropDown3);
		dd3.selectByValue("4");
		//dd3.selectByValue("2");
		//dd3.selectByValue("1");

	}

}
