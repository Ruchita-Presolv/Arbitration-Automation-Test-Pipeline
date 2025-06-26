package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.ClosePage;

import io.cucumber.java.en.*;


public class ClosePageStepDef {
	ClosePage Clo_obj= new ClosePage(DriverFactory.getDriver());

	/******************
	 * @AwardClose
	 */
	@Then("User click on close btn")
	public void user_click_on_close_btn() {
		Clo_obj.closeBtn();
	}
	@Given("user is on close page and verify the page title as {string}")
	public void user_is_on_close_page_and_verify_the_page_title_as(String string) {
		Clo_obj.pageTitle(string);
	}
	@Then("user verify that both filter are loaded on click and usable")
	public void user_verify_that_both_filter_are_loaded_on_click_and_usable() {
		Clo_obj.filterWorking();
	}
	@Then("user select random filter and select bulk upload action then click on award")
	public void user_select_random_filter_and_select_bulk_upload_action_then_click_on_award() {
		Clo_obj.ranSelect();
	}
	@When("user see the pop up title as {string} then he select file to upload and click on upload btn")
	public void user_see_the_pop_up_title_as_then_he_select_file_to_upload_and_click_on_upload_btn(String string) throws InterruptedException {
		Clo_obj.uploadAward(string);
	}











}
