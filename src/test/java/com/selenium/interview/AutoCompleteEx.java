package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteEx {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	
	WebElement text=driver.findElement(By.id("autocomplete"));
	text.clear();
	Thread.sleep(1000);
	text.sendKeys("Toronto");
	
	String val;
	do
	{
		text.sendKeys(Keys.ARROW_DOWN);
		val=text.getAttribute("placeholder");
		if(val.equals("Toronto,ON,Canada"))
		{
			text.sendKeys(Keys.ENTER);
		}
		Thread.sleep(2000);
	}while(!val.isEmpty());
		
	}

}
