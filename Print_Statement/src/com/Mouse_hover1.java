package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_hover1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("pagetitle[1]::"+driver.getTitle());
		
		Actions ac=new Actions(driver);
		
		ac.sendKeys(Keys.ESCAPE).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).click().perform();;
		System.out.println("pagetitle[2]::"+driver.getTitle());
		
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement applelink=driver.findElement(By.xpath("//*[text()='Apple']"));
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(applelink));
		ac.moveToElement(applelink).click().build().perform();
		System.out.println("pagetitle[3]::"+driver.getTitle());
		Thread.sleep(5000);
		
		

	}

}
