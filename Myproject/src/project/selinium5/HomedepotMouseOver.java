package project.selinium5;
//Alldepartment  is first mouseover
//Heating and cooling  is second  mouseover
//Air conditioners is third mouseover 
//Click portable air conditioners.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomedepotMouseOver {

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
	    WebElement heatCoolPath = driver.findElement(By.xpath("(//a[contains(text(),'Heating & Cooling')])[1]"));//Xpath for Heating & Cooling
	    actClass.moveToElement(heatCoolPath).perform();
	    Thread.sleep(500);
	    WebElement airContionerPath = driver.findElement(By.xpath("(//a[contains(text(),'Air Conditioners')])[1]"));//Xpath for Air Conditioners
	    actClass.moveToElement(airContionerPath).perform();
	    Thread.sleep(500);
	    WebElement portAirConditionerPath = driver.findElement(By.xpath("//a[contains(text(),'Portable Air Conditioners')]"));//Xpath for Portable Air Conditioners
	    portAirConditionerPath.click();
	    }

}
