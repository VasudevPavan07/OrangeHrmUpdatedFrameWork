package com.orangeHrm.WebElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TerminationsReasonPage {
	
	private WebDriver driver;
	
	public TerminationsReasonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	private WebElement addBtn;
	@FindBy(css=".oxd-table-card")
	private List<WebElement> reasons;
	
	
	
	public void clickOnAdd() {
		addBtn.click();
	}
	
	public void verifyTerminationAddtion(String termiantion) {
		boolean flag=false;
		for (WebElement webElement : reasons) {
			if (webElement.getText().contains(termiantion)) {
				flag =true;
			}
		}
		
		Assert.assertTrue(flag);
//		if (flag) {
//			System.out.println("termination added");
//		}
//		else {
//			System.out.println("termination not added");
//		}
	}
	
	
	
	

}
