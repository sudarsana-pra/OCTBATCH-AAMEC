package project.selenium8;
//print all the option in Room Type available.
import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelAppDropDown2 {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("http://adactinhotelapp.com/");
		    driver.manage().window().maximize();
		    String title = driver.getTitle();
		    System.out.println("Title of the page: "+title);
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("CurrentUrl: "+currentUrl);
		    
		    WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		    userName.sendKeys("MohamedAsif");
		    WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		    passWord.sendKeys("123456");
		    WebElement loginButton = driver.findElement(By.xpath("//input[@id='login']"));
		    loginButton.click();
		    
		    WebElement roomTypeDropDown = driver.findElement(By.id("room_type"));
		    Select selectClass = new Select(roomTypeDropDown);
		    List<WebElement> roomTypeOptions = selectClass.getOptions();
		    for (WebElement roomTypeLoop : roomTypeOptions) {
		    	String roomTypeText = roomTypeLoop.getAttribute("value");
		    	System.out.println("Room Types: "+roomTypeText);
		   }

}
}
