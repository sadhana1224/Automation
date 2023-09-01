package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy6 {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();
	
		//6th 
		//search the product
	WebElement search=	driver.findElement(By.xpath("//input[@id='gh-search-input']"));
	search.sendKeys("macbook air 13.6 laptop");
	search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add to Cart'])[1]")).click();
	driver.navigate().back();  
	}

}
