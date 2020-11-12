package project.Selinium4;
//Add any two items you want in the cart & Print the total cost in cart.
//ERROR
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    driver.get("https://www.snapdeal.com/product/gizmobitz-rcm6-3-15000-mah/687139260086");
	    driver.findElement(By.id("add-cart-button-id")).click();
	    driver.findElement(By.xpath("(//div[contains(text(),'View Cart')])[2]")).click();
	    WebElement cartText = driver.findElement(By.xpath("//input[@class='btn btn-xl rippleWhite cart-button']"));
	    System.out.println("Amount to pay: "+cartText.getText());
	    //driver.get("https://www.snapdeal.com/cart/addToCart?supc=SDL890408077&vendorCode=S1e738&hardAdded=false");
	    //driver.findElement(By.id("add-cart-button-id")).click();
	  
		
	}

}
