package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionEx2 {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
	WebElement search=	driver.findElement(By.name("q"));
	
	act.keyDown(search,Keys.SHIFT).sendKeys("action class").perform();
	
	}

}
