package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testngdemo2 {
	WebDriver driver ;
	@BeforeMethod
	public  void BrowserSetup() throws InterruptedException {
		driver	= new FirefoxDriver();
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        
	        driver.navigate().to("https://gmail.com/");
	        Thread.sleep(3500);

}
	@Test(priority=2,dependsOnMethods="checkLogo")
	public void checkText() throws InterruptedException
	{
	//	driver.findElement(By.linkText(("Sign in"))).isDisplayed(); 
		
		Boolean s = driver.findElement(By.xpath("/html/body/header/div/a/span")).isDisplayed();
		Assert.assertEquals(s, "true");
		
		//driver.findElement(By.linkText(("Sign in"))).click();
		
	}
	@Test(priority=1)
	public void checkLogo() throws InterruptedException
	{
	
		//driver.findElement(By.linkText(("Try premium"))).click();
		boolean c = driver.findElement(By.cssSelector("a.button:nth-child(2)")).isDisplayed();
		Assert.assertTrue(c,"image is absent");
		
	}
	@Test(priority=3,dependsOnMethods="checkLogo")
	public void Microsoft() throws InterruptedException
	{
	
		String q = driver.getTitle();
		//Assert.assertEquals(q, "gmail");
	}

	
	
	
	@AfterMethod
	public void  BrowserClose()
	{
		driver.quit();
	}
	}


