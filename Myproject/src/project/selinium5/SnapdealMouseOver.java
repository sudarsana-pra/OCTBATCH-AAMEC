package project.selinium5;
//Women's Fashion is first mouseover
//Click footwear->click heals.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMouseOver {

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
	    WebElement womenFasionPath = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));//Xpath for Women's Fashion
	    actClass.moveToElement(womenFasionPath).perform();
	    WebElement heelsPath = driver.findElement(By.xpath("(//span[contains(text(),'Heels')])[2]"));//Xpath for Heels
	    heelsPath.click();

	}

}
