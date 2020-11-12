package project.Selinium4;
//Print "Downloads" text from that.
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumParaPrint {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		WebElement seliniumPara = driver.findElement(By.xpath("//section[@class='hero']"));
		System.out.println("Printing paragraph :"+seliniumPara.getText());
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;//TypeCasting
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);//Temporary location of screenshot.
		File desFile = new File("E:\\java class\\ScreenShot\\Screenshot2.jpg");
		FileUtils.copyFile(sourceFile, desFile);

	}

}
