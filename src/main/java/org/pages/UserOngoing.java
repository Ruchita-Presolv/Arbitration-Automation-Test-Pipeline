package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class UserOngoing {

	private WebDriver driver; 
	public UserOngoing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Claimant  din

	@FindBy(xpath="//select[@class='form-control applicationselect'][1]") 
	private WebElement SelectApplication;

	@FindBy(xpath="//button[@id='sendapp']") 
	private WebElement SendApplication;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']") 
	private WebElement PreviewBtn;

	@FindBy(xpath="//button[@class='swal2-cancel swal2-styled']") 
	private WebElement Canclebtn;


	@FindBy(xpath="//button[@class='btn btn-primary btn-success p-2']")
	private WebElement FinalSendApplication;

	@FindBy(xpath="//div[@id='mess']")
	private WebElement SuccessMass;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement CloseABtn;

	@FindBy(xpath="//option[text()='Claimant  din']")
	private WebElement Claimantdin;
	//option[text()='Claimant  din']
	public void selectApplication(String application) {
		SelectApplication.click();
		Claimantdin.click();
		System.out.println("Application Send :=> "+Claimantdin.getText());
		//ElementUtil.eu.selectDropDownTextPresent(driver, SelectApplication,"application");		
	}
	public void sendApplication() {
		SendApplication.click();
	}
	public void previewApplication() {
		//PreviewBtn.click();
		ElementUtil.eu.clickByJS(driver, PreviewBtn);
		Canclebtn.isEnabled();
		//ElementUtil.eu.scrollByJS(driver, FinalSendApplication);

		FinalSendApplication.click();

	}
	public void finalStatus() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 10000, SuccessMass);
		if (SuccessMass.isDisplayed()) {
			System.out.println("Succcessfully send the application ");

			ElementUtil.eu.waitForElementToBeClickable(driver, CloseABtn, 800);
			//CloseABtn.click();

		} else {
			System.out.println("fails to  send the application ");
		}

	}
	//
	//Claimant: Application for oral hearing

	@FindBy(xpath="//option[text()='Claimant: Application for oral hearing']")
	private WebElement ClaimantApplicationfororalhearing;
	public void  claimantApplicationfororalhearing() {
		SelectApplication.click();
		ClaimantApplicationfororalhearing.click();
		System.out.println("Application Send :=> "+ClaimantApplicationfororalhearing.getText());
	}


	//Claimant: Intimation regarding failure of settlement

	@FindBy(xpath="//option[text()='Claimant: Intimation regarding failure of settlement']")
	private WebElement ClaimantIntimationregardingfailureofsettlement;

	public void  claimantIntimationregardingfailureofsettlement() {
		SelectApplication.click();
		ClaimantIntimationregardingfailureofsettlement.click();
		System.out.println("Application Send :=> "+ClaimantIntimationregardingfailureofsettlement.getText());
	}

	//Claimant: Application for additional evidence


	@FindBy(xpath="//input[@class='swal2-file']")
	private WebElement SelectFile;

	@FindBy(xpath="//option[text()='Claimant: Application for additional evidence']")
	private WebElement Applicationforadditionalevidence;

	@FindBy(xpath="//h5[@id='exampleModalLabel']")
	private WebElement PreviewPage;

	//h5[@id='exampleModalLabel']
	public void  applicationforadditionalevidence() {
		SelectApplication.click();
		Applicationforadditionalevidence.click();
		System.out.println("Application Send :=> "+Applicationforadditionalevidence.getText());
	}

	public void selectFile() throws InterruptedException {
		Thread.sleep(2000);
		SelectFile.sendKeys(System.getProperty("user.dir")+"//documents//Important one.pdf");	

	}
	public void previewAddDoc() throws InterruptedException {
		PreviewBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 500, PreviewPage);
		//Canclebtn.isEnabled();
		ElementUtil.eu.scrollByJS(driver, FinalSendApplication);
		ElementUtil.eu.scrollByPageDown(driver, 6);

		ElementUtil.eu.clickByJS(driver, FinalSendApplication);
		//FinalSendApplication.click();

	}

	//ClaimantApplicationforExtensionSOC

	@FindBy(xpath="//option[text()='Claimant: Application for Extension - SOC']")
	private WebElement ClaimantApplicationforExtensionSOC;

	@FindBy(xpath="//input[@id='reasonext']")
	private WebElement EnterReasonForExtn;

	@FindBy(xpath="//input[@id='nodays']")
	private WebElement NoOfDays;

	//@FindBy(xpath="")
	//private WebElement 

	public void  claimantApplicationforExtensionSOC() {
		SelectApplication.click();
		ClaimantApplicationforExtensionSOC.click();
		System.out.println("Application Send :=> "+ClaimantApplicationforExtensionSOC.getText());
	}
	public void addReasonAndTime(String reason,String days) {
		EnterReasonForExtn.sendKeys(reason);	
		NoOfDays.sendKeys(days);

	}
	public void previewSocDoc() throws InterruptedException {
		PreviewBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 500, PreviewPage);
		//System.out.println(Canclebtn.isEnabled());
		ElementUtil.eu.scrollByPageDown(driver, 6);
		ElementUtil.eu.scrollByJS(driver, FinalSendApplication);
		ElementUtil.eu.clickByJS(driver, FinalSendApplication);
		//FinalSendApplication.click();

	}

	//@ClaimantApplicationforExtensionFileRejoinder

	@FindBy(xpath="//option[text()='Claimant: Application for Extension File Rejoinder']")
	private WebElement ClaimantApplicationforExtensionFileRejoinder;

	public void  claimantApplicationforExtensionFileRejoinder() {
		SelectApplication.click();
		ClaimantApplicationforExtensionFileRejoinder.click();
		System.out.println("Application Send :=> "+ClaimantApplicationforExtensionFileRejoinder.getText());
	}


	//ClaimantApplicationforextensiontofileReply

	@FindBy(xpath="//option[text()='Claimant: Application for extension to file Reply']")
	private WebElement ClaimantApplicationforextensiontofileReply;

	public void  claimantApplicationforextensiontofileReply() {
		SelectApplication.click();
		ClaimantApplicationforextensiontofileReply.click();
		System.out.println("Application Send :=> "+ClaimantApplicationforextensiontofileReply.getText());
	}

	//@ClaimantApplicationforWithdrawal


	@FindBy(xpath="//option[text()='Claimant: Application for Withdrawal']")
	private WebElement ClaimantApplicationforWithdrawal;


	@FindBy(xpath="//textarea[@class='swal2-textarea']")
	private WebElement InputReasonWithdraw;

	public void  claimantApplicationforWithdrawal() {
		SelectApplication.click();
		ClaimantApplicationforWithdrawal.click();
		System.out.println("Application Send :=> "+ClaimantApplicationforWithdrawal.getText());
	}
	public void withdrawReason(String reason) throws InterruptedException {
		InputReasonWithdraw.sendKeys(reason);
		Thread.sleep(2000);
	}

	//ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings

	@FindBy(xpath="//option[text()='Claimant: Application for Withdrawal with Liberty to file fresh proceedings']")
	private WebElement ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings;

	public void  claimantApplicationforWithdrawalwithLibertytofilefreshproceedings() {
		SelectApplication.click();
		ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings.click();
		System.out.println("Application Send :=> "+ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings.getText());
	}

	//Claimant: Application seeking time on account of settlement

	@FindBy(xpath="//option[text()='Claimant: Application seeking time on account of settlement']")
	private WebElement ClaimantApplicationseekingtimeonaccountofsettlement;

	public void  claimantApplicationseekingtimeonaccountofsettlement() {
		SelectApplication.click();
		ClaimantApplicationseekingtimeonaccountofsettlement.click();
		System.out.println("Application Send :=> "+ClaimantApplicationseekingtimeonaccountofsettlement.getText());
	}

	//other

	@FindBy(xpath="(//a[text()='Other'])[1]")
	private WebElement Otherbtn;


	@FindBy(xpath="//input[@class='swal2-file']")
	private WebElement SelectFileToUpload;


	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement Submitbtn;

	@FindBy(xpath="//div[@id='mess']")
	private WebElement OtherSuccessMass ;

	@FindBy(xpath="//a[text()='Close']")
	private WebElement Closebtn;


	public void otherDoc() {
		Otherbtn.click();
	}
	public void uploadOtherDoc() throws InterruptedException {

		Thread.sleep(2000);
		SelectFileToUpload.sendKeys(System.getProperty("user.dir")+"//documents//Important one.pdf");
		Submitbtn.click();
	}
	public void otherSuccessMass() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 2000, OtherSuccessMass);
		if (OtherSuccessMass.isDisplayed()) {
			System.out.println("Successfully uploaded the document");
			Closebtn.click();

		} else {
			System.out.println("Fails to upload the Document");
		}
	}


	//@ArbitratorDisclosure

	@FindBy(xpath="//a[text()='Arbitrator One']")
	private WebElement ArbitratorLink;

	@FindBy(xpath="//h4[text()='Disclosure']")
	private WebElement pageTitleDis ;

	@FindBy(xpath="//span[@class=' btn btn-sucess btn-xs']")
	private WebElement DisclosureFile ;

	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement CloseDisBtn;

	public void arbOnebtn() throws InterruptedException {
		Thread.sleep(2000);
		ArbitratorLink.click();
	}
	public void downloadDis() throws InterruptedException {

		if (pageTitleDis.isDisplayed()|| DisclosureFile.isEnabled() ) {
			Thread.sleep(2000);
			System.out.println("Successfully download the disclosure");
			if (CloseDisBtn.isDisplayed()) {
				System.out.println("Successfully close the disclosure");
				CloseDisBtn.click();
			} else {
				System.out.println("Fails to close the disclosure");
			}
		} else {
			System.out.println("Fails to download the disclosure ");

		}
	}

	/*
	 * //
	 * 
	 * Bulk Actions
	 * 
	 * //
	 */


	/****************************
	 * Send Application
	 */


	@FindBy(xpath="//input[@id='for_general']")
	private WebElement GeneralFilterBtn;

	@FindBy(xpath="//span[@class='select2-selection__rendered'][1]")
	private WebElement FromInput;

	@FindBy(css="ul[class='select2-results__options']>li:last-child")
	private WebElement SelectCase1st;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(10)")
	private WebElement SelectCase2st;

	@FindBy(xpath="(//span[@class='select2-selection__rendered'])[2]")
	private WebElement ToInput;



	@FindBy(xpath="//select[@class='form-control blkapplicationselect']")
	private WebElement SelectApplicationDrop;

	/*
	 * @FindBy(xpath="") private WebElement
	 */

	public void generalFilterbtn() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.scrollByJS(driver, GeneralFilterBtn);
		GeneralFilterBtn.click();
		Thread.sleep(2000);
	}
	public void fromToInput() throws InterruptedException {
		ElementUtil.eu.waitForElementToBeClickable(driver, FromInput, 60);	
		Thread.sleep(4000);
		
		SelectCase1st.click();
		//SelectCase2st.click();

		Thread.sleep(3000);

		ElementUtil.eu.waitForElementToBeClickable(driver, ToInput, 60);

		Thread.sleep(4000);

		
		SelectCase2st.click();
		//SelectCase1st.click();
		
		Thread.sleep(3000);


	}

	@FindBy(xpath="//select[@class='form-control blkapplicationselect']")
	private WebElement SelectAppBulk;

	public void selectAppBulk(String appName) {
		ElementUtil.eu.selectDropDownValue(driver, SelectAppBulk, appName);
	}

	@FindBy(xpath="//button[@class='btn btn-secondary py-2 px-3 dropdown-toggle']")
	private WebElement BulkActionbtn;

	@FindBy(xpath="//button[@class='dropdown-item blkbtn']")
	private WebElement SendBulkApplication;

	public void bulkActBtn() throws InterruptedException {
		BulkActionbtn.click();
		Thread.sleep(3000);
		SendBulkApplication.click();
		Thread.sleep(3000);
	}


	// excluding cases pop up 

	@FindBy(xpath="//h2[@id='swal2-title'] [text()='Do you want to proceed?']")
	private WebElement ExcludingCasesPopUps;

	@FindBy(xpath="//button[@id='including']")
	private WebElement IncludingHoldCases;



	@FindBy(xpath="//button[@id='excluding']")
	private WebElement ExcludingHoldCases;

	public void includingCases() throws InterruptedException {
		Thread.sleep(2000);
		if (ExcludingCasesPopUps.isDisplayed()) {

			IncludingHoldCases.click();
			System.out.println("some  cases Are Pause ");

		} else {
			System.out.println("All cases Are Active ");
			
		}

	}





	//claimant din bulk send application


	@FindBy(xpath="//option[@value='Claimant  din']")
	private WebElement ClaimantdinApplication;

	@FindBy(xpath="//select[@class='form-control blkapplicationselect']")
	private WebElement SendApplicationBulkBtn;



	public void claimantDinBulkAct() throws InterruptedException {
		SendApplicationBulkBtn.click();
		Thread.sleep(3000);
		ClaimantdinApplication.click();
	}

	/*
	 * # =================Genaral case filter====Add cases to Except ==========
	 */

	@FindBy(xpath="//span[@class='select2-selection select2-selection--multiple']")
	private WebElement ExceptInput ;

	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private List<WebElement> ExpCase4no ;

	@FindBy(xpath="//ul[@class='select2-results__options']//li[6]")
	private WebElement ExpCase6no ;


	public void addCasesToExcept() {
		ExceptInput.click();

		for (int i = 1; i < 5; i++) {
			ExpCase4no.get(i * 2 - 1).click();
			ExceptInput.click();
		}

	}

	//Bulk Action

	@FindBy(xpath="//button[@class='dropdown-item bulkOtherApplication']")
	private WebElement OtherApplicationBtn  ;

	public void bulkApplicationbtn() {
		BulkActionbtn.click();
		OtherApplicationBtn.click();
	}



	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OtherApplicationSubmitBtn ;

	public void uploadAddSubmitBtn() {
		OtherApplicationSubmitBtn.click();
	}



	@FindBy(xpath="//div[@id='mess']")
	private WebElement SuccessBulk ;


	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement BulkClose ;


	public void bulkActSuccessMass() throws InterruptedException {
		Thread.sleep(2000);

		ElementUtil.eu.waitForVisibilityByWebElement(driver, 10000, SuccessBulk);
		if (SuccessBulk.isDisplayed()) {
			System.out.println("Succcessfully send the application ");
			BulkClose.click();
			//ElementUtil.eu.waitForElementToBeClickable(driver, BulkClose, 800);
			//CloseABtn.click();

		} else {
			System.out.println("fails to  upload the file ");
		}
	}



	//Bulk upload other application

	@FindBy(xpath="//button[@id='blkOtherAppBtn']")
	private WebElement BulkOtherApplicationUpload ;

	@FindBy(xpath="//input[@id='fileToUpload']")
	private WebElement UploadFileBulkOther ;


	@FindBy(xpath="//input[@value='Upload']")
	private WebElement  UploadBtn;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ConfirmBtn ;

	@FindBy(xpath="//div[@class='czmess']")
	private WebElement SuccessBulkMass ;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement BulkCloseother  ;

	public void otherAppBulk() {
		BulkActionbtn.click();
		BulkOtherApplicationUpload.click();
	}
	public void upFile() throws InterruptedException {
		UploadFileBulkOther.sendKeys(System.getProperty("user.dir")+"//documents//other.zip");
		Thread.sleep(2000);
		ElementUtil.eu.clickByJS(driver, UploadBtn);
		//UploadBtn.click();
	}
	public void otherBulkSuccessMass() {
		ConfirmBtn.click();
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 100, SuccessBulkMass);
		if (SuccessBulkMass.isDisplayed()) {
			System.out.println("Successfully uploaded the  bulk other application ");
			BulkCloseother.click();
		} else {
			System.out.println("Fails to upload the  bulk other application ");
		}

	}

	//Export to excel

	@FindBy(xpath="//button[@id='reportgenuserongoing']")
	private WebElement ExportToExcel;

	public void exportToExcel() throws InterruptedException {
		BulkActionbtn.click();	
		if (ExportToExcel.isEnabled()) {
			System.out.println("Successfully export data to excel sheet");
			Thread.sleep(2000);
		} else {
			System.out.println("Fails to Export data to excel sheet");
		}	


	}


	//Downloads document

	@FindBy(xpath="//button[@id='download_Docs_user']")
	private WebElement DownloadDocuments;

	@FindBy(xpath="//form[@id='download_Docs_form']//input")
	private List<WebElement> DocumentCheckBox;

	@FindBy(xpath="//button[@id='selected_downlaod']")
	private WebElement DownloadBtn ;

	/*
	 * @FindBy(xpath=" ") private WebElement ;
	 * 
	 * @FindBy(xpath=" ") private WebElement ;
	 * 
	 * @FindBy(xpath=" ") private WebElement ;
	 */



	/*
	 * Randon case Filter
	 * 
	 */


	@FindBy(xpath="//input[@id='for_random']") 
	private WebElement RandomCaseFilterBtn ;

	@FindBy(xpath="(//span[@class='select2-selection select2-selection--multiple'])[2]") 
	private WebElement  RandomInput;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][contains(text(),'A0156')]") 
	private List<WebElement> CaseIds;

	/*
	 * @FindBy(xpath="") private WebElement ;
	 */

	public void randomFilterBtn() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.scrollByJS(driver, RandomCaseFilterBtn);
		RandomCaseFilterBtn.click();
		Thread.sleep(2000);
	}
	public void addCasesToRandomFil() {

		RandomInput.click();
		System.out.println(CaseIds.size());
		for (int i = 0; i <CaseIds.size(); i++) {
			CaseIds.get(i).click();
			ElementUtil.eu.pressEnter(driver, 1);

		}


	}


	//Special hold cases 
	@FindBy(xpath="//button[@id='including']")
	private WebElement IncludingHoldC ;

	@FindBy(xpath="h2[@id='swal2-title']")
	private WebElement IncludingHoldTit ;
	
	public void includingHoldC() {

		if (IncludingHoldC.isDisplayed()) {
			IncludingHoldC.click();
		} else {
			System.out.println("All Cases are active ");
		}


	}


}
