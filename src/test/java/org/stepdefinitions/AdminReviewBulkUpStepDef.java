package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.AdminReviewBulkUp;

import io.cucumber.java.en.*;

public class AdminReviewBulkUpStepDef {
	private AdminReviewBulkUp BulUp_obj= new AdminReviewBulkUp(DriverFactory.getDriver());

	/***************
	 * Upload Csv ----- --Bulk upload
	 ***************/
	@Given("User is ready to take action as bulk uploade and click on bulk upload")
	public void user_is_ready_to_take_action_as_bulk_uploade_and_click_on_bulk_upload() {
		BulUp_obj.clickBulk();
	}

	@Then("user select action as Case.csv  from drop down")
	public void user_select_action_as_case_csv_from_drop_down() {
		BulUp_obj.selectCsv();
	}

	@Then("user enter the batch name")
	public void user_enter_the_batch_name() {
		BulUp_obj.batchName();
	}

	@Then("user select the claimant from drop down list")
	public void user_select_the_claimant_from_drop_down_list() {
		BulUp_obj.selClaimant();
	}

	@Then("user add the .csv file to upload")
	public void user_add_the_csv_file_to_upload() {
		BulUp_obj.addCsvFile();
	}

	@Then("user click on the CsvSubmit btn")
	public void user_click_on_the_csv_submit_btn() {
		BulUp_obj.submitAndClose();
	}
	@Then("user click on the CsvConfirm  btn")
	public void user_click_on_the_csv_confirm_btn() throws InterruptedException {
		BulUp_obj.confirmCsvClick();
	}
	@Then("then user finally click on the Csvclose btn")
	public void then_user_finally_click_on_the_csvclose_btn() throws InterruptedException {
		BulUp_obj.closeClickCsv();
	}





	/***************
	 * Interim Order ----- --Bulk upload
	 ***************/

	@Then("user select action as  Interim Order  from drop down")
	public void user_select_action_as_interim_order_from_drop_down() {

		BulUp_obj.interimSel();
	}
	@Then("user add the file as Interimorder.zip format")
	public void user_add_the_file_as_interimorder_zip_format() {
		BulUp_obj.selectIntFile();
	}
	@Then("user click on the upload document btn")
	public void user_click_on_the_upload_document_btn() {
		BulUp_obj.uploadInt();

	}

	@Then("user click on the Interimclose btn")
	public void user_click_on_the_interimclose_btn() {
		BulUp_obj.interimClose();
	}

	/***************
	 * .ZIP SOC ----- --Bulk upload
	 ***************/

	@Then("user select action as  .ZIP SOC from drop down")
	public void user_select_action_as_zip_soc_from_drop_down() {
		BulUp_obj.zipSocAct();
	}
	@Then("user click on the Claim ZIP input box to upload claim.zip")
	public void user_click_on_the_claim_zip_input_box_to_upload_claim_zip() {
		BulUp_obj.uploadClaim();
	}
	@Then("user click on the Supporting ZIP input box to upload Supporting ZIP")
	public void user_click_on_the_supporting_zip_input_box_to_upload_supporting_zip() {
		BulUp_obj.uploadSupport();
	}
	@Then("user click on on upload btn")
	public void user_click_on_on_upload_btn() {
		BulUp_obj.socUpload();
	}

	@Then("user click on the confirm btn and then close btn")
	public void user_click_on_the_confirm_btn_and_then_close_btn() {
		BulUp_obj.socConfClose();
	}




}
