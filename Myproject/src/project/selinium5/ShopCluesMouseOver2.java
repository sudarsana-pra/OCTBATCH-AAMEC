package project.selinium5;
//Sports&more  is first mouseover Click weights grainers 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopCluesMouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.shopclues.com/wholesale.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement sportsPath = driver.findElement(By.xpath("//a[contains(text(),'Sports & More')]"));
	    actClass.moveToElement(sportsPath).perform();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]")).click();
	    

	}

}
