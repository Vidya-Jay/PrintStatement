package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {
	public static WebDriver driver;
	public void verify_login() throws InterruptedException{
		driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		username.clear();
		username.sendKeys("Admin");
		//store password textbox
		
		WebElement password= driver.findElement(By.id("txtPassword"));
		password.clear();
		Thread.sleep(5000);
		password.sendKeys("Vidya");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		String Acval=driver.getCurrentUrl();
		if(Acval.contains("dashboard")){
			System.out.println("Login is succesful");
		}else{
			
			String message= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
			System.out.println("Login unsuccessful"+message);
			
		}
		driver.quit();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Webelement_methods obj=new Webelement_methods();
		obj.verify_login();

	}

}
