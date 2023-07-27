package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioEx {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#vfb-7-1")).click(); //using cssselector
		Thread.sleep(1000);
		System.out.println("first radio button ");
		
		driver.findElement(By.cssSelector("input#vfb-7-2")).click();
		Thread.sleep(1000);
		System.out.println("second radio button ");
		
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		Thread.sleep(1000);
		System.out.println("first checkbox ");
		
		
		Thread.sleep(1000);
		
		WebElement secondcheck=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		secondcheck.click();
		Thread.sleep(1000);
		System.out.println("second checkbox ");
		
		
		if(secondcheck.isSelected())
		{
			System.out.println("validated");
		}
		else
		{
			System.out.println("validation failed");
		}
		
	
	}

}
