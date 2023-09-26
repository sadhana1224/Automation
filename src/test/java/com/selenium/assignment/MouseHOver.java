package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHOver {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//using action class
		WebElement desk=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desk).moveToElement(mac).click().perform();
	}

}
