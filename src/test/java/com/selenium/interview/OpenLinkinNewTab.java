package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkinNewTab {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).sendKeys(tab);

	}

}
