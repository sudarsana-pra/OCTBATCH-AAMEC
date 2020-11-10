package project.selenium8;
//Book room and print order no.
import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class HotelAppDropDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("CurrentUrl: "+currentUrl);
	    
	    WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
	    userName.sendKeys("MohamedAsif");
	    WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
	    passWord.sendKeys("123456");
	    WebElement loginButton = driver.findElement(By.xpath("//input[@id='login']"));
	    loginButton.click();
	    
	    WebElement locationDropDown = driver.findElement(By.id("location"));
	    Select selectClass1 = new Select(locationDropDown);
	    selectClass1.selectByValue("London");
	    Thread.sleep(1000);

	    WebElement hotelsDropDown = driver.findElement(By.id("hotels"));
	    Select selectClass2 = new Select(hotelsDropDown);
	    selectClass2.selectByValue("Hotel Cornice");
	    Thread.sleep(1000);

	    WebElement roomTypeDropDown = driver.findElement(By.id("room_type"));
	    Select selectClass3 = new Select(roomTypeDropDown);
	    selectClass3.selectByValue("Super Deluxe");
	    Thread.sleep(1000);

	    WebElement roomNoDropDown = driver.findElement(By.id("room_nos"));
	    Select selectClass4 = new Select(roomNoDropDown);
	    selectClass4.selectByValue("1");
	    Thread.sleep(1000);

	    WebElement adultRoomDropDown = driver.findElement(By.id("adult_room"));
	    Select selectClass5 = new Select(adultRoomDropDown);
	    selectClass5.selectByValue("2");
	    Thread.sleep(1000);

	    WebElement childRoomDropDown = driver.findElement(By.id("child_room"));
	    Select selectClass6 = new Select(childRoomDropDown);
	    selectClass6.selectByValue("0");
	    Thread.sleep(1000);

	    WebElement searchClick = driver.findElement(By.id("Submit"));
	    searchClick.click();
	    Thread.sleep(2000);
	    
	    WebElement radioButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	    radioButton.click();
	    WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
	    continueButton.click();

        WebElement firstNameBox = driver.findElement(By.id("first_name"));
	    firstNameBox.sendKeys("Ramesh");
	    WebElement lastNameBox = driver.findElement(By.id("last_name"));
	    lastNameBox.sendKeys("G");
	    WebElement addressBox = driver.findElement(By.id("address"));
	    addressBox.sendKeys("1234,vivekanandha street, \n Dubai main road, \n Dubai.");
	    WebElement cardNoBox = driver.findElement(By.id("cc_num"));
	    cardNoBox.sendKeys("6543212345678908");
	    Thread.sleep(1000);
	    
	    WebElement ccTypeDropDown = driver.findElement(By.id("cc_type"));
	    Select selectClass7 = new Select(ccTypeDropDown);
	    selectClass7.selectByValue("MAST");
	    Thread.sleep(1000);

	    WebElement ccExpMonthDropDown = driver.findElement(By.id("cc_exp_month"));
	    Select selectClass8 = new Select(ccExpMonthDropDown);
	    selectClass8.selectByValue("5");
	    Thread.sleep(1000);

	    WebElement ccExpYearDropDown = driver.findElement(By.id("cc_exp_year"));
	    Select selectClass9 = new Select(ccExpYearDropDown);
	    selectClass9.selectByValue("2022");
	    Thread.sleep(1000);

	    WebElement cvvNoBox = driver.findElement(By.id("cc_cvv"));
	    cvvNoBox.sendKeys("123");
	    Thread.sleep(1000);

	    WebElement bookNowButton = driver.findElement(By.id("book_now"));
	    bookNowButton.click();
	    Thread.sleep(4000);

	    WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
	    String ValueText = orderNo.getAttribute("value");
        System.out.println("Order Number: "+ValueText);
        //HERE ORDER NUMBER WAS DISABLED. THUS WE CAN'T ACCESS THE TEXT
	    
	   }

}
