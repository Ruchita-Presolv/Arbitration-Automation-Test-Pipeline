package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class AdminUsability {
	private WebDriver driver;

	public AdminUsability(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this );
	}


	/*************************
	 * Dashboard step
	 * 
	 */

	@FindBy(css="img[class='hidden-md-down']")
	private WebElement HomePage;

	@FindBy(css="input[class='form-control'][id='startDate']")
	private WebElement StartDate;

	@FindBy(css="input[class='form-control'][id='endDate']")
	private WebElement EndDate;

	@FindBy(css="select[class='form-control']")
	private WebElement SelectArb;

	@FindBy(css="select[class='form-control'][id='enterprise']")
	private WebElement SelectEnterprise;

	@FindBy(css="input[class='form-control'][id='chat_startDate']")
	private WebElement Chat360FromDate;

	@FindBy(css ="input[class='form-control'][id='chat_endDate']")
	private WebElement Chat360EndDate;

	@FindBy(css ="button[class='btn btn-primary pribtn btn-fullrounded center-block ']")
	private WebElement ExportToExcel;


	public void verifyDateFilter() {
		if(HomePage.isDisplayed()) {
			System.out.println("User is on Dashboard page ");
		}else{
			System.out.println("Fails to logged the application");
		}
		if(StartDate.isEnabled()& EndDate.isEnabled()) {
			StartDate.sendKeys("22-12-2023");
			EndDate.sendKeys("02-12-2024");
			System.out.println("User able to select date from calender");
		}else {
			System.out.println("Fails to select date from calender ");
		}
	}
	public void selArbritratorEnterprise() throws InterruptedException{
		if(SelectArb.isEnabled()&SelectEnterprise.isEnabled()) {
			ElementUtil.eu.selectDropDownTextPresent(driver, SelectArb, "shubham Arb" );
			Thread.sleep(2000);
			ElementUtil.eu.selectDropDownTextPresent(driver, SelectEnterprise, "Presolv360" );
			Thread.sleep(2000);
			System.out.println("Successfully select the Arbitrator & EnterPrise ");

		}else {
			System.out.println("Fails to select both");
		}
	}

	public void chat360Download() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, Chat360FromDate);
		if(Chat360FromDate.isEnabled()& Chat360EndDate.isEnabled()) {
			Chat360FromDate.sendKeys("03-09-2017");
			Thread.sleep(2000);
			Chat360EndDate.sendKeys("03-09-2023");
			Thread.sleep(2000);
			System.out.println("user able to enter date to fiter out the report in chat360");
			if(ExportToExcel.isEnabled()) {
				System.out.println("Successfully export the chat360 report in excel sheet  ");
			}else {
				System.out.println("Fails to export the excel report ");
			}
		}else {
			System.out.println("Fails to enter the date in chat360");
		}
	}

	/****************************
	 * @ArbitrationNotifications
	 * 
	 */
	@FindBy(xpath="//span[@class='lbl'][text()='Arbitration Notifications']")
	private WebElement ArbNotificationSel;

	@FindBy(xpath="//h4[normalize-space()='Arbitration Notifications']")
	private WebElement ArbNotificationTitle;

	@FindBy(css="button[class='btn btn-success']")
	private WebElement ReadBtn;

	@FindBy(css="button[class='btn btn-primary']")
	private WebElement UnReadBtn;

	//@FindBy()
	//private WebElement

	public void arbNotificatin() {
		ArbNotificationSel.click();
	}
	public void VerifyArbNotPage() {
		if(ArbNotificationTitle.isDisplayed()) {
			System.out.println("User see the Arb notification");
			if(ReadBtn.isEnabled() || UnReadBtn.isEnabled()) {
				System.out.println("User able to change the notifications  Read/Unread Status");
			}else {
				System.out.println("User fails to change the notifications  Read/Unread. Status");

			}
		}else {
			System.out.println("Fails to see the Arb notification"); 

		}
	}
	@FindBy(xpath="//div[starts-with(@class,'col-md-1')]//p")
	private WebElement DateCapture ;
	public void verifyPageNotif() {
		if(ArbNotificationTitle.isDisplayed()) {
			ElementUtil.eu.waitForVisibilityByWebElement(driver, 10, ArbNotificationTitle);
			System.out.println(DateCapture.getText()); 
		}else {
			System.out.println("Notification not Visible for Arbitrator");
		}
	}

	/********************
	 * @ShareFileFun
	 */
	@FindBy(css="a[href='https://staging.presolv360.com/admin/sharedfiles']")
	private WebElement ShareFileSel;

	@FindBy(xpath="//h3[normalize-space()='Shared Files']")
	private WebElement SharefilePTitle;

	@FindBy(css="a[href='javascript:void(0);']")
	private WebElement DownloadSharedFile;

	@FindBy(css="input[class='form-control form-control-sm']")
	private WebElement SearchField;

	@FindBy(css="button[class='btn btn-primary']")
	private WebElement UploadShareFile;

	@FindBy(css="select[class='form-control form-control-sm']")
	private WebElement NoOfEntries;

	public void verifyShareFile() {
		ShareFileSel.click();
		if(SharefilePTitle.isDisplayed()) {
			System.out.println("user able to see share file page");
		}else {
			System.out.println("fails to see the share file page");
		}
	}

	public void shareFileInputFields() {
		if(DownloadSharedFile.isEnabled()& SearchField.isEnabled() & UploadShareFile.isEnabled()& NoOfEntries.isEnabled()) {
			System.out.println("user able to perform any action base on input he given ");
		}else {
			System.out.println("input field not working ");
		}
	}

	/********************
	 *  @ShareFileUpload
	 */

	@FindBy(css="input[id='fileInput']")
	private WebElement FileSelect;

	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	private WebElement SelUserClick;

	@FindBy(css="li[class='select2-results__option select2-results__option--selectable']")
	private WebElement SelectUser;

	@FindBy(css="input[class='btn btn-primary w-100  py-2']")
	private WebElement SubmitShareFile;

	@FindBy(css="div[class='swal2-content']")
	private WebElement SuccessMassage;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement ShareOkBtn;

	@FindBy(xpath="//h3[normalize-space()='Share File']")
	private WebElement ShareFilePopUp;

	public void uploadShareFile() throws InterruptedException {
		UploadShareFile.click();
		Thread.sleep(2000);

		try{
			if(ShareFilePopUp.isDisplayed()) {
				FileSelect.sendKeys(System.getProperty("user.dir")+"\\documents\\AdditionalDocument.zip");
				ElementUtil.eu.scrollByJS(driver, SelUserClick);
				SelUserClick.click();
				//ElementUtil.eu.waitForElementToBeClickable(driver, SelectUser, 400);
				SelectUser.click();
				SubmitShareFile.click();
				System.out.println("file selected successfully");
			}

		}catch(Exception e) {
			System.out.println("fail to select file");
			e.printStackTrace();

		}
	}
	public void verifySuccessMassage() {
		if(SuccessMassage.isDisplayed()) {
			System.out.println("successfully uploaded the file");
		}else {
			System.out.println("Fails to upload file ");
		}
	}

	/*******************
	 * @ResolvBtn
	 */

	@FindBy(css="span[class='spanresolve']")
	private WebElement ResolvBtn;

	@FindBy(xpath="//span[@class='lbl' and text()='Arbitration360']")
	private WebElement Arbitation360Btn;

	@FindBy(css="li[class='securemedtab with-sub arbitration opened'] ul li")
	private List<WebElement> AllActionInsideArb360;

	//	@FindBy()
	//	private WebElement 
	public void resolvSel() {
		ResolvBtn.click();
		System.out.println(Arbitation360Btn.getText());
	}
	public void arb360SelGetAct() {
		Arbitation360Btn.click();
		for(WebElement act:AllActionInsideArb360) {

			System.out.println(act.getText());	
		}
	}

	public void verifyAllActionResolv() {
		for(WebElement act:AllActionInsideArb360) {
			if(act.isEnabled()) {


			}else {
				System.out.println("All actions are not working ");
			}
		}
		System.out.println("All actions are working ");
	}

	/*****************************
	 * @ResolvBtnActionsWorking
	 * 
	 */

	@FindBy(xpath="//span[normalize-space()='For admin review']")
	private WebElement ForAdminBtn;

	@FindBy(css="li[class='securemedtab with-sub arbitration_ongoing ']")
	private WebElement OngoingBtn;

	@FindBy(css="li[class='securemedtab with-sub arbitration_closed ']")
	private WebElement ClosedBtn;

	@FindBy(css="li[class='securemedtab with-sub arbitration_rejected ']")
	private WebElement RejectedBtn;

	@FindBy(css="li[class='securemedtab with-sub arbitration_document ' ]")
	private WebElement DocumentList;

	@FindBy(css="span[class='nav-link-in']")
	private WebElement PageName;

	//	@FindBy(css="")
	//	private WebElement 

	public void forAdminReview(String title) {
		verifyPageTitle(ForAdminBtn, title);	
	}
	public void ongoing(String title) {
		verifyPageTitle(OngoingBtn, title);	
	}
	public void closed(String title) {
		verifyPageTitle(ClosedBtn, title);	
	}
	public void reject(String title) {
		verifyPageTitle(RejectedBtn, title);	
	}
	public void documentList(String title) {
		verifyPageTitle(DocumentList, title);	
	}

	public void verifyPageTitle(WebElement actionBtn ,String actTitle) {
		actionBtn.click();
		if(actTitle.equals(PageName.getText())) {
			System.out.println("Successfully loaded the page :- "+PageName.getText());
		}else {
			System.out.println("Fail to load the page :- "+PageName.getText());
		}
	}

	/******************
	 * @AddNewBtn
	 */

	@FindBy(css="span[class='spanaddnew']")
	private WebElement AddNewBtn;

	@FindBy(css="li[id='addnew ']>ul>li")
	private List< WebElement> AllActionAddNewBtn;


	@FindBy(css="li[id='addnew ']>ul>li")
	private WebElement All10ActionAddNewBtn;

	@FindBy(xpath="//span[@class='lbl'][text()='Users']")
	private WebElement UsersBtn;

	@FindBy(css="li[class='securemedtab with-sub Users opened']>ul li")
	private List<WebElement> AllActionsUserBtn;

	//	public void addNewOptions() throws InterruptedException {
	//		AddNewBtn.click();
	//		Thread.sleep(2000);
	//		for(WebElement ele :AllActionsUserBtn ) {
	//			System.out.println(ele.getText());
	//			ElementUtil.eu.waitForPageLoad(driver);
	//		}

	//}
	public void allActionEnability() throws InterruptedException {
		AddNewBtn.click();
		Thread.sleep(2000);
		for(WebElement addact:AllActionAddNewBtn) {
			if(addact.isEnabled()) {
				System.out.println(addact.getText());
			}else {
				System.out.println("Not all actions are working");
			}
		}
		System.out.println("All actions are working");
	}

	public void userActions() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 1000, UsersBtn);

		ElementUtil.eu.clickByJS(driver, UsersBtn);

		//UsersBtn.click();
		for(WebElement userAct: AllActionsUserBtn) 
		{
			if(userAct.isEnabled()) {
				System.out.println("Act Name is working : "+userAct.getText());
			}else {
				System.out.println("Act Name is Not working  : "+userAct.getText());
			}

		}
	}

	/********************
	 * @Reports
	 */

	@FindBy(xpath="//span[@class='lbl' and text()= 'Reports']")
	private WebElement ReportsBtn;

	@FindBy(xpath="//li[@class='gold with-sub Reports opened']//ul//li")
	private List<WebElement> AllActReport;

	//	@FindBy()
	//	private WebElement 

	public void reportsAction() {
		ReportsBtn.click();
		for(WebElement rAct:AllActReport ) {
			if(rAct.isEnabled()) {
				System.out.println(rAct.getText());
			}else {
				System.out.println("Actions are not working");
			}
		}
		System.out.println("All Actions are working");
	}

	/************************
	 * @ReportAllActions
	 */

	@FindBy(css="a[href='https://staging.presolv360.com/admin/whatsapp']")
	private WebElement WhatsAppAct;

	@FindBy(css="img[src='https://www.presolv360.com/public/images/DisputeManagement.jpg']")
	private WebElement  WhatsAppPage;

	@FindBy(css="a[href='https://staging.presolv360.com/admin/zoommeetings']")
	private WebElement VcReportAct;

	@FindBy(css="h3[class='panel-title']")
	private WebElement VcReportPage;

	@FindBy(css="a[href='https://staging.presolv360.com/admin/esignrequests']")
	private WebElement EsignAct;

	@FindBy(css="div[id='esignrequests_filter']")
	private WebElement EsignActPage;

	@FindBy(css="a[href='https://staging.presolv360.com/admin/ivr/incoming']")
	private WebElement IvrAct;

	@FindBy(xpath="//h3[normalize-space()='Incoming call']")
	private WebElement IvrActPage;

	@FindBy(css="a[href='https://staging.presolv360.com/admin/report']")
	private WebElement ReportAct;

	@FindBy(css="span[class='nav-link-in']")
	private WebElement ReportActPage;

	//	@FindBy(css="")
	//	private WebElement 

	public void whatsAppclick() {
		ReportsBtn.click();
		WhatsAppAct.click();
		if(WhatsAppPage.isDisplayed()) {
			System.out.println("User Able to send massage");
		}else{
			System.out.println("User Fails to send massage");
		}
	}
	public void vcReport(String title) throws InterruptedException {
		Thread.sleep(2000);
		VcReportAct.click();
		if(VcReportPage.getText().equals(title)) {
			System.out.println("User able to see the Zoom Meeting page");
		}else {
			System.out.println("Fails to see the Zoom Meeting page ");
		}
	}
	public void esign() throws InterruptedException {
		ReportsBtn.click();
		EsignAct.click();
		Thread.sleep(2000);
		if(EsignActPage.isDisplayed()) {
			System.out.println("successfully loaded the required page");
		}else {
			System.out.println("Fails to load the required page");
		}
	}
	public void ivrCall(String title) throws InterruptedException {
		Thread.sleep(2000);
		//ReportsBtn.click();
		IvrAct.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		if(IvrActPage.getText().equals(title)) {
			System.out.println("Successfully loaded the page");		
		}else {
			System.out.println("Fails to load the page");
		}
	}
	public void report(String title) {
		ReportAct.click();
		if(ReportActPage.getText().equals(title)) {
			System.out.println("Successfully loaded the page");		
		}else {
			System.out.println("Fails to load the page");
		}
	}

	/*******************
	 * @MenuControl
	 */

	@FindBy(xpath="//span[normalize-space()='Menu Control']")
	private WebElement 	MenuActBtn;

	@FindBy(css="h3[class='panel-title']")
	private WebElement MenuActPageTitle;	

	@FindBy(xpath="//input[@class='form-control']/../../..//input")
	private List< WebElement >	MenuActPage6Input;



	public void menuControlAct() {
		MenuActBtn.click();
		if(MenuActPageTitle.isDisplayed()) {
			System.out.println("page loaded successfully");
			for(WebElement input:MenuActPage6Input) {
				System.out.println(input.isEnabled()); 
			}
		}else {
			System.out.println("fails to load page");
		}
	}
	public void menuPageTitle(String title) {
		if(title.equals(MenuActPageTitle.getText())) {
			System.out.println("menu page loaded" );
		}else {
			System.out.println("fails to load menu page");
		}

	}


	/************************
	 * @UserAccessControl
	 */

	@FindBy(xpath="(//span[normalize-space()='User Access Control'])[1]") 
	private WebElement UserAccessControlAct;

	@FindBy(xpath="//h3[normalize-space()='User Access Management']")
	private WebElement UserAccessControlTitle;

	public void userAccessAct() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, UserAccessControlAct);
		ElementUtil.eu.clickByJS(driver, UserAccessControlAct);
		//UserAccessControlAct.click();
		Thread.sleep(2000);
		if(UserAccessControlTitle.isDisplayed()) {
			System.out.println("Page loaded successfully");			  
		}else {
			System.out.println("fails to load page");	
		}
	}
	
	/**********************
	 * @UpdateProfile
	 */
	@FindBy(xpath="//span[normalize-space()='Update Profile']")
	private WebElement  UpdateProfileAct;
	
	@FindBy(xpath="//h3[normalize-space()='Update Profile']")
	private WebElement  UpdateProfileActPage;
	
	@FindBy(xpath="//a[@href='https://staging.presolv360.com/admin/logout']//span[normalize-space()='Logout']")
	private WebElement LogoutBtn; 
	
	
	@FindBy(xpath="//div[@class='jspDragBottom']")
	private WebElement MenuDown; 
	
	
	public void updateProfile(String titlt) throws InterruptedException {
		Thread.sleep(2000);
	ElementUtil.eu.scrollByJS(driver, UpdateProfileAct);
	Thread.sleep(2000);
	ElementUtil.eu.waitForElementToBeClickable(driver, UpdateProfileAct, 8000);
	UpdateProfileAct.click();
		if (UpdateProfileActPage.getText().equals(titlt)) {
			System.out.println("Update Profile Page loaded successfully");
		
		} else {
			System.out.println(" fails to load Update Profile Page ");
		} 
		
	}
	
	
	
	

}


