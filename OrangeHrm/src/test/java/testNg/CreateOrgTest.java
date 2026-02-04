package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrgTest {
	@BeforeClass
	public void configBC() {
		System.out.println(".......launching browser");
	}
	@AfterClass
	public void configaAC() {
		System.out.println("====logout from app");
	}
	@BeforeMethod
	public void confidBm() {
		
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void configAm() {
		
		System.out.println("===quiting the browser");
	}
	@Test(priority = 1)
	public void createOrganizationTest() {
		System.out.println("org created");
	}
	
	@Test
	public void createOrgWithIndustries() {
		System.out.println("created ord");
	}
	
	
	
	
	

}
