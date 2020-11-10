package project.selenium7;
//Search motorolo and   take the screenshot.
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	  
	    WebElement searchPath = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));//xpath for searchbox
	    searchPath.sendKeys("motorola");
	    WebElement searchIconPath = driver.findElement(By.xpath("(//input[@class='nav-input'])[2]"));//xpath for search icon
	    searchIconPath.click();
	    Thread.sleep(3000);
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot8.jpg");
	    FileUtils.copyFile(sourceShot, desShot);
	    }

}
