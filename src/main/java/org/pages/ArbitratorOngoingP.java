package org.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class ArbitratorOngoingP {
	private WebDriver driver;
	public ArbitratorOngoingP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="select[class='form-control directionselect']")
	private WebElement SelectDirectionClick;

	@FindBy(css="button[id='send']")
	private WebElement SendDirectionBtn;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement PreviewBtn;

	@FindBy(css="button[id='sendDirection']")
	private WebElement FinalSendDirectionBtn;


	@FindBy(xpath="//span[@class='lbl' and text()='Ongoing']") 
	private WebElement OngoingBtn;

	@FindBy(xpath="//span[@class='lbl' and text()='Closed']") 
	private WebElement Closedbtn; 

	@FindBy(xpath="//option[ text()='Add direction']") 
	private WebElement Adddirection;

	@FindBy(xpath="//option[ text()='Closure (contested)']") 
	private WebElement ClosureContested;

	@FindBy(xpath="//option[ text()='Closure (uncontested)']")
	private WebElement ClosureUncontested;

	@FindBy(xpath="//option[ text()='Closure informal reply']")
	private WebElement Closureinformalreply;

	@FindBy(xpath="//select[@class='form-control directionselect']//option[@class='dirType']") 
	private List<WebElement> AllDirectionsOptions;


	//@FindBy(xpath="") private WebElement
	/**************
	 * @Adddirection
	 */	
	public void ongoingBtn() {
		OngoingBtn.click(); 
	}
	public void addDirection()  {
		selectDirection(Adddirection);
	}
	public void selectDirection(WebElement direction)  {
		ElementUtil.eu.waitForPageLoad(driver);
		try {
			SelectDirectionClick.click();
			System.out.println("dir : "+direction.getText());
			//Thread.sleep(2000);
			direction.click();
			//Thread.sleep(2000);
			//ElementUtil.eu.selectDropDownPosition(driver, SelectDirectionClick, "2");	
		} catch (Exception e) {
			//System.out.println("No direction of given name exist");
		}

	}
	public void sendDirectionRejoinder() throws InterruptedException {
		Thread.sleep(2000);
		SendDirectionBtn.click();
		EnterNoOfDays.sendKeys("15");
		// ElementUtil.eu.clickByJS(driver, SendDirectionBtn);
		Thread.sleep(2000);

		PreviewBtn.click();
		ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		try {
			ElementUtil.eu.waitForElementToBeClickable(driver, FinalSendDirectionBtn, 60);
			System.out.println("Successfully send the direction");
			Thread.sleep(1000);
			ElementUtil.eu.waitForPageLoad(driver);
		} catch (Exception e) {

			System.out.println("Direction Not Exist");
		}


	}
	public void sendDirection() throws InterruptedException {
		Thread.sleep(2000);
		SendDirectionBtn.click();
	
		// ElementUtil.eu.clickByJS(driver, SendDirectionBtn);
		Thread.sleep(2000);

		PreviewBtn.click();
		ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		try {
			ElementUtil.eu.waitForElementToBeClickable(driver, FinalSendDirectionBtn, 60);
			System.out.println("Successfully send the direction");
			Thread.sleep(1000);
			ElementUtil.eu.waitForPageLoad(driver);
		} catch (Exception e) {

			System.out.println("Direction Not Exist");
		}


	}
	@FindBy(xpath="//a[contains(text(),'A01')]")
	private WebElement Caseid1p;
	//a[contains(text(),'A01')]
	public void waitCondition() throws InterruptedException {
		//Thread.sleep(2000);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 300, Caseid1p);
	}


	//for date entry
	@FindBy(css="input[class='swal2-input']")
	private WebElement EnterDate;

	public void sendKeyDateDirection() {
		SendDirectionBtn.click();
		EnterDate.sendKeys("23-12-2023");
		PreviewBtn.click();
		ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, FinalSendDirectionBtn, 400);
		System.out.println("Successfully send the direction");
	}
	//for days entry
	@FindBy(css="textarea[class='swal2-textarea']")
	private WebElement EnterNoOfDays;
	public void sendNoOfDaysDirection() {
		SendDirectionBtn.click();
		EnterNoOfDays.sendKeys("15");
		PreviewBtn.click();
		ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, FinalSendDirectionBtn, 300);
		System.out.println("Successfully send the direction");
	}

	public void closureContested() throws InterruptedException {
		selectDirection(ClosureContested);
	}
	public void closureUncontested() throws InterruptedException {
		selectDirection(ClosureUncontested);
	}
	public void closureInformalReply() throws InterruptedException {
		selectDirection(Closureinformalreply);
	}
	public void allDir() throws InterruptedException {
		for (WebElement dir : AllDirectionsOptions) {
			selectDirection(dir);
		}
	}

	@FindBy(xpath="//option[ text()='Cm new direction']")
	private WebElement Cmnewdirection;
	public void cmNewdirection() throws InterruptedException {
		selectDirection(Cmnewdirection);
	}

	@FindBy(xpath="//option[ text()='Confirmation of arbtrator']")
	private WebElement Confirmationofarbtrator;

	public void confirmationofarbtrator() throws InterruptedException {
		selectDirection(Confirmationofarbtrator);
	}

	@FindBy(xpath="//option[ text()='Interim Order']")
	private WebElement InterimOrder;

	public void interimOrder() {
		selectDirection(InterimOrder);	
	}

	@FindBy(xpath="//option[ text()='Intimate']")
	private WebElement Intimate;
	public void intimate() {
		selectDirection(Intimate);
	}

	@FindBy(xpath="//option[ text()='new directioin']")
	private WebElement Newdirectioin;
	public void newdirectioin() {

		selectDirection(Newdirectioin);
	}

	@FindBy(xpath="//option[ text()='Objection to Application for Withdrawal']")
	private WebElement ObjectiontoApplicationforWithdrawal;

	public void objectiontoApplicationforWithdrawal() {
		selectDirection(ObjectiontoApplicationforWithdrawal);
	}

	@FindBy(xpath="//option[ text()='Objections Reserved for Orders']")
	private WebElement ObjectionsReservedforOrders;
	public void objectionsReservedforOrders() {
		selectDirection(ObjectionsReservedforOrders);
	}

	@FindBy(xpath="//option[ text()='opportunity to choose']")
	private WebElement Opportunitytochoose;
	public void opportunitytochoose() {
		selectDirection(Opportunitytochoose);
	}

	@FindBy(xpath="//option[ text()='Recall incorrect order']")
	private WebElement Recallincorrectorder;
	public void reCallIncorrectorder() {
		selectDirection(Recallincorrectorder);
	}

	@FindBy(xpath="//option[ text()='Rejoinder']")
	private WebElement Rejoinder;
	public void rejoinder() {
		selectDirection(Rejoinder);
	}

	@FindBy(xpath="//option[ text()='Rejoinder Extension']")
	private WebElement RejoinderExtension;
	public void rejoinderExtension() {
		selectDirection(RejoinderExtension);
	}


	@FindBy(xpath="//option[ text()='Reopen Proceedings Order']")
	private WebElement ReopenProceedingsOrder ;
	public void reopenProceedingsOrder() {
		selectDirection(ReopenProceedingsOrder);
	}

	@FindBy(xpath="//option[ text()='Reply Extension Order']")
	private WebElement ReplyExtensionOrder;
	public void replyExtensionOrder() {
		selectDirection(ReplyExtensionOrder);
	}

	@FindBy(xpath="//option[ text()='Reply to Respondent Application/ Objection']")
	private WebElement  ReplytoRespondentApplicationObjection;
	public void replytoRespondentApplicationObjection() {
		selectDirection(ReplytoRespondentApplicationObjection);
	}



	@FindBy(xpath="//option[ text()='Settlement Extension Order']")
	private WebElement  SettlementExtensionOrder;
	public void settlementExtensionOrder() {
		selectDirection(SettlementExtensionOrder);
	}

	@FindBy(xpath="//option[ text()='Settlement Failure - Closure ex-parte']")
	private WebElement SettlementFailureClosureexparte ;
	public void settlementFailureClosureexparte() {
		selectDirection(SettlementFailureClosureexparte);
	}

	@FindBy(xpath="//option[ text()='Settlement Failure - SOC']")
	private WebElement SettlementFailureSOC ;
	public void settlementFailureSOC() {
		selectDirection(SettlementFailureSOC);
	}

	@FindBy(xpath="//option[ text()='Settlement Failure - SOD']")
	private WebElement SettlementFailureSOD ;
	public void settlementFailureSOD() {
		selectDirection(SettlementFailureSOD);
	}

	@FindBy(xpath="//option[ text()='SOC Extension']")
	private WebElement SOCExtension ;
	public void socExtension() {
		selectDirection(SOCExtension);
	}

	@FindBy(xpath="//option[ text()='SOD Extension']")
	private WebElement SODExtension ;
	public void sodExtension() {
		selectDirection(SODExtension);
	}

	@FindBy(xpath="//option[ text()='Withdrawal Order']")
	private WebElement WithdrawalOrder ;
	public void withdrawalOrder() {
		selectDirection(WithdrawalOrder);
	}

	@FindBy(xpath="//option[ text()='Withdrawal with liberty']")
	private WebElement WithdrawalWithLiberty ;

	public void withdrawalWithLiberty() {
		selectDirection(WithdrawalWithLiberty);
	}

	@FindBy(xpath="//option[ text()='Withdrawal with Liberty due to ineffective service']")
	private WebElement WithdrawalwithLibertyduetoineffectiveservice ;
	public void WithdrawalwithLibertyduetoineffectiveservice() {
		selectDirection(WithdrawalwithLibertyduetoineffectiveservice);

	}

	@FindBy(xpath="//option[ text()='Custom Direction']")
	private WebElement  CustomDirection;
	public void customDirection() {
		selectDirection(CustomDirection);

	}


	@FindBy(xpath="//option[ text()='Schedule Oral Hearing']")
	private WebElement ScheduleOralHearing ;
	public void scheduleOralHearing() {

	}


	// other 

	@FindBy(xpath="//a[contains(@href,'https://staging.presolv360.com/arbitrator/upload/document?id')]")
	private WebElement OtherBtn;

	@FindBy(xpath="//input[@id='docu']")
	private WebElement SelFileToOther;

	@FindBy(xpath="//button[@class='btn ybigbtn']")
	private WebElement SubmitOther;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement VerifyMassage;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OkBtn;

	public void otherSelect() {
		OtherBtn.click();
	}
	public void directionUpload() {
		ElementUtil.eu.switchToNewSingleWindow(driver);
		SelFileToOther.sendKeys(System.getProperty("user.dir")+"//documents//Important one.pdf");
		SubmitOther.click();
	}

	public void verifyMassage() {
		if (VerifyMassage.isDisplayed()) {
			OkBtn.click();
			System.out.println("Successfully Send the direction ");
		} else {
			System.out.println("Fails to sent the direction");
		}
	}

	/*+++++++++++++++++++++++++++++++++++++++
	 * #Actions
	 **/

	@FindBy(xpath="(//button[@id='dropdownMenuButton'])[25]")
	private WebElement ActionBtn;

	@FindBy(xpath="(//a[contains(@href,'https://staging.presolv360.com/arbitrator/upload/award?id=')]//button[text()='Upload Award'])[25]")
	private WebElement AwardSelect;

	@FindBy(xpath="//input[@id='award']")
	private WebElement SelectAwardFile;

	@FindBy(xpath="//button[@id='uploadaward']")
	private WebElement AwardSub;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement AwardUpStatus;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement AwardOkBtn ;

	@FindBy(xpath="(//button[@id='dropdownMenuButton'])[25]/../../../td[2]//a")
	private WebElement CaseId ;

	@FindBy(xpath="//a[@href='https://staging.presolv360.com/arbitrator/closeds']")
	private WebElement CloseClick ; 

	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement SearchInput ;

	@FindBy(xpath="//button[@class=' btn btn-success fa fa-search']")
	private WebElement SearchBtn ;

	@FindBy(xpath="//a[starts-with(@href,'/arbitrator/casedetails?id=')]")
	private WebElement GetCaseid ;

	//upload Award
	String caseid=null;

	public void selectAward() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, AwardSelect, 400);
		//AwardSelect.click();
		//System.out.println(caseid);

	}
	public String actionClick() {
		caseid=CaseId.getText();
		ActionBtn.click();
		//Thread.sleep(2000);
		return caseid;
	}
	public void uploadAward() {
		ElementUtil.eu.switchToNewSingleWindow(driver);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 300, SelectAwardFile);
		SelectAwardFile.sendKeys(System.getProperty("user.dir")+"//documents//Important one.pdf");
		ElementUtil.eu.scrollByJS(driver, AwardSub);
		AwardSub.click();
	}

	public void awardSuccessMass() throws InterruptedException {
		if (AwardUpStatus.isDisplayed()) {
			System.out.println("Award uploaded successfully");
			AwardOkBtn.click();
			System.out.println(caseid);
			CloseClick.click();
			SearchInput.sendKeys(caseid);
			SearchBtn.click();
			Thread.sleep(2000);
			//ElementUtil.eu.waitForPageLoad(driver);
			System.out.println(GetCaseid.getText());
			if (GetCaseid.getText().equals(caseid)) {
				System.out.println("Successfully change the case status");
			} else {
				System.out.println("Fails to change the case status");
			}
		} else {
			System.out.println("fails to upload the award");
		}
	}

	/*************************
	 * UploadInterimOrder
	 */

	@FindBy(xpath="(//a[contains(@href,'https://staging.presolv360.com/arbitrator/upload/iterimaward?id=')]//button[text()='Upload Interim Order'])[25]")
	private WebElement UploadInterimOrder;

	@FindBy(xpath="//input[@id='fileInput']")
	private WebElement SelectInterimFile;

	@FindBy(xpath="//button[@id='form_to_save']")
	private WebElement interimSubmit; 


	public void selectInterim() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, UploadInterimOrder, 400);
		//AwardSelect.click();
		//System.out.println(caseid);

	}
	public void uploadInterim() {
		ElementUtil.eu.switchToNewSingleWindow(driver);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 300, SelectInterimFile);
		SelectInterimFile.sendKeys(System.getProperty("user.dir")+"//documents//Important one.pdf");
		ElementUtil.eu.scrollByJS(driver, interimSubmit);
		interimSubmit.click();
	}
	public void interimSuccessMass() throws InterruptedException {
		if (AwardUpStatus.isDisplayed()) {
			System.out.println("Award uploaded successfully");
			AwardOkBtn.click();
		}else {
			System.out.println("fails to upload document");
		}
	}

	//@Disclosure


	@FindBy(xpath="(//button[@class='btn btn-success'][text()='View Disclosures'])[25]")
	private WebElement ViewDisclosure;

	@FindBy(xpath="//h4[text()='Disclosure']")
	private WebElement DisPageTitle;

	@FindBy(xpath="//span[@class=' btn btn-sucess btn-xs']")
	private WebElement DisclosuresPdf;

	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement CloseBtn;

	public void disclosureAct() throws InterruptedException {
		ViewDisclosure.click();
		Thread.sleep(2000);
		if (DisPageTitle.isDisplayed()&DisclosuresPdf.isEnabled() ) {
			System.out.println(DisclosuresPdf.isEnabled());
			System.out.println("Successfully view the documents");
			CloseBtn.click();	
		} else {
			System.out.println("Fails to download the documents");
		}
	}


	//@Private 

	@FindBy(xpath="(//button[@class='btn btn-primary'][text()='Private'])[25]")
	private WebElement PrivateCom;

	@FindBy(xpath="//input[@class='form-control arbcomm']")
	private WebElement AddMessage;

	@FindBy(xpath="//button[@class='btn btn-default btn-success csendbtn']")
	private WebElement SaveBtn;

	@FindBy(xpath="//h2[@class='swal2-title']")
	private WebElement SuccessMess;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OkBtnCom;

	public void privateClick() {
		PrivateCom.click();
	}
	public void addMessage(String Mess) {
		AddMessage.sendKeys(Mess);
		SaveBtn.click();	
	}
	public void verifySuccess() {
		if (SuccessMess.isDisplayed()) {
			System.out.println("Successfully added message");
			OkBtnCom.click();
		} else {
			System.out.println("Fails to add message");
		}
	}

	//@Share
	@FindBy(xpath="(//button[@class='btn btn-success'][text()='Shared'])[25]")
	private WebElement ShareBtn;

	public void shareClick() {
		ShareBtn.click();
	}
	/***************************
	 * //BulkAction
	 * 
	 * 
	 */

	@FindBy(css="input[id='for_general']")
	private WebElement GeneralfilAct;

	@FindBy(css="span[id^='select2--']")
	private WebElement From;

	@FindBy(xpath="//span[@class='selection']//span[text()='To']")
	private WebElement To;

	@FindBy(xpath="//textarea[@class='select2-search__field']")
	private WebElement Except;

	@FindBy(css="ul[class='select2-results__options']>li:last-child")
	private WebElement FirstCase;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(640)")
	private WebElement SecondCase;
	//ul[class='select2-results__options']>li:nth-child(10)
	@FindBy(css="ul[class='select2-results__options']>li:nth-child(10)")
	private WebElement SecondExpCase;

	@FindBy(css="button[id='dropdownMenuButton'][class='btn btn-secondary  py-2 px-3 dropdown-toggle']")
	private WebElement BulkAction;

	@FindBy(css="div[class='dropdown-menu show']>button:first-child")
	private WebElement DownloasAward;

	@FindBy(css="div[class='dropdown-menu show']>button:last-child")
	private WebElement DownloadDocuments;

	@FindBy(css="form[id='download_Docs_form']>input")
	private List<WebElement> ListOfDoc;

	@FindBy(css="button[id='selected_downlaod']")
	private WebElement DownloadBtn;

	@FindBy(css="h2[id='swal2-title']")
	private WebElement Successmass;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement OkBtnDoc ;

	public void generalFilSel() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, GeneralfilAct);
		Thread.sleep(2000);
		GeneralfilAct.click();
		Thread.sleep(2000);
	}
	public void fromToCase() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, From);
		//ElementUtil.eu.waitForElementToBeClickable(driver, From, 600);
		Thread.sleep(2000);
		From.click();
		//	ElementUtil.eu.waitForElementToBeClickable(driver, FirstCase, 300);
		Thread.sleep(2000);
		SecondCase.click();
		//FirstCase.click();
		Thread.sleep(2000);
		To.click();
		Thread.sleep(2000);
		FirstCase.click();
		//SecondCase.click();
		//ElementUtil.eu.waitForElementToBeClickable(driver, SecondCase, 300);
	}



	public void bulkAction() {
		BulkAction.click();
		downloadAward();
	}
	public void downloadAward() {
		if (DownloasAward.isEnabled()) {
			System.out.println("Award download successfully");			
		} else {
			System.out.println("Fails to download Award");
		}
	}
	public void downloadDocuments() throws InterruptedException {
		Thread.sleep(2000);
		DownloadDocuments.click();
		for (Iterator iterator = ListOfDoc.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			webElement.click();
		}
		if (DownloadBtn.isEnabled()) {
			System.out.println("Successfully Download the documents");
		} else {
			System.out.println("Fails to download the documents");
		}
	}

	public void exceptAdd() throws InterruptedException {
		Thread.sleep(4000);
		Except.click();
		Thread.sleep(4000);
		FirstCase.click();
		SecondExpCase.click();
		driver.findElement(By.cssSelector("ul[class='select2-results__options']>li:nth-child(5)")).click();
	}

	/**********************************
	 * Bulk Direction Method
	 * 
	 */
	// Sent direction 

	@FindBy(xpath="//select[@class='form-control blkdirectionselect mx-3']")
	private WebElement SelectDir;

	@FindBy(xpath="//button[@class='btn btn-success blkbtn py-2']")
	private WebElement SendDirBulk ;

	@FindBy(xpath="//select[@name='direction']//option[@class='dirType']")
	private List<WebElement> AllDirectionsName ;

	/*
	 * public void allDirName(String dir) { for (Iterator iterator =
	 * AllDirectionsName.iterator(); iterator.hasNext();) { WebElement webElement =
	 * (WebElement) iterator.next(); webElement.equals(dir); } }
	 */

	public void selectDirection(String dir) throws InterruptedException {
		SelectDir.click();
		Thread.sleep(2000);
		try {

			ElementUtil.eu.selectDropDownTextPresent(driver, SelectDir, dir);
			System.out.println("Direction name is : "+dir);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Direction Not Exist");
			e.printStackTrace();

		}

	}
	//@FindBy(xpath="//button[text()='Send Direction'][@id='sendDirection']")
	@FindBy(xpath="//button[text()='Send Direction'][@id='sendDirection']")
	private WebElement BulkSend;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement PagePopUp;

	@FindBy(xpath="//button[@id='including']")
	private WebElement IncludingCases;

	public void includingPopUp() {
		if(PagePopUp.isDisplayed()) {
			IncludingCases.click();
		}
	}



	@FindBy(xpath="//span[@id='tto']")
	private WebElement SuccessMessagePop;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement Clickok;

	public void sendBulkDirection() throws InterruptedException {

		SendDirBulk.click();
		includingPopUp();

		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, BulkSend);
		//FinalSendDirectionBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickableMinutes(driver, BulkSend, 20);
		//BulkSend.click();

		if (SuccessMessagePop.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickableMinutes(driver, Clickok, 20);
			//Clickok.click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
	}
	public void sendBulkDirectionRandom() throws InterruptedException {

		SendDirBulk.click();
		//includingPopUp();

		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, BulkSend);
		//FinalSendDirectionBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickableMinutes(driver, BulkSend, 200);
		//BulkSend.click();

		if (SuccessMessagePop.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickableMinutes(driver, Clickok, 200);
			//Clickok.click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
	}

