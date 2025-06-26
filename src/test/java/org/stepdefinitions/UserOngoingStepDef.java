package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.UserOngoing;

import io.cucumber.java.en.*;


public class UserOngoingStepDef {
	UserOngoing user_ong_obj= new UserOngoing(DriverFactory.getDriver());

	/*
	 * Claimant din
	 */


	/*
	 * @Then("user on home page and click on  the Arbitration360 btn") public void
	 * user_on_home_page_and_click_on_the_arbitration360_btn() {
	 * user_ong_obj.arbitration360btn(); }
	 */

	//===================
	@Given("user is on ongoing page and select first case and click on Select Application and user select application as {string}")
	public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as(String string) {
		user_ong_obj.selectApplication(string);
	}
	@Then("user click on send application")
	public void user_click_on_send_application() {
		user_ong_obj.sendApplication();
	}
	@Then("click on preview btn and click on send application btn")
	public void click_on_preview_btn_and_click_on_send_application_btn() {
		user_ong_obj.previewApplication();
	}
	@When("user see the success massage then user click on close btn")
	public void user_see_the_success_massage_then_user_click_on_close_btn() throws InterruptedException {
		user_ong_obj.finalStatus();
	}

//applicationforAdditionalEvidence
@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for oral hearing")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_oral_hearing() {
	user_ong_obj.claimantApplicationfororalhearing();
}


//claimantIntimationregardingfailureofsettlement

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Intimation regarding failure of settlement")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_intimation_regarding_failure_of_settlement() {
	user_ong_obj.claimantIntimationregardingfailureofsettlement();
}


//Claimant: Application for additional evidence

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for additional evidence")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_additional_evidence() {
	user_ong_obj.applicationforadditionalevidence();
}
@Then("user uploade file here")
public void user_uploade_file_here() throws InterruptedException {
	user_ong_obj.selectFile();
}


@Then("click on preview btn and then click on send application btn")
public void click_on_preview_btn_and_then_click_on_send_application_btn() throws InterruptedException {
	user_ong_obj.previewAddDoc();
}



//ClaimantApplicationforExtensionSOC

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Extension - SOC")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_extension_soc() {
	user_ong_obj.claimantApplicationforExtensionSOC();
}





@Then("user enter the reason for extention as {string} and no of days as {string}")
public void user_enter_the_reason_for_extention_as_and_no_of_days_as(String string, String string2) {
	user_ong_obj.addReasonAndTime(string, string2);
}


@Then("click on preview btn and then click on send application for soc btn")
public void click_on_preview_btn_and_then_click_on_send_application_for_soc_btn() throws InterruptedException {
	user_ong_obj.previewSocDoc();
}


//@ClaimantApplicationforExtensionFileRejoinder
@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Extension File Rejoinder")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_extension_file_rejoinder() {
	user_ong_obj.claimantApplicationforExtensionFileRejoinder();
}

//ClaimantApplicationforextensiontofileReply

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for extension to file Reply")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_extension_to_file_reply() {
	user_ong_obj.claimantApplicationforextensiontofileReply();
}

//@ClaimantApplicationforWithdrawal


@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Withdrawal")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_withdrawal() {
	user_ong_obj.claimantApplicationforWithdrawal();
}
@Then("user enter the reason for extention as {string}")
public void user_enter_the_reason_for_extention_as(String string) throws InterruptedException {
	user_ong_obj.withdrawReason(string);
}

//ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Withdrawal with Liberty to file fresh proceedings")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_for_withdrawal_with_liberty_to_file_fresh_proceedings() {
	user_ong_obj.claimantApplicationforWithdrawalwithLibertytofilefreshproceedings();
}

//Claimant: Application seeking time on account of settlement

@Given("user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application seeking time on account of settlement")
public void user_is_on_ongoing_page_and_select_first_case_and_click_on_select_application_and_user_select_application_as_claimant_application_seeking_time_on_account_of_settlement() {
	user_ong_obj.claimantApplicationseekingtimeonaccountofsettlement();
}


//other


@Given("user is on ongoing page and click on Other")
public void user_is_on_ongoing_page_and_click_on_other() {
	user_ong_obj.otherDoc();
}
@Then("user select document to upload and click on submit btn")
public void user_select_document_to_upload_and_click_on_submit_btn() throws InterruptedException {
	user_ong_obj.uploadOtherDoc();
}
@When("user see the success massege then user click on close btn")
public void user_see_the_success_massege_then_user_click_on_close_btn() throws InterruptedException {
	user_ong_obj.otherSuccessMass();
}


