package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	
	WebDriver driver=null;
	@Test
	@Parameters({"url","searchterm"})
	public void ParameterEx(String url,String searchterm)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchterm);
		
	}

}
