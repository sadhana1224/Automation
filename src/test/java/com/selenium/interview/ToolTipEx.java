package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipEx {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		WebElement hover=driver.findElement(By.xpath("//a[text()='Contrary']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(hover).build().perform();
		
		System.out.println(hover.getText());

	}

}
