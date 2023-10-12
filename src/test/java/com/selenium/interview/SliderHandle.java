package com.selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='range']"));
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		Actions act=new Actions(driver);
		//max slider
		act.dragAndDropBy(ele, 200, 0).perform();
		//min slider
		act.dragAndDropBy(ele, -200, 0).perform();

	}

}
