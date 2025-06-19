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

public class VerifyForgotLogin{
	
	public LoginPageSteps loginPage;
	public SignupPageSteps signUPpage;
	public LoginConfirmationpageSteps confirmationPage;
	public HomePageSteps homePage;
	public ForgotLoginSteps forgotLoginPage;
	public GoogleLoginPageSteps googleLoginPage;

	WebDriver driver = BasePage.getDriver();

	@When("the user clicks on the forgot login link")
	public void the_user_clicks_on_the_forgot_login_link() {
		
		loginPage = new LoginPageSteps(driver);
	    loginPage.clickOnForgotLoginLink();
	}

	@Then("the forgot login page should be displayed with header {string}")
	public void the_forgot_login_page_should_be_displayed_with_header(String header) {
		forgotLoginPage = new ForgotLoginSteps(driver);
	    forgotLoginPage.verifyForgotLoginHeader(header);
	}
}
