package project.Selinium4;
//http://www.gmail.com  Login the gmail using debug steps.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.gmail.com");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    //WebElement gmailClick = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	    //gmailClick.click();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rameshg12345@gmail.com");;//Enter email or phone
	    driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();//Click to go for password
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456678");//Enter password
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();//click next to signin
	}

}
