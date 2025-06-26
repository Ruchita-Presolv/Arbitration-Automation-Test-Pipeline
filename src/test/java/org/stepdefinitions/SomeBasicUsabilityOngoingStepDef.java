package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.SomeBasicUsabilityOngoing;

import io.cucumber.java.en.*;

public class SomeBasicUsabilityOngoingStepDef {


	private SomeBasicUsabilityOngoing some_B_obj= new SomeBasicUsabilityOngoing(DriverFactory.getDriver());

	/******************************
	 * Filter Based on Batch Name
	 */

	@Given("User is on the ongoing page and verifies that able to see the header filter")
	public void user_is_on_the_ongoing_page_and_verifies_that_able_to_see_the_header_filter() {
		some_B_obj.hederFilter();
	}
	@Given("Also verifies that he able to filter the cases based on the bached name he select from the drop down as {string}")
	public void also_verifies_that_he_able_to_filter_the_cases_based_on_the_bached_name_he_select_from_the_drop_down_as(String string) {
		some_B_obj.batchSearch(string);
	}
	@Then("user click on the search icon and verify that all cases loaded on the page having batch name as {string}")
	public void user_click_on_the_search_icon_and_verify_that_all_cases_loaded_on_the_page_having_batch_name_as(String string) throws InterruptedException {
		some_B_obj.hederFilterSearch(string);
	}

	/******************************
	 * Filter Based on Arbitrator name
	 * @throws InterruptedException 
	 */

	@Given("Also verifies that he able to filter the cases based on the Arbitrator name he select from the drop down as Arbitrator one")
	public void also_verifies_that_he_able_to_filter_the_cases_based_on_the_arbitrator_name_he_select_from_the_drop_down_as_arbitrator_one() throws InterruptedException {
		some_B_obj.arbitratorSel();
	}
	@Then("user click on the search icon and verify that all cases loaded on the page having Arbitrator name as Arbitrator one")
	public void user_click_on_the_search_icon_and_verify_that_all_cases_loaded_on_the_page_having_arbitrator_name_as_arbitrator_one() throws InterruptedException {
		some_B_obj.arbSearch();
	}

	/******************************
	 * Filter Based on Organisation name
	 * @throws InterruptedException 
	 * 
	 */

	@Given("Also verifies that he able to filter the cases based on the Organisation name he select from the drop down as Presolv360")
	public void also_verifies_that_he_able_to_filter_the_cases_based_on_the_organisation_name_he_select_from_the_drop_down_as_presolv360() throws InterruptedException {
		some_B_obj.selOrganisation();
	}
	@Then("user click on the search icon and verify that all cases loaded on the page having Organisation name as Presolv360")
	public void user_click_on_the_search_icon_and_verify_that_all_cases_loaded_on_the_page_having_organisation_name_as_presolv360() throws InterruptedException {
		some_B_obj.orgSearchFilter();
	}

	/******************************
	 * Filter Based on Date 
	 * @throws InterruptedException 
	 * 
	 */

	@Given("Also verifies that he able to filter the cases based on the date in from as {string} and in to as {string}")
	public void also_verifies_that_he_able_to_filter_the_cases_based_on_the_date_in_from_as_and_in_to_as(String string, String string2) throws InterruptedException {
		some_B_obj.setDate(string, string2);
	}
	@Then("user click on the search icon and verify that all cases loaded as per the date entered by user")
	public void user_click_on_the_search_icon_and_verify_that_all_cases_loaded_as_per_the_date_entered_by_user() {
		some_B_obj.caseLoadedDate();
	}

	/******************************
	 * Search for case id and Refresh btn
	 * 
	 */
	/////////////////////////////////////////////////////////////////////////
	@Given("User is on the ongoing page and verifies that able to see the case table loaded or not")
	public void user_is_on_the_ongoing_page_and_verifies_that_able_to_see_the_case_table_loaded_or_not() {
		some_B_obj.caseTable();
	}

	@Given("user capture any case id from the table and enter the same in the search input box and click on search icon")
	public void user_capture_any_case_id_from_the_table_and_enter_the_same_in_the_search_input_box_and_click_on_search_icon() throws InterruptedException {
		some_B_obj.searchCaseId();
	}
	@Then("user again capture the case id and compare with the previous case id for which he search")
	public void user_again_capture_the_case_id_and_compare_with_the_previous_case_id_for_which_he_search() {
		some_B_obj.compareCaseid();
	}
	@Then("after this user click on the refresh button to verify that it is working or not")
	public void after_this_user_click_on_the_refresh_button_to_verify_that_it_is_working_or_not() {
		some_B_obj.refreshBtn();
	}

	/******************************
	 * Search No of cases and next btn
	 * @throws InterruptedException 
	 * 
	 */

