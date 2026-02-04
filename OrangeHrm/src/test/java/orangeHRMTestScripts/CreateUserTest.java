package orangeHRMTestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.WebElements.AddUserPage;
import com.orangeHrm.WebElements.AdminPage;
import com.orangeHrm.WebElements.HomePage;
import com.orangeHrm.WebElements.LoginPage;
import com.orangeHrm.genericUtility.BaseClass;
import com.orangeHrm.genericUtility.ExcelUtility;
import com.orangeHrm.genericUtility.JsonUtility;
import com.orangeHrm.genericUtility.WebDriverUtility;
@Listeners(com.orangeHrm.genericUtility.ListnerImplementation.class)

public class CreateUserTest extends BaseClass {

	@Test
	public void createUserTest() throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub

		ExcelUtility elib = new ExcelUtility();

		String firstname = elib.getDataFromExcel("sheet1", 1, 0);
		String lastname = elib.getDataFromExcel("sheet1", 1, 1);

		String empName = firstname + lastname;
		System.out.println(firstname);

		HomePage hp = new HomePage(driver);
		AdminPage adp = new AdminPage(driver);
		AddUserPage ap = new AddUserPage(driver);

		// clicking on the Admin link
		hp.clickAdmin();
		// creating user
		ap.addUser(driver, empName, empName, "123456vk");
		adp.verifyUserCreation(firstname);

	}

}
