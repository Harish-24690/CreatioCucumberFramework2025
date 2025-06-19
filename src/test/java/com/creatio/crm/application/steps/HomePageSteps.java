package com.creatio.crm.application.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.applicatiom.elements.HomePageElements;


public class HomePageSteps extends HomePageElements {

	public HomePageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnNewFolder() {
		waitForElement(NewFolderButton);
		click(NewFolderButton);
		
	}

	public void clickONNewProcess() {
		waitForElement(NewProcessButton);
		click(NewProcessButton);
		
	}

	public void verifyLeftPanelLinks() {
		waitForElement(HomePageHeader);
		waitForElement(HRProcessLink);
		waitForElement(SalesProcessLink);
		waitForElement(ServiceProcessLink);
		waitForElement(NewFolderButton);
		waitForElement(NewProcessButton);
		
	}

	public void LogoutFromApplication() {
		waitForElement(ProfileButton);
		click(ProfileButton);
		click(LogoutButton);
		
	}

	public void verifyHomePageIsDisplayed(String expHeader) {
		waitForElement(HomePageHeader);
		Assert.assertEquals(getElementText(HomePageHeader), expHeader);
		
		
	}

}
