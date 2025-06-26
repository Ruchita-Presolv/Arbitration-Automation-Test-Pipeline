package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.OngoingRandomFIlAct;

import io.cucumber.java.en.*;

public class OngoingRandomFIlActStepDef {
	OngoingRandomFIlAct on_Ran_obj = new OngoingRandomFIlAct(DriverFactory.getDriver());

	// Bulk close 

	@Given("user is on ongoing page and select the filter as Random case filter")
	public void user_is_on_ongoing_page_and_select_the_filter_as_random_case_filter() throws InterruptedException {
		on_Ran_obj.randomFilSelect();
	}
	@When("user select filter then input field get open and he capture some case and store in one variable")
	public void user_select_filter_then_input_box_get_open_and_he_capture_some_case_and_store_in_one_variable() throws InterruptedException {
		on_Ran_obj.clickInputFieldRan();
		on_Ran_obj.sendCases();
	}
	@Then("user send all cases as an input of filter and then click on the bulk action and select Bulk close action")
	public void user_send_all_cases_as_an_input_of_filter_and_then_click_on_the_bulk_action_and_select_bulk_close_action() {
		on_Ran_obj.bulkCloseClick();
	}
	@Then("user enter the reason as {string} and click on apply closebtn")
	public void user_enter_the_reason_as_and_click_on_apply_closebtn(String string) {
		on_Ran_obj.addReason(string);
	}
	@Then("user verifies  the success status and click on the close btn")
	public void user_verifies_the_success_status_and_click_on_the_close_btn() {
		on_Ran_obj.successStatus();
	}

	// Bulk Withdraw 


	@Then("user send all cases as an input of filter and then click on the bulk action and select Bulk Withdraw action")
	public void user_send_all_cases_as_an_input_of_filter_and_then_click_on_the_bulk_action_and_select_bulk_withdraw_action() {
		on_Ran_obj.bulkWithdraw();
	}
	@Then("user enter the reason as {string} and click on apply withdrawbtn")
	public void user_enter_the_reason_as_and_click_on_apply_withdrawbtn(String string) {
		on_Ran_obj.addReason(string);
	}

	// Download Award Sheet


	@When("user select filter then input field get open and he capture some case and store in second variable")
	public void user_select_filter_then_input_field_get_open_and_he_capture_some_case_and_store_in_second_variable() throws InterruptedException {
		on_Ran_obj.noOfCases();
	}
	@Then("user send all cases as an input of filter and then click on the bulk action")
	public void user_send_all_cases_as_an_input_of_filter_and_then_click_on_the_bulk_action() throws InterruptedException {
		on_Ran_obj.bulkAction();
	}
	@Then("user verify that able to download Award sheet or not")
	public void user_verify_that_able_to_download_award_sheet_or_not() {
		on_Ran_obj.downloadAward();
	}

	// Download Documents

	@Then("user verify that able to Download Documents or not")
	public void user_verify_that_able_to_download_documents_or_not() {
		on_Ran_obj.downloadDoc();
	}

	// Download Documents Selected 

	@Then("user click on the download documents and verifies that able to select all document and click on the download")
	public void user_click_on_the_download_documents_and_verifies_that_able_to_select_all_document_and_click_on_the_download() {
		on_Ran_obj.downloadSelectedDoc();
	}

	// Download All Documents 
	@Then("user click on the download documents and verifies that able to download all documents")
	public void user_click_on_the_download_documents_and_verifies_that_able_to_download_all_documents() {
		on_Ran_obj.downloadAllDoc();
	}




}
