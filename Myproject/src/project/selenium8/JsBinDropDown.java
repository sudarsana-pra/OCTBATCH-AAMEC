package project.selenium8;
//Select Even Option availble in fruits Find out number of option not selected
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JsBinDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://output.jsbin.com/osebed/2");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement fruitsPath = driver.findElement(By.id("fruits"));
	    Select selectClass = new Select(fruitsPath);
	    List<WebElement> fruitsOptions = selectClass.getOptions();
	    int count = 0;
	    //int select = 0;
	    for (int i = 0; i <= fruitsOptions.size()-1; i++) {
	    	if(i%2!=0) {
	    		selectClass.selectByIndex(i);
	    	}
	    	else
	    		count++;
	    }
	    //int number = count - select;
		System.out.println("Number of unselected options: "+count);


	}

}
