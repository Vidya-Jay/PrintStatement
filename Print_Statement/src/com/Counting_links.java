package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_links {
public static WebDriver driver;
public void print_links() throws InterruptedException{
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.naukri.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no of links are::"+links.size());
	//iterate all links
	for(WebElement eachlink:links)
	{
		//get all link text
		String linkname=eachlink.getText();
		//get url of all links
		String url= eachlink.getAttribute("href");
		System.out.println(linkname);
		System.out.println(url);
				
	}
	Thread.sleep(50000);
	driver.quit();
}
	public static void main(String[] args) throws InterruptedException {
		Counting_links cl=new Counting_links();
		cl.print_links();
		

	}

}
