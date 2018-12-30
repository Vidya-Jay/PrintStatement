package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Using_iterator {
	public static WebDriver driver;
	@Test
	public void Windows_naukri() throws InterruptedException{
		driver = new ChromeDriver();
		driver.navigate().to("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()){
			String childwindow=i1.next();
			if(!parent.equals(childwindow)){
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				Thread.sleep(4000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@value='Register with us']")).click();
		driver.findElement(By.xpath("//*[@value='fresher']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
