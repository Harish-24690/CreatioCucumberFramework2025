package com.creatio.crm.application.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.ForgotLoginSteps;
import com.creatio.crm.application.steps.GoogleLoginPageSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginConfirmationpageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SignupPageSteps;
import com.creatio.crm.framework.api.base.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithInvalidCredentials {

	public LoginPageSteps loginPage;
	public SignupPageSteps signUPpage;
	public LoginConfirmationpageSteps confirmationPage;
	public HomePageSteps homePage;
	public ForgotLoginSteps forgotLoginPage;
	public GoogleLoginPageSteps googleLoginPage;

	WebDriver driver = BasePage.getDriver();

	@Then("an error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String errorMessage) {
		
		loginPage = new LoginPageSteps(driver);

		loginPage.verifyInvalidLoginErrorMessage(errorMessage);
	}

}
