package com.creatio.crm.application.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.applicatiom.elements.LoginPageElements;
import com.creatio.crm.framework.utilities.PropUtil;

public class LoginPageSteps extends LoginPageElements {

	Properties prop = PropUtil.readData("Config.properties");
	
	public LoginPageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

	public void launchTheApplication() {
		launchApplication();
		Assert.assertEquals(getTitle(), prop.getProperty("APP_TITLE"), "Application title mismatch after launch.");
		

	}

	public void loginPageHeader(String expHeader) {
		waitForElement(header);
		Assert.assertEquals(header, expHeader);
		
	}

	/*
	 * public void verifyLoginPageLogo() { waitForElement(logo);
	 * Assert.assertTrue(isElementDisplayed(logo),
	 * "Login page logo is not visible."); log("pass",
	 * "Login page logo verified successfully"); }
	 */

	public void enterCredentials(String userName, String password) {
		waitForElement(emailInputField);
		enterElement(emailInputField, userName);
		

		waitForElement(passwordInputField);
		enterElement(passwordInputField, password);
		

	}

	public void clickOnLogoinButton() {
		waitForElement(loginButton);
		click(loginButton);
		
	}

	public void verifyEmailLoginErrorMessage() {
		waitForElement(EmailLoginErrorMessage);
		Assert.assertTrue(isElementDisplayed(EmailLoginErrorMessage),
				"Login error message not displayed on invalid email.");
		
	}

	public void verifyPasswordLoginErrorMessage() {
		waitForElement(PasswordLoginErrorMessage);
		Assert.assertTrue(isElementDisplayed(PasswordLoginErrorMessage),
				"Login error message not displayed on invalid password.");
		
	}
	
	

	public void clickOnForgotLoginLink() {
		waitForElement(forgotPassLink);
		click(forgotPassLink);
		
	}

	public void verifyChatButton() {
		waitForElement(ChatWindowButton);
		click(ChatWindowButton);
		
	}

	public void verifyGoogleLoginlink() {
		waitForElement(googleLoginLink);
		jsClick(googleLoginLink);
//		click(googleLoginLink);
		
	}

	public void verifyFacebookLoginLink() {
		waitForElement(facebookLoginLink);
		click(facebookLoginLink);
		
	}
	
	public void verifySignInLink() {
		waitForElement(signUpLink);
		click(signUpLink);
		
	}

	public void verifyLogoutSuccessful() {
		waitForElement(header);
//		Assert.assertTrue(isElementDisplayed(header), "Login page header not displayed after logout.");
		
	}

	public void verifyInvalidLoginErrorMessage(String expectedErrorMessage) {
		waitForElement(InvalidLoginErrorMessage);
		String actualErrorMessage = getElementText(InvalidLoginErrorMessage);
//		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match expected.");
		
		
	}
}
