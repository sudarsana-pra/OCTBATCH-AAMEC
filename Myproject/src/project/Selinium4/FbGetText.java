package project.Selinium4;
//https://www.facebook.com/   Print the email and password you are given.
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbGetText {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor jS = (JavascriptExecutor)driver;	//Downcasting
		WebElement emailObj = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		//JAVASCRIPT EXECUTER.
		jS.executeScript("arguments[0].setAttribute('value','ramesh.g12345@gmail.com')",emailObj);//set value for email.
		Object emailGet = jS.executeScript("return arguments[0].getAttribute('value')", emailObj);//get value for email.
		String emailString = emailGet.toString(); //Object to String.
		System.out.println("EmailId: "+emailString);
		
		WebElement passObj = driver.findElement(By.xpath("//input[@id='pass']"));
		jS.executeScript("arguments[0].setAttribute('value','123456')",passObj);//Set value for password
		Object passGet = jS.executeScript("return arguments[0].getAttribute('value')",passObj);//Get value for Password
		System.out.println("Password :"+passGet.toString());
		
		WebElement logInClick = driver.findElement(By.xpath("//button[@name='login']"));
	    jS.executeScript("arguments[0].click()", logInClick);
		
		//Take Screenshot
		TakesScreenshot snapShot = (TakesScreenshot)driver;
		File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
		File desShot = new File("E:\\java class\\ScreenShot\\Screenshot6.jpg");
		FileUtils.copyFile(sourceShot, desShot);
	}

}
