package com.selenium.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GroupsEx1 {
	WebDriver driver=null;
	
	@Test(groups={"sanity"})
	
	public void myntra()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9688741481");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
			
	}
	

}
