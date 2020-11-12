package project.Selinium;
//IRCTC xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();//Alert
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("kumbakonam");//from station
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("chennai");//To station
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("29-10-2020");//calendar
		//driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c12-5 ui-state-highlight ng-star-inserted']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

	}

}
