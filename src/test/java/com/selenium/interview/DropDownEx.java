package com.selenium.interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select sel=new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//sel.selectByIndex(3);
		//sel.selectByVisibleText("Black");
		sel.selectByValue("2");
		
		List<WebElement> tot=driver.findElements(By.xpath("//select[@id='oldSelectMenu']//option"));
		System.out.println(tot.size());
		
		for(WebElement val:sel.getOptions())
		{
			if(val.getText().equals("Aqua"))
			{
				val.click();
			}
		}
	}

}
