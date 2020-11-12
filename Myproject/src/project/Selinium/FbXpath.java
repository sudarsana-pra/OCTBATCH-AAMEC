package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrtentUrl: "+currentUrl);
	    
	    WebElement emailId = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	    emailId.sendKeys("rameshg12345@gmail.com");
	    
	    WebElement userPassword = driver.findElement(By.xpath("//input[@id='pass']"));
	    userPassword.sendKeys("12345");
	    
	    WebElement logInClick = driver.findElement(By.xpath("//button[@name='login']"));
	    logInClick.click();
	    
	    
	    
	    

	}

}
