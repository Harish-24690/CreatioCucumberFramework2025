package com.creatio.crm.application.stepdefinitions;



import com.creatio.crm.application.base.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyForgotLogin extends BaseTest {

	/**/

	@When("the user clicks on the forgot login link")
	public void the_user_clicks_on_the_forgot_login_link() {

		initializePages();
		loginPage.clickOnForgotLoginLink();
	}

	@Then("the forgot login page should be displayed with header {string}")
	public void the_forgot_login_page_should_be_displayed_with_header(String header) {
		forgotLoginPage.verifyForgotLoginHeader(header);
	}
}
