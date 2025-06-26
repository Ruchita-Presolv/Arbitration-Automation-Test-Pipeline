package org.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class OngoingRandomGeneralFilter {
	
	private WebDriver driver;
	String path = System.getProperty("user.dir");

	public OngoingRandomGeneralFilter(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	// Case .Csv Upload 
	
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[1]")
	private WebElement CaseCsv;

	@FindBy(xpath="(//input[@class='form-control'][@name='batch_name'])[2]")
	private  WebElement BatchName;

	@FindBy(xpath="(//span[@class='select2-selection__rendered'][text()='--Select--'])[3]")
	private WebElement SelectClick;

	@FindBy(xpath="//li[normalize-space()='Presolv User via Bombay Blokes Respondent']")
	private WebElement SelectClamaint;

	@FindBy(xpath="//input[@id='upload_document_Input']")
	private WebElement ClickCsvFile;

	@FindBy(xpath="//input[@type='Submit'][@class='btn btn-primary py-2 upload_document_Submit']")
	private WebElement  UploadCsvBtn;

	@FindBy(xpath="//button[text()='Confirm'][@class='swal2-confirm swal2-styled']")
	private WebElement ConfirmClick;

	@FindBy(xpath="//a[text()='Close']")
	private WebElement CloseClick;
	
	
	
	public void caseCsvSel() throws InterruptedException {
		Thread.sleep(2000);
		CaseCsv.click();
		
	}
	public void batchName() {
		String batchName=randomName();
		BatchName.sendKeys(batchName);
	}
	public void claimantName() {
		SelectClick.click();
		SelectClamaint.click();
	}
	
	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ContactHidePopUp;
	
	@FindBy(xpath="//li[normalize-space()='Prashant1 Bhundere t via Bombay (Blokes)']")
	private WebElement SelectClamaintHide;

	
	
	public void claimantNameContactHide() {
		SelectClick.click();
		SelectClamaintHide.click();
		try {
			ContactHidePopUp.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void addCsvFile() {
		String path= System.getProperty("user.dir");
		try {
			ClickCsvFile.sendKeys(path+"\\documents\\NOA_100csv_testing_U.csv");
			UploadCsvBtn.click();
			
		}catch(InvalidArgumentException e) {
			
			e.printStackTrace();
			
		}
	
	}

	/*
	 * public void uploadCaseBtn() { UploadCsvBtn.click(); }
	 */
	public void confirmCsvClick() throws InterruptedException {
		ConfirmClick.click();
		closeClickCsv();
	}
	public void closeClickCsv() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@id='upload_document_mess']")).isDisplayed()) {
			ElementUtil.eu.scrollByJS(driver, CloseClick);
			ElementUtil.eu.waitForElementToBeClickable(driver, CloseClick, 140);
			System.out.println("Succesfully uploaded the case on the platform");
		}
	}
	
	
	
	

	// zip Soc

	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[2]")
	private WebElement ZipSoc;
	
	@FindBy(xpath="//input[@id='upload_document_Input']")
	private WebElement ClaimFileUp ;
	
	@FindBy(xpath="//input[@id='Supporting_document_Input']")
	private WebElement SupportFileUp;
	
	@FindBy(xpath="//input[@class='btn btn-primary py-2 upload_document_Submit']") 
	private WebElement UploadSoc ;
	
	
	public void selZipSoc() throws InterruptedException {
		Thread.sleep(2000);
		ZipSoc.click();
	}
	public void claimSel() {
		
		ClaimFileUp.sendKeys(path+"\\documents\\claim.zip");
	}
	
	public void supportSel() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, SupportFileUp);
		SupportFileUp.sendKeys(path+"\\documents\\support.zip");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
	}
	
	
	
	//Interim Order
	
	
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[3]")
	private WebElement InteriumOrder;

	  @FindBy(xpath="//input[@id='upload_document_Input']")
	  private WebElement InteriumOrderFileUp ;
	  
	  
	 public void interiumOrderSel() throws InterruptedException {
		 Thread.sleep(2000);
		 InteriumOrder.click();
	}
	
	public void interiumOrderfile() throws InterruptedException {
		
		ElementUtil.eu.scrollByJS(driver, InteriumOrderFileUp);
		InteriumOrderFileUp.sendKeys(path+"\\documents\\Interimorder.zip");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
		
		
		//InteriumOrderFileUp.sendKeys(path+"\\documents\\Interimorder.zip");
	}
	
	
	//Award
	
	
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[4]")
	private WebElement Award;
	
	
	@FindBy(xpath="//input[@id='upload_document_Input']")
    private WebElement AwardFileUp;
	
	
	
	public void awardSel() throws InterruptedException {
		 Thread.sleep(2000);
		Award.click();
	}
	public void awardFileUpload() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, AwardFileUp);
		AwardFileUp.sendKeys(path+"\\documents\\Award.zip");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
	}
	
	
	//Courier Csv
	
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[5]")
	private WebElement  CourierCsv;
	
	@FindBy(xpath="//input[@id='upload_document_Input']")
    private WebElement CourierCsvFile ;
	
	@FindBy(css="span[id='select2-courier_type-container']")
	private WebElement TypeOptName;
	
	
	@FindBy(css="ul[class='select2-results__options']>li:nth-child(2)")
	private  WebElement TypeOfDocName;
	

	public void courierCsvSel() throws InterruptedException {
		Thread.sleep(2000);
		CourierCsv.click();
	}
	
	public void typeFileN1() throws InterruptedException {
		Thread.sleep(2000);
		//TypeOptName.sendKeys("Test_Automation");
		TypeOptName.click();
		TypeOfDocName.click();
	}
	

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(3)")
	private  WebElement SOC_Tracking;
	
	public void sOC_Tracking() throws InterruptedException {
		Thread.sleep(2000);
		//TypeOptName.sendKeys("Test_Automation");
		TypeOptName.click();
		SOC_Tracking.click();
	}
	
	@FindBy(css="ul[class='select2-results__options']>li:nth-child(4)")
	private  WebElement Award_Dispatch_proof;
	
	public void award_Dispatch_proof() throws InterruptedException {
		Thread.sleep(2000);
		//TypeOptName.sendKeys("Test_Automation");
		TypeOptName.click();
		Award_Dispatch_proof.click();
	}
	
	@FindBy(css="ul[class='select2-results__options']>li:nth-child(5)")
	private  WebElement Award_Tracking;
	
	public void award_Tracking() throws InterruptedException {
		Thread.sleep(2000);
		//TypeOptName.sendKeys("Test_Automation");
		TypeOptName.click();
		Award_Tracking.click();
	}
	
	
	public void courierCsvFileUpload() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, CourierCsvFile);
		CourierCsvFile.sendKeys(path+"\\documents\\courier_sample_2.csv");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
	}
	
	// Courier Zip
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[6]")
	private WebElement ZipCourier;
	
	@FindBy(xpath="//input[@id='upload_document_Input']")
	private WebElement ZipCourierFileUp;
	
	public void zipCourierSel() throws InterruptedException {
		Thread.sleep(2000);
		ZipCourier.click();
	}
	
	public void zipCourierFileUpload() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, ZipCourierFileUp);
		ZipCourierFileUp.sendKeys(path+"\\documents\\courier.zip");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
	}
	
	
	
	// add proof to upload 

	
	@FindBy(xpath="//input[@id='dispatch_proof_yes']")
	private  WebElement ProofTouploadRadio;
	
	
	@FindBy(xpath="//input[@id='upload_document_dispatch_proof']")
	private  WebElement UploadPdf;
	
	@FindBy(xpath="//label[@class='mb-1']")
	private  WebElement UploadPdfTitle;
	
	public void radioBtnProof() throws InterruptedException  {
		ProofTouploadRadio.click();
		Thread.sleep(2000);
		
		
	}
	
	public void uploadCsvFile () {
		CourierCsvFile.sendKeys(path+"\\documents\\courier_sample_2.csv");
		
	}
	
	public void uploadProof() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.scrollByJS(driver, UploadPdfTitle);
		Thread.sleep(2000);
		UploadPdf.sendKeys(path+"\\documents\\Dispatch_Pro.pdf");
		Thread.sleep(2000);
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
	}
	
	
	
	
	
	
	
	//Additional Doc
	
	@FindBy(xpath="(//div[@class='col-md-12 mb-3'])//div[7]")
	private WebElement AdditionalDoc;
	
	@FindBy(xpath="//input[@id='additional_doc_csv']")
	  private WebElement  AdditionalDocCsv;
	
	@FindBy(xpath="//input[@id='upload_document_Input']")
	  private WebElement AdditionalDocPdf;
	
	
	
	public void additionalDocSel() throws InterruptedException {
		Thread.sleep(2000);
		AdditionalDoc.click();
	}
	public void additionalCsv() {
		AdditionalDocCsv.sendKeys(path+"\\documents\\AdditionalDoc_testing_Csv.csv");
	}
	public void additionalPdf() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, AdditionalDocPdf);
		AdditionalDocPdf.sendKeys(path+"\\documents\\AdditionalDocument.zip");
		ElementUtil.eu.scrollByJS(driver, UploadSoc);
		Thread.sleep(2000);
		UploadSoc.click();
		
		
	}
	
	
	
	
	
