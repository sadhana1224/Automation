package com.selenium.assignment; //concept correct

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeDatePicker {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		Thread.sleep(4000);
		
		String month="september";
		String date="29";
		String year="2023";
		
		driver.findElement(By.xpath("//div[@class='sc-12foipm-34 iHoHRr']//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle']")).click();
		while(true)
		{
			String monthyr=driver.findElement(By.xpath("//div[text()='September 2023']")).getText();
			
			String arr[]=monthyr.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
			break;
			else
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Day']"));

	for(WebElement dt:dates)
	{
		if(dt.getText().equals(date))
		{
			dt.click();
		}
	}
	}

}
