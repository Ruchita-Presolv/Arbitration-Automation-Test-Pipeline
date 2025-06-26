package org.stepdefinitions;

import org.factory.DriverFactory;
import org.pages.CaseDetailsAndTrackDownload;

import io.cucumber.java.en.*;

public class CaseDetailsAndTrackDownloadStepDef {
	CaseDetailsAndTrackDownload case_obj= new CaseDetailsAndTrackDownload(DriverFactory.getDriver());


	/**********************************
	 * _DownloadAll Document StepDef  For Single caseId
	 */

	@Given("user is on the ongoing page and click in search box enter the case as {string} and click on the search icon")
	public void user_is_on_the_ongoing_page_and_click_in_search_box_enter_the_case_as_and_click_on_the_search_icon(String string) {
		case_obj.caseIdSearch(string);
	}
	@When("user see the result for the as per search the user click on the caseId")
	public void user_see_the_result_for_the_as_per_search_the_user_click_on_the_case() {
		case_obj.caseIdVisible();
	}
	@Then("user verify that able to see the case details of the same case then user download all document")
	public void user_verify_that_able_to_see_the_case_details_of_the_same_case() throws InterruptedException {
		case_obj.downloadCaseDoc();
	}

	@Then("user click on the downloadall document")
	public void user_click_on_the_downloadall_document() {
		case_obj.downloadFinalAllDoc();
	}


	@Then("user click on download with cover letter")
	public void user_click_on_download_with_cover_letter() {
		case_obj.downloadWithCover();
	}


	@Then("user click on download without  cover letter")
	public void user_click_on_download_without_cover_letter() {
		case_obj.downloadWithoutCover();
	}






	@When("user see the success massage then click on ok btn")
	public void user_see_the_success_massage_then_click_on_ok_btn() throws InterruptedException {
		case_obj.verifySuccessMassage();
	}

	/**********************************
	 * _Directions By Arbitrator Document StepDef  For Single caseId
	 */

	@Then("user click on the Directions By Arbitrator")
	public void user_click_on_the_directions_by_arbitrator() {
		case_obj.directionsByArbitrator();
	}
	@Then("user click on the Download Selected btn")
	public void user_click_on_the_download_selected_btn() {
		case_obj.downloadSelectedSel();
	}


	@Then("user click on the Award Interim Order By Arbitrator")
	public void user_click_on_the_award_interim_order_by_arbitrator() {
		case_obj.awardInterimOrderByArbitratorSel();
	}


	@Then("user click on the Statement Of Claim and Interim Application")
	public void user_click_on_the_statement_of_claim_and_interim_application() {
		case_obj.statementOfClaimAndInterimApplication();
	}

	@Then("user click on the Applications")
	public void user_click_on_the_applications() {
		case_obj.applicationsSel();
	}

	@Then("user click on the close btn")
	public void user_click_on_the_close_btn() {
		case_obj.closeBtn();
	}



	/**********************************
	 *  perticular single  Document download StepDef  For Single caseId @
	 * @throws InterruptedException 
	 */


	@Then("user click on the Request Letter preview")
	public void user_click_on_the_request_letter_preview() {
		case_obj.requestPreview();
	}

	@Then("user click on the Request Letter download")
	public void user_click_on_the_request_letter_download() throws InterruptedException {
		case_obj.requestLetterDown();
	}

	@Then("user preview Noa")
	public void user_preview_noa() {
		case_obj.noaPreview();
	}

	@Then("user download Noa")
	public void user_download_noa() {
		case_obj.noaDown();
	}



	@When("after that user preview arbitrator appoint letter")
	public void after_that_user_preview_arbitrator_appoint_letter() {
		case_obj.arbitratorAppointmentPre();
	}

	@Then("after that user download arbitrator appoint letter")
	public void after_that_user_download_arbitrator_appoint_letter() {
		case_obj.arbAppointDown();
	}

	@When("after that user preview arbitrator assignment  letter")
	public void after_that_user_preview_arbitrator_assignment_letter() {
		case_obj.arbitratorAssignmentPre();
	}
	@When("after that user download arbitrator assignment  letter")
	public void after_that_user_download_arbitrator_assignment_letter() {
		case_obj.assignmentDown();
	}


	@When("after that user preview Consent and Disclosures")
	public void after_that_user_preview_consent_and_disclosures() {
		case_obj.ConsentandDisclosuresPre();
	}

	@When("after that user download Consent and Disclosures")
	public void after_that_user_download_consent_and_disclosures() {
		case_obj.consentandDisclosuresDon();
	}



	@When("after that user preview  Communications  by Admin")
	public void after_that_user_preview_communications_by_admin() {
		case_obj.communicationByAdminPre();
	}


	@When("after that user download  Communications  by Admin")
	public void after_that_user_download_communications_by_admin() {
		case_obj.communicationByAdminDown();
	}


	@When("after that user previw the statement of claim")
	public void after_that_user_previw_the_statement_of_claim() {
		case_obj.statementOfClaimPrev();
	}


	@When("after that user Download the statement of claim")
	public void after_that_user_download_the_statement_of_claim() {
		case_obj.statementOfClaimDown();
	}


	@When("after that user previw the supporting document")
	public void after_that_user_previw_the_supporting_document() {
		case_obj.supportingDocPrev();
	}


	@When("after that user download the supporting document")
	public void after_that_user_download_the_supporting_document() {
		case_obj.supportingDocDown();
	}







	@When("after that user download Claim, and Interim Application, if any")
	public void after_that_user_download_claim_and_interim_application_if_any() {
		case_obj.statementOfClaimPrev();
	}
	@When("user also download the  Supporting Documents")
	public void user_also_download_the_supporting_documents() {
		case_obj.supportingDocuments();
	}







}
