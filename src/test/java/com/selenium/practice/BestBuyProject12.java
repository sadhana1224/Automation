package com.selenium.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuyProject12 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
 
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//choose country
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='country-selection']//h4[contains(text(),'United States')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M127.2 57.')]")));
		driver.findElement(By.xpath("//button[@id='account-menu-account-button']//*[name()='svg']")).click();
	
		
		//3rd TC
		//click on account
		/*
		 * //driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement account=driver.findElement(By.xpath("//span[text()='Account']"));
		js.executeScript("arguments[0].scrollIntoView(true);", account);
		js.executeScript("arguments[0].click();", account);
		*/
		

	
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sadhu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("logesh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sadhanasuba24@test.com");
		 driver.findElement(By.xpath("//span[@class='c-toggle-slider c-toggle-round']")).click();
		driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("One+two=3");
		driver.findElement(By.xpath("//input[@id='reenterPassword']")).sendKeys("One+two=3");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8532498732");
		//driver.findElement(By.xpath("//input[@id='is-recovery-phone']"));
	driver.findElement(By.xpath("//button[text()='Create an Account']")).click();
	
	Thread.sleep(1000);
	driver.navigate().back();
        
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys("sadhanasuba24@test.com");
	driver.findElement(By.xpath("//span[@class='c-toggle-slider c-toggle-round']")).click();
	driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("One+two=3");
	driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Sign In']")));
	 
	
	 
	
	
	 
	
	
	
		
		
		//driver.quit();
		
		
		
	
		
		
		
	}

}
