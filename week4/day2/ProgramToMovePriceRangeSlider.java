package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramToMovePriceRangeSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).click(driver.findElementByXPath("//span[text()='Jeans']")).perform();
		
		//locate the price range starting element
		WebElement slider = driver.findElementByXPath("(//div[@data-filter-type='slider']//a)[1]");
		
		//actions to move the slider
		builder.clickAndHold(slider).moveByOffset(20, 0).release().perform();
	}

}
