package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy9 {

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

		//7th shop by department

		driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/button[1]/*[1]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//li[@class='liDropdownList '][11]"));
		dropdown.click();
		WebElement furniture = driver.findElement(By.xpath("//li[@class='liDropdownList '][2]"));
		furniture.click();
		driver.findElement(By.xpath("//a[text()='Kitchen & Dining Furniture']")).click();
		driver.findElement(By.xpath("//h4[@class='sku-title']//a[text()='Arcade1Up - Capcom Street Fighter II Legacy Stool - Multi']")).click();
		driver.findElement(By.xpath("(//div[@class='fulfillment-add-to-cart-button'])[1]")).click();

		driver.navigate().back();
		//8th	//choose brand
	
		 
		driver.findElement(By.xpath("//nav[@class='hamburger-menu']//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("//li[@class='liDropdownList '][3]")).click();
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		driver.findElement(By.xpath("(//div[@class='col-xs-2'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Unlocked Samsung phones']")).click();
		driver.findElement(By.xpath("//a[text()='Samsung - Pre-Owned Galaxy Note20 Ultra 5G 128GB (Unlocked) - Mystic Black']")).click();
		driver.findElement(By.xpath("(//div[@class='fulfillment-add-to-cart-button']//button[@type=\"button\"])[1]")).click();


		//9th tc
		driver.findElement(By.xpath("//a[text()='Go to Cart']")).click();
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue as Guest')]")).click();
		driver.findElement(By.xpath("//button[text()='Switch all to shipping']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sadhana");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sadhu");
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys("1510 Wyoming Blvd NE");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Albuquerque");
		driver.findElement(By.xpath("//select[@id='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("87112");
		driver.findElement(By.xpath("//input[@id='save-for-billing-address-Map {}']")).click();
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Continue to Payment Information']")).click();
	}

}
