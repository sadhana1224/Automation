package com.selenium.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gc {
 static WebDriver driver;
	ArrayList<String> vegetableNames= new ArrayList<String>();
	int discountPercentage=50;

	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testcase1()
	{
	   String isNext = "false";
	    
	   while(isNext.equals("false")) {
			

	        List<WebElement> veggies = driver.findElements(By.xpath("//tbody/tr"));
	        
	        for (int i = 1; i <= veggies.size(); i++) {
	            String vegName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).getText();
	            String Price = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	            String discountt = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();
	            
	            double originalPrice = Double.parseDouble(Price);
	            double discountedPrice = Double.parseDouble(discountt);
	            
	            double discount = (discountedPrice / originalPrice) * 100;
	            System.out.printf("Vegetable name: %s Discount Percentage: %.2f\n", vegName, discount);
	            
	            if (discount > discountPercentage) {
	                vegetableNames.add(vegName);
	            }
	    	   
		}
		
            WebElement nextPageButton = driver.findElement(By.xpath("//a[@aria-label='Next']"));
            isNext =nextPageButton.getAttribute("aria-disabled");
            if(isNext.equals("false"))
            	nextPageButton.click();

	    
	    }
       System.out.println("Vegetables which have discount percentage greater than " + discountPercentage + " are " + vegetableNames.toString());

	    
	}

	@AfterMethod
	public void aftermethod()
	{
		//driver.quit();
	}
	
}