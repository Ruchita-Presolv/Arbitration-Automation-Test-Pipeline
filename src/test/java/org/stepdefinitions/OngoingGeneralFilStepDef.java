package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.OngoingGeneralFilAct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OngoingGeneralFilStepDef {
	OngoingGeneralFilAct O_GenFil_obj= new OngoingGeneralFilAct(DriverFactory.getDriver());


	/***********************
	 * General filter without Except cases StepDef
	 * 
	 ***************/

	@When("user select general case filter")
	public void user_select_general_case_filter()  {
		O_GenFil_obj.generalFilSel();
	}
	@Then("user see from to input window and click on the from and select case")
	public void user_see_from_to_input_window_and_click_on_the_from_and_select_case() throws InterruptedException {
		O_GenFil_obj.addcCasesFrom();
	}
	@Then("user click on the To and select case")
	public void user_click_on_the_to_and_select_case() throws InterruptedException {
		O_GenFil_obj.addCaseTo();
	}

	@Then("user click on the bulk Action")
	public void user_click_on_the_bulk_upload() {
		O_GenFil_obj.bulkUpClick();
	}


	// Actions 
	// 1] Bulk Close
	@Given("user add cases in filter and  select action as Bulk Close")
	public void user_add_cases_in_filter_and_select_action_as_bulk_close() {
		O_GenFil_obj.bulkClose();

	}
	@Then("User add reason for close and Apply")
	public void user_add_reason_for_close_and_apply() throws InterruptedException {
		O_GenFil_obj.addReason();
	}
	@Then("user close the BulkClose case")
	public void user_close_the_bulk_close_case() throws InterruptedException {
		O_GenFil_obj.finalBClose();

	}

	// 2] Bulk Withdraw 

	@Given("user add cases in filter and  select action as Bulk Withdraw")
	public void user_add_cases_in_filter_and_select_action_as_bulk_withdraw() {
		O_GenFil_obj.bulkWithdraw();
	}

	// 3] Additional Doc Upload 


	@Given("user add cases in filter and  select action as Upload Additional Doc")
	public void user_add_cases_in_filter_and_select_action_as_upload_additional_doc() throws InterruptedException {
		O_GenFil_obj.addDoc();
	}
	@Then("user select additional document to upload")
	public void user_select_additional_document_to_upload() {
		O_GenFil_obj.selAddDocFile();
	}
	@Then("user click the submit btn")
	public void user_click_the_submit_btn() {
		O_GenFil_obj.additionalDocSubmit();
	}
	@When("user see the uploaded process completed the user click on the close")
	public void user_see_the_uploaded_process_completed_the_user_click_on_the_close() {
		O_GenFil_obj.additionalClose();
	}

	//4 Download Award Sheet

	@Given("user add cases in filter and  select action as Download Award Sheet")
	public void user_add_cases_in_filter_and_select_action_as_download_award_sheet() throws InterruptedException {
		O_GenFil_obj.downloadAwardSheet();
	}

	// 5 Download Documents
	// 1] @ Notice of arbitration

	@Given("user select action as Download Documents")
	public void user_select_action_as_download_documents() throws InterruptedException {
		O_GenFil_obj.downloadActSel();
	}
	@Given("user select the  Notice of arbitration to download")
	public void user_select_the_notice_of_arbitration_to_download() {
		O_GenFil_obj.noticeOfArbSel();
	}
	@Then("user click on the Docdownload btn")
	public void user_click_on_the_docdownload_btn() {
		O_GenFil_obj.downloadClick();
	}
	@Then("user verify the success massage and user click on the ok btn")
	public void user_verify_the_success_massage_and_user_click_on_the_ok_btn() throws InterruptedException {
		O_GenFil_obj.statusOkBtn1();
	}

	//Cover letter pop up


	@When("user see the pop up then he click on download with cover letter")
	public void user_see_the_pop_up_then_he_click_on_download_with_cover_letter() throws InterruptedException {
		O_GenFil_obj.downloadWithCover();
	}


	@When("user see the pop up then he click on download without cover letter")
	public void user_see_the_pop_up_then_he_click_on_download_without_cover_letter() throws InterruptedException {
		O_GenFil_obj.downloadWithoutCover();
	}




	// 2]  @Arbitrator Consent

	@Given("user select the   Arbitrator Consent to download")
	public void user_select_the_arbitrator_consent_to_download() {
		O_GenFil_obj.arbConcent();
	}

	// 3]  @Statement of claim 
	@Given("user select the   Statement of claim to download")
	public void user_select_the_statement_of_claim_to_download() {
		O_GenFil_obj.statementOfClaim();
	}

	// 4]  @Direction by arbtrator
	@Given("user select the   Direction by arbtrator to download")
	public void user_select_the_direction_by_arbtrator_to_download() {
		O_GenFil_obj.directionByArbtrator();
	}

	// 5]  @Application to download
	@Given("user select the   Application to download")
	public void user_select_the_application_to_download() {
		O_GenFil_obj.applicationToDownload();
	}

	// 6]  @Award or Interm order

	@Given("user select the Award or Interm order by arbtrator to download")
	public void user_select_the_award_or_interm_order_by_arbtrator_to_download() {
		O_GenFil_obj.awardOrIntermOrder();
	}

	// 7] @Additonal documents
	@Given("user select the Additonal documents to download")
	public void user_select_the_additonal_documents_to_download() {
		O_GenFil_obj.additonaldocuments();
	}

	// 8] @Award delevery report
	@Given("user select the  Award delevery report to download")
	public void user_select_the_award_delevery_report_to_download() {
		O_GenFil_obj.awardDeleveryReport();
	}

	// 9] @Party reply
	@Given("user select the   Party reply to download")
	public void user_select_the_party_reply_to_download() throws InterruptedException {
		O_GenFil_obj.partyReply();

	}

	// 10] @DownloadAll document

	@Then("user click on the downloadAll btn")
	public void user_click_on_the_download_all_btn() throws InterruptedException {
		O_GenFil_obj.downloadAllDocument();
	}

	// 11] @Random Document download 

	@Given("user select Random  document  to download")
	public void user_select_random_document_to_download() {
		O_GenFil_obj.randomDocumentDownload();
	}

	// 12] @close btn

	@Then("user click on the Close btn")
	public void user_click_on_the_close_btn() {
		O_GenFil_obj.closeBtnClick();
	}


	/*****************************************************************************
	 * 4) select cases by using from to filter and add cases in except 
	 * @throws InterruptedException 
	 *   @StepDefinations 
	 ************************************/

	// Actions 



	@Then("user here add cases in except input box")
	public void user_here_add_cases_in_except_input_box() throws InterruptedException {
		O_GenFil_obj.exceptAddCases();
	}

	/*****************************************************************************
	 * 5) select Single cases by using from to filter  
	 * 
	 *   StepDefinations 
	 * @throws InterruptedException 
	 ************************************/


	@Then("user select single case and take action")
	public void user_select_single_case_and_take_action() throws InterruptedException {
		O_GenFil_obj.singleCaseSelect();
	}

	/*****************************************************************************
	 * 6) user select single case and add same case in except and take action  
	 * 
	 *   StepDefinations 
	 * @throws InterruptedException 
	 ************************************/


	@Given("select single case and add same case in except and take action")
	public void select_single_case_and_add_same_case_in_except_and_take_action() throws InterruptedException {
		O_GenFil_obj.noCaseSelect();
	}



	@Then("select action as Bulk Close and then verify the massage")
	public void select_action_as_bulk_close_and_then_verify_the_massage() {
		O_GenFil_obj.verifyerrorMass();
	}

	/*****************************************************************************
	 *  7] if user select cases from platform and also click on 
	 *     input box then unselect the cases  selected before   
	 *   StepDefinations 
	 * 
	 ************************************/

	@Given("user already apply the filter and also select the case on the platform")
	public void user_already_apply_the_filter_and_also_select_the_case_on_the_platform() {
		O_GenFil_obj.iterateSelCaseCheckBox();
	}
	@Then("user check the previous selection is change or not")
	public void user_check_the_previous_selection_is_change_or_not() {

	}
	@Then("user perform action like Download Award Sheet")
	public void user_perform_action_like_download_award_sheet() {

	}


}
