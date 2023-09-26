package com.selenium.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyoBoardActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.SHIFT);
		
		act.sendKeys(Keys.CONTROL);
		act.sendKeys(Keys.ALT);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.BACK_SPACE);
		act.perform();
	}

}
