package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
    features ="@target/rerun.txt", // Rerun only failed scenarios
  glue = {"org.stepdefinitions","org.applicationhooks"},
    monochrome = true,
    dryRun = false,
    plugin = {
        "pretty",
        "html:target/html_report/cucumber_rerun_report.html",
        "json:target/json_report/json_rerun_report.json",
        "junit:target/junit_report/junit_rerun_report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        
    }
)
public class ReRunner {

}
