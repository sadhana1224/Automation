package com.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		
		driver=new ChromeDriver();
		                                            
		 driver.navigate().to("https://www.google.com");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //ExplicitWait or WebDriverWait --> We can apply explicit wait only to a specific webelement
		 
		 WebElement searchBox= driver.findElement(By.name("q"));
		 
		 //WebDriverWait wait = new WebDriverWait(driver,10)); (Previous version of Selenium)
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q123")));
		 wait.until(ExpectedConditions.visibilityOf(searchBox));
		 
		 searchBox.sendKeys("Explicit wait");
		 
		 

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	}

}
