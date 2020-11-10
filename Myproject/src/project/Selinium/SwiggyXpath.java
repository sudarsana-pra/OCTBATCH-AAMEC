package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.swiggy.com");
		    driver.manage().window().maximize();
		    String title = driver.getTitle();
		    System.out.println("Title of the page: "+title);
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("CurrtentUrl: "+currentUrl);
		    
		    WebElement signUpKey = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		    signUpKey.click();
		    WebElement phnNo = driver.findElement(By.xpath("//input[@class='_381fS']"));
		    phnNo.sendKeys("9876543210");
		    WebElement customerName = driver.findElement(By.xpath("//input[@id='name']"));
		    customerName.sendKeys("Ramesh G");
		    WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
		    emailId.sendKeys("rameshg12345@gmail.com");
		    WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
		    userPassword.sendKeys("1234567");
		    WebElement continueClick = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		    continueClick.click();


	}

}
