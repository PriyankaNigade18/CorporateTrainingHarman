package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * single scenario: tags="@sellpage"
 * multiple scenario:tags="@sellpage or @mobilepage"
 * multiple scenario: same tag name
 * ignore one scenario: tags="not @mobilepage"
 * ignore multiple scenario: tags="not @ignore"
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="com.stepdef",
					tags="@regression"
					)
public class AmazonRunner {

}
