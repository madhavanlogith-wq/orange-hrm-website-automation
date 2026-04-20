package com.orangehrm.testing.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/com/orangehrm/testing/featurefile/featureFile.feature",
    glue = "com.orangehrm.testing.stepdefinition",
    dryRun = true,  // 🔥 important for debugging
    monochrome = true,
    plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class RunnerIo extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}