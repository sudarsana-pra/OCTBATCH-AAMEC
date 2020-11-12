package project.Selinium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the paragraph displayed below your message
public class OcadoXpath {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://help.ocado.com/hc/en-us/requests/new");
		    driver.manage().window().maximize();
		    String title = driver.getTitle();
		    System.out.println("Title of the page: "+title);
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("CurrtentUrl: "+currentUrl);
		    WebElement yourMessage = driver.findElement(By.xpath("//p[@id='request_description_hint']"));
		    System.out.println("Paragraph below your message :"+yourMessage.getText());
		    
		    //TAKING SCREENSHOT OF THE RESULT
		    TakesScreenshot snapShot = (TakesScreenshot)driver;  //Downcasting or Typecast
		    File sourceShot = snapShot.getScreenshotAs(OutputType.FILE);
		    File desShot = new File("E:\\java class\\ScreenShot\\Screenshot3.jpg");
		    FileUtils.copyFile(sourceShot, desShot);

	}

}
