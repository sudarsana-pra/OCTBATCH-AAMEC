package project.Selinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumXpath {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		WebElement downloadText = driver.findElement(By.xpath("//a[contains(text(),'Downloads')]"));
		System.out.println("Text from selinium:"+downloadText.getText());
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;//TypeCasting
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);//Temporary location of screenshot.
		File desFile = new File("E:\\java class\\ScreenShot\\Screenshot1.jpg");
		FileUtils.copyFile(sourceFile, desFile);
		
		
		

	}

}
