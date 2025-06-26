package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.OngoingPage;

//import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.*;

public class OngoingStepDef {
	OngoingPage Ongoing_ob = new OngoingPage(DriverFactory.getDriver());

	/******
	 * Upload AdditionalDoc StepDefination
	 *******/
	@Then("user click on the Ongoing tab")
	public void user_click_on_the_ongoing_tab(){
		Ongoing_ob.ongoingTab();
	}
	@Given("user in on ongoing page and verify the title as {string}")
	public void user_in_on_ongoing_page_and_verify_the_title_as(String title) {
		Ongoing_ob.verifyPageTitle(title);
	}
	@Then("user select first case and upload additional doc")
	public void user_selet_first_case_and_upload_additional_doc() {
		Ongoing_ob.uploadAddDoc();
	}

	/******
	 * Single case Withdraw StepDefination
	 *******/

	@Given("user is on ongoing page and select single case to perform withdraw action")
	public void user_is_on_ongoing_page_and_select_single_case_to_perform_withdraw_action() {
		Ongoing_ob.ongoingTab();
	}
	@Given("user click on withdraw perticular selected case")
	public void user_click_on_withdraw_perticular_selected_case() {
		Ongoing_ob.withdrawAction();
	}

	/******
	 * Single case  Various Actions  Locaters & pageMethod 
	 * RefrenceId Update 
	 *******/


	@Given("user is on ongoing page and click on the Action btn and select single case")
	public void user_is_on_ongoing_page_and_click_on_the_action_btn_and_select_single_case() {
		Ongoing_ob.selCase();
	}
	@Given("user capture previous RefId and select action as Update Refrence ID")
	public void user_capture_previous_ref_id_and_select_action_as_update_refrence_id() {
		Ongoing_ob.selRefIdUpAction();
	}
	@Then("user user add new refrence id to the selected case and click on the submit btn")
	public void user_user_add_new_refrence_id_to_the_selected_case_and_click_on_the_submit_btn() {
		Ongoing_ob.addNewBatchName();
	}
	@Then("user compare the both ref. id. if both should be different")
	public void user_compare_the_both_ref_id_if_both_should_be_different() throws InterruptedException {
		Ongoing_ob.verifyRefId();
	}


	// Arbitrator log 

	@Given("user is on ongoing page and select single case and click on the Action btn")
	public void user_is_on_ongoing_page_and_select_single_case_and_click_on_the_action_btn() {
		Ongoing_ob.selectCaseAndActionClick();
	}
	@Then("user select action as Arbitrator log")
	public void user_select_action_as_arbitrator_log() {
		Ongoing_ob.selActionArbLog();
	}
	@Then("user should be able to see the Arbitrator Added and date when assign")
	public void user_should_be_able_to_see_the_arbitrator_added_and_date_when_assign() throws InterruptedException {
		Ongoing_ob.checkAssignArb();
		Ongoing_ob.checkAssignDate();
	}
	@Then("user should be  able to close the Arbitrator Log")
	public void user_should_be_able_to_close_the_arbitrator_log() {
		Ongoing_ob.arbLogClose();
	}

	// Assign Arbitrator 

	@Given("user is on ongoing page and select single case and capture old arbitrator name  click on the Action btn")
	public void user_is_on_ongoing_page_and_select_single_case_and_capture_old_arbitrator_name_click_on_the_action_btn() throws InterruptedException {
		Ongoing_ob.oldArbitratorNameActionClick();
	}


	@Then("user select action as Assign Arbitrator")
	public void user_select_action_as_assign_arbitrator() throws InterruptedException {
		Ongoing_ob.assignSelAct();
	}
	@Then("user select the arbitrator from the dropdown list")
	public void user_select_the_arbitrator_from_the_dropdown_list() throws InterruptedException {
		Ongoing_ob.newArbiAdd();
	}
	@Then("user add reason as {string}")
	public void user_add_reason_as(String string) {
		Ongoing_ob.addReason(string);
	}
	@Then("user click on the Assign btn")
	public void user_click_on_the_assign_btn() throws InterruptedException {
		Ongoing_ob.assignClick();
	}
	@Then("user verify that the new arbitrator added successfully or not by compairing previous and new added")
	public void user_verify_that_the_new_arbitrator_added_successfully_or_not_by_compairing_previous_and_new_added() {
		Ongoing_ob.verifyArbiAdd();
	}

	/**************************
	 * Add lowyer 
	 */
	@Then("user select action as Add Lawyer")
	public void user_select_action_as_add_lawyer() throws InterruptedException {
		Ongoing_ob.addlawyer();
	}
	@Then("user enter first name as {string} and last name as {string}")
	public void user_enter_first_name_as_and_last_name_as(String string, String string2) {
		Ongoing_ob.firstLastName(string, string2);
	}
	@Then("user add   Email ID {string} and Moblie No {string} and")
	public void user_add_email_id_and_moblie_no_and(String string, String string2) {
		Ongoing_ob.emailMobileNo(string, string2);
	}
	@Then("user enter Other details as {string}")
	public void user_enter_other_detials_as(String string) throws InterruptedException {
		Ongoing_ob.otherDetails(string);
	}
	@Then("user click on the submit btn")
	public void user_click_on_the_final_btn() {
		Ongoing_ob.submitAddlawyer();
	}
	@Then("verify that Lawyer added successfully or not")
	public void verify_that_lowyer_added_successfully_or_not() throws InterruptedException {
		Ongoing_ob.verifylawyerBtn();
	}

