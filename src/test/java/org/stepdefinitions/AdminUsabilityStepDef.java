package org.stepdefinitions;




import org.factory.DriverFactory;
import org.pages.AdminUsability;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminUsabilityStepDef {

	private AdminUsability admin_obj = new AdminUsability(DriverFactory.getDriver());

	/*************************
	 * Dashboard step
	 * 
	 */
	@Given("user is on dashboard page and verify that from to date input field working or not")
	public void user_is_on_dashboard_page_and_verify_that_from_to_date_input_field_working_or_not() {
		admin_obj.verifyDateFilter();
	}
	@Then("user verify that able to select arbitrator name and also the Enterprise from the dropdown")
	public void user_verify_that_able_to_select_arbitrator_name_and_also_the_enterprise_from_the_dropdown() throws InterruptedException {
		admin_obj.selArbritratorEnterprise();
	}
	@Then("user check he is able to Download Chat360 Data for certain time period")
	public void user_check_he_is_able_to_download_chat360_data_for_certain_time_period() throws InterruptedException {
		admin_obj.chat360Download();
	}

	/****************************
	 * @ArbitrationNotifications
	 * 
	 */
	@Given("user is on dashboard page click on the Arbitration Notifications")
	public void user_is_on_dashboard_page_click_on_the_arbitration_notifications() {
		admin_obj.arbNotificatin();
	}
	@Then("user verify that able to see the arbitration notification or not")
	public void user_verify_that_able_to_see_the_arbitration_notification_or_not() {
		admin_obj.VerifyArbNotPage();
	}


	@Then("user verify that notifications were displayed or not")
	public void user_verify_that_notifications_were_displayed_or_not() {

		admin_obj.verifyPageNotif(); 
	}

	/********************
	 * @ShareFileFun
	 */
	@Given("user is on dashboard page and click on the Shared Files and verify that page loaded or not")
	public void user_is_on_dashboard_page_and_click_on_the_shared_files_and_verify_that_page_loaded_or_not() {
		admin_obj.verifyShareFile();
	}
	@Then("user verifies that all input field are working or not on the page")
	public void user_verifies_that_all_input_field_are_working_or_not_on_the_page() {
		admin_obj.shareFileInputFields();
	}

	/********************
	 *  @throws InterruptedException 
	 * @ShareFileUpload
	 */

	@Then("user click on upload file and select file to upload also select user and click on submit btn")
	public void user_click_on_upload_file_and_select_file_to_upload_also_select_user_and_click_on_submit_btn() throws InterruptedException {
		admin_obj.uploadShareFile();
	}
	@Then("user verify the success status and click on ok btn")
	public void user_verify_the_success_status_and_click_on_ok_btn() {
		admin_obj.verifySuccessMassage();
	}

	/*******************
	 * @ResolvBtn
	 */
	@Given("user is on the dashboard page and click on the Resolv btn and get all action present in it")
	public void user_is_on_the_dashboard_page_and_click_on_the_resolv_btn_and_get_all_action_present_in_it() {
		admin_obj.resolvSel();
	}
	@When("user see the Arbitration360 then click and get all action present in it")
	public void user_see_the_arbitration360_then_click_and_get_all_action_present_in_it() {
		admin_obj.arb360SelGetAct();
	}
	@Then("user verifies that able to perform all action present in it or not")
	public void user_verifies_that_able_to_perform_all_action_present_in_it_or_not() {
		admin_obj.verifyAllActionResolv();
	}

	/*****************************
	 * @ResolvBtnActionsWorking
	 * 
	 */

	@When("user see the Arbitration360 then click and get all action present in it and verifies all are working or not")
	public void user_see_the_arbitration360_then_click_and_get_all_action_present_in_it_and_verifies_all_are_working_or_not() {
		admin_obj.arb360SelGetAct();
		admin_obj.verifyAllActionResolv();
	}
	@When("user click on For Admin Review action and verify that the page is properly loaded or not and title as {string}")
	public void user_click_on_for_admin_review_action_and_verify_that_the_page_is_properly_loaded_or_not_and_title_as(String string) {
		admin_obj.forAdminReview(string);
	}
	@Then("user click on Ongoing action and verify that the page is properly loaded or not and title as {string}")
	public void user_click_on_ongoing_action_and_verify_that_the_page_is_properly_loaded_or_not_and_title_as(String string) {
		admin_obj.ongoing(string);
	}
	@Then("user click on Closed action and verify that the page is properly loaded or not and title as {string}")
	public void user_click_on_closed_action_and_verify_that_the_page_is_properly_loaded_or_not_and_title_as(String string) {
		admin_obj.closed(string);
	}
	@Then("user click on Rejected action and verify that the page is properly loaded or not and title as {string}")
	public void user_click_on_rejected_action_and_verify_that_the_page_is_properly_loaded_or_not_and_title_as(String string) {
		admin_obj.reject(string);
	}
	@Then("user click on  Document list and verify that the page is properly loaded or not and title as {string}")
	public void user_click_on_document_list_and_verify_that_the_page_is_properly_loaded_or_not_and_title_as(String string) {
		admin_obj.documentList(string);
	}


	/******************
	 * @throws InterruptedException 
	 * @AddNewBtn
	 */

	@Given("user is on the dashboard page and click on Add new btn and get all action present in it and verify all are working  or not")
	public void user_is_on_the_dashboard_page_and_click_on_add_new_btn_and_get_all_action_present_in_it_and_verify_all_are_working_or_not() throws InterruptedException {
		admin_obj.allActionEnability();
	}


	@Then("user click on Users and get all action present in it and verify all are working or not")
	public void user_click_on_users_and_get_all_action_present_in_it_and_verify_all_are_working_or_not() throws InterruptedException {
		admin_obj.userActions();
	}

	/********************
	 * @Reports
	 */
	@Given("user is on the dashboard page and click on Reports btn and get all action present in it and verify all are working  or not")
	public void user_is_on_the_dashboard_page_and_click_on_reports_btn_and_get_all_action_present_in_it_and_verify_all_are_working_or_not() {
		admin_obj.reportsAction();
	}

	/************************
	 * @ReportAllActions
	 */


	@Given("user is on dashboard page and click on Report and then click on  whatsapp and verify page loaded or not")
	public void user_is_on_dashboard_page_and_click_on_report_and_then_click_on_whatsapp_and_verify_page_loaded_or_not() {
		admin_obj.whatsAppclick();
	}
	@Then("user verify the usability of VC Report action and title as {string}")
	public void user_verify_the_usability_of_vc_report_action_and_title_as(String string) throws InterruptedException {
		admin_obj.vcReport(string);
	}
	@Then("user verify the  E sign\\/E stamp")
	public void user_verify_the_e_sign_e_stamp() throws InterruptedException {
		admin_obj.esign();
	}
	@Then("user verify the Ivr Call action and  title as {string}")
	public void user_verify_the_ivr_call_action_and_title_as(String string) throws InterruptedException {
		admin_obj.ivrCall(string);
	}
	@Then("user verify the Report action and title as {string}")
	public void user_verify_the_report_action_and_title_as(String string) {
		admin_obj.report(string);
	}

	/*******************
	 * @MenuControl
	 */

	@Given("user is on dashboard page and click on  Menu Control and verify page loaded or not")
	public void user_is_on_dashboard_page_and_click_on_menu_control_and_verify_page_loaded_or_not() {
		admin_obj.menuControlAct();
	}
	@Given("user verify the page title as {string} and also check that all input field are working or not")
	public void user_verify_the_page_title_as_and_also_check_that_all_input_field_are_working_or_not(String string) {
		admin_obj.menuPageTitle(string);
	}
	/************************
	 * @throws InterruptedException 
	 * @UserAccessControl
	 */

	@Given("user is on dashboard page and click on  User Access Control and verify page loaded or not and page title as {string}")
	public void user_is_on_dashboard_page_and_click_on_user_access_control_and_verify_page_loaded_or_not_and_page_title_as(String string) throws InterruptedException {
		admin_obj.userAccessAct();
	}

	/**********************
	 * @throws InterruptedException 
	 * @UpdateProfile
	 */
	@Given("user is on dashboard page and click on  Update Profile and verify page loaded or not and page title as {string}")
	public void user_is_on_dashboard_page_and_click_on_update_profile_and_verify_page_loaded_or_not_and_page_title_as(String string) throws InterruptedException {
		admin_obj.updateProfile(string);
	}


}
