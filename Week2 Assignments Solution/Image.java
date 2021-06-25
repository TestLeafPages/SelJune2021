package leafGrounds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		String homePage = driver.getTitle();
		System.out.println(homePage);
		
		if (homePage.contains("TestLeaf")) {
			System.out.println("HomePage is Displayed");
		}else
			System.out.println("HomePage is Not Displayed");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	driver.navigate().to(attribute);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if (title.contains("404")) {
		System.out.println("Error is Displayed");
	}else
		System.out.println("Error is Not Displayed");
	
	
		

  }
} 