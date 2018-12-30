package table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class table_1 {
public static WebDriver driver;
@BeforeTest
public void launch(){
	driver=new ChromeDriver();
	driver.navigate().to("C:\\Users\\Vidya\\Documents\\Education\\Selenium\\Programs\\Apr 2\\qedgetable.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
}
@Test
public void Table(){
	String text=driver.findElement(By.xpath("//*[text()='ameerpet']")).getText();
	System.out.println("specific row and column value::"+text);
	WebElement table= driver.findElement(By.tagName("table"));
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	Reporter.log("no of rows are::"+rows.size(),true);
	//iterate all rows
	for(int i=1;i<rows.size();i++){
		List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		
		if(i==1){
			Reporter.log("no of columns are::"+cols.size(),true);
		}
		
		for(int j=0;j<cols.size();j++){
			String eachcell= cols.get(j).getText();
			System.out.println("\t"+eachcell);
			Reporter.log(eachcell);
		}

	System.out.println();
	
	}
	
	
	
	
}

}