	@Then("user withdraw the same case because its action get change from add Lawyer to view Lawyer\\(update)")
	public void user_withdraw_the_same_case_because_its_action_get_change_from_add_lowyer_to_view_lowyer_update() {
		Ongoing_ob.withdrawAction();
	}


	/***********************************
	 * Delete Lawyer
	 */
	@Then("user delete the lawyer from the selected case id")
	public void user_delete_the_lawyer_from_the_selected_case_id() {

		Ongoing_ob.deleteLawyer();
	}


	/****
	 * Add Lawyer to update submit
	 * @throws InterruptedException 
	 */

	@Then("user click on the Addsubmit btn")
	public void user_click_on_the_addsubmit_btn() throws InterruptedException {
		Ongoing_ob.addLawyerToupdateSubmit();
	}


	/********
	 * Update lawyer details
	 * @throws InterruptedException 
	 */

	@Given("user is on ongoing page select the first case and click on the view lawyer details and update it")
	public void user_is_on_ongoing_page_select_the_first_case_and_click_on_the_view_lawyer_details() throws InterruptedException {
		Ongoing_ob.updateLawyerDetails();
	}

	@Given("user clear the previous Arbitrator details and enter first name as {string} and last name as {string}")
	public void user_clear_the_previous_arbitrator_details_and_enter_first_name_as_and_last_name_as(String string, String string2) throws InterruptedException {
		Ongoing_ob.updateFirstLastName(string, string2);
	}
	@Given("user user clear the previous Arbitrator details and add   Email ID {string} and Moblie No {string} and")
	public void user_user_clear_the_previous_arbitrator_details_and_add_email_id_and_moblie_no_and(String string, String string2) throws InterruptedException {
		Ongoing_ob.updateEmailMobileNo(string, string2);
	}
	@Then("user user clear the previous Arbitrator details and enter Other details as {string}")
	public void user_user_clear_the_previous_arbitrator_details_and_enter_other_details_as(String string) throws InterruptedException {
		Ongoing_ob.updateOtherDetails(string);
	}

	@Then("user click on the update  btn")
	public void user_click_on_the_update_btn() throws InterruptedException {
		Ongoing_ob.updatebtn();
	}

	@Then("verify that updated Lawyer added successfully or not")
	public void verify_that_updated_lawyer_added_successfully_or_not() throws InterruptedException {
		Ongoing_ob.verifyUpdateLawyer();
	}

	/*****************************
	 * Claim Summary
	 * @throws InterruptedException 
	 */


	@Given("user select action as Claim Summary")
	public void user_select_action_as_claim_summary() throws InterruptedException {
		Ongoing_ob.claimSummarysel();
	}
	@Given("user verify it is download successfully and click on the Ok btn")
	public void user_verify_it_is_download_successfully_and_click_on_the_ok_btn() {
		Ongoing_ob.verifySuccessMassOk();
	}

	/*****************************
	 * Upload Party Reply
	 * @throws InterruptedException 
	 */

	@Given("user select action as Upload Party Reply")
	public void user_select_action_as_upload_party_reply() {
		Ongoing_ob.uploadPartyDetails();
	}
	@When("user click on the View Details then pdf should be download to check the case details")
	public void user_click_on_the_view_details_then_pdf_should_be_download_to_check_the_case_details() {
		Ongoing_ob.viewDetailsCase();
	}
	@Then("user add the Party Name as {string}")
	public void user_add_the_party_name_as(String string) {
		Ongoing_ob.partyName(string);
	}
	@Then("user add reply as {string}")
	public void user_add_reply_as(String string) {
		Ongoing_ob.addPartyReply(string);
	}
	@Then("user add  Attachment in party reply")
	public void user_add_attachment_in_party_reply() {
		Ongoing_ob.addAttachment();
	}
	@Then("user click on the party reply submit btn")
	public void user_click_on_the_party_reply_submit_btn() throws InterruptedException {
		Ongoing_ob.partyReplySubmit();
	}



	/*****************************
	 * Edit Party Details
	 * @throws InterruptedException 
	 */


