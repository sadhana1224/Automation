package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https:///www.google.com");

		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium ide");
		
		WebElement wb=driver.findElement(By.cssSelector("textarea#APjFqb"));
		wb.sendKeys("Selenium webdriver");
		wb.sendKeys(Keys.ENTER);
		
	
		driver.findElement(By.xpath("//h3[contains(text(),'WebDriver')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.quit();
	}

}
