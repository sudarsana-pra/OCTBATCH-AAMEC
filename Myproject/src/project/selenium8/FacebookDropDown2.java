package project.selenium8;
//Print all the options in month using getText() method
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	    Thread.sleep(2000);
	    
	    WebElement monthPath = driver.findElement(By.id("month"));
	    Select selectClass = new Select(monthPath);//select class to access dropdowns
	    List<WebElement> monthOptions = selectClass.getOptions();//getOptions used to get all the options in the selected path
	    for (WebElement monthLoop : monthOptions) {
	    	String monthOptionsGet = monthLoop.getText();//foreach loop to get value one by one
	    	System.out.println("Options in Month: "+monthOptionsGet);
			
		}

	}

}
