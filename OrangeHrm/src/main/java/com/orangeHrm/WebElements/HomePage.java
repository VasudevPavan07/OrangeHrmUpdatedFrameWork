package com.orangeHrm.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement Adminlink;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimlink;
	
	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leavelink;
	
	@FindBy(xpath = "//span[text()='Time']")
	private WebElement timelink;
	
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitmentlink;
	
	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement myInfolink;
	
	@FindBy(xpath = "//span[text()='Performance']")
	private WebElement performancelink;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboardlink;
	
	@FindBy(xpath = "//span[text()='Directory']")
	private WebElement directorylink;
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement maintenancelink;
	
	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement claimlink;
	
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzzlink;
	
	@FindBy(css = "span[class='oxd-userdropdown-tab']")
	private WebElement logoutDropdown;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void logout() {
		logoutDropdown.click();
		logoutbtn.click();
	}
	
	public void clickOnPim(){
		pimlink.click();
	}
	
	public void clickAdmin() {
		Adminlink.click();
	}
	
	public void clickOnrecruitmentlink() {
		recruitmentlink.click();
	}
	
	public void clickOnMyinfolink() {
		myInfolink.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
