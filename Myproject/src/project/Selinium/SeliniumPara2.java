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

public class SeliniumPara2 {
   public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
			
		WebElement seliniumPara = driver.findElement(By.xpath("//section[@class='hero']"));
	    System.out.println("Printing paragraph :"+seliniumPara.getText());
			

		WebElement seliniumPara2 = driver.findElement(By.xpath("(//div[@class='metadata'])[1]"));
		System.out.println(seliniumPara2.getText());//printing second paragraph.
		
		//Taking Screenshot
		TakesScreenshot snap = (TakesScreenshot)driver;//TypeCasting-downcasting.
		File sourcePath = snap.getScreenshotAs(OutputType.FILE);
		File desPath = new File("E:\\java class\\ScreenShot\\Screenshot3.jpg");
		
		FileUtils.copyFile(sourcePath, desPath);
		
		}
}
