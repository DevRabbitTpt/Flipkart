package Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testflip {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.flipkart.com");
		

	driver.get("https://www.flipkart.com/search?q=Pendrive&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	 //driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Pendrive");
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();

	//String Pendrive = "//*[@class='s1Q9rs']";
	//String value = "//*[@class='_30jeq3']";

	String text = driver.findElement(By.xpath("//*[@class='s1Q9rs']")).getAttribute("title");
	

	String price = driver.findElement(By.xpath("//*[@class='_30jeq3']")).getText();
	

	List<WebElement> lists = driver.findElements(By.xpath("//*[@class='s1Q9rs']"));
	List<WebElement> list = driver.findElements(By.xpath("//*[@class='_30jeq3']"));
	System.out.println("Total Number Pendrives: " + lists.size());
	for (int i = 0; i < lists.size(); i++) 
	{
		System.out.println(lists.get(i).getText() + "---" + list.get(i).getText());
	}
}
}
