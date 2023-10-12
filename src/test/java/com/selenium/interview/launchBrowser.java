package com.selenium.interview;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class launchBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//locators
		
		//linktext
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		
		//partial linktext
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Imag")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//css selector
		//class name
	WebElement search=	driver.findElement(By.className("gLFyf"));
	search.clear();
	search.sendKeys("gmail");
		Thread.sleep(2000);
		driver.navigate().back();
	
		//id
		driver.findElement(By.id("APjFqb")).sendKeys("selenium learning");

		List<WebElement> li=driver.findElements(By.xpath("//span[contains(text(),'selenium learning')]"));
		
		for(WebElement val:li)
		{
			if(val.getText().equals("selenium learning"))
			{
				val.click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
