package com.samsung.iers.jobs.GK010007;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GK010007Excel {

	
	public String CreateExcel() {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sh = wb.createSheet("11");
		HSSFRow row = sh.createRow(1);
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("test");
		
		String filename = "test excel file!";

		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream("/Users/ashycat/"+filename);
			wb.write(fs);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fs != null){
				try {
					fs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	
		
		return filename;
		
	}
}
