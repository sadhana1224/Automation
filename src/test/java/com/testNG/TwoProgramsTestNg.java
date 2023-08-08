package com.testNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TwoProgramsTestNg {

	@Test
	public void actionEx()
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions action=new Actions(driver);

		WebElement doublecl=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doublecl);


		/*WebElement cl=driver.findElement(By.xpath("//button[text()='Click Me']"));
	action.click(cl).build().perform();*/
	}
	
	@Test
	public void rightclick()
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement rightcl=driver.findElement(By.id("rightClickBtn"));
		Actions action=new Actions(driver);
		action.contextClick(rightcl);

	}
}