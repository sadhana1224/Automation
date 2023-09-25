package com.selenium.assignment;

import java.util.List;
  //concept crct but error
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxexInterview {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions optt=new ChromeOptions();
		optt.addArguments("--disable-notifications");
		driver=new ChromeDriver(optt);
		driver.get("https://html.form.guide/checkbox/html-form-with-checkbox/");
		
		//method 1
	//	driver.findElement(By.xpath("(//p//input[@type='checkbox' ])[2]")).click();
		
		//method 2
		List<WebElement> li=driver.findElements(By.xpath("//p//input[@type='checkbox' ]"));
		
		//using for loop
	/*	for(int i=0;i<li.size();i++)
		{
			li.get(i).click();
		}
		*/
		//using for each
		
	/*	for(WebElement cb:li)
		{
			cb.click();
		}
		*/
		//method 3--select green and red
		
		for(WebElement list:li)
		{
			String text=list.getAttribute("type");
			if(text.equals("Red") || text.equals("Blue"))
			{
				list.click();
			}
					
		}
		
		//method 4 select last 2 options
		
		int tolCheckbox=li.size();
		for(int i=tolCheckbox-2;i<tolCheckbox;i++)
		{
			li.get(i).click();
		}
		
		
		//method 5 select first 2 option
		
		for(int i=0;i<li.size();i++)
		{
			if(i<2)
			{
				li.get(i).click();
			}
		}
	}

}
