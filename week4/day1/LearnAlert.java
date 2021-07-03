package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// To get the URL 
		driver.get("http://www.leafground.com/pages/Alert.html");
		// To Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Inspect the AlertBox button
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		// Alert -- Interface
		// switchTo - switches the control from main window to the alert box
		// alert() -- current active modal dialog 
		// ******** SIMPLE ALERT *********//
		
		Alert alert1 = driver.switchTo().alert();
		// Gets the text from the alert box
		String textAlert1 = alert1.getText();
		System.out.println("textAlert1:" + textAlert1);
		// Click OK button of the alert box
		alert1.accept();
		
		// Throws org.openqa.selenium.NoAlertPresentException
		// Trying to interact with the alert that is not active curently
		// String textAlert1 = alert1.getText();
		
		
		// AT THIS POINT CONTROL IS IN THE MAIN WINDOW
		
		
		// ******** CONFIRM ALERT *********//
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		String textAlert2 = alert2.getText();
		System.out.println("textAlert:2" + textAlert2);
		
		//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		// Click OK button of the alert box
		alert2.accept();
		// alert2.dismiss();
		
		
		// ******** PROMPT ALERT *********//
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		String textAlert3 = alert3.getText();
		alert3.sendKeys("Qeagle");
		
		Thread.sleep(3000);
		alert3.accept();
		System.out.println("textAlert3:" + textAlert3);
		
		// ********** MODAL DIALOG*******//
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
