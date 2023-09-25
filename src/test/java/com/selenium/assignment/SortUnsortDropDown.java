package com.selenium.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SortUnsortDropDown { //correct code

	static WebDriver driver;
	public static void main(String[] args)
	{
		ChromeOptions optt=new ChromeOptions();
		optt.addArguments("--disable-notifications");
		driver=new ChromeDriver(optt);
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement dp=driver.findElement(By.name("category_id"));
		Select sel=new Select(dp);
		List<WebElement> allOption=sel.getOptions();
		
		ArrayList originalList=new ArrayList();
		ArrayList templList=new ArrayList();
		
		for(WebElement opt:allOption)
		{
			originalList.add(opt.getText());
			templList.add(opt.getText());
		}
		System.out.println(originalList);
		System.out.println("before sort temp :"+templList);
		
		Collections.sort(templList);
		
		System.out.println(originalList);
		System.out.println("after sort temp :"+templList);
		
		if(originalList.equals(templList))
		{
			System.out.println("sorted order...");
		}
		else
		{
			System.out.println("Unsorted order...");
		}

	}

}
