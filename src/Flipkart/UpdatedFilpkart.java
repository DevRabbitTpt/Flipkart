package Flipkart;import org.openqa.selenium.WebDriver;
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

public class UpdatedFilpkart {

//log4j
	private static  Logger loggername =Logger.getLogger(UpdatedFilpkart.class);


	public static void main(String args[]) throws InterruptedException, IOException 

	{
//log4j properties
		PropertyConfigurator.configure("C:\\Users\\Administrator\\eclipse-workspace\\FLIPKART\\log4j.properties");
		loggername.info("UpdatedFilpkart");

//launching browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//opening URL
		driver.get("https://www.flipkart.com");
		
		loggername.info("opened filpkart");
//close
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(1000);
		//click on electronics
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
//move to pendrive
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
		Thread.sleep(2000);
		//buy now
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button]")).click();
		Thread.sleep(2000);

		//write xpath for mobilenumber text
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("9347550163");
		//continue
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();

		Thread.sleep(2000);
		//write xpath for paswword 
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("Sangitha@2022");
		//writexpath for login and click on that button
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		//Delivery address
		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[1]/input")).sendKeys("sangitha");
		
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[2]/input[@name='phone']")).sendKeys("9347550163");
      driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[1]/input[@name='pincode']")).sendKeys("517501");
		Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[2]/input[@name='addressLine2']")).sendKeys("Tirupathi");
     //  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[4]/div/div[1]/textarea")).sendKeys("Narayana puram,tirupathi");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[1]//input[@name='city']")).sendKeys("Tirupathi");
        //driver.findElement(By.xpath("//div[1]//*[@class='_1cpOwe _1lRtwc jE2jGc']")).click();
        
	}

}
