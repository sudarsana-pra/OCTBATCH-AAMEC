package citi.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClas {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
//Launch a browser 
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
//--url address bar
		driver.get("https://demo.automationtesting.in/register.html");
// maximize the window screen
		driver.manage().window().maximize();
		
		
		Actions actClass = new Actions(driver);
		Robot r = new Robot();
		WebElement btnGmail = driver.findElement(By.xpath("//div[contains(text(),'Google')]"));
		//btnGmail.sendKeys("java");
		
		//actClass.keyDown(btnGmail, Keys.SHIFT).sendKeys("java").keyUp(btnGmail, Keys.SHIFT).perform();
		
		String text = btnGmail.getText();
		System.out.println("Text ="+ text);
		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
		
		//Typecast-downcast
		TakesScreenshot tk =(TakesScreenshot)driver; 
//% temp-source		
		File src = tk.getScreenshotAs(OutputType.FILE); 
//destination		
		File des = new File("C:\\Users\\Dell\\Desktop\\script\\screenshot.png");
		
		FileUtils.copyFile(src, des);

	}

}
