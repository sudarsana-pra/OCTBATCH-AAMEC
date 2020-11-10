package project.selinium5;
//womens is mouseover
//Click flat slipper
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOver2 {

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
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    WebElement womenMouseOver = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
	    actClass.moveToElement(womenMouseOver).perform();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//a[contains(text(),'Flats')]")).click();


	}

}
