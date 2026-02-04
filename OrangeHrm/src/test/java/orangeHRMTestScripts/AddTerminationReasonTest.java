package orangeHRMTestScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.WebElements.AddTerminationReasonPage;
import com.orangeHrm.WebElements.HomePage;
import com.orangeHrm.WebElements.LoginPage;
import com.orangeHrm.WebElements.PIMpage;
import com.orangeHrm.WebElements.TerminationsReasonPage;
import com.orangeHrm.genericUtility.BaseClass;
import com.orangeHrm.genericUtility.ExcelUtility;
import com.orangeHrm.genericUtility.FileUtility;
import com.orangeHrm.genericUtility.JavaUtility;
import com.orangeHrm.genericUtility.JsonUtility;
import com.orangeHrm.genericUtility.WebDriverUtility;
@Listeners(com.orangeHrm.genericUtility.ListnerImplementation.class)

public class AddTerminationReasonTest extends BaseClass {
	
	@Test(groups = {"Regression"})
	public  void addTerminationTest() throws IOException {
		// TODO Auto-generated method stub
	
		ExcelUtility elib = new ExcelUtility();
	
		HomePage hp = new HomePage(driver);
		AddTerminationReasonPage atp = new AddTerminationReasonPage(driver);
		TerminationsReasonPage trp = new TerminationsReasonPage(driver);
		
		hp.clickOnPim();
		atp.addTerminationName("abscond2");
		trp.verifyTerminationAddtion("abscond2");
	}

}
