package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.ArbitratorOngoingP;
import org.utilities.ElementUtil;

import io.cucumber.java.en.*;

public class ArbitratorOngoingStepDef {
	ArbitratorOngoingP Arb_Ong_obj= new ArbitratorOngoingP(DriverFactory.getDriver());

	/**************
	 * @Adddirection
	 */
	@Given("user is on the dashboard page and click on the Ongoing Action")
	public void user_is_on_the_dashboard_page_and_click_on_the_ongoing_action() {
		Arb_Ong_obj.ongoingBtn();
	}

	@Given("user is on ongoing page and in first case send direction as Add direction")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_add_direction() throws InterruptedException {
		Arb_Ong_obj.addDirection();
	}
	@Given("user click on send direction and click on preview btn and click on send direction")
	public void user_click_on_send_direction_and_click_on_preview_btn_and_click_on_send_direction() throws InterruptedException {
		Arb_Ong_obj.sendDirection();
	}


	//@ClosureContested
	@Given("user is on ongoing page and in first case send direction as Closure \\(contested)")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_closure_contested() throws InterruptedException {
		Arb_Ong_obj.closureContested();
	}

	//ClosureUncontested
	@Given("user is on ongoing page and in first case send direction as Closure Uncontested")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_closure_uncontested() throws InterruptedException {
		Arb_Ong_obj.closureUncontested();
	}

	//ClosureInformalReply
	@Given("user is on ongoing page and in first case send direction as Closure Informal Reply")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_closure_informal_reply() throws InterruptedException {
		Arb_Ong_obj.closureInformalReply();
	}

	//@Cmnewdirection
	@Given("user is on ongoing page and in first case send direction as Cm new direction")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_cm_new_direction() throws InterruptedException {
		Arb_Ong_obj.cmNewdirection();
	}

	//@Confirmationofarbtrator
	@Given("user is on ongoing page and in first case send direction as Confirmation of arbtrator")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_confirmation_of_arbtrator() throws InterruptedException {
		Arb_Ong_obj.confirmationofarbtrator();
	}

	//Interim Order
	@Given("user is on ongoing page and in first case send direction as Interim Order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_interim_order() {
		Arb_Ong_obj.interimOrder();
	}

	//Intimate

	@Given("user is on ongoing page and in first case send direction as Intimate")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_intimate() {
		Arb_Ong_obj.intimate();
	}
	//Newdirectioin

	@Given("user is on ongoing page and in first case send direction as  New directioin")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_new_directioin() throws InterruptedException {
		Arb_Ong_obj.newdirectioin();
	}

	//@ObjectiontoApplicationforWithdrawal

	@Given("user is on ongoing page and in first case send direction as  Objection to Application for Withdrawal")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_objection_to_a_pplication_for_withdrawal() {
		Arb_Ong_obj.objectiontoApplicationforWithdrawal();
	}

	//ObjectionsReservedforOrders

	@Given("user is on ongoing page and in first case send direction as Objections Reserved for Orders")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_objections_reserved_for_orders() {
		Arb_Ong_obj.objectionsReservedforOrders();
	}

	//Opportunitytochoose
	@Given("user is on ongoing page and in first case send direction as Opportunity to choose")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_opportunity_to_choose() {
		Arb_Ong_obj.opportunitytochoose();
	}

	@Given("user click on send direction and add no of days then  click on preview btn and click on send direction")
	public void user_click_on_send_direction_and_add_no_of_days_then_click_on_preview_btn_and_click_on_send_direction() {
		Arb_Ong_obj.sendNoOfDaysDirection();
	}

	//Re call incorrect order

	@Given("user is on ongoing page and in first case send direction as Re call incorrect order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_re_call_incorrect_order() {
		Arb_Ong_obj.reCallIncorrectorder(); 
	}

	@Given("user click on send direction and add date then click on preview btn and click on send direction")
	public void user_click_on_send_direction_and_add_date_then_click_on_preview_btn_and_click_on_send_direction() {
		Arb_Ong_obj.sendKeyDateDirection();
	}

