package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	WebDriver driver=null;
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="testdata")
	public void fetchdata(String url,String searchtext) throws InterruptedException
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchtext);
		Thread.sleep(2000);
	}
	
	@DataProvider(name="testdata")
	
	public Object[][]  dataSet()
	{
		
		return new Object[][]
				{
	
			{"https://www.google.com/","Guvi"	},
			{"https://www.google.com/","amazon"},
			{"https://www.google.com/","flipkart"}

				};
		
	}
	@AfterMethod
	public void closeBrowsers()
	{
		driver.quit();
	}

}
