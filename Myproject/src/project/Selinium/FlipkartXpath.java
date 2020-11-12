package project.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		//WEBELEMENT 
		Actions actClass = new Actions(driver);//Action class
		WebElement loginClick = driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		actClass.moveToElement(loginClick).perform();
		driver.findElement(By.xpath("//a[@class=\"oZoRPi\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("9876543210");
		
		

	}

}
