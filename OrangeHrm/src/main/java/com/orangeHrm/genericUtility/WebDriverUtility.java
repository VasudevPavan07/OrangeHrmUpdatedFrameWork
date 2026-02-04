package com.orangeHrm.genericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	WebDriver driver;
	
	public WebDriverUtility(WebDriver driver) {
		this.driver= driver;
	}
	
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void maximizeBrowserWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	public void waitForElement(WebDriver driver , WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	//used to switch to any window based  on window title
	public void switchToWindow(WebDriver driver,String partialWindowTitle) {
		  Set<String> windowhandles = driver.getWindowHandles();
		  Iterator<String> it = windowhandles.iterator();
		  while(it.hasNext()) {
			 String wID = it.next();
			 driver.switchTo().window(wID);
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.contains(partialWindowTitle)) {
				break;
			}
		  }
	}
	
	
	//used to switch to alert window and click on cancel button
	public void switchToAlertAndCancel(WebDriver driver, String expectedMsg) {
		Alert alt = driver.switchTo().alert();
		if(alt.getText().equals(expectedMsg)){
			System.out.println("alert message is verified ");
		}
		else {
			System.out.println("alert message is not verified");
		}
		alt.dismiss();
	}
	
	//used to switch to frame based on index
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	//used to switch to frame based on id/name_attribute
	public void switchToFrame(WebDriver driver,String id_name_attribute) {
		driver.switchTo().frame(id_name_attribute);
		
	}
	
	//used to select the value of the DropDown based on index
	public void  select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	
	//used to select the value of the DropDown based on visible text
	public void select(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	 
	//used to place mouse cursor on specified element
	public void mouseHoverOnElement(WebDriver driver,WebElement element) {
		    Actions action = new Actions(driver);
		    action.moveToElement(element).perform();
	}
	
	//used to right click on specified element
	public void rightClickOnElement(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	//PRESS ENTER KEY 
	public void pressEnterKey(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	
	
	
	
	
	
	
}