	@Then("user load no of cases per page as {string} and also compare it with case count per page and also same for {string} and {string}cases")
	public void user_load_no_of_cases_per_page_as_and_also_compare_it_with_case_count_per_page_and_also_same_for_cases(String string, String string2,String string3) throws InterruptedException {
		some_B_obj.loadNoOfCases(string, string2 ,string3);
	}

	@Then("user click on the next button and check it working or not")
	public void user_click_on_the_next_button_and_check_it_working_or_not() throws InterruptedException {
		some_B_obj.changePage();
	}

	/******************************
	 * Case status change 
	 * @throws InterruptedException 
	 * 
	 */

	@Given("user select the case and update its status as pause")
	public void user_select_the_case_and_update_its_status_as_pause() {
		some_B_obj.updateStatus();
	}
	@Then("after user checked the checkbox and tries to upload additional documents then he get an alert")
	public void after_user_checked_the_checkbox_and_tries_to_upload_additional_documents_then_he_get_an_alert() {
		some_B_obj.checkStatus();
	}
	@Then("user click on the no btn")
	public void user_click_on_the_no_btn() {
		some_B_obj.alertVerify();
	}
	//====================Withdraw===========================

	@Then("after user click on the action btn and select Withdraw action then get an alert")
	public void after_user_click_on_the_action_btn_and_select_withdraw_action_then_get_an_alert() throws InterruptedException {
		some_B_obj.withdrawPauseCase();
	}

	//=============Uploade additional doc==========


	@Then("user checked the checkbox and tries to upload additional documents then he get an alert")
	public void user_checked_the_checkbox_and_tries_to_upload_additional_documents_then_he_get_an_alert() {
		some_B_obj.checkStatus();
	}
	@Then("users verify the message as {string} and then click on Confirm btn")
	public void users_verify_the_message_as_and_then_click_on_confirm_btn(String string) {
		some_B_obj.alertConfirm(string);
	}
	@Then("user upload the additional document and verify the success message")
	public void user_upload_the_additional_document_and_verify_the_success_message() {
		some_B_obj.uploadAdditionalDoc();
	}




	//+++++++Changes in Additional Documents ==============

	@When("user see the Upload Additional Docs pop up then user select document to upload")
	public void user_see_the_upload_additional_docs_pop_up_then_user_select_document_to_upload() throws InterruptedException {
		some_B_obj.pUploadDoc();
	}
	@When("user verify that yes and no radio btn are active or not and checked yes and add discription as {string}")
	public void user_verify_that_yes_and_no_radio_btn_are_active_or_not_and_checked_yes_and_add_discription_as(String string) throws InterruptedException {
		some_B_obj.discriptionAdd(string);
	}
	@Then("user select mode of communication as email also enability or other btn and click on submit btn")
	public void user_select_mode_of_communication_as_email_also_enability_or_other_btn_and_click_on_submit_btn() {
		some_B_obj.modeOfCommunicatio();
	}

@Then("user verify success massage and click on close btn")
public void user_verify_success_massage_and_click_on_close_btn() throws InterruptedException {
	some_B_obj.verifySuccessMass();
}





	//===================Action Butten and All Inside Action usability ============


	@Then("user select the caseId as {string} on platform and click on the action btn")
	public void user_select_the_case_id_as_on_platform_and_click_on_the_action_btn(String string) throws InterruptedException {
		some_B_obj.actionBtn(string);
	}
	@Then("user then verify all action present in action are working or not")
	public void user_then_verify_all_action_present_in_action_are_working_or_not() {
		some_B_obj.actionEnability();
	}
	@Then("user also verify that the select all cases checkbox working or not")
	public void user_also_verify_that_the_select_all_cases_checkbox_working_or_not() throws InterruptedException {
		some_B_obj.selectAll();
	}

	//=========================download consent=============================

	@Then("user select any case present on the page and click on assign arbitrator and download consent and click on close Btn")
	public void user_select_any_case_present_on_the_page_and_click_on_assign_arbitrator_and_download_consent_and_click_on_close_btn() throws InterruptedException {
		some_B_obj.downloadConsent();
	}


	//===================BulkActionOptions=================================


	@Then("user select all cases present on the page using select all checkbox")
	public void user_select_all_cases_present_on_the_page_using_select_all_check_box() {
		some_B_obj.selectAllCases();
	}
	@Then("user verifies that able to click on bulk action and also check the usability of all action present in  it for Both filter")
	public void user_verifies_that_able_to_click_on_bulk_action_and_also_check_the_usability_of_all_action_present_in_it_for_both_filter() throws InterruptedException {
		some_B_obj.bulkAction();
	}

	//===================BulkActionOptions=================================

	@Given("user verifies that able to click on bulk upload and also check the usability of all action present in  it")
	public void user_verifies_that_able_to_click_on_bulk_upload_and_also_check_the_usability_of_all_action_present_in_it() throws InterruptedException {
		some_B_obj.bulkupload();
	}







}
