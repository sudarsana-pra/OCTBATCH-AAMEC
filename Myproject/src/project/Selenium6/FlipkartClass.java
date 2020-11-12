package project.Selenium6;
//Type a  name in email textbox and cut using (control +c) and paste in password using (control+v)
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get(" https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	   
	    
	    Thread.sleep(1000);
	    WebElement emailPath = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));//xpath for email text area
	    emailPath.sendKeys("9876543210");
	    
	    Robot robotClass = new Robot();
	    WebElement passPath = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));//xpath for password
	    robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_A);
    	robotClass.keyRelease(KeyEvent.VK_CONTROL);
    	robotClass.keyRelease(KeyEvent.VK_A);
    	//coping the content
    	robotClass.keyPress(KeyEvent.VK_CONTROL);
	    robotClass.keyPress(KeyEvent.VK_C);
    	robotClass.keyRelease(KeyEvent.VK_CONTROL);
    	robotClass.keyRelease(KeyEvent.VK_C);
    	passPath.click();
    	robotClass.keyPress(KeyEvent.VK_CONTROL);//paste the content in pasword text area
	    robotClass.keyPress(KeyEvent.VK_V);
    	robotClass.keyRelease(KeyEvent.VK_CONTROL);
    	robotClass.keyRelease(KeyEvent.VK_V);
    	
	   }

}
