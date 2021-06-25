package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundHyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/");

		// Click on HyperLink
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='HyperLink']")).click();

		//1) Verifying go to home page feature is done
		System.out.println("***********************************************");
		System.out.println("Verifying the link Directs to Home Page or not");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		String homepageUrl = driver.getCurrentUrl();
		if (homepageUrl.contains("home")) {
			System.out.println("Gone to HomePage");
		} else {
			System.out.println("Not Gone to HomePage");
		}

		//2) Verifying Where i am suppose to go feature is done
		System.out.println("***********************************************");
		System.out.println("Verifying Where i am suppose to go feature is done");

		Thread.sleep(1000);
		driver.navigate().back();
		String attribute = driver
				.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"))
				.getAttribute("href");
		//System.out.println(attribute);
		Thread.sleep(1000);
		driver.navigate().to(attribute);
		String title = driver.getTitle();
		System.out.println("While clicking on the link it goes to page called :" + title);

		
		//3) Verifying the link is broken or not
		System.out.println("***********************************************");
		System.out.println("Verifying the link is broken or not");

		Thread.sleep(1000);
		driver.navigate().back();
		String errorLink = driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		driver.navigate().to(errorLink);
		Thread.sleep(1000);
		String error = driver.getTitle();
		//System.out.println(error);
		if (error.contains("404")) {
			System.out.println("The link is Broken");
		} else {
			System.out.println("The link is Not Broken");
		}

		//4) Verifying whether both the Home page link are same
		System.out.println("***********************************************");
		System.out.println("Verifying whether both the Home page link are same");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		String goToHomeLink1 = driver.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
		Thread.sleep(1000);
		String goToHomeLink2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");
		if (goToHomeLink1.equals(goToHomeLink2)) {
			driver.navigate().to(goToHomeLink1);
			System.out.println("Both the links are same and Clicked on the fiirst link");
		}else {
			System.out.println("Both the links are not same");
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='HyperLink']")).click();
		driver.close();

	}

}