	@Given("user select action as Edit Party Details")
	public void user_select_action_as_edit_party_details() throws InterruptedException {
		Ongoing_ob.editpartyDetailsSelAct();
	}
	@Then("user click on the Add Claimant Party btn")
	public void user_click_on_the_add_claimant_party_btn() throws InterruptedException {
		Ongoing_ob.claimPartyBtn();

	}
	@Then("user ada email Id as {string} and Mobile No as {string}")
	public void user_ada_email_id_as_and_mobile_no_as(String string, String string2) {

		Ongoing_ob.claimantEmailAndMobile(string, string2);

	}
	@Then("user Enter Each Claimants Name,Status as {string}")
	public void user_enter_each_claimants_name_status_as(String string) {
		Ongoing_ob.addClaimantDetails(string);

	}
	@Then("user click on the Add Responding Party btn")
	public void user_click_on_the_add_responding_party_btn() {
		Ongoing_ob.addRespondant();

	}
	@Then("user add email Id as {string} and Mobile No as {string}")
	public void user_add_email_id_as_and_mobile_no_as(String string, String string2) {
		Ongoing_ob.respondantEmailAndMobile(string, string2);

	}

	@Then("user Enter Each Respondent Name,Status as {string}")
	public void user_enter_each_respondent_name_status_as(String string) {
		Ongoing_ob.respondentDetails(string);

	}
	@Then("user click on the Edit Party Details submit btn")
	public void user_click_on_the_edit_party_details_submit_btn() {
		Ongoing_ob.submitEditPDetails();


	}
	@Then("user verify the final update massage and click on the ok btn")
	public void user_verify_the_final_update_massage_and_click_on_the_ok_btn() throws InterruptedException {
		Ongoing_ob.successMassEditParty();
		Thread.sleep(2000);

	}
	@Then("user again go on the ongoing page and select the same case id and click on the case details")
	public void user_again_go_on_the_ongoing_page_and_select_the_same_case_id_and_click_on_the_case_details() {
		Ongoing_ob.compareTheAddedPartyDetails();

	}

	@Then("user verify the other claimant details as per update or not email Id as {string} and Mobile No as {string} Claimants Name,Status as {string}")
	public void user_verify_the_other_claimant_details_as_per_update_or_not_email_id_as_and_mobile_no_as_claimants_name_status_as(String string, String string2, String string3) {
		Ongoing_ob.claimantDetailsVerify(string, string2, string3);
	}
	@Then("user also verify the Other Respondent details as per updated or not email Id as {string} and Mobile No as {string} Respondent Name,Status as {string}")
	public void user_also_verify_the_other_respondent_details_as_per_updated_or_not_email_id_as_and_mobile_no_as_respondent_name_status_as(String string, String string2, String string3) {

	}

	/****************************************
	 * Delete party details added
	 * 
	 */
	@Then("user delete the claimant and Respondent previously added")
	public void user_delete_the_claimant_and_respondent_previously_added() {
		Ongoing_ob.deletePartyDetails();
	}


	/*****************************
	 * Upload SOD
	 * 
	 */

	@Given("user is on ongoing page and search for case id as {string}")
	public void user_is_on_ongoing_page_and_search_for_case_id_as(String string) {
		Ongoing_ob.searchCaseid(string);
	}
	@Then("user click on the action btn and select action as like Upload SOD")
	public void user_click_on_the_action_btn_and_select_action_as_like_upload_sod() throws InterruptedException {
		Ongoing_ob.sodUploadAct();
	}
	@Then("user select zip file to upload")
	public void user_select_zip_file_to_upload() {
		Ongoing_ob.sodZipFileSel();
	}
	@Then("user click on the SOD submit btn")
	public void user_click_on_the_sod_submit_btn() {
		Ongoing_ob.sodSubmitbtn();
	}
	@Then("user verify the success massage as {string} and then user click on the ok btn")
	public void user_verify_the_success_massage_as_and_then_user_click_on_the_ok_btn(String string) {
		Ongoing_ob.verifySocSuccessMassage(string);
	}


	/*****************************
	 * View Document List
	 * 
	 */


	@Given("user select action as View Document List")
	public void user_select_action_as_view_document_list() {
		Ongoing_ob.viewDocList();
	}
	@Then("user able to see the documents present in the selected case")
	public void user_able_to_see_the_documents_present_in_the_selected_case() {
		Ongoing_ob.verifyTheCase();
	}

	/*****************************
	 * Shared
	 * 
	 */

	@Given("user select action as Shared")
	public void user_select_action_as_shared() {
		Ongoing_ob.shareSel();
	}
	@Then("user enter the comment in the input box and then user click on the sent btn")
	public void user_enter_the_comment_in_the_input_box_and_then_user_click_on_the_sent_btn() throws InterruptedException {
		Ongoing_ob.addShareComment();

	}
	@Then("user verify that the comment added Successfully or not")
	public void user_verify_that_the_comment_added_successfully_or_not() {
		Ongoing_ob.verifyShareComment();
	}


	/*****************************
	 * Private 
	 * 
	 */


	@Given("user select action as Private")
	public void user_select_action_as_private() {
		Ongoing_ob.privateSel();
	}
	@Then("user add the comment in the input box and and click on the send btn")
	public void user_add_the_comment_in_the_input_box_and_and_click_on_the_send_btn() {
		Ongoing_ob.addPrivate();
	}





}