//@ArbitratorDisclosure

@Given("user is on ongoing page and then click on ArbitratorOne")
public void user_is_on_ongoing_page_and_then_click_on_arbitrator_one() throws InterruptedException {
	user_ong_obj.arbOnebtn();
}
@Then("user verify that user able to see the disclosure and also able to download or not")
public void user_verify_that_user_able_to_see_the_disclosure_and_also_able_to_download_or_not() throws InterruptedException {
	user_ong_obj.downloadDis();
}



/*
 * //
 * 
 * Bulk Actions
 * 
 * //
 */

/*
 * Send Application
 */

@Given("user is on ongoing page and then click on general filter")
public void user_is_on_ongoing_page_and_then_click_on_general_filter() throws InterruptedException {
	user_ong_obj.generalFilterbtn();
}
@Then("user add cases in from and to")
public void user_add_cases_in_from_and_to() throws InterruptedException {
	user_ong_obj.fromToInput();
}


@Then("user click on select application as {string}")
public void user_click_on_select_application_as(String string) {
	user_ong_obj.selectAppBulk(string);
}
@Then("user click on the Bulk action and click on send application")
public void user_click_on_the_bulk_action_and_click_on_send_application() throws InterruptedException {
	user_ong_obj.bulkActBtn();
}

// Excluding cases pop up 

@When("user see the Do you want to proceed pop up then user select as including exclude cases")
public void user_see_the_do_you_want_to_proceed_pop_up_then_user_select_as_including_exclude_cases() throws InterruptedException {
	user_ong_obj.includingCases();
}


//Including Hold Cases

@When("user see the pause case pop up then he select includind hold cases")
public void user_see_the_pause_case_pop_up_then_he_select_includind_hold_cases() {
	user_ong_obj.includingHoldC();  
}



//claimant din bulk send application 


@Then("user click on select application as Claimant  din")
public void user_click_on_select_application_as_claimant_din() throws InterruptedException {
	user_ong_obj.claimantDinBulkAct();
}

/*
 * # =================Genaral case filter====Add cases to Except ==========
 */
@Then("user add cases to except")
public void user_add_cases_to_except() {
	user_ong_obj.addCasesToExcept();
}

//Bulk Action


@Then("user click on bulk action and select other application")
public void user_click_on_bulk_action_and_select_other_application() {
	user_ong_obj.bulkApplicationbtn();
}


@Then("user click on submit btn")
public void user_click_on_submit_btn() {
	user_ong_obj.uploadAddSubmitBtn();
}


@When("user see the success massage for bulk actions  then user click on close btn")
public void user_see_the_success_massage_for_bulk_actions_then_user_click_on_close_btn() throws InterruptedException {
	user_ong_obj.bulkActSuccessMass();
}

//Bulk upload other application


@Then("user click on bulk action and select upload bulk other application")
public void user_click_on_bulk_action_and_select_upload_bulk_other_application() {
	user_ong_obj.otherAppBulk();
}
@Then("user add file to upload and click on upload btn")
public void user_add_file_to_upload_and_click_on_upload_btn() throws InterruptedException {
	user_ong_obj.upFile();
}
@Then("user click on confirm btn and verify the success massage and click on close")
public void user_click_on_confirm_btn_and_verify_the_success_massage_and_click_on_close() {
	user_ong_obj.otherBulkSuccessMass();
}

//Export to excel

@Then("user click on bulk action and select Export to excel")
public void user_click_on_bulk_action_and_select_export_to_excel() throws InterruptedException {
	user_ong_obj.exportToExcel(); 
}



//Downloads document


@Then("user click on bulk action and select Download  Documents")
public void user_click_on_bulk_action_and_select_download_documents() {
   
}

/*
 * Randon case Filter
 * 
 */


@Given("user is on ongoing page and then click on Random case filter")
public void user_is_on_ongoing_page_and_then_click_on_random_case_filter() throws InterruptedException {
	user_ong_obj.randomFilterBtn();
}


@Then("user add cases to the random input field")
public void user_add_cases_to_the_random_input_field() {
	user_ong_obj.addCasesToRandomFil();
}







}
