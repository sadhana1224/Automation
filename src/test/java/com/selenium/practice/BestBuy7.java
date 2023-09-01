package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy7 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose country
		driver.findElement(By.xpath("(//div[@class='country-selection']//h4[text()='United States'])[1]")).click();

		//7th shop by department
		
		driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/button[1]/*[1]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//li[@class='liDropdownList '][11]"));
		dropdown.click();
		WebElement furniture = driver.findElement(By.xpath("//li[@class='liDropdownList '][2]"));
		furniture.click();
		driver.findElement(By.xpath("//a[text()='Kitchen & Dining Furniture']")).click();
		driver.findElement(By.xpath("//h4[@class='sku-title']//a[text()='Arcade1Up - Capcom Street Fighter II Legacy Stool - Multi']")).click();
		driver.findElement(By.xpath("(//div[@class='fulfillment-add-to-cart-button'])[1]")).click();
		
	}

}
