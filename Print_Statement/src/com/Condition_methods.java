package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		//store username textbox in to webelement
		WebElement username=driver.findElement(By.xpath("//*[@id='login1']"));
		boolean user_enabled=username.isEnabled();
		System.out.println("username textbox is ::"+user_enabled);
		username.sendKeys("test@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		boolean pass_enabled= password.isEnabled();
		System.out.println("password textbox is::"+pass_enabled);
		password.sendKeys("test@123");
		
		WebElement checkbox= driver.findElement(By.xpath(".//*[@id='remember']"));
		//uncheck the checkbox from selection.
		
		if(checkbox.isSelected())
			checkbox.click();
		Thread.sleep(5000);
		
		WebElement gobutton=driver.findElement(By.name("proceed"));
		boolean go_displayed=gobutton.isDisplayed();
		gobutton.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		driver.quit();
		
		}

}
