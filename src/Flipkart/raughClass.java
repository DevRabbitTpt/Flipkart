package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class raughClass {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/checkout/init");

	}

}
