package project.Selenium6;
import java.awt.AWTException;
//Click Selenium Test Papers Right Click Day 6 Robot and select Inspect.
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
	    WebElement testPaperPath = driver.findElement(By.xpath("(//h2[@class='mb-0'])[5]"));//xpath for selenium test paper
	    actClass.click(testPaperPath).perform();
	    Thread.sleep(1000);
	    WebElement dayPath = driver.findElement(By.xpath("//a[contains(text(),' DAY 6 TASK')]"));
	    actClass.contextClick(dayPath).perform();
	    Thread.sleep(1000);
	    for (int i = 1; i < 7; i++) {
	    	robotClass.keyPress(KeyEvent.VK_DOWN);
	    	robotClass.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
	    robotClass.keyPress(KeyEvent.VK_ENTER);
    	robotClass.keyRelease(KeyEvent.VK_ENTER);
	}

	}



