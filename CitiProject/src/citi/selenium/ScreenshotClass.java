package citi.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
		//Launch a browser 
				WebDriver launch = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
		//--url address bar
				launch.get("https://www.google.com/");
		// maximize the window screen
				launch.manage().window().maximize();
				
		//Typecast-downcast
				TakesScreenshot tk =(TakesScreenshot)launch; 
		//% temp-source		
				File src = tk.getScreenshotAs(OutputType.FILE); 
		//destination		
				File des = new File("C:\\Users\\Dell\\Desktop\\screenshot.png");
				
				FileUtils.copyFile(src, des);
	}

}
