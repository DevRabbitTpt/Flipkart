package Flipkart;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart2 {
				
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("pendrive",Keys.ENTER);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	//WebElement z1=driver.findElement(By.xpath("//a[@title='pendrive']"));
	//act.moveToElement(z1).build().perform();
	//z1.click();
	//Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	 
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div[2]/a/span")).click();
	//Thread.sleep(2000);
	List<WebElement> well= driver.findElements(By.xpath("//*[@class='s1Q9rs']"));
	System.out.println(well.size());
	for(WebElement s:well)
	{
		System.out.println(s.getText()+"");
		
}
	
		/*driver.get("https://www.flipkart.com/search?q=Pendrive&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		// driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Pendrive");
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();

		String Pendrive = "//*[@class='s1Q9rs']";
		String value = "//*[@class='_30jeq3']";

		String text = driver.findElement(By.xpath(Pendrive)).getAttribute("title");
		// System.out.println(text);

		String price = driver.findElement(By.xpath(value)).getText();
		// System.out.println(price);

		List<WebElement> lists = driver.findElements(By.xpath("//*[@class='s1Q9rs']"));
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='_30jeq3']"));
		System.out.println("Total Number Pendrives: " + lists.size());
		for (int i = 0; i < lists.size(); i++) 
		{
			System.out.println(lists.get(i).getText() + "---" + list.get(i).getText());
		}*/
	}
	
			
			
}
		

		
		


