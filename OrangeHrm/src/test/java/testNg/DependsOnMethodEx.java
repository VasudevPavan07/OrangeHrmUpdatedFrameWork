package testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnMethodEx {

	
	@Test
	public void createContact()
	{
		System.out.println("contact created");
	}
	
   @Ignore
	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
		System.out.println("contact modified");
	}
	
	@Test(enabled = false)
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
}
