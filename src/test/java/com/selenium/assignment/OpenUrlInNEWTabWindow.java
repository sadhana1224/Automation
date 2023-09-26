package com.selenium.assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlInNEWTabWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		driver=new ChromeDriver();
		//tab
		driver.get("https://www.facebook.com/login/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://twitter.com/i/flow/login?lang=en");

		//window

		driver.get("https://www.facebook.com/login/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://twitter.com/i/flow/login?lang=en");
	}

}
