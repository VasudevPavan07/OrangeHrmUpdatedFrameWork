package com.orangeHrm.WebElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	
	private WebDriver driver;
	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lasttname;
	@FindBy(xpath = "//label[.='Employee Id']/../..//input")
	private WebElement empid;

	@FindBy(xpath = "//input[@type='checkbox']/../..//label")
	private WebElement checkbox;

	@FindBy(xpath = "//label[contains(.,'Username')]/../..//input")
	private WebElement username;

	@FindBy(xpath = "//label[.='Password']/../..//input")
	private WebElement password;

	@FindBy(xpath = "//label[.='Confirm Password']/../..//input")
	private WebElement confirmpassword;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submit;
	
	
	public void addEmployee(String firstname,String lastname,String empid,String username,String password){
		this.firstname.sendKeys(firstname);
		this.lasttname.sendKeys(lastname);
		this.empid.sendKeys(Keys.CONTROL, "A" + Keys.BACK_SPACE);
		this.empid.sendKeys(empid);
//		this.checkbox.click();
//		this.username.sendKeys(username);
//		this.password.sendKeys(password);
//		this.confirmpassword.sendKeys(password);
		this.submit.click();
	}
		

}
