package citi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		//set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
		//Launch a browser 
				WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
		//--url address bar
				driver.get("http://demo.guru99.com/test/drag_drop.html");
		// maximize the window screen
				driver.manage().window().maximize();
				Actions actClass = new Actions(driver);
				
				WebElement sourceElement = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
				WebElement targetElement = driver.findElement(By.id("bank"));
				
				actClass.dragAndDrop(sourceElement, targetElement).perform();
				
				WebElement sourceAmt = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
				WebElement targetAmt = driver.findElement(By.id("amt7"));
				
				actClass.dragAndDrop(sourceAmt, targetAmt).perform();
				
				
	}

}
