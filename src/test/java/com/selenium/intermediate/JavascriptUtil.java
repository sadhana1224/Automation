package com.selenium.intermediate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	static WebDriver driver;
	public static void drawBorder(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",ele);
	}

	public static String getTitleJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=(String) js.executeScript("return document.title;");
		return title;	
	}
	public static void generateAlert(WebDriver driver,String msg)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+msg+"')");
	}
	public static void refreshJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("history.go(0);");
	}
	public static void scrollPAgeUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");	
	}
	public static void zoomPage(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='50%'");	
	}
	public static void flash(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor=ele.getCssValue("backgroundColor");
		for(int i=0;i<50;i++)
		{
			changecolor("#000000",ele,driver);
			changecolor(bgcolor,ele,driver);
		}
	}
	public static void changecolor(String color,WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",ele);
	}

}
