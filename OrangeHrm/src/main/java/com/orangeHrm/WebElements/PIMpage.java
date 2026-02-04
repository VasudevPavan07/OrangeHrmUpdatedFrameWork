package com.orangeHrm.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PIMpage {
	
	private WebDriver driver;
	
	public PIMpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addbtn;
	@FindBy(xpath = "//label[text()='Employee Name']/../..//input")
	private WebElement employeename;
	
	@FindBy(xpath = "//label[.='Employee Id']/../..//input")
	private WebElement empidinput;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span' and contains(.,'Records Found')]")
	private WebElement records;
	
	@FindBy(xpath = "//span[contains(.,'Configuration')]/i")
	private WebElement configurations;
	
	@FindBy(linkText = "Termination Reasons")
	private WebElement terminationReasons;
	
	
	
	public void createEmpolyee(WebDriver driver,String firstname, String lastname,String empid,String username,String password) {
		HomePage hp = new HomePage(driver);
		AddEmployeePage aep = new AddEmployeePage(driver);
		hp.clickOnPim();
		addbtn.click();
		aep.addEmployee(firstname, lastname, empid, username, password);
	}
	
	
	public void verifyEmployeeCreation(WebDriver driver,String empid) {
		HomePage hp = new HomePage(driver);
		hp.clickOnPim();
		this.empidinput.sendKeys(empid);
		this.searchbtn.click();
		
		Assert.assertTrue(records.getText().contains("1"));
		
//		if(this.records.getText().contains("1")) {
//			System.out.println("employee created");
//		}
//		else {
//			System.out.println("employee not created");
//		}
		
	}
	
	public void clickOnTerminationReasons() {
		configurations.click();
		terminationReasons.click();
	}
	
	
	

}
