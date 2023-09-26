package com.selenium.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts3Types {

	static WebDriver driver;
	public static void main(String[] args)
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	
	driver=new ChromeDriver(opt);
	//alert
	//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//driver.manage().window().maximize();
	
	/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	driver.switchTo().alert().accept();
	
	driver.navigate().refresh();
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	
	Alert val=driver.switchTo().alert();
	val.sendKeys("sadhana");
	val.accept();
	*/
	//2---authendication popup
	
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	//3--permision based popup
	
	driver.get("some url");
	
	}
}
