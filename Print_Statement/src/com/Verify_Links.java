package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Links {

	public static void main(String[] args) throws InterruptedException {
		String baseurl="http://newtours.demoaut.com/";
		WebDriver driver= new ChromeDriver();
		String underConstitle="Under Construction: Mercury Tours";
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> linkelements= driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+linkelements.size());
		String[] linktexts=new String[linkelements.size()];
		int i=0;
		for(WebElement e:linkelements){
			linktexts[i]=e.getText();
			i++;
		}
		
		for(String t:linktexts){
			driver.findElement(By.linkText(t)).click();
			Thread.sleep(5000);
			if(driver.getTitle().equals(underConstitle)){
				System.out.println("\n"+t+"is under construction");
			}else{
				System.out.println("\n"+t+"is working");
			}
			driver.navigate().back();
		}

	}

}
