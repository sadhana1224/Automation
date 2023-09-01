package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy8 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();

		//choose brand
		
		driver.findElement(By.xpath("//nav[@class='hamburger-menu']//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("//li[@class='liDropdownList '][3]")).click();
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		driver.findElement(By.xpath("(//div[@class='col-xs-2'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Unlocked Samsung phones']")).click();
		driver.findElement(By.xpath("//a[text()='Samsung - Pre-Owned Galaxy Note20 Ultra 5G 128GB (Unlocked) - Mystic Black']")).click();
		driver.findElement(By.xpath("(//div[@class='fulfillment-add-to-cart-button']//button[@type=\"button\"])[1]")).click();
	}

}
