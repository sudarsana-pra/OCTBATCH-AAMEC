package project.selinium5;
//All department is first mouseover 
//Paint is second mouseover
//Interior painting is third mouseover
//Click celling paint.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomedepotMouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.homedepot.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    WebElement alldeptPath = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));//Xpath for All Departments
	    actClass.moveToElement(alldeptPath).perform();
	    WebElement paintPath = driver.findElement(By.xpath("//a[contains(text(),'Paint')]"));//Xpath for Paint
	    actClass.moveToElement(paintPath).perform();
	    //Thread.sleep(500);
	    WebElement interiorPaintPath = driver.findElement(By.xpath("//a[contains(text(),'Interior Paint')]"));//Xpath for Interior Paint
	    actClass.moveToElement(interiorPaintPath).perform();
	    Thread.sleep(500);
	    WebElement ceilingPaintPath = driver.findElement(By.xpath("//a[contains(text(),'Ceiling Paint')]"));//Xpath for Portable Ceiling Paint
	    ceilingPaintPath.click();

	}

}
