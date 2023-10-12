package com.selenium.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		//radio button
		WebElement radio=driver.findElement(By.id("vfb-7-2"));
		radio.click();
		
		boolean isRadio=radio.isSelected();
		System.out.println(isRadio);
		
		//checkbox
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(cb.size());
		
		//specific checkbox
		//driver.findElement(By.id("vfb-6-0")).click();
		//first 2
		for(int i=0;i<cb.size();i++)
				{
			if(i<2)
			{
			cb.get(i).click();	
			}
				}
		//select last 2
		
		
	/*	int tot=cb.size();
		for(int i=tot-2;i<tot;i++)
		{
			cb.get(i).click();
		}
		//select multiple checkboxes
	/*	for(WebElement val:cb)
		{
			if(val.equals("checkbox1") && (val.equals("checkbox3")))
			{
				val.click();
			}
		}
		
		Thread.sleep(2000);
		*/
		//select all checkboxes
	
		/*
		for(int i=0;i<cb.size();i++)
		{
			cb.get(i).click();
		}
		*/
		Thread.sleep(2000);
		driver.quit();
	}

}
