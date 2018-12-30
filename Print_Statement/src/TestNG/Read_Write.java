package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write {

	public static void main(String[] args) throws IOException {
		String pathname="practice1.xlsx";
		File f=new File(pathname);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		XSSFRow ro=ws.getRow(0);
		int cc=ro.getLastCellNum();
		System.out.println("no of rows are::"+rc+" "+"no of columns are::"+cc);
		String user = ws.getRow(1).getCell(0).getStringCellValue();
		String pass= ws.getRow(2).getCell(1).getStringCellValue();
		System.out.println(user+" "+pass);
		//Write some text into results column
		ws.getRow(1).createCell(2).setCellValue("test passed");
		fi.close();
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		
		

	}

}
