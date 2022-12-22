package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Actions a = new Actions(driver);
       
        driver.navigate().to("https://en-gb.facebook.com/reg/");
       driver.findElement(By.cssSelector("button[data-cookiebanner='accept_button']")).click(); 
       Thread.sleep(2500);
       WebElement element = driver.findElement(By.name(("websubmit")));
       int x= element.getLocation().getX();
       int y= element.getLocation().getY();
       
       WebElement s=driver.findElement(By.name(("firstname")));
       
       a.click(s).sendKeys("visha").keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(org.openqa.selenium.Keys.CONTROL).keyDown(org.openqa.selenium.Keys.TAB).keyUp(org.openqa.selenium.Keys.TAB).keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
     //  a.moveByOffset(x, y).sendKeys("visha").build().perform();
    //   WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
   //   int x = element.getLocation().getX();
     // int y = element.getLocation().getY();
     // a.moveByOffset(x, y).click().build().perform();
    //  a.moveToElement(element).doubleClick().build().perform();
        
        
	}

}
