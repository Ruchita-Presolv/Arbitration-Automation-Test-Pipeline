package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.ArbitratorClosedByPresolv;

import io.cucumber.java.en.*;



public class ArbitratorClosedByPresolvStepDef {

	ArbitratorClosedByPresolv Arb_Clo_Presol = new ArbitratorClosedByPresolv(DriverFactory.getDriver());

	// Case Details Page 

	@Then("user click on closed by presolv btn")
	public void user_click_on_closed_by_presolv_btn() {
		Arb_Clo_Presol.closedByP();
	}
	@Given("user is on closed by presolv page and click on caseId")
	public void user_is_on_closed_by_presolv_page_and_click_on_case_id() {
		Arb_Clo_Presol.caseIdP();
	}

	@Then("user verify that he able to see the case details page")
	public void user_verify_that_he_able_to_see_the_case_details_page() throws InterruptedException {
		Arb_Clo_Presol.caseDetailp();
	}


	// View Disclosures2


	@Given("user is on closed by presolv and click on action btn")
	public void user_is_on_closed_by_presolv_and_click_on_action_btn() throws InterruptedException {
		Arb_Clo_Presol.actionBtn();
	}
	@Then("user click on view disclosures2 and verify that he is able to view the disclosures2")
	public void user_click_on_view_disclosures2_and_verify_that_he_is_able_to_view_the_disclosures2() throws InterruptedException {
		Arb_Clo_Presol.viewDisclosures2Btn();
	}

	//Upload Directions

	@Then("user click on  upload directions btn and select file to upload and click on upload btn")
	public void user_click_on_upload_directions_btn_and_select_file_to_upload_and_click_on_upload_btn() throws InterruptedException {
		Arb_Clo_Presol.uploadDirection();
	}

	// Upload Award 


	@Then("user then click on the upload award")
	public void user_then_click_on_the_upload_award() throws InterruptedException {
		Arb_Clo_Presol.uploadAwardBtn();
	}
	@Then("user click on without signature and select file to upload and click on submit btn")
	public void user_click_on_without_signature_and_select_file_to_upload_and_click_on_submit_btn() {
		Arb_Clo_Presol.uploadAward();
	}
	@When("user sees Final Award uploaded massage then click on ok button")
	public void user_sees_final_award_uploaded_massage_then_click_on_ok_button() {
		Arb_Clo_Presol.successMassUpload();
	}

	// Private Comment


	@Then("user click on private btn and share comment as {string} and click on save btn")
	public void user_click_on_private_btn_and_share_comment_as_and_click_on_save_btn(String string) {
		Arb_Clo_Presol.privateComment(string);
	}
	@When("user see the success massage for comment then click on ok btn")
	public void user_see_the_success_massage_for_comment_then_click_on_ok_btn() {
		Arb_Clo_Presol.commentSaved();
	}

	//Shared Comment 

	@Then("user click on Shared btn and share comment as {string} and click on save btn")
	public void user_click_on_shared_btn_and_share_comment_as_and_click_on_save_btn(String string) {
		Arb_Clo_Presol.sharedComment(string);
	}

	// Important resources 


	@Given("is on closed by presolv page then he click on Important Resources page")
	public void is_on_closed_by_presolv_page_then_he_click_on_important_resources_page() throws InterruptedException {
		Arb_Clo_Presol.importantResources();
	}
	@Then("user check that the requires page loaded or not")
	public void user_check_that_the_requires_page_loaded_or_not() {
		Arb_Clo_Presol.resourcesPage();
	}

	// Profile form 

	@Given("user is on closed by presolv page then he click on Profile")
	public void user_is_on_closed_by_presolv_page_then_he_click_on_profile() {
		Arb_Clo_Presol.profileBtn();
	}
	@Then("user verify that he able to see the profile form and also view the password form")
	public void user_verify_that_he_able_to_see_the_profile_form_and_also_view_the_password_form() throws InterruptedException {
		Arb_Clo_Presol.profileForm();
	}





}
