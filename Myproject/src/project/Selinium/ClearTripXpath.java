package project.Selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClearTripXpath {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.cleartrip.com/trains");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrtentUrl: "+currentUrl);
	    
	    WebElement fromBar = driver.findElement(By.xpath("//input[@title='From station']"));
	    fromBar.sendKeys("Kumbakonam");
	    fromBar.click();
	    WebElement toBar = driver.findElement(By.xpath("//input[@title='To station']"));
	    toBar.sendKeys("Trichy");
	    
	    WebElement classClick = driver.findElement(By.xpath("//select[@id='trainClass']"));
	    classClick.click();
	    Robot rc = new Robot();
	    rc.keyPress(KeyEvent.VK_DOWN);
	    rc.keyRelease(KeyEvent.VK_UP);
	    rc.keyPress(KeyEvent.VK_ENTER);
	    rc.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@selflabel='dd/mm/yyyy']")).sendKeys("29/10/2020");
	    driver.findElement(By.xpath("//input[@selflabel='dd/mm/yyyy']")).click();
	    driver.findElement(By.xpath("//select[@name='adults']")).click();
	    //WebElement closeClick = driver.findElement(By.xpath("//a[@id='close']"));
	    //closeClick.click();
	    driver.findElement(By.xpath("//button[text()='Search trains']")).click();
	    }

}
