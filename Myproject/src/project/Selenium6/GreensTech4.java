package project.Selenium6;
//Right Click RPA [ below Top Selenium Trends In 2020] and click Inspect
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    Robot robotClass = new Robot();
	    WebElement rpaPath = driver.findElement(By.xpath("(//a[contains(text(),'RPA')])[1]"));//xpath for RPA
	    actClass.contextClick(rpaPath).perform();
	    for (int i = 1; i < 7; i++) {
	    	robotClass.keyPress(KeyEvent.VK_DOWN);
	    	robotClass.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
	    robotClass.keyPress(KeyEvent.VK_ENTER);
    	robotClass.keyRelease(KeyEvent.VK_ENTER);
	}

}
