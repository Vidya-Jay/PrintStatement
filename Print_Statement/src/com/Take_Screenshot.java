package com;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		//java timestamp
		DateFormat df=new SimpleDateFormat("dd_mm_yyyy hh_mm_ss");
		Date d=new Date();
		String datef=df.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
		FileUtils.copyFile(src,new File("C://Users//Vidya//Selenium/"+datef+"screenshot.jpg"));
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}

		Thread.sleep(5000);
		driver.quit();
	}

}
