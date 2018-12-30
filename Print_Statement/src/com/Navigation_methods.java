package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_methods {
public WebDriver obj;
public void Commands_Navigate() throws InterruptedException{
	//launch browser
	obj=new FirefoxDriver();
	obj.navigate().to("https://www.google.com/");
	System.out.println("pagetitle[1]::"+obj.getTitle());;
	obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	obj.manage().window().maximize();
	//click on gmail link
	obj.findElement(By.partialLinkText("Gm")).click();
	Thread.sleep(5000);
	System.out.println("pagetitle[2]::"+obj.getTitle());
	//click on back button to get to previous page
	obj.navigate().back();
	System.out.println("pagetitle[3]::"+obj.getTitle());
	Thread.sleep(5000);
	//click on forward next page
	obj.navigate().forward();
	System.out.println("pagetitle[4]::"+obj.getTitle());
	Thread.sleep(5000);
	obj.navigate().refresh();
	Thread.sleep(4000);
	obj.quit();
	
	
}

	public static void main(String[] args) throws InterruptedException {
		Navigation_methods nm= new Navigation_methods();
		nm.Commands_Navigate();
		

	}

}
