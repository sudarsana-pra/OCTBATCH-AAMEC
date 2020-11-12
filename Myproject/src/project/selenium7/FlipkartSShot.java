package project.selenium7;
//Search iphone and take the screenshot.
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Thread.sleep(1000);
	    WebElement closePath = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));//to close the popup
	    closePath.click();
	    WebElement searchPath = driver.findElement(By.xpath("//input[@name='q']"));//Search box
	    searchPath.sendKeys("iphone");
	    WebElement searchButtonPath = driver.findElement(By.xpath("//button[@class='vh79eN']"));//Search click
	    searchButtonPath.click();
	    Thread.sleep(4000);
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot7.jpg");
	    FileUtils.copyFile(sourceShot, desShot);


	

	}

}
