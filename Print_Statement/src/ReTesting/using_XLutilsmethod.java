package ReTesting;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.XL_UTILS;

public class using_XLutilsmethod {
	@Test
	public void launch() throws IOException{
		XL_UTILS excel=new XL_UTILS();
		String excelpath="C:\\Users\\Vidya\\Framework-Online\\Print_Statement\\Test Data\\practice1.xlsx";
		int rc=excel.getRowCount(excelpath, "Sheet1");
		int cc=excel.getCellCount(excelpath, "Sheet1", 0);
		System.out.println("no. of rows::"+rc+" "+"no. of cols::"+cc);
		for(int i=1;i<=rc;i++){
			String username=excel.getCellData(excelpath, "Sheet1", i, 0);
			String password=excel.getCellData(excelpath, "Sheet1", i, 1);
			
			System.out.println(username+"  "+password);
			excel.setCellData(excelpath, "Sheet1", i, 2, "pass");
			
		}
		
		
		
		
		
		
	}
	
	

}
