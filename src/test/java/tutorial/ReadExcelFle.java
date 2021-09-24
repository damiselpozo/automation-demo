package tutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFle {

	public ReadExcelFle() {
		// TODO Auto-generated constructor stub
	}
	
	public void readExcel(String filepath, String sheetName) throws IOException {
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		int rowCount  = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		
		for (int i = 0; i <= rowCount; i++) {
			
		}
		
	}

}
