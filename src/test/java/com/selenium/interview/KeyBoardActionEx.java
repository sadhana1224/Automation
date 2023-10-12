package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionEx {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://text-compare.com/"); //website not working code crct
		driver.manage().window().maximize();

		WebElement text1=driver.findElement(By.id("inputText1"));
		WebElement text2=driver.findElement(By.id("inputText2"));

		text1.sendKeys("welcome to chennai");

		Actions act=new Actions(driver);

		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);

		//ctrl c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);

		//tab
		act.sendKeys(Keys.TAB);
		//ctr v

		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		
		driver.findElement(By.xpath("//div[text()='Compare!']")).click();
		if(text1.getText().equals(text2.getText()))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
