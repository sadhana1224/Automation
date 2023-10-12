package com.selenium.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Seelnium ide");
		search.sendKeys(Keys.ENTER);
		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		for(WebElement val:li)
		{
			System.out.println(val.getAttribute("href"));
		}
	}

}
