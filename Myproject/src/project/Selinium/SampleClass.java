package project.Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","E:\\eclipse-workspace\\Myproject\\Driver\\IEDriverServer.exe");

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new InternetExplorerDriver();		
		
		driver.get("https://tamilbookspdf.com/genre/science-fiction/");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current url: "+currenturl);
		
    	driver1.get("https://www.tutorialspoint.com/arduino/index.htm");
		String title1 = driver1.getTitle();
		System.out.println("Title1: "+title1);
		String currenturl1 = driver1.getCurrentUrl();
		System.out.println("Currenturl1: "+currenturl1);

	}

}
