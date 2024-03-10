package test_NG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

class ResolutionTest
{
	//Using Firefox
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.getcalley.com/page-sitemap.xml");
		  Thread.sleep(5000);
		  
		  //to set the desktop resolution
		  Dimension d = new Dimension(1920,1080);
		  driver.manage().window().setSize(d);
		  
		  
		 WebElement ele1 = driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']"));
		 ele1.click();
		 TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\CHANDAN L\\Desktop\\Screenshots\\photo1fire.jpeg");
		FileUtils.copyFile(src, dst);
		Thread.sleep(5000);
		driver.navigate().back();
		
		 Dimension d1 = new Dimension(1366,768);
		  driver.manage().window().setSize(d1);
		  
			 WebElement ele2 = driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-call-from-browser/']"));
			 ele2.click();
			File src1 = ts.getScreenshotAs(OutputType.FILE);
			File dst1 = new File("C:\\Users\\CHANDAN L\\Desktop\\Screenshots\\photo2fire.jpeg");
			FileUtils.copyFile(src1, dst1);
			Thread.sleep(5000);
			driver.navigate().back();
			
			 Dimension d2 = new Dimension(1536,864);
			  driver.manage().window().setSize(d2);
			  
				 WebElement ele3= driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-pro-features/']"));
				 ele3.click();
				File src2 = ts.getScreenshotAs(OutputType.FILE);
				File dst2 = new File("C:\\Users\\CHANDAN L\\Desktop\\Screenshots\\photo3fire.jpeg");
				FileUtils.copyFile(src2, dst2);
				Thread.sleep(5000);
				driver.navigate().back();
			
			driver.close();

}
}

