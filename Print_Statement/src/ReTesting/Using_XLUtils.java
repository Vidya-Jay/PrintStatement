package ReTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.XL_UTILS;
import pack1.Reusable;

public class Using_XLUtils extends Reusable{

	XL_UTILS excel=new XL_UTILS();
	
	@BeforeTest
	public void launch(){
		driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
				
	}
	@Test
	public void Verify_EmpCreation() throws IOException, InterruptedException{
		String excelpath="C:\\Users\\Vidya\\Framework-Online\\Print_Statement\\Test Data\\EMPCreation1.xlsx";
		int rc=excel.getRowCount(excelpath, "Emp");
		int cc=excel.getCellCount(excelpath, "Emp", 0);
		Reporter.log("no of rows::"+rc+"  "+"no of cols::"+cc,true);
		for(int i=1;i<=rc;i++){
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("btnAdd")).click();
			Thread.sleep(4000);
			String fname=excel.getCellData(excelpath, "Emp", i, 0);
			String mname=excel.getCellData(excelpath, "Emp", i, 1);
			String lname=excel.getCellData(excelpath, "Emp", i, 2);
			String eid=excel.getCellData(excelpath, "Emp", i, 3);
			driver.findElement(By.name("firstName")).sendKeys(fname);
			driver.findElement(By.name("middleName")).sendKeys(mname);
			driver.findElement(By.name("lastName")).sendKeys(lname);
			driver.findElement(By.name("employeeId")).sendKeys(eid);
			driver.findElement(By.id("btnSave")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			String url=driver.getCurrentUrl();
			if(url.contains("empNumber")){
				Reusable.screenshotWithDate("orange", "empcreation");
				excel.setCellData(excelpath, "Emp", i,4 , "Emp creation is success");
				excel.fillGreenColor(excelpath, "Emp", i, 4);
				
			}
			else{
				Reusable.screenshotWithDate("orange", "empcreation");
				excel.setCellData(excelpath, "Emp", i, 5, "Emp Creation is unsuccess");
				excel.fillRedColor(excelpath, "Emp", i, 4);
			}
		}
		
	}
}
