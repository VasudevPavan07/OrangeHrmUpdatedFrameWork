package com.orangeHrm.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminPage {
	
	
	WebDriver driver ;
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[.=' Add ']")
	WebElement addBtn;
	
	@FindBy(xpath = "//label[.='Username']/../..//input")
	WebElement usernameInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbtn;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span' and contains(.,'Records Found')]")
	WebElement record;
	
	
	
	
	public void clickOnAddBtn() {
		addBtn.click();
	}
	
	
	
	
	public void verifyUserCreation(String username) {
		this.usernameInput.sendKeys(username);
		
		Assert.assertTrue(record.getText().contains("1"));

//		if () {
//			System.out.println("usercreated");
//		}
//		else {
//			System.out.println("usernotcreated");
//		}
	}
	
	
	
	
	
	

}
