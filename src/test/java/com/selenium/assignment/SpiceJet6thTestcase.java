package com.selenium.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet6thTestcase {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spicejet.com/");

		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		//departure date
		String year="2023";
		String month="September";
		String date="25";

		driver.findElement(By.xpath(" //div[contains(@data-testid,'month-"+month+"-"+year+"')]//div[@data-testid='undefined-calendar-day-"+date+"']/div")).click();


		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		//adult	

		for(int i=1;i<2;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		}

		driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'INR')])[1]")).click();

		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//div[contains(text(),'Search Flight')]"));
		act.doubleClick(search).build().perform();		

		//continue payment
		WebElement continuePayment=driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']"));
		act.click(continuePayment).build().perform();

		//passengers page
		//contact details

		driver.findElement(By.xpath("//*[@data-testid='title-contact-detail-card']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Mrs')]")).click();

		driver.findElement(By.xpath("//*[@data-testid='first-inputbox-contact-details']")).sendKeys("sadhana");
		driver.findElement(By.xpath("//*[@data-testid='last-inputbox-contact-details']")).sendKeys("Logesh");
		driver.findElement(By.xpath("//*[@data-testid='contact-number-input-box']")).sendKeys("9688741481");
		driver.findElement(By.xpath("//*[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("sadhu.lokii1924@gmail.com");
		driver.findElement(By.xpath("//*[@data-testid='city-inputbox-contact-details']")).sendKeys("Bangalore");

		//1st passenger
		driver.findElement(By.xpath("//*[@data-testid='traveller-0-title-field']")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Mrs')])[2]")).click();

		driver.findElement(By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("Logesh");
		driver.findElement(By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("8870140494");
		driver.findElement(By.xpath("//div[@data-testid='traveller-0-travel-info-cta']")).click();

		//2nd passenger
		driver.findElement(By.xpath("//*[@data-testid='traveller-1-first-traveller-info-input-box']")).sendKeys("sadhana");
		driver.findElement(By.xpath("//*[@data-testid='traveller-1-last-traveller-info-input-box']")).sendKeys("Logesh");
		driver.findElement(By.xpath("//*[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("9688741481");
		//continue to add-ons
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']")).click();
		//click continue to payment
		Thread.sleep(5000);
		try {
			// Create a Robot instance
			Robot robot = new Robot();
			int targetX = 500; 
			int targetY = 300;   
			robot.mouseMove(targetX, targetY);

			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 
			Thread.sleep(5000);

			WebElement cl=  driver.findElement(By.id("at_addon_close_icon"));
			cl.click();

		} catch (AWTException e) {
			e.printStackTrace();
		}

		WebElement continueElement = driver.findElement(By.xpath("(//*[text()='Continue'])[3]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", continueElement);
		
		//*[@data-testid='add-ons-continue-footer-button' and not(div[contains(@style,'display:none')])][3]/div[1]
	//	WebElement elem = driver.findElement(By.xpath("//*[@id=\"button\"]"));
	//	WebElement elem = driver.findElement(By.xpath("(//*[text()='Continue'])[3]"));
		
	//	elem.click();
		
	//	wait.until(ExpectedConditions.elementToBeClickable(elem)).click();
	

		//		Thread.sleep(8000);
		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("document.body.click();");
		//		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//		//WebElement cl=  driver.findElement(By.xpath("//div[@class='at_addon_close']"));
		//	//	js.executeScript("arguments[0].click();", cl);
		//		//Thread.sleep(1000);
		//		//driver.findElement(By.xpath("//*[@data-testid='add-ons-continue-footer-button'][3]")).click();
		//
		//	/*	JavascriptExecutor js=(JavascriptExecutor)driver;
		//		WebElement cl=  driver.findElement(By.xpath("//div[@class='at_addon_close']"));
		//		js.executeScript("arguments[0].click();", cl);
		//		*/
		//		//WebElement dc=driver.findElement(By.xpath("//div[text()='Trip Summary']"));
		//		//  act.doubleClick(dc).build().perform();
		//		// driver.findElement(By.xpath("//div[@id='at_addon_close_icon']")).click();//close the add
		//		// act.click().perform();

	}


}