	//Rejoinder direction ext days 

	@Given("user click on send direction Rejoinder and click on preview btn and click on send direction")
	public void user_click_on_send_direction_rejoinder_and_click_on_preview_btn_and_click_on_send_direction() throws InterruptedException {
		Arb_Ong_obj.sendDirectionRejoinder();
	}

	//Rejoinder
	@Given("user is on ongoing page and in first case send direction as Rejoinder")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_rejoinder() {
		Arb_Ong_obj.rejoinder();
	}

	//RejoinderExtension

	@Given("user is on ongoing page and in first case send direction as Rejoinder Extension")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_rejoinder_extension() {
		Arb_Ong_obj.rejoinderExtension();
	}

	//ReopenProceedingsOrder

	@Given("user is on ongoing page and in first case send direction as Reopen Proceedings Order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_reopen_proceedings_order() {
		Arb_Ong_obj.reopenProceedingsOrder();
	}

	//ReplyExtensionOrder

	@Given("user is on ongoing page and in first case send direction as Reply Extension Order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_reply_extension_order() {
		Arb_Ong_obj.replyExtensionOrder();
	}

	//ReplytoRespondentApplicationObjection


	@Given("user is on ongoing page and in first case send direction as Reply to Respondent Application Objection")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_reply_to_respondent_application_objection() {
		Arb_Ong_obj.replytoRespondentApplicationObjection();
	}

	//SettlementExtensionOrder

	@Given("user is on ongoing page and in first case send direction as Settlement Extension Order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_settlement_extension_order() {
		Arb_Ong_obj.settlementExtensionOrder();
	}


	//SettlementFailureClosureexparte
	@Given("user is on ongoing page and in first case send direction as Settlement Failure Closure exparte")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_settlement_failure_closure_exparte() {
		Arb_Ong_obj.settlementFailureClosureexparte();
	}


	//SettlementFailureSOC
	@Given("user is on ongoing page and in first case send direction as Settlement Failure SOC")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_settlement_failure_soc() {
		Arb_Ong_obj.settlementFailureSOC();
	}

	//SettlementFailureSOD

	@Given("user is on ongoing page and in first case send direction as Settlement Failure SOD")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_settlement_failure_sod() {
		Arb_Ong_obj.settlementFailureSOD();
	}

	//SOCExtension

	@Given("user is on ongoing page and in first case send direction as SOC Extension")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_soc_extension() {
		Arb_Ong_obj.socExtension();
	}

	//SODExtension

	@Given("user is on ongoing page and in first case send direction as SOD Extension")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_sod_extension() {
		Arb_Ong_obj.sodExtension();
	}

	//@WithdrawalOrder

	@Given("user is on ongoing page and in first case send direction as Withdrawal Order")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_withdrawal_order() {
		Arb_Ong_obj.withdrawalOrder();
	}

	//WithdrawalWithLiberty

	@Given("user is on ongoing page and in first case send direction as Withdrawal WithLiberty")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_withdrawal_with_liberty() {
		Arb_Ong_obj.withdrawalWithLiberty();
	}

	//WithdrawalwithLibertyduetoineffectiveservice
	@Given("user is on ongoing page and in first case send direction as Withdrawal with Liberty due to ineffective service")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_withdrawal_with_liberty_due_to_ineffective_service() {
		Arb_Ong_obj.WithdrawalwithLibertyduetoineffectiveservice();
	}

	//CustomDirection
	@Given("user is on ongoing page and in first case send direction as Custom Direction")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_custom_direction() {
		Arb_Ong_obj.customDirection();
	}

	//@Other

