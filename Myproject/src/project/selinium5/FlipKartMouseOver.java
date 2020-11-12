package project.selinium5;
//Home & Furniture is first mouseover.Click Bath Towels and print any product name 

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMouseOver {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.flipkart.com");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    Actions actClass = new Actions(driver);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    WebElement homeMouseOver = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
	    actClass.moveToElement(homeMouseOver).perform();
	    driver.findElement(By.xpath("//a[contains(text(),'Bath Towels')]")).click();
	    String getTextTowel= driver.findElement(By.xpath("//a[@class='_2cLu-l']")).getText();
	    System.out.println("Name of the Towel: "+getTextTowel);
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\ScreenShot");
	    FileUtils.copyFile(sourceShot, desShot);
	    
	    

	}

}
