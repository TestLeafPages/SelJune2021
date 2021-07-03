package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTableXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// To get the URL 
		driver.get("http://leafground.com/pages/table.html");
		// To Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> row = driver.findElementsByXPath("//table//tr/td[2]");
		
		List<Integer> vital = new ArrayList<Integer>();
		
		for (WebElement mark : row) {
			System.out.println(mark.getText());
			String least = mark.getText().replaceAll("%", "");
			// 100 ( string)
			System.out.println(least);
			
			vital.add(Integer.parseInt(least)); 
			// 100 (Integer)
		}
		
		Collections.sort(vital);
		Integer lowest = vital.get(0);

		driver.findElementByXPath("//td[contains(text(),'"+lowest+"')]/following-sibling::td/input").click();
	}
	
}
