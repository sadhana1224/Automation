package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx {

	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, trg).perform();
	}

}
