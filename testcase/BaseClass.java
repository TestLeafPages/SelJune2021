package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	
	public String excelFileName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startApp(String url, String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	
	@DataProvider(name = "fetchData", indices = 0)
	public String[][] sendData() throws IOException {
		//create object ReadExcel class
		ReadExcel re = new ReadExcel();
				
		//Call the readData() using the object with input as fileName
		return re.readData(excelFileName);
	}
	

}
