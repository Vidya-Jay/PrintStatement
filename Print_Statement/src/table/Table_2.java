package table;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Table_2 {
	public static WebDriver driver;
	@BeforeTest
	public void launch(){
		driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void windows_naukri() throws InterruptedException{
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);;
		Iterator<String> I1=s1.iterator();
		while(I1.hasNext()){
			String childwindow=I1.next();
			if(!parent.equals(childwindow)){
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@value='Register with us']")).click();
		driver.findElement(By.xpath("//*[@value='fresher']")).click();
		Thread.sleep(2000);
		
		
	}
@AfterTest
public void close(){
	driver.quit();
}
}
