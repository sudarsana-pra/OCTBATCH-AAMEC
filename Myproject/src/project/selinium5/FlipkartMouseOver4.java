package project.selinium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Electronics is mouseover Click Realme Click 1st Product name
public class FlipkartMouseOver4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();//To close the popup
	    Thread.sleep(500);
	    WebElement electronicsMouseOver = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));//Electronics xpath
	    actClass.moveToElement(electronicsMouseOver).perform();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//a[contains(text(),'Realme')])[1]")).click();//clicking Realme.
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();



	}

}
