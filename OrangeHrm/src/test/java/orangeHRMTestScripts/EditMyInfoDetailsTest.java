package orangeHRMTestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.WebElements.HomePage;
import com.orangeHrm.WebElements.LoginPage;
import com.orangeHrm.WebElements.PersonalDetailsPage;
import com.orangeHrm.genericUtility.BaseClass;
import com.orangeHrm.genericUtility.ExcelUtility;
import com.orangeHrm.genericUtility.FileUtility;
import com.orangeHrm.genericUtility.JavaUtility;
import com.orangeHrm.genericUtility.JsonUtility;
import com.orangeHrm.genericUtility.WebDriverUtility;
@Listeners(com.orangeHrm.genericUtility.ListnerImplementation.class)

public class EditMyInfoDetailsTest extends BaseClass {

	@Test
	public void editMyInfoTest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		FileUtility flib = new FileUtility();
		ExcelUtility elib = new ExcelUtility();
		JavaUtility jlib = new JavaUtility();
		int randomNum = jlib.getRandomNumber();
		String empid = randomNum + "";

		String USERNAME = flib.getPropertyKeyValue("username");
		String PASSWORD = flib.getPropertyKeyValue("password");

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		PersonalDetailsPage pdp = new PersonalDetailsPage(driver);

		hp.clickOnMyinfolink();
		pdp.editUserDetails("pavan", "vasudev", empid);
		Thread.sleep(2000);
		hp.logout();
		lp.login(USERNAME, PASSWORD);
		hp.clickOnMyinfolink();
		Thread.sleep(2000);
		pdp.verifyDetailsModification("pavan", "vasudev", empid);

	}

}
