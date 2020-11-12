package project.selenium8;
//Select All availble in fruits Print first selected option 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JsBinDropDown2 {

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
	    int fruitsSize = fruitsOptions.size();                    //getting the size of an list for looping
	    for (int i = 0; i < fruitsSize; i++) {
	    	selectClass.selectByIndex(i);                         //looping to select all the options
		}
	    WebElement firstSelectedOption = selectClass.getFirstSelectedOption();//get first selected option using method
	    String firstSelectText = firstSelectedOption.getText();//get that value as a text to print it 
	    System.out.println("First selected option is: "+firstSelectText);

   }

}


