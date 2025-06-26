package org.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.utilities.ElementUtil;

public class OngoingGeneralFilAct {
	private WebDriver driver ; 

	//Webelements
	@FindBy(css="input[id='for_general']")
	private WebElement GenCaseFil;

	@FindBy(css="span[id='select2-blkdirfrom-container']")
	private WebElement FromClick;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(1)")
	private WebElement  SelFirstCase;

	@FindBy(css="span[id='select2-blkdirto-container'][title='To']")
	private WebElement  ToClick;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(2)")
	private WebElement SelSecondCase;

	@FindBy(css="span[class='select2-selection select2-selection--multiple'][role='combobox']")
	private WebElement ExceptClick;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(2)")
	private WebElement ExceptCase;

	@FindBy(xpath="(//button[@class='btn btn-secondary py-2 px-3 dropdown-toggle'])[1]")
	private WebElement BulkActionClick;





	public OngoingGeneralFilAct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);

	}	
	public void generalFilSel() {
		ElementUtil.eu.scrollByJS(driver, GenCaseFil);
		GenCaseFil.click();
		ElementUtil.eu.scrollByPageDown(driver, 2);
	}
	public void addcCasesFrom() throws InterruptedException {

		ElementUtil.eu.waitForElementToBeClickable(driver, FromClick, 60);	
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, SelFirstCase, 60);

	}
	public void addCaseTo()  {
		ToClick.click();

		ElementUtil.eu.waitForElementToBeClickable(driver, SelSecondCase, 100);
	}
	public void bulkUpClick() {
		BulkActionClick.click();
		//ElementUtil.eu.waitForElementToBeClickable(driver, BulkActionClick, 60);    
	}

	// Actions 
	//1]]

	@FindBy(css="div[class='dropdown-menu show']>button:nth-child(1)")
	private WebElement BulkCloseSel;


	@FindBy(css="textarea[class='swal2-textarea']")
	private WebElement ReasonToClose;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement ApplyReason;

	@FindBy(xpath="//div[center[h5[span[@id='tto']]]]//span")
	private WebElement StatusCheck;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg mt-5']")
	private WebElement CloseBulkClo;
	
	//a[@class='btn btn-danger btn-lg']
	public void bulkClose() {
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkCloseSel, 100);
		//BulkCloseSel.click();
	}
	public void addReason() throws InterruptedException {
		ReasonToClose.sendKeys("Document not Submit");
		ApplyReason.click();
		Thread.sleep(3000);
	}
	
	public void finalBClose() throws InterruptedException {
		Thread.sleep(3000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 4000, StatusCheck);
		if(StatusCheck.isDisplayed()){
			System.out.println("***Successfully close or Withdraw the case ");
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 2000, CloseBulkClo);

		}
		
	}
	

	// 2] Bulk Withdraw 
	@FindBy(css="div[class='dropdown-menu show']>button:nth-child(2)")
	private WebElement BulkWithdrawSel;

	public void bulkWithdraw() {
		BulkWithdrawSel.click();
	}

	// 3] Additional Doc
	@FindBy(css="div[class='dropdown-menu show']>button:nth-child(3)")
	private WebElement AdditionalDocSel;

	@FindBy(css="input[id='fileInput'][name='adoc']")
	private WebElement SelAddDocFile;

	@FindBy(css="input[class='p-2 btn btn-primary blkupdadocc1']")
	private WebElement  AddSubmitBtn;

	@FindBy(xpath="//b[text()='Upload Operation Completed. ']")
	private WebElement UploadStatus;

	@FindBy(xpath="//a[text()='Close']")
	private WebElement  AdditionalDocClose;

	public void addDoc() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, AdditionalDocSel, 100);  
	}
	public void selAddDocFile() {
		SelAddDocFile.sendKeys(System.getProperty("user.dir")+"\\documents\\Important one.pdf");
	}
	public void additionalDocSubmit() {
		AddSubmitBtn.click();
	}
	public void additionalClose() {
		if(UploadStatus.isDisplayed()) {
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 60, AdditionalDocClose);
		}
	}

	//4 Download Award Sheet
	@FindBy(css="div[class='dropdown-menu show']>button:nth-child(4)")
	private WebElement DownloadAwardSheet;

	public void downloadAwardSheet() throws InterruptedException {
		Thread.sleep(2000);
		//DownloadAwardSheet.click();
		//Thread.sleep(2000);
		if(DownloadAwardSheet.isEnabled()) {
			System.out.println("Successfully download the Award sheet");
			
		}else {
			System.out.println("Fails to download the Award sheet");
		}
	}

	// 5 Download Documents

	// 1] @ Notice of arbitration
	@FindBy(css="div [id='download_Docs']")
	private WebElement DownloadDocumentsAct;


	// css=form[id='download_Docs_form'] input:nth-child(1)
	//form[id='download_Docs_form']>input[name='sectionSelected[]']:nth-child(1)
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[1]")
	private WebElement Noticeofarbitration;

	@FindBy(css="div[class='modal-footer']>button:nth-child(2)")
	private WebElement DownloadBtn ;

	@FindBy(css="div[class='swal2-icon swal2-success swal2-animate-success-icon']")
	private WebElement SuccessMassage1;

	@FindBy(css="h2[class='swal2-title']")
	private WebElement SuccessMassage2;
	
	
	@FindBy(css="div[class='swal2-icon swal2-error swal2-animate-error-icon']")
	private WebElement FailureMassage2;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement OkBtn;


	public void downloadActSel() throws InterruptedException {
		Thread.sleep(2000);
		DownloadDocumentsAct.click();
	}
	public void noticeOfArbSel() {

		ElementUtil.eu.waitForElementToBeClickable(driver, Noticeofarbitration, 100);
		//Noticeofarbitration.click();
	}
	public void downloadClick() {

		DownloadBtn.click();		
	}
	
	
	//Cover letter pop up
	@FindBy(css="button[class='swal2-confirm custom-confirm-class swal2-styled']")
	private WebElement DownloadWithCover;
	//button[class='swal2-confirm custom-confirm-class swal2-styled']
	//button[id='with_cov_letter']
	
	public void downloadWithCover() throws InterruptedException {
		Thread.sleep(2000);
		DownloadWithCover.click();
		System.out.println(" ***Download with cover letter ");
	}
	
	//Cover without letter pop up
		@FindBy(css="input[id='without_cov_letter']")
		private WebElement DownloadWithoutCover;
		
		//input[id='without_cov_letter']
		//button[id='without_cov_letter']
		
		public void downloadWithoutCover() throws InterruptedException {
			Thread.sleep(2000);
			DownloadWithoutCover.click();
			DownloadWithCover.click();
			System.out.println("***Download without cover letter ");
		}
		
	
	

	public void statusOkBtn() throws InterruptedException {
		Thread.sleep(8000);
		if(SuccessMassage1.isDisplayed()) {
			Thread.sleep(2000);
			System.out.println("Zip downloaded successfully! ");
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 240, OkBtn);

		}else if(FailureMassage2.isDisplayed())
		{   Thread.sleep(2000);
		System.out.println("No files available for this Case!");

		ElementUtil.eu.waitForElementToBeClickable(driver, OkBtn, 240);
		}
		else {
			System.out.println("No Massage is  displayed");
		}
	}
	public void statusOkBtn1() throws InterruptedException {
		Thread.sleep(8000);
		if(SuccessMassage2.isDisplayed()) {
			Thread.sleep(2000);
			System.out.println("Zip downloaded successfully! ");
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 240, OkBtn);

		}else if(FailureMassage2.isDisplayed())
		{   Thread.sleep(2000);
		System.out.println("No files available for this Case!");

		ElementUtil.eu.waitForElementToBeClickable(driver, OkBtn, 240);
		}
		else {
			System.out.println("No Massage is  displayed");
		}
	}

	// 2]  @Arbitrator Consent
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[2]")
	private WebElement  ArbitratorConsent;

	public void arbConcent() {
		ElementUtil.eu.waitForElementToBeClickable(driver, ArbitratorConsent, 100);
		//ArbitratorConsent.click();
	}

	// 3]  @Statement of claim 
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[3]")
	private WebElement   StatementOfClaim;

	public void statementOfClaim() {
		ElementUtil.eu.waitForElementToBeClickable(driver, StatementOfClaim, 100);
		//StatementOfClaim.click();
	}
	// 4]  @Direction by arbtrator
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[4]")
	private WebElement  DirectionByArbtrator;

	public void directionByArbtrator() {
		ElementUtil.eu.waitForElementToBeClickable(driver, DirectionByArbtrator, 100);

	}
	// 5]  @Application to download
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[5]")
	private WebElement  ApplicationToDownload;

	public void applicationToDownload() {
		ElementUtil.eu.waitForElementToBeClickable(driver, ApplicationToDownload, 100);

	}

	// 6]  @Award or Interm order
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[6]")
	private WebElement  AwardOrIntermOrder;

	public void awardOrIntermOrder() {
		ElementUtil.eu.waitForElementToBeClickable(driver, AwardOrIntermOrder, 100);

	}

	// 7] @Additonal documents
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[7]")
	private WebElement  Additonaldocuments;

	public void additonaldocuments() {
		ElementUtil.eu.waitForElementToBeClickable(driver, Additonaldocuments, 100);

	}

	// 8] @Award delevery report
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[8]")
	private WebElement  AwardDeleveryReport;

	public void awardDeleveryReport() {
		ElementUtil.eu.waitForElementToBeClickable(driver, AwardDeleveryReport, 100);

	}

	// 9] @Party reply
	@FindBy(xpath="(//div[form[input[@name='sectionSelected[]']]])//input[10]")
	private WebElement  PartyReply ;

	public void partyReply() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, PartyReply, 200);

	}

	// 10] @DownloadAll document
	@FindBy(css="button[id='downlaod_all']")
	private WebElement  DownloadAllDocument ;

	public void downloadAllDocument() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, DownloadAllDocument, 200);

	}

	// 11] @Random Document download 
	public void randomDocumentDownload() {
		ElementUtil.eu.waitForElementToBeClickable(driver, Noticeofarbitration, 100);
		ElementUtil.eu.waitForElementToBeClickable(driver, StatementOfClaim, 100);
		ElementUtil.eu.waitForElementToBeClickable(driver, AwardDeleveryReport, 100);
		ElementUtil.eu.waitForElementToBeClickable(driver, Additonaldocuments, 100);

	}

	// 12] @close btn
	@FindBy(css="button[class='btn btn-secondary']")
	private WebElement  CloseBtn ;

	public void closeBtnClick() {
		ElementUtil.eu.waitForElementToBeClickable(driver, CloseBtn, 200);

	}
	
	
	/*****************************************************************************
	 * 4) select cases by using from to filter and add cases in except 
	 * @throws InterruptedException 
	 *  
	 ************************************/

	// Actions 
	// 1] Bulk Close
	
	public void exceptAddCases() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptClick, 300);
		//ExceptClick.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptCase, 300);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkActionClick, 300);
		
	}
	
	/*****************************************************************************
	 * 5) select Single cases by using from to filter    
	 ************************************/
	
	
	@FindBy(css="span[id='select2-blkdirto-container'][class]")
	private WebElement  ToClickS;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(1)")
	private WebElement SelSecondCaseS;
	
	
	public void singleCaseSelect() throws InterruptedException {
	
		Thread.sleep(2000);
		ToClickS.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelSecondCaseS, 100);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkActionClick, 300);
	}
	
	/*****************************************************************************
	 * 6) user select single case and add same case in except and take action   
	 * @throws InterruptedException 
	 ************************************/
	
	
	@FindBy(css="ul[class='select2-results__options']>li:first-child")
	private WebElement ExceptCase1;
	
	@FindBy(css="h2[id='swal2-title']")
	private WebElement MassVerify;
	
	
	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement MassageOkBtn;
	public void noCaseSelect() throws InterruptedException {

		Thread.sleep(2000);
		ToClickS.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelSecondCaseS, 100);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptClick, 300);
		//ExceptClick.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptCase1, 300);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkActionClick, 300);
		
	}
	public void verifyerrorMass() {
		if(MassVerify.isDisplayed()) {
			System.out.println("Select at least @One  case to perform the action ");
			MassageOkBtn.click();
			
		}else {
			System.out.println("case selected");
		}
	}
	
	/*****************************************************************************
	 *  7] if user select cases from platform and also click on 
	 *     input box then unselect the cases  selected before   
	 ************************************/

	@FindBy(css="input[class='singlecs check_mark']")
	private WebElement checkedCheckBox ;
	
//	@FindBy()
//	private WebElement
//	
//	@FindBy()
//	private WebElement
//	
//	@FindBy()
//	private WebElement
	
	public void  iterateSelCaseCheckBox() {
		 List<WebElement> list = new ArrayList<>();
		
		  for(int i=0;i<= 10;i++){
			  list.add(checkedCheckBox);
			  if(list.size()%2==0){
				  
				 ElementUtil.eu.waitForElementToBeClickable(driver, checkedCheckBox, 100);
			  }
	        }
	}
}
