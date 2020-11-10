package citi.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleClass {
	public static void main(String[] args) throws InterruptedException {
		
//set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
//Launch a browser 
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
//--url address bar
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
// maximize the window screen
		driver.manage().window().maximize();
//--url print console
		String title = driver.getTitle();
		System.out.println("Title of page :"+title);
//--title print url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Print the URL :"+currentUrl);

		Thread.sleep(5000);//Wait
		WebElement emailPassword = driver.findElement(By.xpath("(//input [@type='password'])[2]"));//return type of findElement-->webElement
		emailPassword.sendKeys("asdfasdfasdf");
	
		driver.findElement(By.xpath("(//input [@name='firstname'])")).sendKeys("Mani");;//By--> Abstract class
		//sendKeys-->enter value or perform action in webelement
		
//		emailUserName.clear();
//		emailUserName.sendKeys("vannan");
	
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Male']"));
		System.out.println("Gender :"+findElement);
	
		
		WebElement loginButton = driver.findElement(By.xpath("(//button[@name='websubmit'])"));//return type of findElement-->webElement
		loginButton.click();
	
//		driver.close();
//		driver.quit();

	
	}

}
