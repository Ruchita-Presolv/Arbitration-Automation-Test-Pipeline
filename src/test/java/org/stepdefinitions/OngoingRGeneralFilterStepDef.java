package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.OngoingRandomGeneralFilter;

import io.cucumber.java.en.*;

public class OngoingRGeneralFilterStepDef {
	OngoingRandomGeneralFilter O_Ran_GenObj= new OngoingRandomGeneralFilter(DriverFactory.getDriver());




	// Case .Csv Upload 

	@Given("user select the action Case .csv")
	public void user_select_the_action_case_csv() throws InterruptedException {
		O_Ran_GenObj.caseCsvSel();
	}
	@Then("user click on the batch name and add batch name")
	public void user_click_on_the_batch_name_and_add_batch_name() {
		O_Ran_GenObj.batchName();
	}
	@Then("user select the user name as Presolv User via Bombay Blokes")
	public void user_select_the_user_name_as_presolv_user_via_bombay_blokes() {
		O_Ran_GenObj.claimantName();
	}
	@Then("user select the case .csv file to uplad and click on the upload btn")
	public void user_select_the_case_csv_file_to_uplad_and_click_on_the_upload_btn() {
		O_Ran_GenObj.addCsvFile();
	}
	@When("user see the confirm btn then he  click on confirm btn  and finally click on close btn")
	public void user_see_the_confirm_btn_then_he_click_on_confirm_btn_and_finally_click_on_close_btn() throws InterruptedException {
		O_Ran_GenObj.confirmCsvClick();
	}


	//Contact hide 


	@Then("user select the user name as Presolv User via Bombay Blokes1")
	public void user_select_the_user_name_as_presolv_user_via_bombay_blokes1() {
		O_Ran_GenObj.claimantNameContactHide();
	}



	// zip Soc


	@Given("user select the .ZIP SOC")
	public void user_select_the_zip_soc() throws InterruptedException {
		O_Ran_GenObj.selZipSoc();
	}
	@Given("user select the file for claim")
	public void user_select_the_file_for_claim() {
		O_Ran_GenObj.claimSel();
	}

