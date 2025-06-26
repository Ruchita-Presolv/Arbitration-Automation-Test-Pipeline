package org.testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/org.features/AdminReviewBulkUp.feature", 
		glue = { "org.stepdefinitions",
		"org.applicationhooks" }, monochrome = true, dryRun = false, 
		//tags = "@CaseCsv1", // to run specific tc
		plugin = { "pretty", "html:target/html_report/cucumber_report.html", "json:target/json_report/json_report.json",
				"junit:target/junit_report/junit_report.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/Failed_Scenarios.txt"}

		)
public class TestNgRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object [][]scenarios(){ 

		return super.scenarios();
	}
}

//@Smoke or @Sanity
//AdminReviewBulkUp.feature
//DashBoardPage.feature
//"@filterConfirm or @filterApprove"
//@PageAction
//OngoingPage.feature
//AdminReviewBulkUp.feature
//LoginPage.feature
//OngoingRandom&GeneralFilter.feature
//OngoingGeneralFilAct.java
//CaseDetailsAndTrackDownload.feature
//SomeBasicUsabilityOngoing.feature
//OngoingRandomFilAct.feature
//AdminUsability.feature
//ClosePage.feature
//=====================================================
//ArbitratorLogin.feature