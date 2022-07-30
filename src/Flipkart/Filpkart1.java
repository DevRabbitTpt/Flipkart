package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Filpkart1 {
	
public static void main(String args[]) throws InterruptedException, IOException 

{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.flipkart.com");
		
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		  Thread.sleep(3000);
		Actions act=new Actions(driver);

         act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"))).build().perform();
         Thread.sleep(3000);
         act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[3]/a[7]"))).click().perform();
		driver.get("https://www.flipkart.com/computers/storage/pen-drives/pr?sid=6bo,jdy,uar&otracker=nmenu_sub_Electronics_0_Pendrives");
		Thread.sleep(1000);
		//driver.findElement(By.linkText("HP V236w 64 GB Pen Drive")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a[2]")).click();
		Thread.sleep(1000);
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
		driver.findElement(By.xpath("//input[@id=\'pincodeInputId\']")).sendKeys("517501");
		
		driver.findElement(By.xpath("//*[@id=\"swatch-0-capacity\"]/a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button]")).click();
		//Thread.sleep(2000);
		/*driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("sangithakanchana@gmail.com");
	
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("Sangitha@2022");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"CNTCTE9A98F725E1441BCABFDA017A\"]/button")).click(); // Click on Delivery
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click(); // Continue Button
		{
	 WebElement element = driver.findElement(By.xpath("//img[@alt=\'Large\']"));
	 Actions builder = new Actions(driver);
		 builder.moveToElement(element).perform();
		 }
	
		driver.findElement(By.xpath("//img[@alt=\'Electronics\']")).click();
		driver.findElement(By.xpath("//a[contains(text(),\'Pendrives\')]")).click();

		driver.findElement(By.cssSelector(".eFQ30H:nth-child(3) .\\_396cs4")).click();
		driver.findElement(By.linkText("Pendrives")).click();
		{
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Mobiles\')]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 100, 0).perform();
		}
		driver.findElement(By.xpath("//a[contains(text(),\'Pendrives\')]")).click();
		{
			WebElement element = driver.findElement(By.xpath("//div[2]/div/a/div/div/div"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}*/
		driver.get("https://www.flipkart.com/hp-v236w-32-gb-pen-drive/p/itmcd00ee5b57ab1?pid=ACCEMA5FGTK2YZXV&lid=LSTACCEMA5FGTK2YZXVWCC6ZI&marketplace=FLIPKART&store=6bo%2Fjdy%2Fuar&srno=b_1_1&otracker=nmenu_sub_Electronics_0_Pendrives&fm=organic&iid=5cf0397c-72fe-4194-ad59-d26da9be728d.ACCEMA5FGTK2YZXV.SEARCH&ppt=browse&ppn=browse&ssid=mh1hfrq6kg0000001659073174277");
		WebElement sd=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img"));
		  File src1=sd.getScreenshotAs(OutputType.FILE);
		  File trg1=new File(".\\Screenshots\\pendrive.jpg");
		  FileUtils.copyFile(src1, trg1);
		
	}


}

	

