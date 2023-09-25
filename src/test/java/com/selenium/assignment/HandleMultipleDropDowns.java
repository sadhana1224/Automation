package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDowns {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
WebElement noEmpl=driver.findElement(null);
selectOption(noEmpl,"18");
WebElement industry=driver.findElement(null);
selectOption(industry,"gdfh");
WebElement country=driver.findElement(null);
selectOption(country,"tru");


	}
	public static void selectOption(WebElement ele,String value)
	{
		Select sel=new Select(ele);
		
		List<WebElement> opt=sel.getOptions();
		for(WebElement op:opt)
		{
			if(op.getText().equals(value))
			{
				op.click();
				break;
			}
		}
	}

}
