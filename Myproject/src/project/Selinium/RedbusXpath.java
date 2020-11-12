package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class RedbusXpath {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrtentUrl: "+currentUrl);
	    
	    //Actions actClass = new Actions(driver);
	    WebElement signIn = driver.findElement(By.xpath("//div[@class='fr signin-block']"));
	    signIn.click();
	    WebElement signInLink = driver.findElement(By.xpath("//li[@id='signInLink']"));
	    signInLink.click();
	    WebElement mobileNo = driver.findElement(By.xpath("(//input[@class='IP'])[1]"));
	    mobileNo.sendKeys("9876543210");

	}

}
