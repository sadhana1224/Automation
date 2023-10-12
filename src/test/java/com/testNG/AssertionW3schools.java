package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionW3schools {
WebDriver driver=null;

@Test
public void AssertW3schools()
{
	driver=new ChromeDriver();
	driver.get("https://profile.w3schools.com/");
	driver.manage().window().maximize();
	
	String exptit="Log in - W3Schools";
	Assert.assertEquals(exptit, driver.getTitle()); //compare the both titles
	
	
	WebElement username=driver.findElement(By.xpath("//input[@id='modalusername']"));
	WebElement pwd=driver.findElement(By.xpath("//input[@id='current-password']"));
	
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("xyz@gmail.com");
	
	Assert.assertTrue(pwd.isDisplayed());
	pwd.sendKeys("sadhu@123");
	
	
}
}
