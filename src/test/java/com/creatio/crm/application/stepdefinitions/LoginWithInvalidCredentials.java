package com.creatio.crm.application.stepdefinitions;



import com.creatio.crm.application.base.BaseTest;
import io.cucumber.java.en.Then;

public class LoginWithInvalidCredentials extends BaseTest {

	@Then("an error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String errorMessage) {

		initializePages();
		loginPage.verifyInvalidLoginErrorMessage(errorMessage);
	}

}
