package com.orangeHrm.WebElements;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PersonalDetailsPage {
	
	private WebDriver driver;
	
	public PersonalDetailsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="firstName")
	private WebElement firstname;
	@FindBy(name="lastName")
	private WebElement lastname;
	@FindBy(xpath = "//div[.='Employee Id']//input")
	private WebElement empId;
	@FindAll({
		@FindBy(xpath="(//button[@type='submit'])[1]") ,
		@FindBy(xpath="//p[contains(.,' * Required')]/..//button")})
	private WebElement savebtn;
	

	public void editUserDetails(String firstname,String lastName,String empid) throws InterruptedException {
		this.firstname.sendKeys(Keys.CONTROL + "a");
		this.firstname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.firstname.sendKeys(firstname);
		
		this.lastname.sendKeys(Keys.CONTROL + "a");
		this.lastname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.lastname.sendKeys(lastName);
		
		this.empId.sendKeys(Keys.CONTROL + "a");
		this.empId.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.empId.sendKeys(empid);
		Thread.sleep(1000);
		this.savebtn.click();
	}
	
	
	public void verifyDetailsModification(String firstname,String lastName,String empid){
		
		boolean bool = this.firstname.getText().contains(firstname) && this.lastname.getText().contains(lastName) && this.empId.getText().contains(empid);
		
		Assert.assertTrue(bool);
		
//		if (this.firstname.getText().contains(firstname) && this.lastname.getText().contains(lastName) && this.empId.getText().contains(empid)) {
//			System.out.println("Details edited successfully");
//		} else {
//			System.out.println("Details not edited");
//		}
		
		
	}
	
	
	
	
	

}
