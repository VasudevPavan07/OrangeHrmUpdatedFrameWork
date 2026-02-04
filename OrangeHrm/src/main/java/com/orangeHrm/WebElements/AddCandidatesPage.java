package com.orangeHrm.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidatesPage {
	
	private WebDriver driver;
	
	
	public AddCandidatesPage(WebDriver driver) {
		this.driver= driver;
		 PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="firstName")
	private WebElement firstname;
	@FindBy(name="lastName")
	private WebElement lastname;
	@FindBy(xpath = "//div[.='Vacancy']/..//div[@tabindex='0']")
	private WebElement vacancy;
	@FindBy(xpath = "//div[.='Email']/..//input")
	private WebElement email;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebtn;
	
	
	
	public void addCandidate(WebDriver driver, String firstname,String lastname,String email) throws AWTException, InterruptedException{
		RecuirtmentPage rp = new RecuirtmentPage(driver);
		CandidatePage cp = new CandidatePage(driver);
		rp.clickonCandidates();
		cp.addbtn.click();
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
	    this.vacancy.click();
	    Robot robot = new Robot();
	    Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		this.email.sendKeys(email);
		this.savebtn.click();
	}
	
	
	
	
	
	

}
