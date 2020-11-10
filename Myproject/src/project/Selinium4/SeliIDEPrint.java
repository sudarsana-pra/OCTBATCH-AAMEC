package project.Selinium4;
//Print Selenium IDE- Selenium IDE is a Chrome and Firefox extension that makes it easy to record and playback tests in the browser

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliIDEPrint {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/projects/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='intro'])[2]"));
		System.out.println(findElement.getText());
		
		//TAKE SCREENSHOT
		TakesScreenshot snapShot = (TakesScreenshot)driver;
		File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
		File desShot = new File("E:\\java class\\ScreenShot\\Screenshot5.jpg");
		FileUtils.copyFile(sourceShot, desShot);
	}

	
}
