package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webtour {
public static WebDriver driver;
public static Properties p;
public static FileInputStream fi;

@BeforeMethod
public void Launch() throws IOException{
	driver=new ChromeDriver();
	p=new Properties();
	fi=new FileInputStream("Repo.properties");
	p.load(fi);
	driver.navigate().to(p.getProperty("ObjURl"));
	driver.manage().window().maximize();
	
}
@Test(description="Verify Login",priority=0,enabled=true)

public void Verify_Login(){
	driver.findElement(By.xpath(p.getProperty("Objusername"))).sendKeys("admin");;
	driver.findElement(By.xpath(p.getProperty("ObjPassword"))).sendKeys("mercury");;
	driver.findElement(By.xpath(p.getProperty("ObjSignin"))).sendKeys(Keys.ENTER);;
	String Expval=driver.getTitle();
	if(Expval.contains("Find")){
		Reporter.log("Login Success",true);
	}else{
		Reporter.log("Login unSuccess",true);
	}
	
}
@Test(description="Verify Register",priority=1,enabled=true)
public void Verify_Register() throws InterruptedException{
	driver.findElement(By.xpath(p.getProperty("ObjRegister"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(p.getProperty("ObjFname"))).sendKeys("Vidya");
	driver.findElement(By.xpath(p.getProperty("Objlname"))).sendKeys("Jkumar");
	driver.findElement(By.xpath(p.getProperty("Objphone"))).sendKeys("12345345");
	driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys("test@gmail.com");
	driver.findElement(By.xpath(p.getProperty("Objaddress"))).sendKeys("32 rosepac avenue");
	driver.findElement(By.xpath(p.getProperty("ObjCity"))).sendKeys("Brampton");
	driver.findElement(By.xpath(p.getProperty("ObjState"))).sendKeys("Chennai");
	driver.findElement(By.xpath(p.getProperty("ObjPostalcode"))).sendKeys("Vidya");
	new Select(driver.findElement(By.xpath(p.getProperty("ObjCountry")))).selectByIndex(10);
	Thread.sleep(4000);
	driver.findElement(By.xpath(p.getProperty("ObjUname"))).sendKeys("Vidya");
	WebElement pwd=driver.findElement(By.xpath(p.getProperty("Objpwd")));
	pwd.sendKeys("test@123");
	String password= pwd.getAttribute("value");
	WebElement cpassword=driver.findElement(By.xpath(p.getProperty("Objcpwd")));
	cpassword.sendKeys("test@234");
	String cpwd=cpassword.getAttribute("value");
	driver.findElement(By.xpath(p.getProperty("Objsubmit"))).sendKeys("Vidya");
	if(password.equals(cpwd)){
		String message= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		Reporter.log(message,true);
		Reporter.log("login successful",true);
	}else{
		Reporter.log("login unsuccessful",true);
	}
	
	
	
}
@AfterMethod
public void logout() throws InterruptedException{
	Thread.sleep(4000);
	driver.quit();
}


}
