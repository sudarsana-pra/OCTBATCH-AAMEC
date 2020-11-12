package project.Selinium4;
//Print the Getting started.
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliGetStart {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/en/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement findElement = driver.findElement(By.xpath("(//a[contains(text(),'Getting started')])[1]"));
		System.out.println(findElement.getText());
		
		//TAKING SCREENSHOT
		TakesScreenshot snapShot = (TakesScreenshot)driver;
		File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
		File desShot = new File("E:\\java class\\ScreenShot\\Screenshot4.jpg");
		FileUtils.copyFile(sourceShot, desShot);
	}

	
}
