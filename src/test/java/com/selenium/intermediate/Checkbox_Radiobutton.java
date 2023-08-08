package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Radiobutton {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		//selecting the first radio button value
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();
		Thread.sleep(1000);
		System.out.println("Selected the first radio button option");
		
		//selecting the second radio button option
		driver.findElement(By.xpath("//input[@value='Option 3']")).click();
		Thread.sleep(1000);
		System.out.println("Selected the third radio button option");
		
		//checkbox
		driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
		Thread.sleep(1000);
		System.out.println("Selected the first checkbox option");
		
		WebElement thirdCheckbox=driver.findElement(By.xpath("//input[@value='checkbox3']"));
		thirdCheckbox.click();
		Thread.sleep(1000);
		System.out.println("Selected the third checkbox option");
		//isDisplayed
		boolean isthirdcheckBox=thirdCheckbox.isDisplayed();
		System.out.println(isthirdcheckBox);
		
		if(thirdCheckbox.isSelected())
		{
			System.out.println("Third check box selection validated");
		}
		else
		{
			System.out.println("Validation failure for third checkbox selection");
		}
		
	}

}
