package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read_All {
public static WebDriver driver;
public static File f;
public static FileInputStream fi;
public static FileOutputStream fo;
public static XSSFWorkbook wb;
public static XSSFSheet sh;
public static XSSFRow ro;

	public static void main(String[] args) {
		FileInputStream fi;
		try {
			fi = new FileInputStream("C:\\Users\\Vidya\\Framework-Online\\practice1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rc= sh.getLastRowNum();
		XSSFRow ro=sh.getRow(0);
		int cc=ro.getLastCellNum();
		System.out.println("no of rows"+rc+"   "+"no of cols"+cc);
		for(int i=1;i<=rc;i++){
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
			
		}
		fi.close();
		wb.close();
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			System.out.println(t.getMessage());
		}

	}

}
