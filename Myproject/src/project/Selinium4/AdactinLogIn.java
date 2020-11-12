package project.Selinium4;
//http://www.adactin.com/HotelApp/   Print the UserName and Password that you are entered.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    JavascriptExecutor jS = (JavascriptExecutor)driver;
	    
	    WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));//finding element for username
	    jS.executeScript("arguments[0].setAttribute('value','Ramesh g')", userName);//set value for username using javascript
	    Object getName = jS.executeScript("return arguments[0].getAttribute('value')",userName);//get that value at username
	    System.out.println("Name of the User: "+getName.toString());//print that user name
	    
	    WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));//path for password
	    jS.executeScript("arguments[0].setAttribute('value','1234567')", passWord);//set password using javascript
	    Object getPass = jS.executeScript("return arguments[0].getAttribute('value')", passWord);//get password
	    System.out.println("Password: "+getPass.toString());
	    WebElement logInClick = driver.findElement(By.xpath("//input[@id='login']"));
	    jS.executeScript("arguments[0].click()", logInClick);
	}

}
