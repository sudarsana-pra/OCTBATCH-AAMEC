package project.selinium5;
//Course is first mouseover Software testing training is second mouseover  Click selenium training 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreentechMouseOver {

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
	    WebElement softwarePath = driver.findElement(By.xpath("//span[contains(text(),'Software Testing (12)')]"));//Xpath for Software Testing (12)
	    actClass.moveToElement(softwarePath).perform();
	    WebElement seleniumPath = driver.findElement(By.xpath("//span[contains(text(),'Selenium Certification Training')]"));//Xpath for Selenium Certification Training
	    seleniumPath.click();

	    


	}

}
