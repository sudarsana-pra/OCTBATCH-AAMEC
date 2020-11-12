package project.selenium8;
//print all the option of country using getAttribute() method Register Form
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99DropDown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement countryPath = driver.findElement(By.name("country"));
	    Select selectClass = new Select(countryPath);
	    List<WebElement> countryOptions = selectClass.getOptions();
	    for (WebElement countryLoop : countryOptions) {
	    	String countryText = countryLoop.getAttribute("value");
	    	System.out.println("COUNTRY': "+countryText);
			
		}
	    

	}
}
