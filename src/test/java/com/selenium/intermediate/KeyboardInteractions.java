package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class KeyboardInteractions {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement searchText=driver.findElement(By.name("q"));
		
		act.keyDown(searchText,Keys.SHIFT).sendKeys("Action Class").build().perform();
		

	}

}
