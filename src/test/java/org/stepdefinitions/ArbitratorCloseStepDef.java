package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.ArbitratorCloseP;
import org.pages.ArbitratorOngoingP;

import io.cucumber.java.en.*;

public class ArbitratorCloseStepDef {

	ArbitratorOngoingP Arb_Ong_obj= new ArbitratorOngoingP(DriverFactory.getDriver());
	ArbitratorCloseP Arb_close_obj = new ArbitratorCloseP(DriverFactory.getDriver());



	// bulk action using filter 


	@Given("user is on closed page and select general filter")
	public void user_is_on_closed_page_and_select_general_filter() throws InterruptedException {
		Arb_close_obj.generalFilSel();
	}


	@Then("user click on  bulk  action btn")
	public void user_click_on_bulk_action_btn() {
		Arb_close_obj.bulkAct();
	}
	@Then("user select as download  documents")
	public void user_select_as_download_documents() throws InterruptedException {
		Arb_close_obj.downloadDocuments();

	}


	@Then("user select as Export to excel all data")
	public void user_select_as_export_to_excel_all_data() {
		Arb_close_obj.exportToExcel();
	}

	//================================================


	@Then("user add cases in from to filter Closed")
	public void user_add_cases_in_from_to_filter_closed() throws InterruptedException {
		Arb_close_obj.fromToCaseClose();
	}


	//Actions 

	// Upload Direction

	@Given("user is on closed page and then click on Action btn")
	public void user_is_on_closed_page_and_then_click_on_action_btn() {
		Arb_close_obj.actiontnClick();
	}

	@Then("user click on upload directions then select file and click on submit button")
	public void user_click_on_upload_directions_then_select_file_and_click_on_submit_button() throws InterruptedException {
		Arb_close_obj.uploadDirection();
	}
	@When("user see the success massage then user click on upload btn")
	public void user_see_the_success_massage_then_user_click_on_upload_btn() {
		Arb_close_obj.verifySuccesMass();
	}


	//View Disclosures

	@Then("user click on View Disclosures and verify that able to see the Arbitrator’s Consent and Disclosures by Arbitrator")
	public void user_click_on_view_disclosures_and_verify_that_able_to_see_the_arbitrator_s_consent_and_disclosures_by_arbitrator() {
		Arb_close_obj.viewDisclosure();
	}
	@Then("user verify that back button working or not")
	public void user_verify_that_back_button_working_or_not() {
		Arb_close_obj.disclosureBackBtn();
	}

	// Private


	@Then("user click on the private and then add massage as {string}")
	public void user_click_on_the_private_and_then_add_massage_as(String string) {
		Arb_close_obj.privateClick(string);
	}
	@Then("user click on save btn and also close the pop up")
	public void user_click_on_save_btn_and_also_close_the_pop_up() {
		Arb_close_obj.saveClosePopUp();
	}

	//Share 

	@Then("user click on the Shared and then add massage as {string}")
	public void user_click_on_the_shared_and_then_add_massage_as(String string) {
		Arb_close_obj.shareClick(string);
	}



}
