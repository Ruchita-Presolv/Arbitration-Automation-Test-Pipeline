package org.pages;

import java.util.List;
import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class EndToEndScn {
	private WebDriver driver;
	public EndToEndScn(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='fileInput']")
	private WebElement ClickCsvFile;

	public void addCsvFile() {
		String path= System.getProperty("user.dir");
		try {
			ClickCsvFile.sendKeys(path+"\\documents\\NOA_1_csv_testing_U.csv");
		}catch(InvalidArgumentException e) {

			e.printStackTrace();

		}
	}

	@FindBy(xpath="//span[text()='Ongoing']")
	private WebElement OngoingBtn;


	@FindBy(xpath="(//a[contains(@href,'/admin/arbitrator/casedetails?id=')])[1]")
	private WebElement LastCaseId;

	@FindBy(xpath="(//a[contains(@href,'/admin/arbitrator/casedetails?id=')])[10]/../..//td[6]")
	private WebElement ArbAssign;

	/*
	 * @FindBy(xpath="") private WebElement ;
	 */
	static String Caseid=null;
	String ArbAssignStatus;
	public String captureCaseId() throws InterruptedException {
		OngoingBtn.click();
		Thread.sleep(2000);
		Caseid = LastCaseId.getText();
		ArbAssignStatus=ArbAssign.getText();
		Thread.sleep(2000);
		System.out.println(Caseid +"  " + ArbAssignStatus);
		return Caseid;
	}

	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchInput ;

	@FindBy(xpath="//button[@id='search_btn']")
	private WebElement SearchBtn;

	@FindBy(xpath="//input[@class='blkchk check_mark d-block']")
	private WebElement SelectCaseId;

	public void approveSelectedCase() throws InterruptedException {

		if(Caseid!=null) { 
			System.out.println(Caseid); 

			SearchInput.sendKeys(Caseid); 
			Thread.sleep(2000); 
			SearchBtn.click();
			Thread.sleep(2000); 
		}else {

			System.out.println("Case not present ");
		}
		//SelectCaseId.click();

	}


	@FindBy(xpath="//input[contains(@class,'blk')]")
	private WebElement SelectCaseIdCA;

	public void selectCA() throws InterruptedException {
		ElementUtil.eu.waitForElementToBeClickable(driver, SelectCaseIdCA, 300);
		//SelectCaseIdCA.click();
		Thread.sleep(2000);
	}

	/*
	 * @FindBy(xpath="//a[contains(@href,'/arbitrator/arbitration/brief?id=')]")
	 * private WebElement CaseIdCA1;
	 * 
	 * @FindBy(xpath="//span[text()='Ongoing']") private WebElement Ongoing;
	 * 
	 * @FindBy(xpath="//input[@class='form-control form-control-sm']") private
	 * WebElement OngoingSearchIn;
	 * 
	 * @FindBy(xpath="//button[@class=' btn btn-success fa fa-search']") private
	 * WebElement OngoingSearchBtn;
	 * 
	 */
	/*
	 * String caseid=null; public String arbCase() { caseid = CaseIdCA1.getText();
	 * return caseid; }
	 */
	/*
	 * public void searchcaseid() throws InterruptedException {
	 * OngoingSearchIn.sendKeys(caseid); System.out.println(caseid);
	 * OngoingSearchBtn.click(); Thread.sleep(2000); }
	 */


	@FindBy(xpath=" //a[text()=' Accept']")
	private WebElement AcceptSingleCase;


	@FindBy(xpath="//h4[text()='Consent and Disclosures']")
	private WebElement ConcentPage;

	@FindBy(xpath="//button[@id='disclosure_form']")
	private WebElement SubmitAccept;

	public void singleAcceptCase() throws InterruptedException {
		ElementUtil.eu.waitForElementToBeClickable(driver, AcceptSingleCase, 300);
		if (ConcentPage.isDisplayed()) {
			ElementUtil.eu.scrollByJS(driver, SubmitAccept);
			Thread.sleep(2000);
			SubmitAccept.click();

		} else {
			System.out.println("Concent and Disclosure Page not loaded");
		}
	}


	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement SuccessMassSingle;

	@FindBy(xpath="//button[text()='OK']")
	private WebElement SingleOkBtn;

	public void finalSuccessM() {
		if (SuccessMassSingle.isDisplayed()) {
			SingleOkBtn.click();
			System.out.println("Successfully Accept the case");
			System.out.println(Caseid);
		} else {
			System.out.println("Fails to Accept the case");

		}
	}

	@FindBy(xpath="(//input[@class='form-control form-control-sm'])[3]")
	private WebElement SearchInput2;



	public void previousCase() throws InterruptedException {
		OngoingBtn.click();
		searchCase();

	}
	public void searchCase() throws InterruptedException {

		if(Caseid!=null) { 
			System.out.println(Caseid); 

			SearchInput2.sendKeys(Caseid); 
			Thread.sleep(2000); 
			SearchBtn.click();
			Thread.sleep(2000); 
		}else {
			Thread.sleep(2000); 
			System.out.println("Case not present ");
			Caseid = LastCaseId.getText();
			ArbAssignStatus=ArbAssign.getText();
			searchCase();
		}
		//SelectCaseId.click();

	}

	@FindBy(xpath="//a[contains(@href,'/admin/arbitrator/casedetails?id=')]")
	private WebElement CaseIdClick ;

	@FindBy(xpath="//h5[contains(normalize-space(),'Case Details: ')]")
	private WebElement CaseDetailsPage;

	@FindBy(xpath="//h4[contains(normalize-space(),'Communications by Admin')]")
	private WebElement CommunicationByAdmin;

	@FindBy(xpath="//div[@class='card-block']//table[5]//tbody//td[2]")
	private WebElement DocumentDis;


	public void verifyAddDoc() {
		CaseIdClick.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		if (CaseDetailsPage.isDisplayed()) {
			ElementUtil.eu.scrollByJS(driver, CommunicationByAdmin);
			if (DocumentDis.isDisplayed()) {
				System.out.println("Successfully uploaded additional  document ");
				System.out.println(DocumentDis.getText());
			} else {
				System.out.println("Fails to upload the additional documents ");
			}
		} else {
			System.out.println("Fails to load case details page ");
		}
	}


	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement okBtnFail;
	//Switch win
	public void switchWinAddUrl() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '_blank');");
		//driver.get("https://staging.presolv360.com/login");
		ElementUtil.eu.switchToNewSingleWindow(driver);
		driver.get("https://staging.presolv360.com/login");
		Thread.sleep(2000);
		ElementUtil.eu.waitForPageLoad(driver);
		if (okBtnFail.isDisplayed()) {
			okBtnFail.click();
		}
	}


	// Arbitrator Notifications

	@FindBy(xpath="//span[text()='Mail Record']")
	private WebElement MailRecordBtn; 

	@FindBy(xpath="//h3[text()='Sent Mail']")
	private WebElement SendMailPage;

	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchField;


	@FindBy(xpath="//select[@class='form-control form-control-sm']")
	private WebElement ShowNoOFEntries; 

	@FindBy(xpath="//td[text()='No data found']")
	private WebElement NoDataFound;

	@FindBy(xpath="//table[@id='emailrecord']//tbody//tr[2]")
	private WebElement SuccessResult;

	@FindBy(xpath="//div[@id='emailrecord_info']")
	private WebElement NoOfEntries;

	public void mailRecord() {
		MailRecordBtn.click();
		if (SendMailPage.isDisplayed()) {
			System.out.println("Successfully Load the Send mail page");
		} else {
			System.out.println("Fails to load the page");
		}

	}
	public void sendMail(String date) throws InterruptedException {
		SearchField.sendKeys(date);
		Thread.sleep(2000);

		if (SuccessResult.isDisplayed()) {
			System.out.println("Successfully Send Mail"+" "+NoOfEntries.getText());			
		}else if(NoDataFound.isDisplayed()){
			//NoDataFound.isDisplayed();
			System.out.println("Fails to send the Mails");
		}else {

		}
	}


	// Notifications 

	/************
	 * Email
	 */


	@FindBy(xpath="//span[text()='Notification Queue']")
	private WebElement NotificationQueueBtn;

	@FindBy(xpath="//span[text()='Email Queue']")
	private WebElement EmailQueueBtn;

	@FindBy(xpath="//a[@id='tab5']")
	private WebElement EmailQPTitle ;

	@FindBy(xpath="//select[@id='event_change']")
	private WebElement EventTypeSel;

	@FindBy(xpath="//input[@id='from_date']")
	private WebElement FromDate;

	@FindBy(xpath="//input[@id='to_date']")
	private WebElement TooDate;

	@FindBy(xpath="//select[@id='status_change']")
	private WebElement StatusSel;

	@FindBy(xpath="//button[@id='email_filter_search']")
	private WebElement NotiSearchBtn;
	//button[@id='email_filter_search']
	//button[@class=' btn btn-success fas fa-search filter_search']

	@FindBy(xpath="//tbody/tr/td[4]")
	private List<WebElement> EventName;

	@FindBy(xpath="//tbody/tr/td[7]")
	private List<WebElement> ActionStatus ;

	@FindBy(xpath="//select[@class='form-control form-control-sm']")
	private WebElement NoEntriesOnPage;
	//select[@name='email_queue_length']
	//select[@class='form-control form-control-sm']

	@FindBy(xpath="//tbody/tr/td[2]")
	private List<WebElement> CasesId;

	//tbody/tr/td[2]

	public void notificationAct() {
		NotificationQueueBtn.click();
	}

	public void emailQ(String PageTiE) {

		EmailQueueBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		if (EmailQPTitle.isDisplayed()) {
			System.out.println("Eamil queue page loaded Successfully");
		} else {
			System.out.println("Fails to load page");
		}
	}


	public  void filterAdd(String EventN,String D1,String D2,String Status) throws InterruptedException {
		ElementUtil.eu.selectDropDownTextPresent(driver, EventTypeSel, EventN);
		Thread.sleep(1000);
		FromDate.sendKeys(D1);
		TooDate.sendKeys(D2);

		ElementUtil.eu.selectDropDownTextPresent(driver, StatusSel, Status);
		Thread.sleep(1000);
		NotiSearchBtn.click();
		Thread.sleep(2000);
		System.out.println("=======EventN=="+EventN);

	}

	public void verifySearchResult(String EventN) throws InterruptedException {
		// System.out.println(EventN);

		String status=ActionStatus.get(0).getText();
		ElementUtil.eu.selectDropDownTextPresent(driver, NoEntriesOnPage, "1,000");
		Thread.sleep(1000);
		//System.out.println(EventN+":- "+EventName.size()+": Cases Count");

		
		
		
		//		for (int i = 0; i < EventName.size(); i++) {
		//		    WebElement event = EventName.get(i);
		//		    // Perform operations with the WebElement
		//		    System.out.println("CNo" + i + " EventN:" + event.getText());
		//		    String q= "SENT";
		//			if (event.equals(EventN)& status.contains(q) ) {
		//				//System.out.println(event.getSize()); 
		//				System.out.println("Sent : "+status);
		//			} else {
		//				System.out.println("fail"+status);
		//			}
		//		}




		for (WebElement event : EventName) {
			String CaseId=null;
			//System.out.println(EventName.size());
			for (int i = 0; i < CasesId.size(); i++) {
				CaseId=CasesId.get(i).getText();	
			}
			System.out.println();
			String q= "SENT";
			if (event.equals(EventN)|| status.contains(q) ) {
				//System.out.println(event.getSize()); 
				System.out.println("Status : "+status+" "+CaseId);
				//System.out.println("Status : "+status+" "+"Pass");
				//System.out.println("Status :" +"Pass");
			} else {
				System.out.println("fail"+status);
				System.out.println("Status : "+status+" "+CaseId);
			}

		}

	}


	/************
	 * WhatsApp
	 */


	@FindBy(xpath="//span[text()='WhatsApp Queue']")
	private WebElement WhatsAppQueueBtn;

	@FindBy(xpath="//a[@id='tab5']")
	private WebElement WhatsQPTitle ;


	public void whatsAppQ(String PageTiE) {

		WhatsAppQueueBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		String WTit=WhatsQPTitle.getText();
		if (WTit.equals(PageTiE)) {
			System.out.println("WhatsApp queue page loaded Successfully");
		} else {
			System.out.println("Fails to load WA page");
		}
	}

	@FindBy(xpath="//select[@id='status_change']")
	private WebElement StatusWSel ;

	@FindBy(xpath="//button[@id='whatsapp_filter_search']")
	private WebElement NotiWASearchBtn ;


	public  void filterAddWhatsApp(String EventN,String D1,String D2,String Status) throws InterruptedException {
		ElementUtil.eu.selectDropDownTextPresent(driver, EventTypeSel, EventN);
		Thread.sleep(1000);
		FromDate.sendKeys(D1);
		TooDate.sendKeys(D2);

		ElementUtil.eu.selectDropDownTextPresent(driver, StatusWSel, Status);
		Thread.sleep(1000);
		NotiWASearchBtn.click();
		Thread.sleep(1000);
		System.out.println("=======EventN=="+EventN);

	}


	//WhatsApp & Email Queue
	@FindBy(xpath="//span[text()='Whatsapp & Email']")
	private WebElement WhatsAppEmailQueue ;

	@FindBy(xpath="//a[@id='tab5']")
	private WebElement PageTitle ;


	public void waAndEmailQ() throws InterruptedException {
		WhatsAppEmailQueue.click();
		Thread.sleep(2000);
		if (PageTitle.isDisplayed()) {
			System.out.println("Successfully loaded the page");
		} else {
			System.out.println("Fails to load the page ");
		}
	}

	public void verifyWaAndEmail() {

	}



	//Download Email

	@FindBy(xpath="//input[@id='selected_email_download']")
	private WebElement SelectToDownBtn ;

	@FindBy(xpath="//button[@id='bulk_email_download']")
	private WebElement  DownloadBtn;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ConfirmDown ;

	@FindBy(xpath="//div[@id='swal2-content']")
	private WebElement SuccessMass ;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement  FinalOkBtn;

	public void downloadNotif() throws InterruptedException {
		ElementUtil.eu.waitForPageLoad(driver);
		//ElementUtil.eu.scrollByJS(driver, SelectToDownBtn);
		ElementUtil.eu.scrollByPageDown(driver, 5);
		Thread.sleep(2000);
		ElementUtil.eu.clickByJS(driver, SelectToDownBtn);
		//SelectToDownBtn.click();
		DownloadBtn.click();

	}

	public void verifyDownload() throws InterruptedException {

		ElementUtil.eu.waitForElementToBeClickable(driver, ConfirmDown, 300);
		Thread.sleep(2000);
		if (SuccessMass.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickable(driver, FinalOkBtn, 200);
			//FinalOkBtn.click();
			System.out.println("Successfully download the notifications details");
		} else {
			System.out.println("Fails to download notifications details");
		}

	}
	
	
     //WhatsApp Download 
	
	@FindBy(xpath="//input[@id='selected_whatsapp_download']")
	private WebElement SelectWAToDownBtn ;

	@FindBy(xpath="//button[@id='bulk_whatsapp_download']")
	private WebElement  DownloaWAdBtn;
	
	public void downloadWANotif() throws InterruptedException {
		ElementUtil.eu.waitForPageLoad(driver);
		//ElementUtil.eu.scrollByJS(driver, SelectToDownBtn);
		ElementUtil.eu.scrollByPageDown(driver, 5);
		Thread.sleep(2000);
		ElementUtil.eu.clickByJS(driver, SelectWAToDownBtn);
		//SelectToDownBtn.click();
		DownloaWAdBtn.click();

	}

	//Resent mail
	
	/*
	 * @FindBy(xpath="") private WebElement ;
	 * 
	 * @FindBy(xpath="") private WebElement ;
	 * 
	 * @FindBy(xpath="") private WebElement ;
	 * 
	 * @FindBy(xpath="") private WebElement ;
	 * 
	 */
	
	
}

