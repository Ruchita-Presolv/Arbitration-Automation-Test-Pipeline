package org.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.ElementUtil;

public class CaseDetailsAndTrackDownload {
	private WebDriver driver;

	public CaseDetailsAndTrackDownload( WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, this);

	}
	// WEB ELEMENTS
	@FindBy(css="input[type='search']")
	private WebElement ClickOnSearchBox;

	@FindBy(css="button[id='search_btn']")
	private WebElement SearchBtn;

	//a[href*='/admin/arbitrator/casedetails?id=']
	@FindBy(css="a[href*='/admin/arbitrator/casedetails?id=']")
	private WebElement CaseIdClick;

	//a[href*='/admin/arbitrator/casedetails?id=']
	/*
	 * //exact case id
	 * 
	 * @FindBy(css="a[href='/admin/arbitrator/casedetails?id=526']") private
	 * WebElement CaseIdClick;
	 */

	@FindBy(xpath="//h5[starts-with(text(),'Case Details:')]/../h5")
	private WebElement CaseDetails;

	@FindBy(xpath="//a[text()='Download All']")
	private WebElement DownloadAllBtn;

	//	@FindBy()
	//	private WebElement 

	/**********************************
	 * _DownloadAll Document Page  For Single caseId
	 */

	public void caseIdSearch(String caseid) {
		ClickOnSearchBox.click();
		ClickOnSearchBox.sendKeys(caseid);
		SearchBtn.click();
	}
	public void caseIdVisible() {
		if(CaseIdClick.isDisplayed()) {
			CaseIdClick.click();
		}
	}
	public void downloadCaseDoc() throws InterruptedException {

		switchToNewSingleWindow();

		Thread.sleep(4000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 640, CaseDetails);
		CaseDetails.getText();
		ElementUtil.eu.scrollByJS(driver, DownloadAllBtn);
		Thread.sleep(4000);
		DownloadAllBtn.click();
		//ElementUtil.eu.waitForVisibilityByWebElement(driver, 800, DownloadAllBtn); 
		Thread.sleep(4000);
	}
	public void switchToNewSingleWindow() {
		String ParentWinId1 = driver.getWindowHandle();
		//System.out.println(ParentWinId1);

		Set<String> allWinId= driver.getWindowHandles();
		Iterator<String> itr = allWinId.iterator();
		String id1= itr.next();
		if(id1.equals(ParentWinId1)) {
			id1=itr.next();
		}
		driver.switchTo().window(id1);
		System.out.println(ParentWinId1);
		System.out.println(id1);
	}
	/*
	 * @FindBy() private WebElement
	 * 
	 * @FindBy() private WebElement
	 */

	@FindBy(css="div[class='modal-footer']>button:last-child")
	private WebElement DownloadAllDoc;

	@FindBy(css="div[class='swal2-success-ring']")
	private WebElement SuccessMassage;

	@FindBy(css="div[class='swal2-icon swal2-error swal2-animate-error-icon']")
	private WebElement failureMassage;


	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement ClickOnOkBtn;

	public void downloadFinalAllDoc() {
		ElementUtil.eu.waitForElementToBeClickable(driver, DownloadAllDoc, 200); 
	}
	public void verifySuccessMassage() throws InterruptedException {
		//Thread.sleep(10000);

		ElementUtil.eu.waitForVisibilityByWebElement(driver, 600, SuccessMassage);

		//ElementUtil.eu.wait(500);
		if(SuccessMassage.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickable(driver, ClickOnOkBtn, 600);

			System.out.println("susscessfully downloaded ");
			//ClickOnOkBtn.click();
		}else if(failureMassage.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickable(driver, ClickOnOkBtn, 600);
			System.out.println("No files available for this Case!");
		}else {
			System.out.println("Documents not available in this case ");
		}
	}




	// with cover letter

	@FindBy(xpath="//button[@id='with_cov_letter']")
	private WebElement WithCover ;

	public void downloadWithCover() {
		WithCover.click();
		System.out.println("*With cover  letter");
	}
	
	// without  cover letter
	@FindBy(xpath="//button[@id='without_cov_letter']")
	private WebElement WithoutCover ;

	public void downloadWithoutCover() {
		WithoutCover.click();
		System.out.println("*Without cover  letter");
	}

	/************************************************************************
	 * _Directions By Arbitrator,Award/Interim Order By Arbitrator
	 * 
	 * Statement Of Claim, And Interim Application,
	 * 
	 * Applications Document For Single caseId
	 * 
	 ***********************************/

	@FindBy(css="div[class='col-sm-8 mt-1']>div:nth-child(1)")
	private WebElement DirectionsByArbitrator ;

	@FindBy(css="input[id='award']")
	private WebElement AwardInterimOrderByArbitrator ;  


	@FindBy(css="input[id='soc']")
	private WebElement  StatementOfClaimAndInterimApplication; 
	;

	@FindBy(css="input[id='application']")
	private WebElement Applications   ;

	@FindBy(css="div[class='modal-footer']>button:nth-child(1)")
	private WebElement CloseBtn ;

	@FindBy(css="div[class='modal-footer']>button:nth-child(2)")
	private WebElement DownloadSelected ;

	public void directionsByArbitrator() {
		//ElementUtil.eu.waitForElementToBeClickable(driver, DirectionsByArbitrator, 200);
		try{
			DirectionsByArbitrator.click();

		}catch(Exception e){

			e.printStackTrace();
			System.out.println("Directions By Arbitrator Document Not Available catch");
		}finally {

			System.out.println(" ");
			CloseBtn.click();
			//driver.close();
		}
	}
	public void awardInterimOrderByArbitratorSel() {
		try{
			AwardInterimOrderByArbitrator.click();

		}catch(Exception e){

			e.printStackTrace();
			System.out.println("Award / Interim Order By Arbitrator Document Not Available catch");
		}finally {

			System.out.println(" ");
			CloseBtn.click();
			//driver.close();
		}
	}
	public void statementOfClaimAndInterimApplication() {

		try{
			StatementOfClaimAndInterimApplication.click();

		}catch(Exception e){

			e.printStackTrace();
			System.out.println("Statement Of Claim, And Interim Application Document Not Available catch");
		}finally {

			System.out.println(" ");
			CloseBtn.click();
			//driver.close();
		}
	}
	public void applicationsSel() {
		try{
			Applications.click();

		}catch(Exception e){

			e.printStackTrace();
			System.out.println("Application Document Not Available inside catch");
		}finally {

			System.out.println(" ");
			CloseBtn.click();
			//driver.close();
		}

	}

	public void closeBtn() {
		ElementUtil.eu.waitForElementToBeClickable(driver, CloseBtn, 600);
		System.out.println("close btn is working ");
	}
	public void downloadSelectedSel() {
		DownloadSelected.click();
	}


	/**********************************
	 * perticular single  Document download   For Single caseId
	 */


	@FindBy(xpath="//a[@href='javascript:void()'][@data-folder='requestLetter']/../../span[2]")
	private WebElement RequestPreview ;

	
	public void requestPreview() {
		try {
			singleDocPreviewWithSwitch(RequestPreview, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@FindBy(xpath="//a[@href='javascript:void()'][@data-folder='requestLetter']/../../span[3]")
	private WebElement RequestDownload;

	public void requestLetterDown() throws InterruptedException {
		singleDocDownloadWithSwitch(RequestDownload, 1);
	}

	@FindBy(xpath="(//a[@href='javascript:void()' and @data-folder='noticeofarbitration'])[1]")
	private WebElement NOAPreview ;

	
	public void noaPreview() {
		try {
			singleDocPreviewWithSwitch(NOAPreview, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@FindBy(xpath="(//a[@href='javascript:void()' and @data-folder='noticeofarbitration'])[2]")
	private WebElement NOADownload;

	public void noaDown() {
		try {
			singleDocDownloadWithSwitch(NOADownload, 1);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@FindBy(xpath="//span[text()='Arbitrator Appointment Letter']/../../td[2]/span[2]")
	private WebElement ArbitratorAppointmentPre ;

	
	public void arbitratorAppointmentPre() {
		try {
			singleDocPreviewWithSwitch(ArbitratorAppointmentPre, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@FindBy(xpath="//span[text()='Arbitrator Appointment Letter']/../../td[2]/span[3]")
	private WebElement ArbitratorAppointmentDon ;

	public void arbAppointDown() {
		try {
			singleDocDownloadWithSwitch(ArbitratorAppointmentDon, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath="//span[text()='Arbitrator Assignment Report']/../../td[2]/span[2]")
	private WebElement ArbitratorAssignmentp ;

	
	public void arbitratorAssignmentPre() {
		try {
			singleDocPreviewWithSwitch(ArbitratorAssignmentp, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
	
	@FindBy(xpath="//span[text()='Arbitrator Assignment Report']/../../td[2]/span[3]")
	private WebElement ArbitratorAssignmentDon ;

	public void assignmentDown() {
		try {
			singleDocDownloadWithSwitch(ArbitratorAssignmentDon, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@FindBy(xpath="//span[text()='Consent and Disclosures']/../../td[2]/span[2]")
	private WebElement ConsentandDisclosuresPre ;

	@FindBy(xpath="//div[@class='modal-body docbox']")
	private WebElement ConsentandDisclosuresPage ;
	
	public void ConsentandDisclosuresPre() {
		try {
			singleDocPreviewWithSwitch(ConsentandDisclosuresPre, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	@FindBy(xpath="//span[text()='Consent and Disclosures']/../../td[2]/span[3]")
	private WebElement ConsentandDisclosuresDon ;

	public void consentandDisclosuresDon() {
		try {
			singleDocDownloadWithSwitch(ConsentandDisclosuresDon, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
	@FindBy(xpath="//div[@class='card-block']//table[5]/tbody//td[7]/a[1]")
	private WebElement CommunicationByAdminPre ;

	public void communicationByAdminPre() {
		try {
			singleDocPreviewWithSwitch(CommunicationByAdminPre, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath="//div[@class='card-block']//table[5]/tbody//td[7]/a[2]")
	private WebElement CommunicationByAdminDown ;

//	public void communicationByAdminDown() {
//		try {
//			singleDocPreviewWithSwitch(CommunicationByAdminDown, ConsentandDisclosuresPage);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public void communicationByAdminDown() {
		try {
			singleDocDownloadWithSwitch(CommunicationByAdminDown, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

	@FindBy(xpath="//table[@id='subbyparty']//tbody//tr//span[text()='Statement of Claim']/../../td[7]//a[1]")
	private WebElement StatementOfClaimPrev ;
	//table[@id='subbyparty']//tbody//tr//span[text()='Statement of Claim']/../../td[7]//a[1]
	//table[@id='subbyparty']//tbody//tr//span[text()='Supporting Documents']/../../td[7]//a[1]
	public void statementOfClaimPrev() {
		try {
			singleDocPreviewWithSwitch(StatementOfClaimPrev, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//table[@id='subbyparty']//tbody//tr//span[text()='Statement of Claim']/../../td[7]//a[2]")
	private WebElement StatementOfClaimDown ;
	//table[@id='subbyparty']//tbody//tr//span[text()='Statement of Claim']/../../td[7]//a[1]
	//div[@class='card-block']//table[3]//tr[2]//span[text()='Statement of Claim']/../../td[6]/a[2]
	public void statementOfClaimDown() {
		try {
			singleDocDownloadWithSwitch(StatementOfClaimDown, 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//table[@id='subbyparty']//tbody//tr//span[text()='Supporting Documents']/../../td[7]//a[1]")
	private WebElement SupportingDocPrev ;
	//div[@class='card-block']//table[3]//tr[3]//span[text()='Supporting Documents']/../../td[6]/a[1]
	
	public void supportingDocPrev() {
		try {
			singleDocPreviewWithSwitch(SupportingDocPrev, ConsentandDisclosuresPage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//table[@id='subbyparty']//tbody//tr//td[@class='SOCD']//span[text()='Supporting Documents']/../../td[7]//a[2]")
	private WebElement SupportingDocDown ;
	//table[@id='subbyparty']//tbody//tr//td[@class='SOCD']//span[text()='Supporting Documents']/../../td[7]//a[2]
	//div[@class='card-block']//table[3]//tr[3]//span[text()='Supporting Documents']/../../td[6]/a[2]
	public void supportingDocDown() {
		try {
			singleDocDownloadWithSwitch(SupportingDocDown, 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@FindBy(xpath="(//a[@data-folder='soc'])[1]")
	private WebElement StatementofClaim ;	
	public void statementofClaim() {
		try {
			singleDocDownloadWithSwitch(StatementofClaim, 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@FindBy(xpath="(//a[@data-folder='soc'])[2]")
	private WebElement SupportingDocuments ;

	public void supportingDocuments() {
		try {
			singleDocDownload(SupportingDocuments);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Reusable methods 
	public void singleDocDownloadWithSwitch(WebElement ele, int pageDownByNo) throws InterruptedException {
		switchToNewSingleWindow();
		Thread.sleep(4000);

		ElementUtil.eu.scrollByPageDown(driver, pageDownByNo);
		Thread.sleep(4000);

		ele.click();
		Thread.sleep(2000);
		succesMassageVerify();
	}
	public void succesMassageVerify() {
		if(driver.findElement(By.cssSelector("h2[id='swal2-title']")).isDisplayed()) {
			driver.findElement(By.cssSelector("button[class='swal2-confirm swal2-styled']")).click();
			System.out.println("File downloaded Successfully ");
		}else {
			System.out.println("File Not downloaded ");
		}
	}

	
	public void singleDocPreviewWithSwitch(WebElement ele,WebElement ele2) throws InterruptedException {
		switchToNewSingleWindow();
		Thread.sleep(4000);
		ele.click();
		Thread.sleep(2000);
		if (ele2.isDisplayed()) {
			System.out.println("User able to preview the page");
		} else {
			System.out.println("User fails to preview the page");
		}


	}



	public void singleDocDownload(WebElement ele) throws InterruptedException {

		ElementUtil.eu.waitForElementToBeClickable(driver, ele, 640);  

		Thread.sleep(2000);
		succesMassageVerify();
	}
}


