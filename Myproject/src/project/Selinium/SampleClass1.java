package project.Selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SampleClass1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("Title of the page: "+title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("CurrtentUrl: "+currentUrl);
    
    WebElement userName = driver.findElement(By.id("email"));
    userName.sendKeys("Ramesh");
    
    WebElement userPassword = driver.findElement(By.id("pass"));
    userPassword.sendKeys("123456");
    
    WebElement loginButton = driver.findElement(By.name("login"));
    loginButton.click();

}
}
