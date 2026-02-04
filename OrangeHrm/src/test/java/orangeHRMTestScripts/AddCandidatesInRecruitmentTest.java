package orangeHRMTestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.WebElements.AddCandidatesPage;
import com.orangeHrm.WebElements.CandidatePage;
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

public class AddCandidatesInRecruitmentTest extends BaseClass {
      
	@Test(groups = {"Smoke","Regression"})
	public  void addCandidatesInRecuitmentTest() throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		// Launch Empty WebBrowser and maximize the browser window
		
		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();
	
		HomePage hp = new HomePage(driver);
		AddCandidatesPage ap = new AddCandidatesPage(driver);
		CandidatePage cp = new CandidatePage(driver);
		
		hp.clickOnrecruitmentlink();
		ap.addCandidate(driver,"virat","kholi","viratkholi@gmail.com");
		cp.verifiyRecuirtment(driver, "virat");
			}
	
	@Test
	public void m2() {
		System.out.println("candidate has beeen added ");
	}
	
	}


