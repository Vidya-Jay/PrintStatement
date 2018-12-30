package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println("pagetitle[1]::"+driver.getTitle());
		
		Actions ac=new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement src= driver.findElement(By.xpath("//*[contains(@id,'draggable')]"));
		WebElement drop=driver.findElement(By.xpath("//*[contains(@id,'droppable')]"));
		
		ac.clickAndHold(src).moveToElement(drop).release().perform();
		if(drop.getText().matches("Dropped"))
			System.out.println("Drag and drop is success");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
