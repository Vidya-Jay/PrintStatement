package com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Javascript {
	public static void changecolor(String color,WebElement element, WebDriver driver) throws InterruptedException{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		Thread.sleep(2000);
		
	}
	
	public static void flash(WebElement element,WebDriver driver) throws InterruptedException{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
	for (int i=0;i<5;i++){
		changecolor("rgb(0,200,0)",element,driver);
		changecolor(bgcolor,element,driver);
	}
	}
	public static void drawborder(WebElement element,WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generatealert(WebDriver driver,String message){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickelementbyjs(WebElement element,WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
	}
	public static void refreshbrowserbyjs(WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String gettitlebyjs(WebDriver driver){
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String Title= js.executeScript("returndocument.title").toString();
	return Title;
	}
	
	public static String getpageInnerText(WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pagetext=js.executeScript("returndocument.documentElement.InnerText;").toString();
		return pagetext;
	}
	
	public static void scrollpagedown(WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollintoview(WebDriver driver, WebElement element){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoview(true)",element);
	}
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("test1234");
		
		WebElement loginbtn= driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		//flash(loginbtn,driver);
		
		drawborder(loginbtn, driver);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Vidya\\Documents\\Education\\Selenium\\Programs\\screenshotsample"));
		
		generatealert(driver, "there is an issue");
		clickelementbyjs(loginbtn, driver);
		refreshbrowserbyjs(driver);
		
		System.out.println(gettitlebyjs(driver));
		
		scrollpagedown(driver);
		
		
	
	}

}
