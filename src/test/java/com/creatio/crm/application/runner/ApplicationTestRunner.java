package com.creatio.crm.application.runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "Features",
	glue = {"com.creatio.crm.framework.api.base","com.creatio.crm.application.stepdefinitions"},
	plugin = {"pretty", "html:Reports/cucumber-test-reports.html"}
//	tags = "@smoke"
)

public class ApplicationTestRunner extends AbstractTestNGCucumberTests{
	@Test
	public void runApplicationTests() {
		System.out.println("Running application UI Tests");
	}

}
