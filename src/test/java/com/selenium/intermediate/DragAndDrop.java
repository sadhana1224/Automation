package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).release().build().perform();
		
		
	}
	
}