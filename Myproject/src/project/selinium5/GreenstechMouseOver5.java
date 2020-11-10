package project.selinium5;
//Courses is first mouseover
//Data Warehousing is second mouseover
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenstechMouseOver5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement coursesPath = driver.findElement(By.xpath("//div[contains(text(),'Courses ')]"));//Xpath for COURSES
	    actClass.moveToElement(coursesPath).perform();
	    WebElement wareHousingPath = driver.findElement(By.xpath("//span[contains(text(),'Data Warehousing (5)')]"));//Xpath for Data Warehousing (5)
	    actClass.moveToElement(wareHousingPath).perform();

	}

}
