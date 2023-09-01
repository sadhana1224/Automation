package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuy3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
 
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();
	
		//3rd TC
		//click on account
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement account=driver.findElement(By.xpath("//span[text()='Account']"));
		js.executeScript("arguments[0].scrollIntoView(true);", account);
		js.executeScript("arguments[0].click();", account);
		
		

		//sign up
		 driver.findElement(By.xpath("//a[normalize-space()='Create Account']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sadhana");
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Vengadashalam");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sadhu.lokii1924@gmail.com");
		 driver.findElement(By.xpath("//span[@class='c-toggle-slider c-toggle-round']")).click();
		 driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("Sadhana@123456");
		 driver.findElement(By.xpath("//input[@id='reenterPassword']")).sendKeys("Sadhana@123456");
		 driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("(555) 555-1235");
		 driver.findElement(By.xpath("//button[contains(text(),'Create an Account')]")).click();
		 
		 Thread.sleep(1000);
		 //go to previous page
		 driver.findElement(By.xpath("//a[@class='mini-header__nav']")).click();
		 
		driver.findElement(By.xpath("//button[@id='account-menu-account-button']//*[name()='svg']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
			driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys("sadhu.lokii1924@gmail.com");
			driver.findElement(By.xpath("//span[@class='c-toggle-slider c-toggle-round']")).click();
			driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("Sadhana@123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		 }
     }
