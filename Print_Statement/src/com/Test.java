package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
	
		WebDriver dr=new FirefoxDriver();
		//launch URl
		dr.get("http://primusbank.qedgetech.com/");
		//maximize browser
		dr.manage().window().maximize();
		
				
		

	}

}