	@Then("user select the file for support and click on upload btn")
	public void user_select_the_file_for_support_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.supportSel();
	}

	@Then("user click on confirm btn and verify success massage and click on close btn")
	public void user_click_on_confirm_btn_and_verify_success_massage_and_click_on_close_btn() throws InterruptedException {
		O_Ran_GenObj.confirmCsvClick();
	}


	//Interim Order

	@Given("user select the InterimOrder . zip")
	public void user_select_the_interim_order_zip() throws InterruptedException {
		O_Ran_GenObj.interiumOrderSel();
	}
	@Given("user select file as interimorder to upload and click on upload btn")
	public void user_select_file_as_interimorder_to_upload_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.interiumOrderfile();
	}


	//Award

	@Given("user select the upload Award")
	public void user_select_the_upload_award() throws InterruptedException {
		O_Ran_GenObj.awardSel();   
	}
	@Given("user select file  as Award.zip and click on upload btn")
	public void user_select_file_as_award_zip_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.awardFileUpload();
	}


	//Additional Doc


	@Given("user select the upload AdditionalDoc")
	public void user_select_the_upload_additional_doc() throws InterruptedException {
		O_Ran_GenObj.additionalDocSel();
	}
	@Then("user click on Upload Additional Doc .CSV and select file")
	public void user_click_on_upload_additional_doc_csv_and_select_file() {
		O_Ran_GenObj.additionalCsv();
	}
	@Then("also user click on Upload Additional Doc .ZIP and select file and click on upload btn")
	public void also_user_click_on_upload_additional_doc_zip_and_select_file_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.additionalPdf();
	}


	//Courier Csv

	@Given("user select Courier .CSV")
	public void user_select_courier_csv() throws InterruptedException {
		O_Ran_GenObj.courierCsvSel();
	}


	//	@Given("user select the file type as {string}")
	//	public void user_select_the_file_type_as(String string) throws InterruptedException {
	//
	//	}

	@Given("user select the file type as NOA to SOC_Dispatch proof")
	public void user_select_the_file_type_as_noa_to_soc_dispatch_proof() throws InterruptedException {
		O_Ran_GenObj.typeFileN1(); 
	}




	@Given("user select the file type as NOA to SOC_Tracking")
	public void user_select_the_file_type_as_noa_to_soc_tracking() throws InterruptedException {
		O_Ran_GenObj.sOC_Tracking();
	}



	@Given("user select the file type as Award_Dispatch proof")
	public void user_select_the_file_type_as_award_dispatch_proof() throws InterruptedException {
		O_Ran_GenObj.award_Dispatch_proof();
	}



	@Given("user select the file type as Award_Tracking")
	public void user_select_the_file_type_as_award_tracking() throws InterruptedException {
		O_Ran_GenObj.award_Tracking();

	}





	@Given("then user add file to upload as Courier .CSV and click on upload btn")
	public void then_user_add_file_to_upload_as_courier_csv_and_click_on_upload_btn() throws InterruptedException {

		O_Ran_GenObj.courierCsvFileUpload();
	}

	// Courier Zip


	@Given("user click ZipCourier")
	public void user_click_zip_courier() throws InterruptedException {
		O_Ran_GenObj.zipCourierSel();
	}
	@Given("user add file to upload as Zip courier and click on upload btn")
	public void user_add_file_to_upload_as_zip_courier_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.award_Tracking();
		O_Ran_GenObj.zipCourierFileUpload();
	}


	// add proof to upload 



	@When("user click on yes radio button")
	public void user_click_on_yes_radio_button() throws InterruptedException {
		O_Ran_GenObj.radioBtnProof();
	}
	@When("then user add file to upload as Courier .CSV")
	public void then_user_add_file_to_upload_as_courier_csv() {
		O_Ran_GenObj.uploadCsvFile();
	}
	@Then("user add pdf file as a proof and click on upload btn")
	public void user_add_pdf_file_as_a_proof_and_click_on_upload_btn() throws InterruptedException {
		O_Ran_GenObj.uploadProof();
	}







































	// upload case csv


	@Given("user select action  Case.csv  from the given option")
	public void user_select_action_case_csv_from_the_given_option() {
		O_Ran_GenObj.selCaseCsv();
	}
	@Given("user click on batch name and enter the batch name")
	public void user_click_on_batch_name_and_enter_the_batch_name() {
		O_Ran_GenObj.batchName();
	}
	@Then("user click on the CsvUpload btn")
	public void user_click_on_the_csv_upload_btn() {
		O_Ran_GenObj.uploadCsvBtn();
	}


	@Given("User is on ongoing page and ready to take action as bulk uploade and click on bulk upload")
	public void user_is_on_ongoing_page_and_ready_to_take_action_as_bulk_uploade_and_click_on_bulk_upload() {
		O_Ran_GenObj.ongoingBulkUp();
	}

	@Given("user select action  Case.csv  from drop down")
	public void user_select_action_case_csv_from_drop_down() {
		O_Ran_GenObj.selCaseCsv();
	}

	@Then("user select action .ZIP SOC from drop down")
	public void user_select_action_zip_soc_from_drop_down() throws InterruptedException {
		O_Ran_GenObj.selZipSoc();
	}

	/***********************
	 * Upload Interim Order  StepDef
	 */

	@Given("user select action as Interim Order from drop down")
	public void user_select_action_as_interim_order_from_drop_down() {
		O_Ran_GenObj.selInterim();
	}
	@Given("user selet file InterimOrder . zip to upload")
	public void user_selet_file_interim_order_zip_to_upload() {
		O_Ran_GenObj.uploadInterimZip();
	}
	@Then("user click on the uploadZip btn")
	public void user_click_on_the_upload_zip_btn() {
		O_Ran_GenObj.intUpload();
	}
	@Then("user click on the ZipClose btn")
	public void user_click_on_the_zip_close_btn() {
		O_Ran_GenObj.intClose();
	}

	/***********************
	 * Upload Courier.csv  StepDef
	 */

	@Given("user select action as  Courier.csv  from drop down")
	public void user_select_action_as_courier_csv_from_drop_down() {
		O_Ran_GenObj.CourierCsv();
	}
	@Given("user enters the file name \\(Optional)")
	public void user_enters_the_file_name_optional() {
		O_Ran_GenObj.typeFileN();
	}
	@Then("user select the file as Courier.csvFile to upload")
	public void user_select_the_file_as_courier_csv_file_to_upload() {
		O_Ran_GenObj.selCourierCsv();
	}
	@Then("User click on the Upload btn")
	public void user_click_on_the_upload_btn() {
		O_Ran_GenObj.uploadBtn();
	}
	@Then("user click on the Confirm btn")
	public void user_click_on_the_confirm_btn() {
		O_Ran_GenObj.confirmBtn();
	}
	@Then("user click on the final Close btn")
	public void user_click_on_the_final_close_btn() {
		O_Ran_GenObj.closebtn();
	}

	/***********************
	 * Upload ZipCourier  StepDef
	 */


	@Given("user select action as  ZipCourier  from drop down")
	public void user_select_action_as_zip_courier_from_drop_down() {
		O_Ran_GenObj.ZipCourier();
	}


	@Given("user enters the  type file name \\(Optional)")
	public void user_enters_the_type_file_name_optional() {
		O_Ran_GenObj.typeFilename();
	}

	@Then("user select the file as ZipCourier File to upload")
	public void user_select_the_file_as_zip_courier_file_to_upload() {
		O_Ran_GenObj.selZipCourierFile();
	}


	@Then("User click on the ZipUpload btn")
	public void user_click_on_the_zip_upload_btn() {
		O_Ran_GenObj.zipUpload();
	}

	@Then("user click on the  ZipUpload Confirm btn")
	public void user_click_on_the_zip_upload_confirm_btn() throws InterruptedException {
		O_Ran_GenObj.zipConfirm();
	}
	@Then("user click on the final ZipUploadClose btn")
	public void user_click_on_the_final_zip_upload_close_btn() {
		O_Ran_GenObj.zipClose();
	}




	/***********************
	 * Upload Award  StepDef
	 */
	@Given("user select action as Award  from drop down")
	public void user_select_action_as_award_from_drop_down() {
		O_Ran_GenObj.awardsel();
	}
	@Given("user select file as Award to upload")
	public void user_select_file_as_award_to_upload() {
		O_Ran_GenObj.selAward();
	}
	@Then("user click on the uploadAward btn")
	public void user_click_on_the_upload_award_btn() {
		O_Ran_GenObj.awardUpload();
	}
	@Then("user click on the AClose")
	public void user_click_on_the_a_close() {
		O_Ran_GenObj.awardClose();
	}

	/***********************
	 * AdditionalDoc  StepDef
	 */

	@Given("user select action as  AdditionalDoc  from drop down")
	public void user_select_action_as_additional_doc_from_drop_down() {
		O_Ran_GenObj.AdditionalDoc();
	}
	@Then("user select the file as AdditionalDoc File to upload")
	public void user_select_the_file_as_additional_doc_file_to_upload() {
		O_Ran_GenObj.selAddDocFile();
	}
	@Then("User click on the AdditionalUpload btn")
	public void user_click_on_the_additional_upload_btn() {
		O_Ran_GenObj.uploadAdd();
	}
	@Then("user click on the AdditionalDoc Close btn")
	public void user_click_on_the_additional_doc_close_btn() {
		O_Ran_GenObj.closeAdd();
	}

	/***********************
	 * Update Batch name  StepDef
	 * @throws InterruptedException 
	 */

	@Given("user is on the ongoing page and refresh the page")
	public void user_is_on_the_ongoing_page_and_refresh_the_page() throws InterruptedException {
		O_Ran_GenObj.pageRefresh();
	}
	@Then("user select the batch from filter and click on the search btn")
	public void user_select_the_batch_from_filter_and_click_on_the_search_btn() throws InterruptedException {
		O_Ran_GenObj.batchsel();
	}
	@Then("user select all cases of particular batch to rename")
	public void user_select_all_cases_of_particular_batch_to_rename() throws InterruptedException {
		O_Ran_GenObj.selAllCaseinThisBatch();
	}

	@Then("user click on the bulk Action	Tab")
	public void user_click_on_the_bulk_action_tab() throws InterruptedException {
		O_Ran_GenObj.selFilterGen();  
	}



	@Then("user select action as Update batch name")
	public void user_select_action_as_update_batch_name() throws InterruptedException {
		O_Ran_GenObj.selActionUpBatchName();
	}
	@Then("user add new batch name and click on the submit btn")
	public void user_add_new_batch_name_and_click_on_the_submit_btn() throws InterruptedException {
		O_Ran_GenObj.addNewName();
	}
	@Then("user verify the success message and click on the close btn")
	public void user_verify_the_success_message_and_click_on_the_close_btn() throws InterruptedException {

	}




}
