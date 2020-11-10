package project.Selenium6;
//Type email in email textbox and cut  the email using Robot class Paste that email in password text  using Robot class 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Robot robotClass = new Robot();
	    WebElement emailPath = driver.findElement(By.xpath("//input[@id='email']"));
	    emailPath.sendKeys("ramesh12345@gmail.com");
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_A);
	    robotClass.keyRelease(KeyEvent.VK_CONTROL);
	    robotClass.keyRelease(KeyEvent.VK_A);
	    Thread.sleep(3000);
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_X);
	    robotClass.keyRelease(KeyEvent.VK_CONTROL);
	    robotClass.keyRelease(KeyEvent.VK_X);
	    Thread.sleep(1000);
	    WebElement passPath = driver.findElement(By.xpath("//input[@id='pass']"));
	    passPath.click();
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_V);
	    robotClass.keyRelease(KeyEvent.VK_CONTROL);
	    robotClass.keyRelease(KeyEvent.VK_V);
	    
	   
	    
	    }

}
