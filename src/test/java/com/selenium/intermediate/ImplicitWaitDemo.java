package com.selenium.intermediate;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		 
		 driver.navigate().to("https://www.google.com");
		 driver.manage().window().maximize();
		 
		 //Implicit wait is called global wait. 
		 //Implicit wait is applicable for all the the web elements for that browser session
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //In previous versions of selenium
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 driver.findElement(By.name("q")).sendKeys("Implicit wait");
		 
		 driver.findElement(By.linkText("Images")).click();
		 
		 
		 
	}

}
