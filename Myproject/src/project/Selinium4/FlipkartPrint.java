package project.Selinium4;
//Print electronic,tv and applicances,men,women,baby&kids,home&furniture and offerzone.(findElement by xpath,text)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
		
	    
	    WebElement electronicsPrint = driver.findElement(By.xpath("//span[text()='Electronics']"));
	    System.out.println("PrintElectronics: "+electronicsPrint.getText());
	    
	    WebElement tvPrint = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	    System.out.println("PrintTv: "+tvPrint.getText());
	    
	    WebElement menPrint = driver.findElement(By.xpath("//span[text()='Men']"));
	    System.out.println("PrintMen: "+menPrint.getText());
	    
	    WebElement womenPrint = driver.findElement(By.xpath("//span[text()='Women']"));
	    System.out.println("PrintWoMen: "+womenPrint.getText());
	    
	    WebElement babyPrint = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
	    System.out.println("Printbaby: "+babyPrint.getText());
	    
	    WebElement homePrint = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	    System.out.println("Printhome: "+homePrint.getText());
	    
	    WebElement sportsPrint = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
	    System.out.println("Printsports: "+sportsPrint.getText());
	    
	    WebElement flightPrint = driver.findElement(By.xpath("//a[text()='Flights']"));
	    System.out.println("Printflight: "+flightPrint.getText());
	    
	    WebElement offerPrint = driver.findElement(By.xpath("//a[text()='Offer Zone']"));
	    System.out.println("Printoffer: "+offerPrint.getText());
	    }

}
