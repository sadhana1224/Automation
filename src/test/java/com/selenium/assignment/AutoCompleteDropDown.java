package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoCompleteDropDown {  //correct code
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions optt=new ChromeOptions();
		optt.addArguments("--disable-notifications");
		driver=new ChromeDriver(optt);
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement searchBox=driver.findElement(By.id("autocomplete"));
		Thread.sleep(2000);	

		searchBox.clear();
		Thread.sleep(2000);	

		searchBox.sendKeys("Toronto");
		Thread.sleep(2000);	

		
		String text;
		do
		{
			searchBox.sendKeys(Keys.ARROW_DOWN);
			
			text=searchBox.getAttribute("value");
			if(text.equals("Toronto, ON, Canada"))
			{
				searchBox.sendKeys(Keys.ENTER);
			}
			Thread.sleep(2000);	
		}while(!text.isEmpty());
		
	}

}
