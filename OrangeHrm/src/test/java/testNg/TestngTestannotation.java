package testNg;

import org.testng.annotations.Test;

public class TestngTestannotation {
	
	@Test(priority = 1 ,invocationCount = 2)
	public void createUserTest() {
		System.out.println("created a user");
	}
	@Test(priority =3 ,invocationCount = 2 )
	public void modifyUserTest()
	{
		System.out.println("modified used details");
	}
	
	@Test(priority = 2)
	public void deleteUser() {
		System.out.println("deleted user");
	}

}
