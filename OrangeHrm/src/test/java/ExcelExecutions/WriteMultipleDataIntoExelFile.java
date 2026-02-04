package ExcelExecutions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultipleDataIntoExelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Qspiders\\Desktop\\Book2.xls");
		              Workbook workbook = WorkbookFactory.create(fis);
		            Sheet sheet = workbook.getSheet("sheet2");
		            
		            
		            WebDriver driver = new ChromeDriver();
		            driver.get("https://www.amazon.com/");
		            
		            driver.manage().window().maximize();
		            
		            Thread.sleep(2000);
		            
		           List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		           
		           for(int i =0 ;i<allLinks.size();i++) {
		        	   
		        	   //create row
		        	Row row = sheet.createRow(i);
		        	   //create cell
		        	Cell cell = row.createCell(0);
		        	   //set cell value
		        	cell.setCellValue(allLinks.get(i).getAttribute("href"));
		        	
		        	   
		           }
		           
		           FileOutputStream fos = new FileOutputStream("C:\\Users\\Qspiders\\Desktop\\Book2.xls");
		            
		            workbook.write(fos);
		            workbook.close();
		
		

	}

}
