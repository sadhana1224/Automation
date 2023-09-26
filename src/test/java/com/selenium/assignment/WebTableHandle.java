package com.selenium.assignment; //concept correct

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//find rows
		int rows=driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody/tr")).size();
		System.out.println(rows);

		//find columns

		int col=driver.findElements(By.xpath("//table[@class='table table-bordered']//thead//tr/th")).size();
		System.out.println(col);

		//retrieve the specific row/col data
		WebElement data=driver.findElement(By.xpath("//table[@class='table table-bordered']//tbody/tr[3]/td[1]"));
		System.out.println(data.getText());

		//retrieve all the data from the table

		List<WebElement> table=driver.findElements(By.xpath("//tbody/tr"));

		for(WebElement td:table)
		{
			List<WebElement> datas=driver.findElements(By.xpath("//td"));


			for(WebElement tds:datas)
			{
				System.out.println(tds.getText()+"  ");
			}
			
		}
	

	
		}
	}


