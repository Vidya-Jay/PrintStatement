package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.navigate().to("http://jqueryui.com/droppable/");
		obj.manage().window().maximize();
		obj.manage().deleteAllCookies();
		
		Actions ac=new Actions(obj);
		
		ac.moveToElement(obj.findElement(By.partialLinkText("Drag"))).contextClick().build().perform();
		

	}

}
