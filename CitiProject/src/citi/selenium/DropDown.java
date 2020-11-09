package citi.selenium;

import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Octbatch2020\\CitiProject\\Driver\\chromedriver.exe");
//Launch a browser 
		WebDriver driver = new ChromeDriver();// can't create obj fr interface--> chromeDriver (c)-->obj
//--url address bar
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
// maximize the window screen
		driver.manage().window().maximize();
		
		WebElement DayElement = driver.findElement(By.id("day"));
		Select daySelect = new Select(DayElement);
		daySelect.selectByIndex(3);
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByValue("5");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByVisibleText("2020");
		
		//isMultiple ()
		boolean multiple = daySelect.isMultiple();
		System.out.println("Multiple Select :"+multiple);
		
		//getoptions ();--> print all options
		List<WebElement> options = daySelect.getOptions();
		for (WebElement X : options) {
			String text = X.getText();
			System.out.println("day Values:"+text);
		}
		//getoptions ();--> print only selective option
		List<WebElement> options2 = monthSelect.getOptions();
		for (WebElement Y : options2) {
			String text2 = Y.getText();
			System.out.println("Month value :" +text2);
			if (text2.equals("Apr")) {
				monthSelect.selectByVisibleText("Apr");	
				}
		}
		//getAllSelectedOptions();-->
		List<WebElement> allOptions = yearSelect.getAllSelectedOptions();
		for (WebElement Z : allOptions) {
			String text3 = Z.getText();
			System.out.println("Year value :" +text3);
		}
		//print all option based on text
		for (int i = 0; i <options2.size() ; i++) {
			String text = options2.get(i).getText();
			System.out.println(text);
		}
		//print all option based on attribute
		for (int i = 0; i < options.size(); i++) {
			String attribute = options.get(i).getAttribute("value");
			System.out.println(attribute);
		}
		//check box count
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allHobbies.size());
		
		for (WebElement X : allHobbies) {
			String attribute = X.getAttribute("value");
			System.out.println(attribute);
			if (attribute.equals("Cricket")) {
				X.click();
			}
				}
	}

}
