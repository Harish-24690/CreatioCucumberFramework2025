package com.creatio.crm.application.base;

import org.openqa.selenium.WebDriver;

import com.creatio.crm.application.steps.ForgotLoginSteps;
import com.creatio.crm.application.steps.GoogleLoginPageSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginConfirmationpageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SignupPageSteps;
import com.creatio.crm.framework.api.base.BasePage;

public class BaseTest {
	public LoginPageSteps loginPage;
	public SignupPageSteps signUPpage;
	public LoginConfirmationpageSteps confirmationPage;
	public HomePageSteps homePage;
	public ForgotLoginSteps forgotLoginPage;
	public GoogleLoginPageSteps googleLoginPage;

	public void initializePages() {

		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
		signUPpage = new SignupPageSteps(driver);
		confirmationPage = new LoginConfirmationpageSteps(driver);
		homePage = new HomePageSteps(driver);
		forgotLoginPage = new ForgotLoginSteps(driver);
		googleLoginPage = new GoogleLoginPageSteps(driver);
	}

}
