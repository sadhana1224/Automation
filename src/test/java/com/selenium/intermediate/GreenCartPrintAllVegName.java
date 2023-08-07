package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartPrintAllVegName {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		List<WebElement> veggie=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(WebElement vegname:veggie)
		{
			System.out.println(vegname.getText());
		}
		

		
	}

}
