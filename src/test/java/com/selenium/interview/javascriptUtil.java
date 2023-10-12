package com.selenium.interview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptUtil {

	public static void  alertbox(WebDriver driver,String msg)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+msg+"');");
	}
	public static void drawElement(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red';",ele);
	}
	public static void zoomElement(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%';",ele);
	}
	public static void flashEle(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String color=ele.getCssValue("backgroundColor");
		for(int i=0;i<=50;i++)
		{
			changeColor(driver,ele,"#000000");
			changeColor(driver,ele,color);
			
		}
	}

	public static void changeColor(WebDriver driver,WebElement ele,String color)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"';",ele);
	}

}
