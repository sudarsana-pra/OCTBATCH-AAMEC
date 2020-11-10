package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {

			public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.manage().window().maximize();
		    String title = driver.getTitle();
		    System.out.println("Title of the page: "+title);
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("CurrtentUrl: "+currentUrl);

		    WebElement Search = driver.findElement(By.name("q"));
		    Search.sendKeys("Selinium");
		    
		    WebElement SearchClick = driver.findElement(By.name("btnK"));
		    SearchClick.click();
		    
		    

	}

}
