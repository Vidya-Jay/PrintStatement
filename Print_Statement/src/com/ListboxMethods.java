package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxMethods {
	public static WebDriver obj;
	
	public void VerifyListBox() throws InterruptedException{
		obj=new ChromeDriver();
		obj.navigate().to("https://www.facebook.com/");
		obj.manage().deleteAllCookies();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//store month list into select class object
		
		Select omonth=new Select(obj.findElement(By.name("birthday_month")));
		boolean value=omonth.isMultiple();
		System.out.println(value);
		omonth.selectByVisibleText("Dec");
		Thread.sleep(4000);
		omonth.selectByIndex(1);
		Thread.sleep(3000);
		//count no of items in the listbox
		List<WebElement>countitems = omonth.getOptions();
		System.out.println("no of items are::"+countitems.size());
		String reqmth="test";
		boolean valuem  =false;
		
		for(int i=1;i<countitems.size();i++){
			String listtext=countitems.get(i).getText();
			System.out.println(listtext);
			if (reqmth.equalsIgnoreCase(listtext)){
				omonth.selectByIndex(i);
				valuem=true;
				break;
			}
		}
		if(valuem==false){
			System.out.println(reqmth+"not found");
		}
		
	obj.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		ListboxMethods meth=new ListboxMethods();
		meth.VerifyListBox();

	}

}
