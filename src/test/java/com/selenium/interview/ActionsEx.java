package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement dc=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dc).perform();
		
		WebElement rc=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rc).build().perform();
		
		WebElement cl=driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(cl).build().perform();
		
	}

}
