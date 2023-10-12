package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	WebDriver driver=null;
	
	@Test(dataProvider="dataset")
	public void dataprov(String url,String search)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(search);
	}
	
	@DataProvider
	public Object[][] dataset()
	{
		Object[][] data=new Object[][] {
			
			{"https://www.google.com/","guvi"},
			{"https://www.google.com/","bangalore"},
			{"https://www.google.com/","delta airlines"}
		};
		return data;
	}

}
