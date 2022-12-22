package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver ;
	@BeforeMethod
	public  void BrowserSetup() throws InterruptedException {
		driver	= new FirefoxDriver();
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        
	        driver.navigate().to("https://outlook.live.com/owa/");
	        Thread.sleep(3500);
	        //driver.findElement(By.linkText("Create free account")).click();
	}
	        
	        
	      
	@Test(priority=2,dependsOnMethods="TryPremeium")
	public void signin() throws InterruptedException
	{
	//	driver.findElement(By.linkText(("Sign in"))).isDisplayed(); 
		driver.findElement(By.linkText(("Sign in"))).click();
		
	}
	@Test(priority=1)
	public void TryPremeium() throws InterruptedException
	{
	
		//driver.findElement(By.linkText(("Try premium"))).click();
		boolean c = driver.findElement(By.linkText(("Try premium"))).isDisplayed();
		Assert.assertTrue(c,"the icon is not present");
		
	}
	@Test(priority=3,dependsOnMethods="TryPremeium")
	public void Microsoft() throws InterruptedException
	{
	
		driver.findElement(By.linkText(("Microsoft"))).isDisplayed();
	}

	
	
	
	@AfterMethod
	public void  BrowserClose()
	{
		driver.quit();
	}
	}


