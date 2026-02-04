package com.orangeHrm.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.orangeHrm.WebElements.HomePage;
import com.orangeHrm.WebElements.LoginPage;

public class BaseClass {

	public static WebDriver sdriver;
	public WebDriver driver = null;
	

	JavaUtility jlib = new JavaUtility();
	FileUtility flib = new FileUtility();
	JsonUtility jsonLib = new JsonUtility();
//	ExcelUtility elib = new ExcelUtility();

	@BeforeSuite(groups = { "Smoke", "Regression" })
	public void configBS() {
		System.out.println("connect to database");
	}
//	@Parameters("BROWSER") String BROWSER
	@BeforeClass(groups = { "Smoke", "Regression" })
	public void configBC() throws IOException {
		String BROWSER = jsonLib.getDataFromJson("browser");
		String URL = jsonLib.getDataFromJson("url");
		if (BROWSER.contains("chrome")) {
			driver = new ChromeDriver();
		}
		if (BROWSER.contains("firefox")) {
			driver = new FirefoxDriver();
		}
		if (BROWSER.contains("edge")) {
			driver = new EdgeDriver();
		}
		if (BROWSER.contains("safari")) {
			driver = new SafariDriver();
		}
		
		sdriver=driver;
		driver.get(URL);
		driver.manage().window().maximize();
		WebDriverUtility weblib = new WebDriverUtility(driver);
		weblib.waitForPageLoad(driver);

	}

	@BeforeMethod(groups = { "Smoke", "Regression" })
	public void configBM() throws IOException {
		String USERNAME = flib.getPropertyKeyValue("username");
		String PASSWORD = flib.getPropertyKeyValue("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
	}

	@AfterMethod(groups = { "Smoke", "Regression" })
	public void configAM() {
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

	@AfterClass(groups = { "Smoke", "Regression" })
	public void configAC() {
		System.out.println("closing the browser");
		driver.quit();
	}

	@AfterSuite(groups = { "Smoke", "Regression" })
	public void configAS() {
		System.out.println("closing the database connection");
	}

}
