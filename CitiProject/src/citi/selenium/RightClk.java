package citi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
//Launch a browser 
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
//--url address bar
		driver.get("https://www.google.com/");
// maximize the window screen
		driver.manage().window().maximize();
		Actions actClass = new Actions(driver);

//		WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		actClass.contextClick(btnGmail).perform();

		WebElement textGmail = driver.findElement(By.xpath("//div[contains(text(),'Google')]"));
		actClass.doubleClick(textGmail).perform();
	}

}
