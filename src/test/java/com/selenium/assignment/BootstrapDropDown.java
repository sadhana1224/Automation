package com.selenium.assignment;
//concept crct but not working
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropDown {

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions optt=new ChromeOptions();
		optt.addArguments("--disable-notifications");
		driver=new ChromeDriver(optt);
		driver.get("https://www.hdfcbank.com/");
		
		WebElement productType=driver.findElement(By.xpath("//span[text()='Select Product Type']"));
		productType.click();
		
		List<WebElement> pt=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		selectOption(pt,"Cards");	
	
		WebElement product=driver.findElement(By.xpath("//a[text()='Select Product']"));
		product.click();
		List<WebElement> pt1=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		selectOption(pt1,"Credit  Cards");
	}
	
	public static void selectOption(List<WebElement> options,String value)
	{
		for(WebElement opt:options)
		{
			if(opt.getText().equals(value))
			{
				opt.click();
				break;
			}
		}
	}
	{
		
	}

}
