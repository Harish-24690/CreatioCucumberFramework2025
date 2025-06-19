package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.applicatiom.elements.SignupPageElements;

public class SignupPageSteps extends SignupPageElements {
	
	public SignupPageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

	public void enterBussinessEmailId(String emailID, String password) {
		waitForElement(BussinessEmailField);
		enterElement(BussinessEmailField, emailID);
		

		waitForElement(PasswordField);
		enterElement(PasswordField, password);
		

	}

	public void checkThePrivacybutton() {
		waitForElement(PrivacyPolicyCheckBox);
		selectCheckBox(PrivacyPolicyCheckBox, false);
		

	}

	public void clickOnContinueButton() {

		waitForElement(ContinueButton);
		click(ContinueButton);
		
	}

	public void enterNameToSignUp(String userName) {
		waitForElement(SignupNameField);
		enterElement(SignupNameField, userName);
		
	}

	public void enterCompanyNameToSignUp(String company) {
		waitForElement(CompanyField);
		enterElement(CompanyField, company);
		

	}

	public void enterCountryNameToSignUp(String country) {
		waitForElement(CountryField);
		enterTextUsingActions(CountryField, country);
		selectDropdownOption(CountryField, country, "visibletext");
		
	}

	public void enterPhoneNumber(String phoneNumber) {
		waitForElement(PhoneNumberField);
		enterElement(PhoneNumberField, phoneNumber);
		
	}
	
	public void clickOnSignUpButton() {
		waitForElement(SignUPButton);
		click(SignUPButton);
		
	}

}
