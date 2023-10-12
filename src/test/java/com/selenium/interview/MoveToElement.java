package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {


	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement menu=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement sub=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		WebElement sub1=driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		
		act.moveToElement(menu).moveToElement(sub).moveToElement(sub1).perform();
	}

}
