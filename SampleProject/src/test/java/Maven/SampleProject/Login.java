package Maven.SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login {
	
	public static String Username = "mngr214036";
	public static String Password = "AzYjese";
//Hello shashi..
@Test	
public void Login123() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			driver.navigate().to("http://demo.guru99.com/V1/index.php");
		
			driver.navigate().to("http://demo.guru99.com/V1/index.php");
			
			driver.manage().window().maximize();
				
			String PageTitle = driver.getTitle();
			
			System.out.println("GTPL Bank page title is "+PageTitle);
			
			String gettext = driver.findElement(By.xpath("//*[contains(text(),'Gtpl Bank')]")).getText();
			
			System.out.println("GTPL Bank logo is "+gettext);
			
			String Curl = driver.getCurrentUrl();
			
			System.out.println("GTPL Bank current url is "+Curl);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(Username);
			
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
			
			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
			
			JavascriptExecutor executor =  (JavascriptExecutor) driver;
			
	          WebElement Login = driver.findElement(By.xpath("//*[contains(text(),'New Account')]"));
			
			executor.executeScript("arguments[0].click();", Login);
			
			Select AccountType = new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")));
			AccountType.selectByIndex(0);
			Thread.sleep(1000);
			AccountType.selectByValue("current");
			Thread.sleep(1000);
			AccountType.selectByVisibleText("savings");
			
			Thread.sleep(1000);
			
			driver.close();
				
			//driver.quit();
}}
