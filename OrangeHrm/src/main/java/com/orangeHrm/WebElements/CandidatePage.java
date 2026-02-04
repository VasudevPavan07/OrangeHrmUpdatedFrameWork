package com.orangeHrm.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CandidatePage {
	
	
	WebDriver driver;
	
	public CandidatePage(WebDriver driver) {
		this.driver= driver;
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[contains(.,'Add')]")
	WebElement addbtn;
	
	@FindBy(xpath = "//div[.='Candidate Name']//input")
	WebElement candiadteName;
	@FindBy(css = "[type='submit']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//span[contains(.,'Record Found')]")
	WebElement record;
	
	
	public void verifiyRecuirtment(WebDriver driver,String candiadtename) throws AWTException, InterruptedException {
		HomePage hp = new HomePage(driver);
		RecuirtmentPage rp = new RecuirtmentPage(driver);
		Robot robot = new Robot();
		hp.clickOnrecruitmentlink();
		rp.clickonCandidates();
		
		this.candiadteName.sendKeys(candiadtename);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		this.searchBtn.click();
		
		Assert.assertTrue(record.getText().contains("1"));
		
	
	}
	
	
	
	
	
	
	
	

}
