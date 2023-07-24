package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsXpathEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		/*Syntax for XPath
		//tagname[@attribute='value']
		 * */
		 
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Learning XPath");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Using XPath title");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[contains(@id,'APjF')]")).clear();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Imag')]")).click();
		

		

	}

}
