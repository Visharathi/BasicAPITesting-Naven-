package newpackage;
import java.io.*;  

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class exceldemo {

	public static void main(String[] args)throws IOException, BiffException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fname = driver.findElement(By.id("firstName"));
		WebElement sname= driver.findElement(By.id("lastName"));
		WebElement uname= driver.findElement(By.id("username"));
		WebElement pwd= driver.findElement(By.name("Passwd"));
		File f=new File("C:\\Users\\Visha\\OneDrive\\Desktop\\exceldemo.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh =wb.getSheet("dip");
		for(int i = 1;i<sh.getRows();i++)
		{
			//System.out.println(sh.getCell(1,i).getContents());
			fname.sendKeys(sh.getCell(0,i).getContents());
			Thread.sleep(2500);
			sname.sendKeys(sh.getCell(1,i).getContents());
			Thread.sleep(2500);
			uname.sendKeys(sh.getCell(2,i).getContents());
			Thread.sleep(2500);
			pwd.sendKeys(sh.getCell(3,i).getContents());
			fname.clear();
			sname.clear();
			uname.clear();
			pwd.clear();
			Thread.sleep(2500);
		}
		
		

	}

}
