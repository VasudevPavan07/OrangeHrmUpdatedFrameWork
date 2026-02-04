package testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Customer {
	
	@Test
	public void createCustomerTest() {
		System.out.println("new cutomer created");
	}
	
	@Ignore
	@Test(dependsOnMethods = "createCustomerTest" )
	public void modifyCustomerTest() {
		
		System.out.println("customer modified");
	}
	
	@Test(dependsOnMethods = "createCustomerTest")
	public void deleteCustomer() {
		System.out.println("customer deleted");
	}
	

}
