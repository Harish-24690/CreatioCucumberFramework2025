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

public class VerifyLoginLink {

	public LoginPageSteps loginPage;
	public SignupPageSteps signUPpage;
	public LoginConfirmationpageSteps confirmationPage;
	public HomePageSteps homePage;
	public ForgotLoginSteps forgotLoginPage;
	public GoogleLoginPageSteps googleLoginPage;

	WebDriver driver = BasePage.getDriver();

	@When("the user clicks on the Google login link")
	public void the_user_clicks_on_the_google_login_link() {
		loginPage = new LoginPageSteps(driver);
		loginPage.verifyGoogleLoginlink();
	}

	@Then("the Google login page should be displayed")
	public void the_google_login_page_should_be_displayed() {
		googleLoginPage = new GoogleLoginPageSteps(driver);
		googleLoginPage.verifyGoogleLoginPageIsDisplayed();
	}

}