	@Given("user is on ongoing page and in first case and click on  other")
	public void user_is_on_ongoing_page_and_in_first_case_and_click_on_other() {
		Arb_Ong_obj.otherSelect();
	}
	@Given("user select the file to upload and click on submit btn")
	public void user_select_the_file_to_upload_and_click_on_submit_btn() {
		Arb_Ong_obj.directionUpload();
	}
	@When("user see the success massage then he click on ok buttn")
	public void user_see_the_success_massage_then_he_click_on_ok_buttn() {
		Arb_Ong_obj.verifyMassage();
	}


	//Action

	//Upload Award

	@Given("user is on ongoing page and in last case and click on  Action")
	public void user_is_on_ongoing_page_and_in_last_case_and_click_on_action() {
		Arb_Ong_obj.actionClick();
	}
	@Given("user select action as Upload Award")
	public void user_select_action_as_upload_award() throws InterruptedException {
		Arb_Ong_obj.selectAward();
	}
	@Then("user select file to upload as a award and click on submit btn")
	public void user_select_file_to_upload_as_a_award_and_click_on_submit_btn() {
		Arb_Ong_obj.uploadAward();
	}
	@When("user see the success massage then he click on the ok btn")
	public void user_see_the_success_massage_then_he_click_on_the_ok_btn() throws InterruptedException {
		Arb_Ong_obj.awardSuccessMass();
	}


	//@UploadInterimOrder


	@Given("user select action as Upload Interim Order")
	public void user_select_action_as_upload_interim_order() throws InterruptedException {
		Arb_Ong_obj.selectInterim();
	}
	@Then("user select file as interim order to upload and click on submit btn")
	public void user_select_file_as_interim_order_to_upload_and_click_on_submit_btn() throws InterruptedException {
		Arb_Ong_obj.uploadInterim();
	}
	@Then("user than verify the success massage and submit")
	public void user_than_verify_the_success_massage_and_submit() throws InterruptedException {
		Arb_Ong_obj.interimSuccessMass();
	}

	//@Disclosure

	@Then("user click on view disclosures and verify the page title and download  is enable or not and click on close")
	public void user_click_on_view_disclosures_and_verify_the_page_title_and_download_is_enable_or_not_and_click_on_close() throws InterruptedException {
		Arb_Ong_obj.disclosureAct();
	}

	//@Private


	@Then("user click on private btn")
	public void user_click_on_private_btn() {
		Arb_Ong_obj.privateClick();
	}

	@Then("users add messages such as {string} and click on ok save btn")
	public void users_add_messages_such_as_and_click_on_ok_save_btn(String string) {
		Arb_Ong_obj.addMessage(string);
	}
	@Then("user verify the success message")
	public void user_verify_the_success_message() {
		Arb_Ong_obj.verifySuccess();
	}

	//share

	@Then("user click on share btn")
	public void user_click_on_share_btn() {
		Arb_Ong_obj.shareClick();
	}

	//BulkAction 


	@Given("user is on ongoing page and select general filter")
	public void user_is_on_ongoing_page_and_select_general_filter() throws InterruptedException {
		Arb_Ong_obj.generalFilSel();
	}
	@Then("user add cases in from to filter")
	public void user_add_cases_in_from_to_filter() throws InterruptedException {
		Arb_Ong_obj.fromToCase();
	}
	@Then("user select bulk  action as download Award sheet from it also select download documents")
	public void user_select_bulk_action_as_download_award_sheet_from_it_also_select_download_documents() {
		Arb_Ong_obj.bulkAction();
	}
	@Then("user select any document to download and click on download btn")
	public void user_select_any_document_to_download_and_click_on_download_btn() throws InterruptedException {
		Arb_Ong_obj.downloadDocuments();
	}

	//Except add case

	@Then("user add case in except")
	public void user_add_case_in_except() throws InterruptedException {
		Arb_Ong_obj.exceptAdd();
	}

	/*********************
	 * sent direction
	 * @throws InterruptedException 
	 * 
	 */	



	@Then("user click on the select direction and select direction as {string} to sent")
	public void user_click_on_the_select_direction_and_select_direction_as_to_sent(String string) throws InterruptedException {
		Arb_Ong_obj.selectDirection(string);
	}

