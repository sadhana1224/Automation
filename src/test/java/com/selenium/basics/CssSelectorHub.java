package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorHub {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.cssSelector("input#userId")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("xyz1");
		driver.findElement(By.cssSelector("input[name='company']")).sendKeys("guvi");
		driver.findElement(By.cssSelector("input[name='mobile number']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input[value='Submit")).click();
		
	}

}
