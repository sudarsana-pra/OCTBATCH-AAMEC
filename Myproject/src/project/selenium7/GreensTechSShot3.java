package project.selenium7;
//Click interviews question take the screenshot
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

public class GreensTechSShot3 {
	public static void main(String[] args) throws IOException, InterruptedException {

	System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("Title of the page: "+title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("CurrentUrl: "+currentUrl);
    
    WebElement interviewQusPath = driver.findElement(By.xpath("//div[@id='heading20']"));//path for Interview questions
    Thread.sleep(1000);
    interviewQusPath.click();
    Thread.sleep(1000);
    JavascriptExecutor jS = (JavascriptExecutor)driver;
    WebElement scrollPath = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
    jS.executeScript("arguments[0].scrollIntoView(true)",scrollPath);//Scrolling down to geta veiw of options in Interview Qus
    
    TakesScreenshot snapShot = (TakesScreenshot)driver;
    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
    File desShot = new File("E:\\java class\\Screenshot Task\\Screenshot5.jpg");
    FileUtils.copyFile(sourceShot, desShot);


}
}
