package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver=new ChromeDriver();
		 
		 driver.navigate().to("https://demoqa.com/select-menu");
		 driver.manage().window().maximize();
		 
		 Select sel=new Select(driver.findElement(By.id("oldSelectMenu")));
		 
		 sel.selectByIndex(0);
		 Thread.sleep(1000);
		 
		 sel.selectByValue("5");
		 Thread.sleep(1000);
		 
		 sel.selectByVisibleText("Purple");
		 Thread.sleep(1000);
		 
		 List<WebElement> allop=sel.getOptions();
		 
		 for(WebElement all:allop)
		 {
			 System.out.println(all.getText());
		 }
		
	}

}
