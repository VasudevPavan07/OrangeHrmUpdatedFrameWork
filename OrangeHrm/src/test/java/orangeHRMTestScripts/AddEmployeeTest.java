package orangeHRMTestScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orangeHrm.WebElements.HomePage;
import com.orangeHrm.WebElements.LoginPage;
import com.orangeHrm.WebElements.PIMpage;
import com.orangeHrm.genericUtility.BaseClass;
import com.orangeHrm.genericUtility.ExcelUtility;
import com.orangeHrm.genericUtility.FileUtility;
import com.orangeHrm.genericUtility.JavaUtility;
import com.orangeHrm.genericUtility.JsonUtility;
import com.orangeHrm.genericUtility.WebDriverUtility;

@Listeners(com.orangeHrm.genericUtility.ListnerImplementation.class)
public class AddEmployeeTest extends BaseClass {
	@Test(groups = { "Smoke", "Regression" })
	public void addEmployeeTest() throws InterruptedException, IOException {

		
		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();

		int num = jlib.getRandomNumber();
		String empId = num + "";

		String firstname = elib.getDataFromExcel("sheet1", 1, 0);
		
		
		String lastname = elib.getDataFromExcel("sheet1", 1, 1);
//		String empId = elib.getDataFromExcel("sheet1", 1, 1);

	
		
		System.out.println(firstname);
		PIMpage pim = new PIMpage(driver);

		pim.createEmpolyee(driver, firstname, lastname, empId, firstname, empId);
		Assert.fail("------im failing the script------");
		pim.verifyEmployeeCreation(driver, empId);
	}

	@Test
	public void m1() {
		System.out.println("iam impacted and now iam fixed");
	}

}
