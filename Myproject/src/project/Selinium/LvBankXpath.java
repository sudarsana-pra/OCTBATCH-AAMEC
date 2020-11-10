package project.Selinium;
//Lvbank Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvBankXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='navbar_username']")).sendKeys("Ramesh G");
		driver.findElement(By.xpath("//input[@id='navbar_password']")).sendKeys("1234456");
		driver.findElement(By.xpath("//input[@id=\"cb_cookieuser_navbar\"]")).click();
		driver.findElement(By.xpath("(//input[@class='button'])[1]")).click();
		

	}

}
