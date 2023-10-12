package com.selenium.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
	List<WebElement> ag=driver.findElements(By.xpath("//li[@class='sbct']//span[text()='selenium']"));
	System.out.println(ag.size());
	
	for(WebElement auto:ag)
	{
		if(auto.getText().contains("webdriver"))
		{
			auto.click();
			break;
		}
	}
	}

}
