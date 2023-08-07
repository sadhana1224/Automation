package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class KeyBoardInteractEx {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement text=driver.findElement(By.id("APjFqb"));
		act.keyDown(text, Keys.SHIFT).sendKeys("action class").doubleClick().contextClick().build().perform();
		
		

	}

}
