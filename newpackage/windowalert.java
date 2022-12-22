package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowalert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.navigate().to("https://www.amazon.co.uk/");
	        driver.switchTo().alert().accept();
}
}