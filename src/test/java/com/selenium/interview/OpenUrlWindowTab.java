package com.selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWindowTab {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		//tab
	/*	driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/links");
		*/
		//window
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demoqa.com/links");
		
	}

}