//	@FindBy(xpath="")
//	  private WebElement ;
//	  
//	  @FindBy(xpath="")
//	  private WebElement ;
//	  
	
	
	
	
	
	
	
	
	
	//WebElement 
	//@@@@@@@@Select Action to perform
	@FindBy(xpath="(//input[@class='form-check-input'])[1]")
	private WebElement RanFilClick;

	@FindBy(xpath="(//input[@class='form-check-input'])[2]")
	private WebElement GenFilClick;

	@FindBy(xpath="//button[@class='btn btn-secondary py-2 px-3']")
	private WebElement BulkUpBtn;

	
	

	
	

	

	

	

	//==============
	
	
	
	
	
	// upload case csv
	
	
	public void uploadCsvBtn() {
		UploadCsvBtn.click();
	}
	
	
	// page Method 
	/*
	 * #============ Method For CaseCsv 
	 * ========= And ZipSoc ==================
	 */

	public void ongoingBulkUp() {
		ElementUtil.eu.scrollByJS(driver, BulkUpBtn);
		BulkUpBtn.click();
	}
	public void selCaseCsv() {
		CaseCsv.click();	
	}
	


	/*
	 * ================== Method For Upload InterimZip====== And 
	 * 
	 * ==========
	 */
	@FindBy(xpath="//input[@class='col-md-12 dropify'][@id='upload_document_Input']")
	private WebElement InterimFileSel;


	@FindBy(xpath="//input[@class='btn btn-primary py-2 upload_document_Submit']")
	private WebElement IntUpload;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement InterimClose;

	public void selInterim() {
		InteriumOrder.click();
	}
	public void uploadInterimZip() {
		InterimFileSel.sendKeys(path+"\\documents\\Interimorder.zip");

	}
	public void intUpload() {
		IntUpload.click();
	}
	public void intClose() {
		if(driver.findElement(By.xpath("//p[@class='text-success mb-2']")).isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickable(driver, InterimClose, 10);
		}
	}
	/*
	 * ================== Method For Upload Courier .csv====== 
	 * 
	 * ==========
	 */

	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement TypeOpName;

	@FindBy(xpath="//input[@id='couriercsvFileInput']")
	private WebElement SelCsvFile;

	@FindBy(xpath="//input[@class='btn btn-primary p-2 couriercsvSubmit']")
	private WebElement UploadBtn;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ConfirmBtn;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement  Closebtn;


	public void CourierCsv() {
		CourierCsv.click();
	}
	public void typeFileN() {
		TypeOpName.sendKeys("Test_Automation");
	}
	public void selCourierCsv() {
		SelCsvFile.sendKeys(path+"\\documents\\courier_sample.csv");	
	}
	public void uploadBtn() {
		UploadBtn.click();
	}
	public void confirmBtn() {
		ElementUtil.eu.waitForElementToBeClickable(driver, ConfirmBtn, 100); 
	}
	public void closebtn() {
		if(driver.findElement(By.xpath("//div[@id='csvmess']")).isDisplayed()) {
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 10, Closebtn);
		}
	}

	/*
	 * ================== Method For Upload ZipCourier ====== 
	 * 
	 * ==========
	 */
	@FindBy(xpath="//input[@id='courierFileInput']")
	private WebElement ZipCourierFile;

	@FindBy(xpath="(//input[@class='form-control'])[2]")
	private WebElement TypeNameZipC;

	@FindBy(xpath="//input[@class='btn btn-primary p-2 courierSubmit']")
	private WebElement ZipUpload;

	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement ZipConfirm;


	@FindBy(xpath="//div[@id='czmess']")
	private WebElement ZipSMassage;


	@FindBy(xpath="//a[text()='Close']")
	private WebElement Zipclose;

	public void ZipCourier() {
		ZipCourier.click();
	}
	public void typeFilename() {
		TypeNameZipC.sendKeys("Test_Automation");
	}
	public void selZipCourierFile() {
		ZipCourierFile.sendKeys(path+"\\documents\\courier.zip");
	}
	public void zipUpload() {
		ElementUtil.eu.scrollByJS(driver, ZipUpload); 
		ZipUpload.click();
	}
	public void zipConfirm() throws InterruptedException {
		//Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ZipConfirm, 100);
	}
	public void zipClose() {

		if(ZipSMassage.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickable(driver, Zipclose, 100);
		}
	}

	/*
	 * ================== Method For Upload Award ====== 
	 * 
	 * ==========
	 */


	@FindBy(xpath="//input[@id='upload_document_Input']")
	private WebElement SelAwardFile;

	@FindBy(xpath="//input[@class='btn btn-primary py-2 upload_document_Submit']")
	private WebElement AwardUpload;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement AwardConfirm;
	
	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement AwardClose;

	public void awardsel() {
		Award.click();
	}
	public void selAward() {
		SelAwardFile.sendKeys(path+"\\documents\\Award.zip");
	}
	public void awardUpload() {
		AwardUpload.click();
	}
	public void awardClose() {

		//		@FindBy(xpath="//input[@id='FileInput']")
		//		private WebElement SelAdditionalDoc;
		if(driver.findElement(By.xpath("//p[@class='text-success mb-2']")).isDisplayed()) {
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 10, AwardClose);}
	}

	/*
	 * ================== Method For Upload AdditionalDoc ====== 
	 * 
	 * ==========
	 */


	@FindBy(xpath="//input[@id='FileInput']")
	private WebElement SelAdditionalDoc;

	@FindBy(xpath="//button[@id='UpDocsSubmit']")
	private WebElement AddDocUpload;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement AddDocClose;

	public void AdditionalDoc() {
		AdditionalDoc.click();
	}
	public void selAddDocFile() {
		SelAdditionalDoc.sendKeys(path+"\\documents\\AdditionalDocument.zip");
	}
	public void uploadAdd() {
		AddDocUpload.click();
	}

	public void closeAdd() {
		if(driver.findElement(By.xpath("//p[@class='text-success mb-2']")).isDisplayed()) {
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 40, AddDocClose); 
		}
	}

	public static  String randomName() {
		String[] firstName = {"Ajay", "Rohit","JAY","Vinay","Rakesh","Arun"};
		String[] lastName ={"Devid","Musk","Pitter","Kumar","Roy", "Ambani ","aa","dsd","sds","%%"};
		Integer[] num= {34,54,1,3,4,5,6,0,8,7,6,44,67,88,87,44,33,77,55,22,77,66,55,355,353,56,90};
		Random random = new Random();
		//System.out.println(firstName[random.nextInt(firstName.length)]+" "+lastName[random.nextInt(lastName.length)]);

		String str =(firstName[random.nextInt(firstName.length)]+"_"+lastName[random.nextInt(lastName.length)]+"_"+num[random.nextInt(num.length)]);
		for(int i=1; i<=firstName.length; i++)
		{
			// System.out.println("Name:"+str);

		} //System.out.println("Name:"+str);
		return str;        
		//System.out.println(str);
	}


	/***********************
	 * Update Batch name  
	 */

	@FindBy(css="select[id='batch_name_change']")
	private WebElement SelBatchName;

	@FindBy(css="select[id='batch_name_change']>option:nth-child(86)")
	private WebElement SelBatchToRename;

	@FindBy(css="button[id='filter_search']")
	private WebElement FilterSearch;


	@FindBy(xpath="(//input[@class='selarbcaseall'])[2]")
	private WebElement SelAllCasesBot;

	@FindBy(xpath="(//input[@class='selarbcaseall'])[1]")
	private WebElement SelAllCasesTOP;

	@FindBy(css="#update_batch_btn")
	private WebElement UpdateBatchName;

	@FindBy(css="textarea[id='editbatch']")
	private WebElement AddBatchName;

	@FindBy(css="input[id='batch_submit']")
	private WebElement Submit;

	@FindBy(css="select[class='form-control form-control-sm']")
	private WebElement CasePerPage;

	@FindBy(css="input[id='for_general']")
	private WebElement SelGenFilter;

	@FindBy(xpath="//button[@class='btn btn-secondary py-2 px-3 dropdown-toggle']/../../div[4]//button[1]")
	private WebElement ClickOnBulkAction;

	public void pageRefresh() throws InterruptedException {
		Thread.sleep(3000);
		// Actions actions = new Actions(driver);

	        // Refresh the page using the Actions class
	       // actions.sendKeys(Keys.F5).perform();
		 // actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		//ElementUtil.eu.pageRefresh(driver, 2);
		  //driver.navigate().refresh();
		  driver.get(driver.getCurrentUrl());

	}

	public void batchsel() throws InterruptedException {
		Thread.sleep(2000);
		//ElementUtil.eu.windowScrollUpByJs(driver);
		ElementUtil.eu.scrollByPageUp(driver, 6);

		//ElementUtil.eu.selectDropDownPosition(driver, SelBatchName, "5");
		ElementUtil.eu.clickByJS(driver, SelBatchName);
		//SelBatchName.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelBatchToRename, 60);
		System.out.println(SelBatchToRename.getText());

		FilterSearch.click();
		Thread.sleep(2000);
		ElementUtil.eu.selectDropDownValue(driver, CasePerPage, "25");
		SelAllCasesTOP.click();
	}

	public void selAllCaseinThisBatch() {

		//ElementUtil.eu.selectDropDown(driver, CasePerPage, "25");
		ElementUtil.eu.scrollByJS(driver, SelAllCasesBot);
		ElementUtil.eu.waitForElementToBeClickable(driver, SelAllCasesBot, 600);


	}
	public void selFilterGen() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, SelGenFilter);
		SelGenFilter.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ClickOnBulkAction, 400);
		//ClickOnBulkAction.click();

	}
	public void selActionUpBatchName() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, UpdateBatchName, 120);	
	}
	public void addNewName() throws InterruptedException {
		Thread.sleep(2000);
		String BatchName=randomString();
		AddBatchName.sendKeys("Test_"+BatchName);
		Submit.click();


		System.out.println("Previous Batch name :-> "+SelBatchToRename.getText());	
		System.out.println("Updated Batch name :-> "+" Test_"+BatchName);

	}


	public static String randomString() {
		String CHARACTERS  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@&*";
		int length= 5;

		Random random = new Random();
		StringBuilder sb= new StringBuilder();

		for(int i=0; i<=length;i++) {
			int randomIndex = 	random.nextInt(CHARACTERS.length());
			char randomchar = CHARACTERS.charAt(randomIndex);
			sb.append(randomchar);

		}
		return sb.toString();

	}
	//	@FindBy(css="")
	//	private WebElement SuccessMassage;
	//	
	//	public void verifySuccessMassage() {
	//		
	//	}

}
