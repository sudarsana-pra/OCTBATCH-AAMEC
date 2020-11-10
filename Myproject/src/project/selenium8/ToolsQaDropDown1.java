package project.selenium8;
//ERROR
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQaDropDown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demoqa.com/automation-practice-form/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement statePath = driver.findElement(By.className(" css-1hwfws3"));
	    Select stateSelect = new Select(statePath);
	    stateSelect.selectByIndex(2);
	    stateSelect.selectByIndex(4);

	   
	    
	

	}

}
