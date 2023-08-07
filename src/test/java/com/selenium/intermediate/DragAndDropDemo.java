package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		act.moveToElement(drag).build().perform();
		
		act.dragAndDrop(drag, drop).build().perform();
		
		String validationText= drop.getText();
		
		if(validationText.equals("Dropped!"))
		{
			System.out.println("Validation successful --> Webelement has been dragged and dropped to the specified location");
		}
		else
		{
			System.out.println("Validation Unsuccessful");
		}
		
		
		

	}

}
