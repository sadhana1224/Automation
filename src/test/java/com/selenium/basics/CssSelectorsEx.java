package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https:///www.google.com");

		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("CSS CSelector");
		
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("Name");

	}

}
