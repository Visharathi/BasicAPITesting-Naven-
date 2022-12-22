package newpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;  
public class radiodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.navigate().to("https://www.airindia.in/");
	        
	        List<WebElement>w1=  driver.findElements(By.className("radio-input"));
	        System.out.println(w1.size());
	        

	}

}
