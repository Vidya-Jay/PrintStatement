package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JSscript {
public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
JavascriptExecutor js=((JavascriptExecutor)driver);
driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
Thread.sleep(4000);
js.executeScript("document.querySelector('#txtUsername').value='Admin'");

js.executeScript("document.querySelector('#txtPassword').value='Admin'");
Thread.sleep(4000);
driver.close();
	}

}
