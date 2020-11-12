package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("Title of the page: "+title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("CurrtentUrl: "+currentUrl);

    WebElement firstName = driver.findElement(By.name("firstname"));
    firstName.sendKeys("Ramesh");
    
    WebElement lastName = driver.findElement(By.name("lastname"));
    lastName.sendKeys("Gopalkrishnan");
    
    WebElement mailId = driver.findElement(By.name("reg_email__"));
    mailId.sendKeys("ramesh123@gmail.com");
    
    WebElement passWord = driver.findElement(By.name("reg_passwd__"));
    passWord.sendKeys("1234567");
    
    WebElement Day = driver.findElement(By.name("birthday_day"));
    Day.sendKeys("22");
    
   // WebElement Month = driver.findElement(By.name("birthday_month"));
    //passWord.sendKeys("October");
    
    //WebElement Year = driver.findElement(By.name("birthday_year"));
    //passWord.sendKeys("2020");
    
    
    
}
	}
