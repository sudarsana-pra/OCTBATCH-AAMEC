package project.selenium8;
//print the even dates
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown3 {
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
    
    WebElement datePath = driver.findElement(By.id("day"));
    Select selectClass = new Select(datePath);//select class to access dropdowns
    
    List<WebElement> dateOptions = selectClass.getOptions();//getOptions used to get all the options in the selected path
    for (WebElement dateLoop : dateOptions) {
    	String dateOptionsGet = dateLoop.getAttribute("value");//foreach loop to get value one by one
    	int strToInt = Integer.parseInt(dateOptionsGet);//converting strings to integer
    	if(strToInt%2==0)
    	System.out.println("Options in Date: "+dateOptionsGet);
    }
	}
}
