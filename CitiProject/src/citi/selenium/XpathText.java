package citi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathText {

	public static void main(String[] args) {
		//set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
//Launch a browser 
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
//--url address bar
		driver.get("http://www.aamec.edu.in/");
// maximize the window screen
		driver.manage().window().maximize();
		Actions actClass = new Actions(driver);
		
		WebElement placementPage = driver.findElement(By.xpath("(//span[contains(text(),'Placement')])[1]"));
		actClass.moveToElement(placementPage).perform();
		
		WebElement teamMembers = driver.findElement(By.xpath("(//a[contains(text(),'Team Members')])[1]"));
		teamMembers.click();
		
		WebElement createAccouct = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
		System.out.println(createAccouct.getText());
		
		WebElement placementPage1 = driver.findElement(By.xpath("(//span[contains(text(),'Placement')])[1]"));
		actClass.moveToElement(placementPage1).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Our')]")).click();
		
		WebElement printComapny = driver.findElement(By.xpath("//td[contains(text(),'IBM')]"));
		System.out.println(printComapny.getText());
		
		
		
		
	}

}
