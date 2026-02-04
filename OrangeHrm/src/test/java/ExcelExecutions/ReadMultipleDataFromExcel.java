package ExcelExecutions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis =  new FileInputStream("C:\\Users\\Qspiders\\Desktop\\Book2.xls");
		 Workbook workbook = WorkbookFactory.create(fis);
	      Sheet sheet = workbook.getSheet("sheet2");
		
		int lastRownum = sheet.getLastRowNum();
		
		
		for(int i=0;i<lastRownum; i++) {
		 Row row = sheet.getRow(i);
		 
		 for(int j=0; j<row.getLastCellNum();j++) {
			   Cell cell = row.getCell(j);
			   String link = cell.getStringCellValue();
			   System.out.println(link);
		 }
			
		}
		
		
		
		
		 
		

	}

}
