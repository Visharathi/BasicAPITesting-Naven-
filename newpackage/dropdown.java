package newpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;  
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.navigate().to("https://outlook.live.com/owa/");
	        Thread.sleep(3500);
	        driver.findElement(By.linkText("Create free account")).click();
	        driver.findElement(By.id("MemberName")).sendKeys("refrhe7");
	        Thread.sleep(3500);
	        driver.findElement(By.id("iSignupAction")).click(); 
	        Thread.sleep(3500);
	        driver.findElement(By.id("PasswordInput")).sendKeys("Vish@2021");
	        Thread.sleep(3500);
	       /* driver.findElement(By.id("ShowHidePasswordCheckbox")).click();
	        Thread.sleep(3500);
	        driver.findElement(By.id("iOptinEmail")).click();
	        Thread.sleep(3500);
	        driver.findElement(By.id("iSignupAction")).click();*/
	        WebElement w = driver.findElement(By.id("PasswordForm"));
	       
	        List<WebElement>w1=w.findElements(By.cssSelector("input[type='checkbox']"));
	        for(int i=0; i<w1.size(); i++)
	        {
	        			String txt = w1.get(i).getAttribute("id");
	        			System.out.println(txt);
	                   w1.get(i).click();
	                  
	                   Thread.sleep(2000);
	}
	        driver.findElement(By.id("iSignupAction")).click();
	        driver.findElement(By.id("FirstName")).sendKeys("visha");
	        driver.findElement(By.id("LastName")).sendKeys("rathi");
	        driver.findElement(By.id("iSignupAction")).click();
	        WebElement s = driver.findElement(By.id("Country"));
	        Select d1=new Select(s);
	        d1.selectByValue("Armenia");
	        
	}
}
