package com.orangeHrm.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTerminationReasonPage {
	
	private WebDriver driver;
	
	public AddTerminationReasonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[.='Name']//input")
	private WebElement terminationName;
	@FindBy(css="[type='submit']")
	private WebElement savebtn;
	
	
	public void addTerminationName(String termination) {
		TerminationsReasonPage trp = new TerminationsReasonPage(driver);
		PIMpage pp = new PIMpage(driver);
		pp.clickOnTerminationReasons();
		trp.clickOnAdd();
		terminationName.sendKeys(termination);
		savebtn.click();
	}
	
	
	

}
