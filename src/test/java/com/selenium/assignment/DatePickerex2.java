package com.selenium.assignment; //concept full correct

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerex2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dob']"));
		
		Select dropymon=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		dropymon.selectByVisibleText("Jun");
		
		Select dropyr=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		dropyr.selectByVisibleText("2023");
		
		List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
	
		String date1="24";
		
		for(WebElement dt:date)
		{
			if(dt.getText().equals(date1))
			{
				dt.click();
			}
		}
	}

}
