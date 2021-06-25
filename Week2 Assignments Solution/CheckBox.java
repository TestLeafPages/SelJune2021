package leafGrounds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		driver.findElement(By.xpath("//div[text()='C']/input")).click();
		driver.findElement(By.xpath("//div[text()='C++']/input")).click();
		
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		if (selected) {
			System.out.println("The Selenium checkbox is Checked");
		} else {
			System.out.println("The Selenium checkbox is UnChecked");
		}

		
		driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();;
		boolean deselect = driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected();
		if (deselect) {
			System.out.println("The checkbox is not Deselected");
		} else {
			System.out.println("The checkbox is Deselected");
		}
		driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
	}

}
