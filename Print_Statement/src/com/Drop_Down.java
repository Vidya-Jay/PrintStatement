package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static WebDriver driver;
public void Drop_Down_Verify() throws InterruptedException{
	driver=new ChromeDriver();
	driver.navigate().to("C:/Users/Vidya/Documents/Education/Selenium/Programs/Apr%2012/drop.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Select drop=new Select(driver.findElement(By.xpath("//*[@id='e1_f']/select")));
	boolean value=drop.isMultiple();
	System.out.println(value);
	drop.selectByVisibleText("January");
	Thread.sleep(3000);
	drop.selectByIndex(6);
	Thread.sleep(4000);
	drop.selectByIndex(2);
	Thread.sleep(4000);
	System.out.println(drop.getFirstSelectedOption());
	List<WebElement>count = drop.getAllSelectedOptions();
	System.out.println("no of items selected::"+count.size());
	
	//iterate all selected item
	
	for(int i=0;i<count.size();i++){
		String text=count.get(i).getText();
		System.out.println(text);
	}
	
	drop.deselectByIndex(0);
	Thread.sleep(4000);
	drop.deselectAll();
	Thread.sleep(4000);
	driver.quit();
}
	
	
	public static void main(String[] args) throws InterruptedException {
		Drop_Down obj=new Drop_Down();
		obj.Drop_Down_Verify();

	}

}
