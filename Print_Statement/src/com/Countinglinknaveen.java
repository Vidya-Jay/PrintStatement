package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinknaveen {
public static WebDriver driver;

public void launch(){
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List<WebElement>linklist = driver.findElements(By.tagName("a"));
	
	System.out.println(linklist.size());
	
	for (int i=0;i<linklist.size();i++){
		String linktext=linklist.get(i).getText();
		System.out.println(linktext);
	}
}


	public static void main(String[] args) {
		Countinglinknaveen obj=new Countinglinknaveen();
		obj.launch();

	}

}
