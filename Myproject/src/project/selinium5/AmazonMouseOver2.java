package project.selinium5;
//Signin is first mouseover
//Click Register
//Give details for Register 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.amazon.in");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement accountMouseOver = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	    actClass.moveToElement(accountMouseOver).perform();
	    
	    driver.findElement(By.xpath("(//a[contains(text(),'Start here.')])[1]")).click();   
	    driver.findElement(By.name("customerName")).sendKeys("Ramesh G");
	    driver.findElement(By.name("email")).sendKeys("9876543210");
	    driver.findElement(By.name("secondaryLoginClaim")).sendKeys("ramesh12345@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("12345678");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	

	}

}
