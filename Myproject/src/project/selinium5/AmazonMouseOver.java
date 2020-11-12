package project.selinium5;
//Try Prime first mouseover Click Free fast delievery on prime items
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.amazon.in");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement PrimeMouseOver = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
	    actClass.moveToElement(PrimeMouseOver).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();    
	}

}
