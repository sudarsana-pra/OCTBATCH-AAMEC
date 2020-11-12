package project.Selenium6;
//Select any item and then right click and press open in a new window
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/offers/quirky");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Pongal')]"));
	    actClass.contextClick(findElement).perform();//Right click 
	    Robot robotClass = new Robot();
	    for (int i = 1; i < 2; i++) {
	    	robotClass.keyPress(KeyEvent.VK_DOWN);
	    	robotClass.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
	}
	    robotClass.keyPress(KeyEvent.VK_ENTER);
    	robotClass.keyRelease(KeyEvent.VK_ENTER);//open in new window
	
	}
}
