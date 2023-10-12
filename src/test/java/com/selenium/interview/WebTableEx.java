package com.selenium.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//row
	int row=driver.findElements(By.xpath("//tbody//tr")).size();
	System.out.println("No.of Rows-->"+row);
	
	//column
	int col=driver.findElements(By.xpath("//thead//tr//th")).size();
	System.out.println("no.of col-->"+col);
	
	//specific data
	WebElement ele=driver.findElement(By.xpath("//tbody//tr[4]//td[1]"));
	System.out.println(ele.getText());
	WebElement ele1=driver.findElement(By.xpath("//tbody//tr[4]//td[2]"));
	System.out.println(ele1.getText());
	
	//display all data
	List<WebElement> li=driver.findElements(By.xpath("//tbody//tr"));
	
	for(WebElement data:li)
	{
		List<WebElement> dt=driver.findElements(By.xpath("//td"));
		for(WebElement d:dt)
		{
			System.out.println(d.getText()+" ");
		}
	}

	}

}
