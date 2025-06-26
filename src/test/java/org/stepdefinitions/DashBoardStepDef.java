package org.stepdefinitions;


import org.applicationhooks.AppHooks;
import org.factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.DashBoardpage;
import org.pages.LoginPage;

import io.cucumber.java.en.*;

public class DashBoardStepDef {

	private  LoginPage lp_obj= new LoginPage(DriverFactory.getDriver());
	private DashBoardpage Dp_obj=new DashBoardpage(DriverFactory.getDriver());

	//=new DashBoardpage(DriverFactory.getDriver());


	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("Url"));
		String username= AppHooks.prop.getProperty("UserName");
		String pwd = AppHooks.prop.getProperty("Password");
		Dp_obj = lp_obj.doLoginPage(username, pwd);
		Dp_obj.dashBoardPage();	
	}
	@Given("user is on dashboard page and title as {string}")
	public void user_is_on_dashboard_page_and_title_as(String title) {
		Dp_obj.verifyPageTitle(title);
	}

	@Given("user click on the Resolv btn")
	public void user_click_on_the_resolv_btn() throws InterruptedException {
		Thread.sleep(2000);
		Dp_obj.clickonResolv();
	}

	@Then("user click on the For admin review btn")
	public void user_click_on_the_for_admin_review_btn() throws InterruptedException {
		Thread.sleep(2000);
		Dp_obj.clickOnForAddREview();

	}

	@Then("user click on Arbitration360")
	public void user_click_on_arbitration360() {
		Dp_obj.clickOnArb();
	}

	@Then("user verify the page title as {string}")
	public void user_verify_the_page_title_as(String title) {
		Dp_obj.verifyPageTitle(title);
	}

	@Then("user click on the action button")
	public void user_click_on_the_action_button() {
		Dp_obj.actionClick();
	}


	/*
	 * ***** Confirm Action StepDefination
	 ***********/

	@Given("user ckecked the select all cases check box")
	public void user_ckecked_the_select_all_cases_check_box() {
		Dp_obj.checkCheckBox();
	}

	@Then("user click on the confirm butten")
	public void user_click_on_the_confirm_butten() {
		Dp_obj.filterConfirm();;
	}

	@Given("user unckecked the select all cases check box")
	public void user_unckecked_the_select_all_cases_check_box() {
		Dp_obj.uncheckedChechBox();
	}

	@Then("and set date")
	public void and_set_date() {
		Dp_obj.setDate();
	}

	@Then("click on confirn and click on close btn")
	public void click_on_confirn_and_click_on_close_btn() {
		Dp_obj.confirmAndClose();
	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() {
		Dp_obj.logoutbtn();
	}
	/*
	 * ***** Confirm RandomCase Action StepDefination
	 ***********/

	@Given("user refresh the page and select random cases from the page")
	public void user_refresh_the_page_and_select_random_cases_from_the_page() {
		//Dp_obj.randomCaseSelCon();
	}

	/*
	 * ***** Confirm  by using From to filter  Action StepDefination
	 ***********/


	@Given("user is on filter page  and select action Confirm from drop down")
	public void user_is_on_filter_page_and_select_action_confirm_from_drop_down() {
		Dp_obj.confirmDropAct();
	}
	@Then("select case by using from to filter")
	public void select_case_by_using_from_to_filter() throws InterruptedException {
		Dp_obj.selFromToCase_ExpBlank();
	}

	//+++++++ApproveFilter 

	@Given("user is on filter page  and select action Approve  from drop down")
	public void user_is_on_filter_page_and_select_action_approve_from_drop_down() {
		Dp_obj.approveDropAct();
	}

	@Then("select the Arbitrator from the dropdown")
	public void select_the_arbitrator_from_the_dropdown() {
		Dp_obj.fArbitrator();
	}
	@Then("select case by using from to filter for Approve")
	public void select_case_by_using_from_to_filter_for_approve() throws InterruptedException {
		Dp_obj.SelAppCasesFromToFil();
	}

	@Then("click on ApproveFilter btn")
	public void click_on_approve_filter_btn() throws InterruptedException {
		Dp_obj.FilApproveClick();
	}

	@Then("click on closeFilter btn")
	public void click_on_close_filter_btn() {
		Dp_obj.closeFilter();
	}

	//++++DownloadFilter

	@Given("user is on filter page  and select action Download  from drop down")
	public void user_is_on_filter_page_and_select_action_download_from_drop_down() {
		Dp_obj.downloadDropAct();
	}
	@Then("user click on the download btn")
	public void user_click_on_the_download_btn() throws InterruptedException {
		Dp_obj.downloadBtn();
	}


	//++++ConfirmFilter_ExceptCases

	@Given("user is on filter page  and select perform action Confirm from drop down")
	public void user_is_on_filter_page_and_select_perform_action_confirm_from_drop_down() throws InterruptedException {
		Dp_obj.addExceptConfirm();
	}
	//++++ApproveFilter_ExceptCases	

	@Then("add cases to Except")
	public void add_cases_to_except() throws InterruptedException {
		Dp_obj.addExceptApprove();
	}

	//++++DownloadFilter_ExceptCases


	@Given("user is on filter page  and select perform  action Download from drop down")
	public void user_is_on_filter_page_and_select_perform_action_download_from_drop_down() throws InterruptedException {
		Dp_obj.GenericCall();
	}




	/************
	 * show no of cases per page StepDefinations********************
	 */

	@Given(": User is on for admin review page and click show number of entries per page")
	public void user_is_on_for_admin_review_page_and_click_show_number_of_entries_per_page() {
		Dp_obj.showNoCasePerPage();
	}


	/*************
	 * For Reject Action StepDefinations********************
	 */

	@Given("user ckeck the select all cases check box for Reject")
	public void user_ckeck_the_select_all_cases_check_box_for_reject() {
		Dp_obj.checkCheckBox();
	}
	@Then("user click on the Reject butten")
	public void user_click_on_the_reject_butten() throws InterruptedException {
		Dp_obj.clickOnReject();
	}
	@Then("user add reason to as massage")
	public void user_add_reason_to_as_massage() {
		Dp_obj.inputReason();
	}
	@Then("user click on the Apply btn")
	public void user_click_on_the_apply_btn() {
		Dp_obj.clickOnApply();
	}

	/*****************%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * @AddCaseCsvToReject
	 */

	@Then("user add the .csv file to upload in dashboard")
	public void user_add_the_csv_file_to_upload_in_dashboard() {
		Dp_obj.addCsvFile();
	}


	//@RejectAll

	@Given("user select {int} cases from dropdown the select all cases check box for Reject")
	public void user_select_cases_from_dropdown_the_select_all_cases_check_box_for_reject(Integer int1) throws InterruptedException {
		Dp_obj.rejectAll();
	}

	/*************
	 * For Approve Action StepDefinations********************
	 */

	@Then("user ckecked the select all cases to Approve check box")
	public void user_ckecked_the_select_all_cases_to_approve_check_box() {
		Dp_obj.ApproveSelAll();
	}
	@Then("Select Arbitrater from the dropdown As {string}")
	public void select_arbitrater_from_the_dropdown_as(String string) {
		Dp_obj.ArbriDropSel();
	}
	@Then("click on Approve btn")
	public void click_on_approve_btn() {
		Dp_obj.ApproveClick();
	}
	@Then("click on the Preview Btn")
	public void click_on_the_preview_btn() {
		Dp_obj.preview();
	}
	@Then("click on final Approve btn")
	public void click_on_final_approve_btn() {
		Dp_obj.FinalApprove();
	}
	@Then("click on close btn")
	public void click_on_close_btn() throws InterruptedException {
		Dp_obj.closeApp();
	}


	/*********
	 * without selecting any Arbitrator StepDefinations********
	 */

	@Given("without selecting any Arbitrator click on Approve btn")
	public void without_selecting_any_arbitrator_click_on_approve_btn() {
		Dp_obj.withoutArbSelclick();
	}

	/*********
	 * for Download StepDefinations********
	 */
	@Then("Select all cases to download")
	public void select_all_cases_to_download() {
		Dp_obj.selAllDownload();
	}
	@Then("click on download btn")
	public void click_on_download_btn() {
		Dp_obj.clickOnDownload();
	}


	// End to End Actions 




	@Then("user login on arbitrator dashboard url as {string}")
	public void user_login_on_arbitrator_dashboard_url_as(String string) {
		Dp_obj.newWindow(string);
	}


	@Then("user logged using uName as {string} and passwoed as {string} and click on logged in")
	public void user_logged_using_u_name_as_and_passwoed_as_and_click_on_logged_in(String string, String string2) throws InterruptedException {
		Dp_obj.arbaccept(string, string2);
	}


}






