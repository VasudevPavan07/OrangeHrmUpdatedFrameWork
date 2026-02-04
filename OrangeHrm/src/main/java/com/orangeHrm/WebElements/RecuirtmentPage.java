package com.orangeHrm.WebElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecuirtmentPage {
	
	private WebDriver driver;
	
	public  RecuirtmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Candidates")
	private WebElement candidates;
	
	
	public void clickonCandidates() {
		this.candidates.click();
	}
	

    
	

}
