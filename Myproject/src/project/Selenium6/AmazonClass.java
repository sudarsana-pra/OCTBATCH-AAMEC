package project.Selenium6;
//Click login and type a  email in email textbox and select email and right click and click cut 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement loginPath = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	    loginPath.click();
	    WebElement mailPath = driver.findElement(By.xpath("//input[@name='email']"));
	    mailPath.sendKeys("ramesh12345@gmail.com");//entering email
	    Robot robotClass = new Robot();
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_A);
	    robotClass.keyRelease(KeyEvent.VK_CONTROL);
	    robotClass.keyRelease(KeyEvent.VK_A);//selecting the text in email textbox
	    Actions actClass = new Actions(driver);
	    actClass.contextClick(mailPath).perform();//right click on the email textbox
	    
	    robotClass.keyPress(KeyEvent.VK_DOWN);
	    robotClass.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
	    
	    robotClass.keyPress(KeyEvent.VK_ENTER);
    	robotClass.keyRelease(KeyEvent.VK_ENTER);//enter to cut the text
	    



	    

	}

}
