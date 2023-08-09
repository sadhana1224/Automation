package com.selenium.intermediate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreenCartDiscountPercentage {
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
	
		
		  List<WebElement> veggies=  driver.findElements(By.xpath("//tbody/tr"));
		  int discountPercentage=50;
	      for (int i = 1; i <= veggies.size(); i++) {
	          String vegName=driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]")).getText();
	          String Price=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText();
	          String discountt=driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();

	        
	          double originalPrice=Double.parseDouble(Price);
	          double discountedPrice=Double.parseDouble(discountt);

	          // Calculate the discount percentage
	          double discount=(discountedPrice/originalPrice)*100;
	          System.out.printf("Vegetable name:"+vegName+" Discount Percentage: %.2f\n", discount);
	          if(discount>discountPercentage)
	          {
	        	  vegetableNames.add(vegName);
	        	  //System.out.println("more than 20%-->"+vegName);
	        	  
	          }
	      }
	          System.out.println("-----------------------------------------");
	          
	          driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	          List<WebElement> veggies1=  driver.findElements(By.xpath("//tbody/tr"));
			  
		      for (int j = 1; j<= veggies1.size(); j++) {
		          String vegName1=driver.findElement(By.xpath("//tbody/tr["+ j +"]/td[1]")).getText();
		          String Price1=driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[2]")).getText();
		          String discountt1=driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[3]")).getText();

		        
		          double originalPrice1=Double.parseDouble(Price1);
		          double discountedPrice1=Double.parseDouble(discountt1);

		          // Calculate the discount percentage
		          double discount1=(discountedPrice1/originalPrice1)*100;
		          System.out.printf("Vegetable name:"+vegName1+" Discount Percentage: %.2f\n", discount1);
		        
		          
	      }
		      System.out.println("------------------------------------------");
	      
	
	  driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
      List<WebElement> veggies2=  driver.findElements(By.xpath("//tbody/tr"));
	  
      for (int k = 1; k<= veggies2.size(); k++) {
          String vegName2=driver.findElement(By.xpath("//tbody/tr["+ k +"]/td[1]")).getText();
          String Price2=driver.findElement(By.xpath("//tbody/tr[" + k + "]/td[2]")).getText();
          String discountt2=driver.findElement(By.xpath("//tbody/tr[" + k+ "]/td[3]")).getText();

        
          double originalPrice2=Double.parseDouble(Price2);
          double discountedPrice2=Double.parseDouble(discountt2);

          // Calculate the discount percentage
          double discount2=(discountedPrice2/originalPrice2)*100;
          System.out.printf("Vegetable name:"+vegName2+" Discount Percentage: %.2f\n", discount2);
      }
      
      System.out.println("-------------------------------------");
      driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
      List<WebElement> veggies3=  driver.findElements(By.xpath("//tbody/tr"));
	  
      for (int a= 1; a<= veggies3.size(); a++) {
          String vegName3=driver.findElement(By.xpath("//tbody/tr["+ a +"]/td[1]")).getText();
          String Price3=driver.findElement(By.xpath("//tbody/tr[" + a+ "]/td[2]")).getText();
          String discountt3=driver.findElement(By.xpath("//tbody/tr[" + a+ "]/td[3]")).getText();

        
          double originalPrice3=Double.parseDouble(Price3);
          double discountedPrice3=Double.parseDouble(discountt3);

          // Calculate the discount percentage
          double discount3=(discountedPrice3/originalPrice3)*100;
          System.out.printf("Vegetable name:"+vegName3+" Discount Percentage: %.2f\n", discount3);
          
      }
      
      /*  if(discount>discountPercentage)
        {
      	  vegetableNames.add(vegName);
      	  //System.out.println("more than 20%-->"+vegName);
      	  
        }
        */
      System.out.println("Vegatbles which has discount percentage greater than "+discountPercentage+" are "+vegetableNames.toString());
      
  }

	         
			
	
	    
	
	@AfterMethod
	public void aftermethod()
	{
		//driver.quit();
	}
	

	}


