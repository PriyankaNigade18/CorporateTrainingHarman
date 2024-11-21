package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Crm.feature",
					glue={"com.stepdef","com.Hooks"},
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
					)
public class CRMRunner {

}
