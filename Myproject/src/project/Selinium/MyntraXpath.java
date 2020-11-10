package project.Selinium;
//Myntra xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[contains(text(),'CONTINUE')]")).click();
		

	}

}