	@Then("user click on send direction")
	public void user_click_on_send_direction() throws InterruptedException {
		Arb_Ong_obj.sendBulkDirection();
	}

	//Random 

	@Then("user click on send direction Random filter")
	public void user_click_on_send_direction_random_filter() throws InterruptedException {
		Arb_Ong_obj.sendBulkDirectionRandom();
	}

	
	// Random 

@Then("user click on send No of days in  the direction Random")
public void user_click_on_send_no_of_days_in_the_direction_random() throws InterruptedException {
	Arb_Ong_obj.sendNoOfDaysDirectionBulkRandom();
}


	//send no of days with including paused 

	@Then("user add no of days and click on send direction")
	public void user_add_no_of_days_and_click_on_send_direction() throws InterruptedException {
		Arb_Ong_obj.sendNoOfDaysDirectionPausedBulk();
	}




	//send no of days in direction

	@Then("user click on send No of days in  the direction")
	public void user_click_on_send_no_of_days_in_the_direction() throws InterruptedException {
		Arb_Ong_obj.sendNoOfDaysDirectionBulk();
	}

	// send date in direction 

	@Then("user click on send Date in the  direction")
	public void user_click_on_send_date_in_the_direction() {
		Arb_Ong_obj.sendKeyDateDirectionBulk();
	}


	/*****************************
	 * Random case filter
	 * @throws InterruptedException 
	 * 
	 */

	@Given("user is on ongoing page and select random filter and add cases to it")
	public void user_is_on_ongoing_page_and_select_random_filter_and_add_cases_to_it() throws InterruptedException {
		Arb_Ong_obj.randomFilterSel();

	}










	/************************
	 * @OngoingPageUsability
	 * 
	 */

	@Then("user verify that search input field,search btn,refresh btn")
	public void user_verify_that_search_input_field_search_btn_refresh_btn() {

	}
	@Then("users also verify case details and check box,Send Direction dropdown,button,other button")
	public void users_also_verify_case_details_and_check_box_send_direction_dropdown_button_other_button() {

	}
	@Then("users also verify that Action button , radio button of filter")
	public void users_also_verify_that_action_button_radio_button_of_filter() {

	}
	@Then("user verify bulk action,select direction,send direction")
	public void user_verify_bulk_action_select_direction_send_direction() {

	}

	//Closed


	@Then("user is on the dashboard page and click on the Closed Action")
	public void user_is_on_the_dashboard_page_and_click_on_the_closed_action() {
		Arb_Ong_obj.closedBtn();
	}


	//Oral Hearing 


	@Given("user is on ongoing page and in first case send direction as ScheduleOralHearing")
	public void user_is_on_ongoing_page_and_in_first_case_send_direction_as_schedule_oral_hearing() {
		Arb_Ong_obj.oralHearingDirect();
	}
	@Then("user click on send direction and add date as {string} and time as {string}")
	public void user_click_on_send_direction_and_add_date_as_and_time_as(String string, String string2) throws InterruptedException {
		Arb_Ong_obj.addDateTime(string, string2);
	}
	@Then("user click on  Schedule Directly radio btn")
	public void user_click_on_schedule_directly_radio_btn() {
		Arb_Ong_obj.checkRadioBtn();
	}
	@Then("user click on preview btn and click on send")
	public void user_click_on_preview_btn_and_click_on_send() throws InterruptedException {
		Arb_Ong_obj.sendOralHearingDir();
	}


	// Manually Oral

	@Then("user click on  Schedule Manually  radio btn and add link as {string} and gmail id as {string}")
	public void user_click_on_schedule_manually_radio_btn_and_add_link_as_and_gmail_id_as(String string, String string2) {
		Arb_Ong_obj.mannualOralaHearing(string, string2);
	}


	@Given("user wait for some time")
	public void user_wait_for_some_time() throws InterruptedException {
		Arb_Ong_obj.waitCondition();
	}


}
