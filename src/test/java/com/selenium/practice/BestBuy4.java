package com.selenium.practice;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		//top deal title
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String expectedTitle="Top Deals";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}

		driver.navigate().back();
		//deal of the day-menu

		driver.findElement(By.xpath("//a[text()='Deal of the Day']")).click();
		expectedTitle="Deal";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}

		driver.navigate().back();
		//my best buy membership-menu

		driver.findElement(By.xpath("(//a[text()='My Best Buy Memberships'])[1]")).click();
		expectedTitle="My Best Buy Memberships";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}
		
		driver.navigate().back();
		//click more option in menu
		driver.findElement(By.xpath("//span[text()='Back to School']")).click();

		java.util.List<WebElement> links=driver.findElements(By.xpath("//li[@class='liDropdownList']"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			driver.get(url);
			

			if(driver.getTitle().contains("Best Buy"))
			{
				System.out.println("title is validated");
			}
			else
			{
				System.out.println("title is not validated");
			}
		}


	}

}
