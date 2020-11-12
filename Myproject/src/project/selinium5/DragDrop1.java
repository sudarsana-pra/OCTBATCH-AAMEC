package project.selinium5;

//Drag and drop  bank  in Account ,5000 in amount  at debited side  Drag and drop  sales in Account ,5000 in amount  at credited side 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/drag_drop.html ");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    Actions actClass = new Actions(driver);
	    //DEBIT SIDE
	    WebElement amountDragDebit = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
	    WebElement amountDropDebit = driver.findElement(By.xpath("//ol[@id='amt7']"));
	    actClass.dragAndDrop(amountDragDebit, amountDropDebit).perform();
	    WebElement accountDragDebit = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
	    WebElement accountDropDebit = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    actClass.dragAndDrop(accountDragDebit, accountDropDebit).perform();
	    //CREDIT SIDE
	    WebElement accountDragCredit = driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
	    WebElement accountDropCredit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    actClass.dragAndDrop(accountDragCredit, accountDropCredit).perform();
	    WebElement amountDragCredit = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
	    WebElement amountDropCredit = driver.findElement(By.xpath("//ol[@id='amt8']"));
	    actClass.dragAndDrop(amountDragCredit, amountDropCredit).perform();

	}

}
