package com.orangehrm.testing.runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/com/orangehrm/testing/featurefile/addEmp.feature","./src/test/java/com/orangehrm/testing/featurefile/addJobTitle.feature","./src/test/java/com/orangehrm/testing/featurefile/AdminUserManagement.feature","./src/test/java/com/orangehrm/testing/featurefile/cusData.feature","./src/test/java/com/orangehrm/testing/featurefile/orgAndQua.feature"},
		glue = "com.orangehrm.testing.stepdefinition",
		dryRun = !true,
		monochrome = true,
//		plugin= {
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
////				Tags= {"@fk"}
		plugin = {
				  "pretty",
				  "html:target/cucumber-reports.html",
				  "json:target/cucumber.json",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class RunnerIo extends AbstractTestNGCucumberTests{
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}

