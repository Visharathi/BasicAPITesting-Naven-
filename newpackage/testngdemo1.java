package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testngdemo1 {
	WebDriver driver ;
	@BeforeMethod
	public  void BrowserSetup() throws InterruptedException {
		driver	= new FirefoxDriver();
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        
	        driver.navigate().to("https://www.facebook.com/");
	        Thread.sleep(3500);
	        //driver.findElement(By.linkText("Create free account")).click();
	}
	@Test(priority=2,dependsOnMethods="checkLogo")
	public void checkText() throws InterruptedException
	{
	//	driver.findElement(By.linkText(("Sign in"))).isDisplayed(); 
		String f = "Facebook helps you connect and share with the people in your life.";
		String s = driver.findElement(By.cssSelector("._8eso")).getText();
		Assert.assertEquals(s, f);
		
		//driver.findElement(By.linkText(("Sign in"))).click();
		
	}
	@Test(priority=1)
	public void checkLogo() throws InterruptedException
	{
	
		//driver.findElement(By.linkText(("Try premium"))).click();
		boolean c = driver.findElement(By.cssSelector("img[alt='Facebook']")).isDisplayed();
		Assert.assertTrue(c,"image is absent");
		
	}
	@Test(priority=3,dependsOnMethods="checkLogo")
	public void Microsoft() throws InterruptedException
	{
	
		String q = driver.getTitle();
		
	}

	
	
	
	@AfterMethod
	public void  BrowserClose()
	{
		driver.quit();
	}
	}




