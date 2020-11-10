package project.Selenium6;
// Click Model Resume and  rightClick resume model 4 the page and click save as.
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech3 {

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
	    WebElement resumePath = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));//xpath for model resumes
	    actClass.click(resumePath);
	    WebElement modelPath = driver.findElement(By.xpath("//a[contains(text(),'Resume Model-4 ')]"));//xpath for model 
	    actClass.contextClick(modelPath).perform();
	    Thread.sleep(1000);
	    for (int i = 1; i < 4; i++) {//down key press for 3 times using for loop
	    	robotClass.keyPress(KeyEvent.VK_DOWN);
	    	robotClass.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
	    robotClass.keyPress(KeyEvent.VK_ENTER);
    	robotClass.keyRelease(KeyEvent.VK_ENTER);//entering save link as
   	}

}
