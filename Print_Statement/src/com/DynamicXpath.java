package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freecrm.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("VidyaJay");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vidyac@321123");
	driver.findElement(By.xpath("//input[contains (@type,'submit')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Kalyani Mohanasundaram']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@type='checkbox']")).click();
	Thread.sleep(2000);
	driver.quit();
		

	}

}
