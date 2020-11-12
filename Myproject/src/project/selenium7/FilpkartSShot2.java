package project.selenium7;
//Mouse Over Womens and take the screenshot.
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

public class FilpkartSShot2 {

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
	    Actions actClass = new Actions(driver);
	    WebElement womenmousePath = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
	    actClass.moveToElement(womenmousePath).perform();
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot9.jpg");
	    FileUtils.copyFile(sourceShot, desShot);


	}

}
