package project.Selinium;
import org.openqa.selenium.By;
//Amazon register using Xpath.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		Actions actionClass = new Actions(driver);
		WebElement signinClick = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		actionClass.moveToElement(signinClick).perform();
		driver.findElement(By.xpath("(//a[@class='nav-a'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Ramesh G");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramesh.g12345@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='continue']")).click();




	}

}
