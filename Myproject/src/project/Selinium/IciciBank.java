package project.Selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrtentUrl: "+currentUrl);
	    
	    WebElement UserName = driver.findElement(By.name("DUMMY1"));
	    UserName.sendKeys("Ramesh");
	    
	    WebElement MobileNumber = driver.findElement(By.name("DUMMY2"));
	    MobileNumber.sendKeys("123456");


}
}
