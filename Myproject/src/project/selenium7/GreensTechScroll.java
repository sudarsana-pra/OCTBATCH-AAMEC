package project.selenium7;
//ScrollDown till "job opening" and Take the screenshot and  scroll up Online Classroom
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//ScrollDown till "job opening" and Take the screenshot and  scroll up Online Classroom
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechScroll {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    JavascriptExecutor jS = (JavascriptExecutor)driver;
	    WebElement jobOpeningPath = driver.findElement(By.xpath("//div[@id='heading2011']"));
	    jS.executeScript("arguments[0].scrollIntoView(true)",jobOpeningPath);//Scrolling down
	    
	    TakesScreenshot snapShot = (TakesScreenshot)driver;
	    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
	    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot3.jpg");
	    FileUtils.copyFile(sourceShot, desShot);
	    
	     WebElement onlineClassroomPath = driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
	    jS.executeScript("arguments[0].scrollIntoView(false)",onlineClassroomPath);//Scrolling up
	

	}

}
