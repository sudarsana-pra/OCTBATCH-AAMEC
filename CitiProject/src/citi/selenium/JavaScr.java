package citi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
		// --url address bar
		driver.get("https://www.facebook.com/");
		// maximize the window screen
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement userName = driver.findElement(By.id("email"));
		//userName.sendKeys("t.manier404@gmail.com");
		js.executeScript("arguments[0].setAttribute('value','t.manier404@gmail.com')", userName);//set value 
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", userName);// get the value
		String emailId = executeScript.toString();	
		System.out.println("emailId :"+ emailId);
		String emailIdLocator = userName.getText();
		System.out.println("emailIdLocator :"+ emailIdLocator);
		
		WebElement passTxt = driver.findElement(By.id("pass"));
		//passTxt.sendKeys("asdfasdf");
		js.executeScript("arguments[0].setAttribute('value','sddfasdfasd')", passTxt);//set value
		Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", passTxt);// get the value
		String emailPass = executeScript2.toString();	
		System.out.println("emailPass :"+ emailPass);
		String emailPassLocator = passTxt.getText();
		System.out.println("emailPassLocator :"+ emailPassLocator);
		
//		WebElement loginButton = driver.findElement(By.name("login"));
//		//loginButton.click();
//		js.executeScript("arguments[0].click()", loginButton);
		
		WebElement downScroll = driver.findElement(By.xpath("//a[text()='Developers']"));
		js.executeScript("arguments[0].scrollIntoView(true)", downScroll);
		
		
		WebElement upScroll = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].scrollIntoView(false)", upScroll);
		
		
		
		
		
		
		
		
		

	}

}
