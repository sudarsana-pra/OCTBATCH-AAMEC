package project.selenium7;
//Scroll Down till "Greens technology Perumbakkam. address "and Take  screenshot 
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechSShot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.greenstechnologys.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    JavascriptExecutor jS = (JavascriptExecutor)driver;
	    WebElement infoPath = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
	    jS.executeScript("arguments[0].scrollIntoView(true)",infoPath);//Scrolling down
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot2.jpg");
	    FileUtils.copyFile(sourceShot, desShot);

	}

}
