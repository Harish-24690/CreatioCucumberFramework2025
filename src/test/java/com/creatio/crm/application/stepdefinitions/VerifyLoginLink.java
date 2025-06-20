package com.creatio.crm.application.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.base.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLoginLink extends BaseTest {

	@When("the user clicks on the Google login link")
	public void the_user_clicks_on_the_google_login_link() {
		initializePages();
		loginPage.verifyGoogleLoginlink();
	}

	@Then("the Google login page should be displayed")
	public void the_google_login_page_should_be_displayed() {
		googleLoginPage.verifyGoogleLoginPageIsDisplayed();
	}

}
