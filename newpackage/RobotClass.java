package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
       // WebElement elem= driver.findElement(By.className("fileupload"));
      //  elem.sendKeys("C:\\Users\\Visha\\Downloads\\statement.pdf");
      //  driver.switchTo().alert().accept();
         Actions act = new Actions(driver);
         act.sendKeys(Keys.SPACE).build().perform();
       driver.findElement(By.cssSelector(".uploadResume")).click();
        driver.switchTo().alert().dismiss();


	}

}
