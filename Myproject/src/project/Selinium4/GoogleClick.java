package project.Selinium4;
//http://www.google.com/  Search greens velmurugan and click the 1st link.
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://google.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    JavascriptExecutor jS = (JavascriptExecutor)driver;
	    WebElement googleSearch = driver.findElement(By.xpath("//input[@title='Search']"));
	    jS.executeScript("arguments[0].setAttribute('value','greens velmurugan')",googleSearch);//Setvalue
	    Object googleSearchGet = jS.executeScript("return arguments[0].getAttribute('value')",googleSearch);//getValue
	    System.out.println("Searching: "+googleSearchGet.toString());
	    WebElement searchClick = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	    searchClick.click();
	    
	    WebElement linkClick = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
	    jS.executeScript("arguments[0].click()", linkClick);
	    
	  
	    }

}
