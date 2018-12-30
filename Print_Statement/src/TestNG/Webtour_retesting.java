package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtour_retesting {
public static WebDriver driver;
public static File f;
public static FileInputStream fi;
public static XSSFWorkbook wb;
public static XSSFSheet sh;
public static XSSFRow ro;
public static FileOutputStream fo;


@BeforeTest
public void launch_browser(){
	driver=new ChromeDriver();
}
@Test
public void Register() throws IOException, IOException, InterruptedException{
	String excelpath="C:\\Users\\Vidya\\Framework-Online\\Print_Statement\\Test Data\\practice2.xlsx";
	f=new File(excelpath);
	fi=new FileInputStream(f);
	
	Properties p=new Properties();
	p.load(new FileInputStream("Repo.properties"));
	wb = new XSSFWorkbook(fi);
	sh=wb.getSheetAt(0);
	int rc=sh.getLastRowNum();
	ro=sh.getRow(0);
	int cc= ro.getLastCellNum();
	Reporter.log("no of rows are::"+rc+"no of columns are::"+cc,true);
	//iterate all rows and columns
	for(int i=1;i<=rc;i++){
		driver.navigate().to(p.getProperty("ObjURl"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(p.getProperty("ObjRegister"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(p.getProperty("ObjFname"))).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objlname"))).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objphone"))).sendKeys(sh.getRow(i).getCell(2).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys(sh.getRow(i).getCell(3).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objaddress"))).sendKeys(sh.getRow(i).getCell(4).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("ObjCity"))).sendKeys(sh.getRow(i).getCell(6).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("ObjState"))).sendKeys(sh.getRow(i).getCell(7).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("ObjPostalcode"))).sendKeys(sh.getRow(i).getCell(8).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("ObjCountry"))).sendKeys(sh.getRow(i).getCell(9).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("ObjUname"))).sendKeys(sh.getRow(i).getCell(10).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objpwd"))).sendKeys(sh.getRow(i).getCell(11).getStringCellValue());
		driver.findElement(By.xpath(p.getProperty("Objcpwd"))).sendKeys(sh.getRow(i).getCell(12).getStringCellValue());		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		Thread.sleep(4000);
		if(sh.getRow(i).getCell(11).getStringCellValue().equals(sh.getRow(i).getCell(12).getStringCellValue())){
			Reporter.log("Regiser success",true);
			sh.getRow(i).createCell(13).setCellValue("Password and confirm password are correct");
			String message= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]")).getText();
			sh.getRow(i).createCell(14).setCellValue(message);
					
		}else{
			Reporter.log("register unsucess",true);
			sh.getRow(i).createCell(13).setCellValue("Password and confirm password are not equal");
			sh.getRow(i).createCell(14).setCellValue("fail");
		}
		fi.close();
		fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
				
	}
	
}
@AfterTest
public void logout(){
	driver.quit();
}


}
