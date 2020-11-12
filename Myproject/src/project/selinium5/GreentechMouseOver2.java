package project.selinium5;
//Courses is first mouseover Oracle training is second mouseover Click Oracle sql training
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreentechMouseOver2 {

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
	    WebElement oraclePath = driver.findElement(By.xpath("//span[contains(text(),'Oracle (48)')]"));//Xpath for Oracle
	    actClass.moveToElement(oraclePath).perform();
	    WebElement sqlPath = driver.findElement(By.xpath("//span[contains(text(),'SQL Certification Training')]"));//Xpath for SQL Certification Training
	    sqlPath.click();

	}

}
