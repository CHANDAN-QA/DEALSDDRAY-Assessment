package test_NG;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Functional_Testing_Case  
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./softwares/chromedrivernew.exe");
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	      driver.manage().window().maximize();
		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='reorder'and @class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeMedium icon css-1jgtvd5']")).click();
		driver.findElement(By.xpath("//span[.='Orders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Add Bulk Orders']")).click();
	    driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\CHANDAN L\\Downloads\\demo-data.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Import']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Validate Data']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\CHANDAN L\\Desktop\\Screenshots\\Functional-Testing_screenshot\\Ft1.jpeg");
		FileUtils.copyFile(src, dst);
		Thread.sleep(3000);
		driver.close();   //button[.='Submit']
		
		
		
		
	}
}