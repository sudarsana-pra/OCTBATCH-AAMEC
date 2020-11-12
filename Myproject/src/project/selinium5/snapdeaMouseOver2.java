package project.selinium5;
//Mobile & Tablets is first mouseover
//Click newly lanuch covers.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeaMouseOver2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement mobilePath = driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]"));//Xpath for Mobile & Tablets
	    actClass.moveToElement(mobilePath).perform();
	    WebElement coversPath = driver.findElement(By.xpath("//span[contains(text(),'New Launches Covers')]"));//Xpath for New Launches Covers
	    coversPath.click();

	}

}
