package project.Selinium;
//SNAPDEAL Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		Actions actionClass = new Actions(driver);
		WebElement signInClick = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));//Mouse action at signin
		actionClass.moveToElement(signInClick).perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Register')])[1]")).click();//Register key
//ERROR
       // Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("9876543210");//MobileNo tab
		driver.findElement(By.xpath("//button[contains(text(),'continue')]")).click();
		

	}

}
