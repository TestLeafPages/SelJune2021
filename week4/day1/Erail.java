package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		WebElement fromStation = driver.findElementById("txtStationFrom");
		//to clear
		fromStation.clear();
		//to enter from station
		fromStation.sendKeys("ms");
		//to tap enter key
		fromStation.sendKeys(Keys.ENTER);
		
		
		
		WebElement toStation = driver.findElementById("txtStationTo");
		//to clear
		toStation.clear();
		//to enter to station
		toStation.sendKeys("mdu");
		//to tap enter key
		toStation.sendKeys(Keys.ENTER);
		
		//to uncheck sort on date
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2000);
		
		WebElement resultTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		
		List<WebElement> rows = resultTable.findElements(By.tagName("tr"));
		
		
		for (WebElement eachRow : rows) {
			List<WebElement> allColumns = eachRow.findElements(By.tagName("td"));
			System.out.println(allColumns.get(1).getText());
		}
		
		
		
		
		
		
		

	}

}
