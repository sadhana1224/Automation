package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReportLoginEx {

	static WebDriver driver;
	
	@Test
	public void w3schoolslogin()
	{
		try
		{
		ReportUtil.SetDesc("validating login Functionality");
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("sadhu.lokii1924@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("Automation@19");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		ReportUtil.reportlog("PASS", "login successfull");
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			ReportUtil.reportlog("FAIL", "login failed");
		}
	}
}
