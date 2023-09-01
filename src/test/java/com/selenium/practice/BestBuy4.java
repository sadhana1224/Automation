package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy4 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();

		
		
			
	}

}
