package com.creatio.crm.application.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.base.BaseTest;
import com.creatio.crm.application.steps.ForgotLoginSteps;
import com.creatio.crm.application.steps.GoogleLoginPageSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginConfirmationpageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SignupPageSteps;
import com.creatio.crm.framework.api.base.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginWithValidCredentails extends BaseTest {

	@Given("Initialize the driver")
	public void initializeDriver() {
		initializePages();
	}

	@Given("the user launches the application")
	public void the_user_launches_the_application() {
		loginPage.launchApplication();
	}

	@When("^the user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_enters_username_and_password(String username, String password) {
		loginPage.enterCredentials(username, password);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		loginPage.clickOnLogoinButton();
	}

	@Then("the home page should be displayed with header {string}")
	public void the_home_page_should_be_displayed_with_header(String header) {
		homePage.verifyHomePageIsDisplayed(header);
	}

}
