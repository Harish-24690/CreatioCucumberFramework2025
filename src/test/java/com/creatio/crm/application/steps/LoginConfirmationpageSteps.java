package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.applicatiom.elements.LoginConfirmationPageElements;

public class LoginConfirmationpageSteps  extends LoginConfirmationPageElements{
	
	public LoginConfirmationpageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	
	public void verifyconfirmationPageHeader(String confirmPageHeader) {
		waitForElement(ConfirmationPageHeader);
		Assert.assertEquals(ConfirmationPageHeader,confirmPageHeader);
		
	}
	
	public void verifyClickhereLink() {
		waitForElement(ClickhereLink);
		click(ClickhereLink);
		
	}

}
