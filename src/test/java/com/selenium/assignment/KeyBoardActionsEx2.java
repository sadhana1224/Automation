package com.selenium.assignment; //correct

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsEx2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement text2=driver.findElement(By.xpath("//textarea[@id='inputText1']"));

		text1.sendKeys("welcome to selenium");
		Actions act=new Actions(driver);

		//CTRL+ A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//tab
		act.sendKeys(Keys.TAB);

		//CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//compare 2 value

		if(text1.getText().equals(text2.getText()))
		{
			System.out.println("value equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
