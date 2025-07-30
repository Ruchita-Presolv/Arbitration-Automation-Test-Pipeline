package org.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/org.features",  // You can keep specific file or directory here
    glue = {
        "org.stepdefinitions",
        "org.applicationhooks"
    },
    tags = "@Admin",  // Update this based on what you want to run
    plugin = {
        "pretty",
        "html:target/html_report/cucumber_report.html",
        "json:target/json_report/json_report.json",
        "junit:target/junit_report/junit_report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/rerun.txt" // For failed test re-run
    },
    monochrome = true,
    dryRun = false
)
public class TestRunner {
    // To run with TestNG instead, extend AbstractTestNGCucumberTests and use TestNG runner
}

//src/test/resources/org.features/UserUsability.feature
//"@filterConfirm or @filterApprove"
//"@Smoke or @ArbNameFil"
// @Smoke or @Sanity
//not @Sanity
//@Arb 
//@User
//@Admin

//===============================Admin Dashboard===========================
//AdminReviewBulkUp.feature
//DashBoardPage.feature
//OngoingPage.feature
//LoginPage.feature
//OngoingRandom&GeneralFilter.feature
//OngoingGeneralFilAct.feature
//CaseDetailsAndTrackDownload.feature
//SomeBasicUsabilityOngoing.feature
//OngoingRandomFilAct.feature
// AdminUsability.feature
//ClosePage.feature
//EndToEndScenarios.feature

//EndToEndScenarios.feature
//================================Arbitrator Dashboard=====================
//ArbitratorLogin.feature
//ArbitratorNewRequestsP.feature
//ArbitratorOngoingP.feature
//ArbitratorClosedP.feature
//ArbitratorClosedByPresolv.feature



//cucumber_Arbitration/src/test/resources/org.features/arb.Run
//cucumber_Arbitration/src/test/resources/org.features/user.Run

//@Adddirection or @ClosureContested or @ClosureUncontested 

//src/test/resources/org.features/ArbitratorClosedP.feature

//=================================User Dashboard===========================
// User login page 
// UserLogin.feature
// UserUsability.feature
// UserOngoing.feature

//EndToEndScenarios.feature
