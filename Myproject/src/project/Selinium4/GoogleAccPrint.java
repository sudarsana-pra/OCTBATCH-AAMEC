package project.Selinium4;
//Print all the input you given for registration.
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    JavascriptExecutor jS = (JavascriptExecutor)driver;
	    //FIRSTNAME
	    WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
	    jS.executeScript("arguments[0].setAttribute('value','Ramesh')",firstName);
	    Object getFirstName = jS.executeScript("return arguments[0].getAttribute('value')", firstName);
	    System.out.println("FirstName: "+getFirstName.toString());
	    //LASTNAME
	    WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
	    jS.executeScript("arguments[0].setAttribute('value','G')",lastName);
	    Object getLastName = jS.executeScript("return arguments[0].getAttribute('value')", lastName);
	    System.out.println("Last Name: "+getLastName.toString());
        //USERNAME
	    WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
	    jS.executeScript("arguments[0].setAttribute('value','rameshG123')",userName);
	    Object getUserName = jS.executeScript("return arguments[0].getAttribute('value')", userName);
	    System.out.println("User Name: "+getUserName.toString());
        //PASSWORD
	    WebElement passWord = driver.findElement(By.xpath("//input[@name='Passwd']"));
	    jS.executeScript("arguments[0].setAttribute('value','123445667')",passWord);
	    Object getPassWord = jS.executeScript("return arguments[0].getAttribute('value')", passWord);
	    System.out.println("Password: "+getPassWord.toString());
	    //CONFIRM PASSWORD
	    WebElement confirmPass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	    jS.executeScript("arguments[0].setAttribute('value','123445667')",confirmPass);
	    Object getConfirmPass = jS.executeScript("return arguments[0].getAttribute('value')",confirmPass);
	    System.out.println("Confirm Password: "+getConfirmPass.toString());
	    
	    }

}
