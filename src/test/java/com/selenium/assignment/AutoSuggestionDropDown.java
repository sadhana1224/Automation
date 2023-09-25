package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionDropDown {
	static WebDriver driver;   //correct code
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions optt=new ChromeOptions();
		optt.addArguments("--disable-notifications");
		driver=new ChromeDriver(optt);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
		
		for(WebElement li:list)
		{
			if(li.getText().contains("download"))
			{
				li.click();
				break;
			}
		}
	}

}
