package com.orangeHrm.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {

	private WebDriver driver;

	public AddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[.='User Role']/../..//div[@class='oxd-select-wrapper']")
	private WebElement userRole;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeName;
	@FindBy(xpath = "//label[.='Status']/../..//div[@class='oxd-select-wrapper']")
	private WebElement status;
	@FindBy(xpath = "//label[.='Username']/../..//input")
	private WebElement username;
	@FindBy(xpath = "//label[.='Password']/../..//input")
	private WebElement password;
	@FindBy(xpath = "//label[.='Confirm Password']/../..//input")
	private WebElement confirmPassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;

	public void addUser(WebDriver driveer,String empname, String username, String password) throws AWTException, InterruptedException {
		AdminPage  adp = new AdminPage(driver);
		adp.clickOnAddBtn();
		this.userRole.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		this.employeName.sendKeys(empname);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		this.status.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.confirmPassword.sendKeys(password);
		this.saveBtn.click();
	}

}
