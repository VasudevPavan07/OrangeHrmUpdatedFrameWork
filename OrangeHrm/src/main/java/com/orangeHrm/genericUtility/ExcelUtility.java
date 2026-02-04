package com.orangeHrm.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	// getDataFromExcel
	// setDataToExcel
	// getRowCount

	// it is used to read the data from excel
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/Qspiders/Desktop/Book2.xls");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		workbook.close();
		return data;
	}

	// used to get the last row number of the specified excel sheet
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/Qspiders/Desktop/Book2.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		return sheet.getLastRowNum();
	}
	
	
//used to write data into specied excel sheet
	public void setDataToExcel(String sheetName, int rowNum, int cellNum, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/Qspiders/Desktop/Book2.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		    Row row = sheet.getRow(rowNum);
		    Cell cell = row.createCell(cellNum);
		    cell.setCellValue(data);
		    FileOutputStream fos = new FileOutputStream("C:/Users/Qspiders/Desktop/Book2.xls");
		    wb.write(fos);
		    wb.close();
		 
	}

}
