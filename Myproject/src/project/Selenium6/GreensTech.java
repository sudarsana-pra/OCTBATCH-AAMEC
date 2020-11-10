package project.Selenium6;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//Click interview question and Right click cts interview question and Select open link in new window
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
	public static void main(String[] args) throws InterruptedException, AWTException {

	System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("Title of the page: "+title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("CurrentUrl: "+currentUrl);
    
    WebElement interviewPath = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
    interviewPath.click();
    Actions actClass = new Actions(driver);
    WebElement ctsPath = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]"));
    actClass.contextClick(ctsPath).perform();
    Robot robotClass = new Robot();
    robotClass.keyPress(KeyEvent.VK_DOWN);
    robotClass.keyPress(KeyEvent.VK_DOWN);
    robotClass.keyRelease(KeyEvent.VK_DOWN);
    robotClass.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    robotClass.keyPress(KeyEvent.VK_ENTER);
    robotClass.keyRelease(KeyEvent.VK_ENTER);
}
}
