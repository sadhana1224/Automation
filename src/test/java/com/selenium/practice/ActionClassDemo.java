package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassDemo {
static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement doublecl=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doublecl);
		
		WebElement rightcl=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightcl);
		
		WebElement cl=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(cl).build().perform();
		
		
		
		
		
	}

}
