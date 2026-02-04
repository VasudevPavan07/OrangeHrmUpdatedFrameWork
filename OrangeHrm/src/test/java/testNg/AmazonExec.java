package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.genericUtility.BaseClass;

@Listeners(com.orangeHrm.genericUtility.ListnerImplementation.class)
public class AmazonExec extends BaseClass {
	
	@Test
	public void m3() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		Assert.fail("iam failing");
	}

	
	
}
