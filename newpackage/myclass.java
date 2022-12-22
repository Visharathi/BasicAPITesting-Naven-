package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;  
public class myclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 

	        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.navigate().to("https://www.amazon.co.uk/");
	}}

	       /* driver.findElement(By.cssSelector("#sp-cc-accept")).click();
	        WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
	     	s.sendKeys("iphone");
	     	
	     	driver.findElement(By.cssSelector("input[value='Go']")).click();
	     	
	     	
	     	WebElement element = driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]"));
	     	
	     	 List<WebElement> elements = element.findElements(By.className("a-spacing-micro"));
	     	driver.findElement(By.linkText("Apple")).click();}}
	     	//System.out.println(elements.size());
  /*for (WebElement e : elements) {
            	e.click();
            	 System.out.println(e);
                 //System.out.println(e.getAttribute("id"));
             }}}*/

	     	
	
/*for(int i=0; i<elements.size(); i++)
{
			String txt = elements.get(i).getText();
		//	System.out.println(txt);
           elements.get(i).click();
           Thread.sleep(2000);*/
	
//}
	     	