//	@FindBy(xpath="//span[@id='tto']")
//	private WebElement SuccessMessagePop;
//
//	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
//	private WebElement Clickok;
//	
	public void sendNoOfDaysDirectionPausedBulk() throws InterruptedException {
		SendDirBulk.click();
		includingPopUp();
		EnterNoOfDays.sendKeys("15");
		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickableMinutes(driver, BulkSend, 20);
		if (SuccessMessagePop.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickableMinutes(driver, Clickok, 120);
			//Clickok.click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
		//System.out.println("Successfully send the direction");
	}

	
	public void sendNoOfDaysDirectionBulk() throws InterruptedException {
		SendDirBulk.click();
		includingPopUp();
		EnterNoOfDays.sendKeys("15");
		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickableMinutes(driver, BulkSend, 20);
		if (SuccessMessagePop.isDisplayed()) {
			ElementUtil.eu.waitForElementToBeClickableMinutes(driver, Clickok, 120);
		//	Clickok.click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
		//System.out.println("Successfully send the direction");
	}
	public void sendNoOfDaysDirectionBulkRandom() throws InterruptedException {
		SendDirBulk.click();
		
		EnterNoOfDays.sendKeys("15");
		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, FinalSendDirectionBtn);
		//FinalSendDirectionBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickableMinutes(driver, BulkSend, 20);
		if (driver.findElement(By.xpath("//span[@id='tto']")).isDisplayed()) {
			driver.findElement(By.xpath("//a[@class='btn btn-danger btn-lg']")).click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
		//System.out.println("Successfully send the direction");
	}
	public void sendKeyDateDirectionBulk() {
		SendDirBulk.click();
		EnterDate.sendKeys("23-12-2023");
		PreviewBtn.click();
		//ElementUtil.eu.scrollByJS(driver, SendDirBulk);
		//FinalSendDirectionBtn.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkSend, 300);

		if (driver.findElement(By.xpath("//span[@id='tto']")).isDisplayed()) {
			driver.findElement(By.xpath("//a[@class='btn btn-danger btn-lg']")).click();
			System.out.println("Successfully send the direction");
		} else {
			System.out.println("Fails to send the direction");
		}
		//System.out.println("Successfully send the direction");


	}

	/********************************************
	 * Random case filter
	 */

	@FindBy(css="input[id='for_random']")
	private WebElement RandomCaseFil;

	@FindBy(css="span[class='select2-selection select2-selection--multiple']")
	private WebElement RanInput;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable']")
	private List<WebElement> case6ids;

	//	@FindBy()
	//	private WebElement 
	//	
	//	@FindBy()
	//	private WebElement 

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][1]")
	private WebElement FirstCase1;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][20]")
	private WebElement No20Case;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][30]")
	private WebElement No30Case;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][60]")
	private WebElement No60Case;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][50]")
	private WebElement No50Case;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][100]")
	private WebElement No100Case;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][100]")
	private WebElement Stringss;

	public static void main(String[] args) {
		String si="//li[@class='select2-results__option select2-results__option--selectable'][100]";
	}

	public void randomFilterSel() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, RandomCaseFil);
		Thread.sleep(2000);
		RandomCaseFil.click();
		//ElementUtil.eu.clickByJS(driver, RanInput);
		//RanInput.click();
		Thread.sleep(8000);
		insertCaseId(FirstCase1);
		insertCaseId(No20Case);
		insertCaseId(No30Case);
		insertCaseId(No60Case);
		insertCaseId(No50Case);
		insertCaseId(No100Case);

	}


	public void insertCaseId(WebElement ele) throws InterruptedException {
		ElementUtil.eu.clickByJS(driver, RanInput);
		ElementUtil.eu.waitForElementToBeClickable(driver, ele, 300);

	}


	//Closed 
	public void closedBtn() {
		Closedbtn.click(); 
	}

	//Oral Hearing 

	@FindBy(xpath="//option[ text()='Schedule Oral Hearing']")
	private WebElement ScheduleOralHear;


	@FindBy(xpath="//input[@id='sessionDate']")
	private WebElement DateOfOralH;

	@FindBy(xpath="//input[@id='sessionTime']")
	private WebElement TimeOfOralH;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement PreviewOral;

	@FindBy(xpath="//button[@class='btn btn-primary btn-success p-2']")
	private WebElement SendDirBtn;


	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement SendDirFinalMass;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement SendDirFinalOkBtn;


	public void oralHearingDirect() {
		selectDirection(ScheduleOralHear);
		SendDirectionBtn.click();
	}
	public void addDateTime(String Date,String Time) throws InterruptedException {
		DateOfOralH.sendKeys(Date);
		TimeOfOralH.sendKeys(Time);
		Thread.sleep(2000);
	}
	public void checkRadioBtn() {


	}
	public void sendOralHearingDir() throws InterruptedException {
		PreviewOral.click();
		Thread.sleep(2000);
		SendDirBtn.click();
		Thread.sleep(2000);
		if (SendDirFinalMass.isDisplayed()) {
			SendDirFinalOkBtn.click();
			System.out.println("Oral hearing Schedule Successfully");

		} else {
			System.out.println("Fails to Schedule Oral hearing ");
		}
	}

	//Manually schedule oral hearing

	@FindBy(xpath="//input[@name='zoom_choice'][2]")
	private WebElement ManuallyScheduleRadio ;

	@FindBy(xpath="//input[@name='zoomId']")
	private WebElement Zoommeetinglink;

	@FindBy(xpath="//input[@id='additional_emails']")
	private WebElement gmailId;

	public void mannualOralaHearing(String link, String gmail) {
		ManuallyScheduleRadio.click();

		Zoommeetinglink.sendKeys(link);
		gmailId.sendKeys(gmail);
	}


	// With excluding cases

	//	@FindBy(xpath="//h2[@id='swal2-title']")
	//	private WebElement PauseCasePopUp;
	//	
	//	
	//	@FindBy(xpath="//button[@id='including']")
	//	private WebElement IncludingBtn;
	//	
	//	@FindBy()
	//	private WebElement
	//	@FindBy()
	//	private WebElement
	//	
	//	public void excludingCases() {
	//		
	//	}



}