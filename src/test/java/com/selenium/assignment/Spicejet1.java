package com.selenium.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//disable pop up
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		//driver=new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/"); //-->1st testcase
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(text(),'Signup')]")).click();
		Set<String> child=driver.getWindowHandles();
		for(String childwin:child)
		{
			if(!parent.equalsIgnoreCase(childwin))
			{
				driver.switchTo().window(childwin);

			}
		}
		Thread.sleep(4000);

		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control form-select ']")));
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='first_name' and @class='form-control ']")).sendKeys("sadhana");
		driver.findElement(By.xpath("//input[@id='last_name' and @class='form-control ']")).sendKeys("v");

		driver.findElement(By.xpath("//select[@class='form-control form-select']")).sendKeys("India");

		driver.findElement(By.xpath("//img[@class='d-inline-block datepicker']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='react-datepicker__month-container']")));

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//option[text()='January']")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']//option[text()='1992']")).click();
		driver.findElement(By.xpath("//div[text()='28']")).click();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolldown by 1000
		js.executeScript("window.scrollTo(0,500);");
		/*WebElement phnum=driver.findElement(By.xpath("//input[@class=' form-control']"));
		js.executeScript("arguments[0].value='9748126845';", phnum);
		*/
		driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("9688741481");
	/*	
		WebDriverWait phonum=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele1=driver.findElement(By.xpath("//input[@class=' form-control']"));
		phonum.until(ExpectedConditions.elementToBeClickable(ele1));
		ele1.clear();
		ele1.sendKeys("9564756232");
		Thread.sleep(2000);
		*/
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email_id']")));
		driver.findElement(By.xpath("//input[@id='last_name']")).click();

	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.xpath("//input[@id='email_id']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		//js.executeScript("arguments[0].click();", ele);
		ele.click();
		ele.sendKeys("sadhanasuba24@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='last_name']")).click();

		ele=driver.findElement(By.xpath("//input[@id='new-password']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.sendKeys("Flight@2412");
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Flight@2412");
		
	//	driver.findElement(By.xpath("//input[@id='last_name']")).click();
	
		WebElement element = driver.findElement(By.id("defaultCheck1"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		ele=driver.findElement(By.xpath("//button[text()='Submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
//	WebElement submit=	driver.findElement(By.xpath("//button[text()='Submit']"));
//
//Actions at = new Actions(driver);
//at.moveToElement(submit).click().perform();
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click();", submit);
	
		
		

	}

}
