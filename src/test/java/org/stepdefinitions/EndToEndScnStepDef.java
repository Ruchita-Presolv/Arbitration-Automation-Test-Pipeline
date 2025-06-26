package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.ArbitratorLogin;
import org.pages.EndToEndScn;

import io.cucumber.java.en.*;

public class EndToEndScnStepDef {
	private EndToEndScn end_obj= new EndToEndScn(DriverFactory.getDriver());
	ArbitratorLogin Arb_obj= new ArbitratorLogin(DriverFactory.getDriver());


	@Then("user add the .csv file to upload 10cases")
	public void user_add_the_csv_file_to_upload_10cases() {
		end_obj.addCsvFile();
	}



	@Then("user click on ongoing btn and capture 10th case id from it and assignee status")
	public void user_click_on_ongoing_btn_and_capture_10th_case_id_from_it_and_assignee_status() throws InterruptedException {
		end_obj.captureCaseId();
	}

	//Accept

	@Then("user search for the case id and select the case to accept")
	public void user_search_for_the_case_id_and_select_the_case_to_accept() throws InterruptedException {
		end_obj.approveSelectedCase();
	}

	//Accept1st
	@Given("user checked  the select first cases to Approve check box")
	public void user_checked_the_select_first_cases_to_approve_check_box() throws InterruptedException {
		end_obj.selectCA();
	}



	/*
	 * @Then("user capture {int} case id on the page and  click on ongoing") public
	 * void user_capture_case_id_on_the_page_and_click_on_ongoing(Integer int1)
	 * throws InterruptedException { end_obj.arbCase(); end_obj.searchcaseid(); }
	 */


	@Then("user click on accept btn and when he see the title as {string} then click on submit btn")
	public void user_click_on_accept_btn_and_when_he_see_the_title_as_then_click_on_submit_btn(String string) throws InterruptedException {
		end_obj.singleAcceptCase();
	}


	@When("user see the success massage then he click on ok btn")
	public void user_see_the_success_massage_then_he_click_on_ok_btn() {
		end_obj.finalSuccessM();
	}


	@Then("user click on ongoing btn and select the previously approved case and upload additional documents")
	public void user_click_on_ongoing_btn_and_select_the_previously_approved_case_and_upload_additional_documents() throws InterruptedException {
		end_obj.previousCase();
	}


	@Then("user verify that additional doc uploaded or not")
	public void user_verify_that_additional_doc_uploaded_or_not() {
		end_obj.verifyAddDoc();
	}


	// swithch on tab

	@Then("user add new window and switch on that and then set url for user login")
	public void user_add_new_window_and_switch_on_that_and_then_set_url_for_user_login() throws InterruptedException {
		end_obj.switchWinAddUrl();
	}

	@Then("user add new window and switch on that and then set url for user login  user name as {string} and password as {string}")
	public void user_add_new_window_and_switch_on_that_and_then_set_url_for_user_login_user_name_as_and_password_as(String string, String string2) throws InterruptedException {
		end_obj.switchWinAddUrl();
		Arb_obj.enterUName(string);
		Arb_obj.enterPass(string2);

	}

	// Arbitrator Notifications


	@Then("user click on the Mail record btn")
	public void user_click_on_the_mail_record_btn() {
		end_obj.mailRecord();
	}
	@When("user see the Send mail page then search result based on date as {string} if result found then mail send successfully")
	public void user_see_the_send_mail_page_then_search_result_based_on_date_as_if_result_found_then_mail_send_successfully(String string) throws InterruptedException {
		end_obj.sendMail(string);
	}


	// Notifications 
	/*
	 * Email
	 */
	@Then("user click on Notifications Queue btn")
	public void user_click_on_notifications_queue_btn() {
		end_obj.notificationAct();
	}
	@Then("user click on Email Queue notification and check page title as {string}")
	public void user_click_on_email_queue_notification_and_check_page_title_as(String string) {
		end_obj.emailQ(string);
	}
	@Then("user add event type as {string} and date as from {string} and to {string} and staus as {string} and click on search btn")
	public void user_add_event_type_as_and_date_as_from_and_to_and_staus_as_and_click_on_search_btn(String string, String string2, String string3, String string4) throws InterruptedException {
		end_obj.filterAdd(string, string2, string3, string4);
	}

	@When("user see the result based Event name as {string} on above filter and varify the sent result")
	public void user_see_the_result_based_event_name_as_on_above_filter_and_varify_the_sent_result(String string) throws InterruptedException {
		end_obj.verifySearchResult(string);
	}

	/*
	 * WhatsApp
	 * 
	 */


	@Then("user click on WhatsApp Queue notification and check page title as {string}")
	public void user_click_on_whats_app_queue_notification_and_check_page_title_as(String string) {
		end_obj.whatsAppQ(string);
	}


	@Then("user add event type as {string} and date as from {string} and to {string} and status as {string} and click on search for whatsApp  btn")
	public void user_add_event_type_as_and_date_as_from_and_to_and_status_as_and_click_on_search_for_whats_app_btn(String string, String string2, String string3, String string4) throws InterruptedException {
		end_obj.filterAddWhatsApp(string, string2, string3, string4);
	}


	//WhatsApp & Email Queue


	@Then("user click on WhatsApp & Email Queue and check the page title as {string}")
	public void user_click_on_whats_app_email_queue_and_check_the_page_title_as(String string) {

	}
	@Then("user check for pending records")
	public void user_check_for_pending_records() {

	}


	//Download Email


	@Then("user click on select all to download btn and click on download btn")
	public void user_click_on_select_all_to_download_btn_and_click_on_download_btn() throws InterruptedException {
		end_obj.downloadNotif();
	}
	@Then("user click on confirm btn and verify success massage")
	public void user_click_on_confirm_btn_and_verify_success_massage() throws InterruptedException {
		end_obj.verifyDownload();
	}

	//Download WA

	@Then("user click on select WhatsApp massage  to download btn and click on download btn")
	public void user_click_on_select_whats_app_massage_to_download_btn_and_click_on_download_btn() throws InterruptedException {
		end_obj.downloadWANotif();
	}



	//Resent mail


	@Then("user select single case from table and resent the mail")
	public void user_select_single_case_from_table_and_resent_the_mail() {
		
	}






}
