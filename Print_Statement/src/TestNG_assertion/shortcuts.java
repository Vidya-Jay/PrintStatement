package TestNG_assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import pack1.Reusable;

public class shortcuts extends Reusable {
	WebDriver driver=new ChromeDriver();
		
	//@Test
	public void logintest(){
		System.out.println("login test");
	}
	
	//@Test(dependsOnMethods="logintest")
	public void homepagetest(){
		System.out.println("Homepagetest");
	}

	//@Test(invocationCount=5)
	public void invocationcount(){
		int a=10;
		int b=20;
		int c=30;
		
		int d=a+b+c;
		System.out.println("sum of the above:"+d);
	}
	
	@Test
	public void googletitletest(){
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123","title is not matched");
	}

	@Test
	public void googlelogotest(){
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		boolean b=driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
		Assert.assertEquals(b, true);
		
	}
	
}


