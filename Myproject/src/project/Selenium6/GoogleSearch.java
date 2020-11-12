package project.Selenium6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/webhp");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement searchPath = driver.findElement(By.xpath("//input[@name='q']"));
	    searchPath.sendKeys("VelMurugan");
	    Actions actClass = new Actions(driver);
	    actClass.doubleClick(searchPath).perform();
	    Thread.sleep(1000);
	    Robot robotClass = new Robot();
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_X);
	    robotClass.keyRelease(KeyEvent.VK_CONTROL);
	    robotClass.keyRelease(KeyEvent.VK_X);
	   
	    
		

}
}
