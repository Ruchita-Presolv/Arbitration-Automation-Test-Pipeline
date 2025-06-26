package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.UserUsability;

import io.cucumber.java.en.*;

public class UserUsabilityStepDef {

	UserUsability userU_obj = new UserUsability (DriverFactory.getDriver());

	/********************
	 * usability
	 * @throws InterruptedException 
	 */


	//Arbitration360
	@Given("user on home page and click on Arbitration360 btn")
	public void user_on_home_page_and_click_on_arbitration360_btn() throws InterruptedException {
		userU_obj.arbitration360btn();
	}

	@Given("user on home page and click on Arbitration360 btn check the following")
	public void user_on_home_page_and_click_on_arbitration360_btn_check_the_following() throws InterruptedException {
		userU_obj.arb360Btn();
	}



	@Then("user click on the For Admin Review btn and verify the page title as {string}")
	public void user_click_on_the_for_admin_review_btn_and_verify_the_page_title_as(String string) {
		userU_obj.forAddminReview(string);
	}
	@Then("user then click on ongoing btn and verify the page title as {string}")
	public void user_then_click_on_ongoing_btn_and_verify_the_page_title_as(String string) {
		userU_obj.ongoing(string);
	}
	@Then("user click on Closed btn and verify the page title as {string}")
	public void user_click_on_closed_btn_and_verify_the_page_title_as(String string) {
		userU_obj.closed(string);
	}

	// single Case 


	@Then("user click on single case button and verify that from loaded or not")
	public void user_click_on_single_case_button_and_verify_that_from_loaded_or_not() throws InterruptedException {
		userU_obj.singleCaseBtn();
	}
	@When("user see the Case Registration page then user click on dispute regarding? and verify  taht all options seletable or not")
	public void user_see_the_case_registration_page_then_user_click_on_dispute_regarding_and_verify_taht_all_options_seletable_or_not() {
		userU_obj.typeOfDispute();
	}
	@Then("user click on Disputed amount and verify  taht all options seletable or not")
	public void user_click_on_disputed_amount_and_verify_taht_all_options_seletable_or_not() {
		userU_obj.amountOfDispute();
	}
	@Then("verify that Invoke Arbitration  button working or not")
	public void verify_that_invoke_arbitration_button_working_or_not() {
		userU_obj.invokeArbitration();
	}


	// Single case Registration 



	@Then("user select dispute type as {string} and the amount type as {string}")
	public void user_select_dispute_type_as_and_the_amount_type_as(String string, String string2) throws InterruptedException {
		userU_obj.disputeType(string, string2);
	}
	@Then("user click on Invoke Arbitration button")
	public void user_click_on_invoke_arbitration_button() throws InterruptedException {
		userU_obj.invokeArbitration1();
	}
	@When("user see the the page title as {string}")
	public void user_see_the_the_page_title_as(String string) {
		userU_obj.pageTitle(string);
	}
	@Then("user fill the Respondent details Full Name as {string} and email as {string}  then Phone no {string}")
	public void user_fill_the_respondent_details_full_name_as_and_email_as_then_phone_no(String string, String string2, String string3) {
		userU_obj.respondentDetails(string, string2, string3);
	}
	@Then("Address Line1 as {string} City as {string}  Pincode as {string} State as {string} Country as {string}")
	public void address_line1_as_city_as_pincode_as_state_as_country_as(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		userU_obj.addressRespondent(string, string2, string3, string4, string5);
	}

	@Then("user add Nature of Agreement as {string} and Arbitration Clause No. as {string} and Reference ID as {string}")
	public void user_add_nature_of_agreement_as_and_arbitration_clause_no_as_and_reference_id_as(String string, String string2, String string3) {
		userU_obj.aggrementType(string, string2, string3);   
	}



	@Then("user upload  Agreement pdf file")
	public void user_upload_agreement_pdf_file() throws InterruptedException {
		userU_obj.aggrementPdfUp();
	}
	@Then("user add Brief description of the claim as {string}")
	public void user_add_brief_description_of_the_claim_as(String string) {
		userU_obj.briefDis(string);
	}
	@Then("user add Relief or remedy sought as {string}")
	public void user_add_relief_or_remedy_sought_as(String string) throws InterruptedException {
		userU_obj.relief(string);
	}
	@Then("user check both checked box of aggrements and click on submit btn")
	public void user_check_both_checked_box_of_aggrements_and_click_on_submit_btn() throws InterruptedException {
		userU_obj.checkedAndSubmit();
	}





	//ShareFile


	@Given("user is on home page and click on Share file")
	public void user_is_on_home_page_and_click_on_share_file() {
		userU_obj.shareFile();
	}
	@Given("verify the page title as {string}")
	public void verify_the_page_title_as(String string) {
		userU_obj.pagetitle(string);
	}
	@Given("user also verify that all action btn are workin on that page")
	public void user_also_verify_that_all_action_btn_are_workin_on_that_page() {
		userU_obj.fileUploade();
	}


	//download excel Sheet


	@Given("user is on home page and then click on the arbitration360 and click on for admin review")
	public void user_is_on_home_page_and_then_click_on_the_arbitration360_and_click_on_for_admin_review() throws InterruptedException {
		userU_obj.forAdminReview();
	}
	@Then("user check the select all cases check box and click on download btn")
	public void user_check_the_select_all_cases_check_box_and_click_on_download_btn() {
		userU_obj.downloadExcelSheet();
	}

	//update ref id 


	@Then("user select any case on platform and click on update refrence id")
	public void user_select_any_case_on_platform_and_click_on_update_refrence_id() {
		userU_obj.clickOnRefId();
	}
	@Then("add refrence id as {string} and click on the Submit btn")
	public void add_refrence_id_as_and_click_on_the_submit_btn(String string) {
		userU_obj.updateRefId(string);
	}



}
