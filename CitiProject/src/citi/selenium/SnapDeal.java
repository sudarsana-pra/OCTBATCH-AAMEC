package citi.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
		// Launch a browser
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
		// --url address bar
		driver.get("https://www.snapdeal.com/");
		// maximize the window screen
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot r = new Robot();
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Register')])[1]")).click();

		WebElement findElement = driver.findElement(By.id("userName"));

//Typeconversion/upcasting-:

		int a = 10;
		long b = 15l;

		b = a;// int to long (possible)

		a = (int) b;// long to int (not possible)

//typecast/downcastin:

		int c = (int) b;

	}

}
