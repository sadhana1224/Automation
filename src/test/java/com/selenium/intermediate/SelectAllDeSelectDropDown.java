package com.selenium.intermediate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectAllDeSelectDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver=new ChromeDriver();
		 
		 driver.navigate().to("https://demoqa.com/select-menu");
		 driver.manage().window().maximize();
		 
		 Select sel=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		 
		 sel.selectByIndex(0);
		 Thread.sleep(1000);
		 
		 sel.selectByValue("saab");
		 Thread.sleep(1000);
		 
		 sel.selectByVisibleText("Opel");
		 Thread.sleep(1000);
		 
		 List<WebElement> allop=sel.getOptions();
		 
		 //select all options
		 for(WebElement selAll:sel.getAllSelectedOptions())
		 {
			 System.out.println("selected all options-->"+selAll.getText());
		 }
		 
		 //deselect all options
		 sel.deselectAll();
		 System.out.println("all options are deselected");
		 
		 driver.quit();
	}

}
