package project.Selinium;
//Accessing RedBus
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.redbus.in/");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("Title of the page: "+title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("CurrtentUrl: "+currentUrl);

    WebElement from = driver.findElement(By.id("src"));
    from.sendKeys("Kumbakonam");
    
    WebElement To = driver.findElement(By.id("dest"));
    To.sendKeys("Trichy");

	}
	}
