package project.Selinium;
//GoogleAccountXpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccountXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println("Title of the page: "+driver.getTitle()); 
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramesh.g12345");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
