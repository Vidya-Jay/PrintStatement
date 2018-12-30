package table;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Window_1 {
public static WebDriver driver;
@Test
public void Verify_windowhandles() throws InterruptedException{
	driver=new ChromeDriver();
	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	Thread.sleep(5000);
	Set<String> windows=driver.getWindowHandles();
	System.out.println(windows);
	for(String eachwin:windows){
		System.out.println(eachwin);
		if(!parent.equals(eachwin)){
			driver.switchTo().window(eachwin);
			driver.findElement(By.xpath("//*[text()='Request a Quote']")).click();
			Thread.sleep(4000);
			new Select (driver.findElement(By.xpath("//*[@name='Package']"))).selectByIndex(1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("vidya");
			driver.findElement(By.xpath("//*[@name='LastName']")).sendKeys("jay");
			new Select (driver.findElement(By.xpath("//*[@name='Industry']"))).selectByIndex(2);
			new Select (driver.findElement(By.xpath("//*[@name='Country']"))).selectByIndex(4);
			driver.switchTo().window(parent);
			driver.quit();
		}
	}
}
}
