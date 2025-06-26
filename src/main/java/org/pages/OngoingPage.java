package org.pages;


import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import org.utilities.ElementUtil;

public class OngoingPage {
	private static final String css = null;

	private WebDriver driver;
	// Web Elements

	@FindBy(xpath="//span[text()='Ongoing'][@class='lbl']")
	private WebElement ClickOngoingBtn;


	@FindBy(xpath="//span[@class='nav-link-in']")
	private WebElement PageOngoing;

	@FindBy(xpath="//input[@type='checkbox'][@class='singlecs check_mark']/../span[text()='1']")
	private WebElement CheckCheckBox;
	//input[@type='checkbox'][@class='singlecs check_mark'] //return 1st out of 10
	//input[@type='checkbox'][@class='singlecs check_mark']/../span[text()='1']  // exact 1st

	@FindBy(xpath="//a[text()='Upload Additional Doc']")
	private WebElement AddDocUploadClick;

	@FindBy(xpath="(//input[@id='fileInput'][@name='adoc'])[2]")
	private WebElement ClickOnFileUpPopUp;

	@FindBy(xpath="//input[@value='Submit'][@class='p-2 btn btn-primary ']")
	private WebElement SubmitClick;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement  CloseClick;

	@FindBy(xpath="(//textarea[@class='form-control description'][@name='description'])[2]")
	private WebElement  DescriptionInput;
	
//	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
//	private WebElement  ;
	
	
	
	
	// constructor
	public OngoingPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// page method 
	public void ongoingTab() {
		ClickOngoingBtn.click();
	}
	public void verifyPageTitle(String title) {
		String ExpText= title;
		String ActText = PageOngoing.getText();
		if(ActText.equals(ExpText)) {
			System.out.println("title is Match ");

		}else {
			System.out.println("title not Mached");
		}
	}
	public void uploadAddDoc() {
		try{CheckCheckBox.click();
		AddDocUploadClick.click();
		String path= System.getProperty("user.dir");
		ClickOnFileUpPopUp.sendKeys(path+"\\documents\\Award.zip");
		//ClickOnFileUpPopUp.sendKeys("C:\\Users\\HP01\\OneDrive\\Desktop\\Testing doc\\Award_A049009.pdf");
		
		DescriptionInput.sendKeys("Keep your face always toward the sunshine, and shadows will fall behind you.");
		
		ElementUtil.eu.scrollByJS(driver, SubmitClick);
		SubmitClick.click();
		CloseClick.click();
		System.out.println("AddDoc upload Successfully");
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			//System.out.println("faild to upload AddDoc");
		}
	}

	/******
	 * Single case Withdraw Locaters & pageMethod 
	 *******/
	@FindBy(xpath="//button[@id='dropdownMenuButton1']")
	private WebElement  ActionDropDown ;

	@FindBy(xpath="//button[text()='Withdraw']")
	private WebElement WithdrawClick;

	@FindBy(xpath="//textarea[@class='swal2-textarea']")
	private WebElement InputReasWith;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ApplyClick;

	//######################################################
	@FindBy(xpath="//span[text()='Ongoing'][@class='lbl']")
	private List<WebElement> ClickOngoingMultiBtn;
	//#########################################################

	public void withdrawAction() {
		CheckCheckBox.click();
		ActionDropDown.click();
		WithdrawClick.click();
		InputReasWith.sendKeys("please allow me for Mediation (by using Automation case withdraw)");
		ApplyClick.click();
		CloseClick.click();
	}
	public void multiWithdrawAction() {

	}

	/******
	 * Single case  Various Actions  Locaters & pageMethod 
	 *******/
	@FindBy(xpath="//tbody/tr[1]/td[3]/span[1]")
	private WebElement RefId;

	@FindBy(xpath="//a[@class='dropdown-item'][1]")
	private WebElement SelUpdateRefrenceID;

	@FindBy(xpath="//textarea[@id='editref']")
	private WebElement AddNewRefId;

	@FindBy(xpath="//input[@class='btn btn-primary adminupdaterefid']")
	private WebElement Submit;

	public void selCase() {
		CheckCheckBox.click();

	}
	static String actOldRefId;

	public String selRefIdUpAction() {
		String actOldRefId=RefId.getText();
		System.out.println(actOldRefId);
		ActionDropDown.click();
		SelUpdateRefrenceID.click();
		return actOldRefId;
	}

	public void addNewBatchName() {
		String GenerateRefId=OngoingRandomGeneralFilter.randomString();
		AddNewRefId.sendKeys("@test"+GenerateRefId);
		Submit.click();
	}

	public void verifyRefId() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.pageRefresh(driver, 2);
		String newRefId=RefId.getText();

		if(actOldRefId==newRefId) {
			System.out.println(actOldRefId);
			System.out.println(newRefId);
			System.out.println("Refrence id Not Updated");

		}
		else {
			System.out.println("oldREfId"+actOldRefId);

			System.out.println(	"new RefId"+newRefId);
			System.out.println("Refrence id Updated Successfully ");
		}
	}

	// Arbitrator log

	@FindBy(xpath="//button[text()='Arbitrator Log']")
	private WebElement ArbitratorLogSel;

	@FindBy(css="div[id='myModal230']>div>div>div:nth-child(2)>span>p:first-child")
	private WebElement AssignArbitrator;

	@FindBy(css="div[id='myModal230']>div>div>div:nth-child(2)>span>p:nth-child(2)")
	private WebElement DateOfArbAssign;

	@FindBy(css="div[id='myModal230']>div>div>div:nth-child(1)>button[class='close']")
	private WebElement ArbitrtorLogClose;

	public void selectCaseAndActionClick(){
		CheckCheckBox.click();
		ActionDropDown.click();
	}
	public void selActionArbLog()
	{
		ArbitratorLogSel.click();
		System.out.println("======================");
	}
	public void checkAssignArb() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println( AssignArbitrator.getText());
	}
	public void checkAssignDate() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(DateOfArbAssign.getText());
		System.out.println("======================");
	}
	public void arbLogClose() {
		ElementUtil.eu.waitForElementToBeClickable(driver, ArbitrtorLogClose, 60);
		//ArbitrtorLogClose.click();
		//		 Actions actions = new Actions(driver);
		//
		//	        // Perform a click anywhere on the page
		//	        actions.click().perform();

	}


	// Assign Arbitrator 

	@FindBy(xpath="//button[@class='btn btn-success label label-success clickassignarb']")
	private WebElement AssignSelectDrop;

	@FindBy(xpath="//tbody/tr[1]/td[6]")
	private WebElement OldArbitratorName;

	@FindBy(xpath="//tbody/tr[1]/td[6]")
	private WebElement NewArbitratorName;

	@FindBy(xpath="//select[@class='form-control arbitratorselect2']")
	private WebElement SelectArbitratorSelDrop ;

	@FindBy(xpath="//textarea[@id='changearbreason']")
	private WebElement AddReasonToNewArbAdd;

	@FindBy(xpath="//button[@class='btn btn-inline btn-success label label-success btn-lg changearb']")
	private WebElement Assignbtn;


	private String oldArbName=null;

	public String oldArbitratorNameActionClick() throws InterruptedException {
		oldArbName=OldArbitratorName.getText();

		System.out.println("oldArbName  "+oldArbName);
		CheckCheckBox.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, ActionDropDown, 400);
		Thread.sleep(2000);
		return oldArbName;
		//ActionDropDown.click();
	}
	public void assignSelAct() throws InterruptedException {
		//ElementUtil.eu.waitForElementToBeClickable(driver, AssignSelectDrop, 400);
		AssignSelectDrop.click();
        Thread.sleep(2000);
	}


	public void newArbiAdd() throws InterruptedException {

		//		newArbName= NewArbitratorName.getText();
		//		System.out.println("newArbName  "+newArbName);
		String arb1= "Request sent to Arbitrator One"; // 2
		String arb2= "Request sent to shubham Arb";  //7 value 
		//==============================
		//ElementUtil.eu.selectDropDownTextPresent(driver, SelectArbitratorSelDrop, "Arbitrator One");
		//ElementUtil.eu.selectDropDownTextPresent(driver, SelectArbitratorSelDrop, "Brijesh Arb");
		//==============================


		if(oldArbName.endsWith("Arb")) {
			Thread.sleep(6000);
			ElementUtil.eu.selectDropDownTextPresent(driver, SelectArbitratorSelDrop, "Arbitrator One");


			Thread.sleep(6000);

			System.out.println("Arbitrator One");
		}else {
			//Thread.sleep(6000);

			ElementUtil.eu.selectDropDownTextPresent(driver, SelectArbitratorSelDrop, "shubham Arb");
			System.out.println("shubham Arb");
		}


	}

	public void addReason(String reason) {

		AddReasonToNewArbAdd.sendKeys(reason);
	}
	private String newArbName=null;
	public void assignClick() throws InterruptedException {
		Assignbtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.pageRefresh(driver, 2);
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 500, NewArbitratorName);
		newArbName= NewArbitratorName.getText();

		System.out.println("newArbName  "+newArbName);
	}


	public void verifyArbiAdd() {
		if(oldArbName==newArbName) {
			System.out.println("@^@ New Arbitrator not Assign @^@");
		}
		else {
			System.out.println("@^@ Successfully new Arbitrator Assign @^@");
		}
	}


	/**********************
	 * **** // Add lawyer
	 */
	@FindBy(xpath="//button[@class='btn btn-info adminupdlawyerdetail']")
	private WebElement AddlawyerSel;

	@FindBy(css="input[id='firsttname']")
	private WebElement FirstName;

	@FindBy(css="input[id='lasttname']")
	private WebElement LastName;

	@FindBy(css="input[id='l_email']")
	private WebElement EmailId;

	@FindBy(css="input[id='l_mobile']")
	private WebElement MoblieNo;

	@FindBy(css="input[id='otherdetails']")
	private WebElement OtherDetials;

	@FindBy(xpath="//button[@class='btn btn-info ybigbtn smksubmit adminaddlawyer'][text()='Submit']")
	private WebElement SubmitBtn;

	/*
	 * @FindBy() private WebElement
	 */

	public void addlawyer() throws InterruptedException {
		ElementUtil.eu.waitForElementToBeClickable(driver, AddlawyerSel, 400);
		Thread.sleep(2000);
		//AddlawyerSel.click();
	}

	public void firstLastName(String fName, String lName) {
		FirstName.sendKeys(fName);
		LastName.sendKeys(lName);	
	}
	public void emailMobileNo(String email, String moNo) {
		EmailId.sendKeys(email);
		MoblieNo.sendKeys(moNo);
	}
	public void otherDetails(String otherDetails) throws InterruptedException {
		OtherDetials.sendKeys(otherDetails);
		//Thread.sleep(1000);
	}
	public void submitAddlawyer() {
		ElementUtil.eu.waitForElementToBeClickable(driver, SubmitBtn, 600);
		//SubmitBtn.click();

	}



	// private WebElement viewlawyer=null;
	public void verifylawyerBtn() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ongoing = driver.findElement(By.cssSelector("span[class='nav-link-in']"));
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 600, ongoing);
		Thread.sleep(2000);

		WebElement viewlawyer = driver.findElement(By.cssSelector("a[class='adminviewlawyerdetail']"));
		if(viewlawyer.isDisplayed()) {
			System.out.println("Lawyer added Successfully =========");

			//withdrawAction();

		}else {
			System.out.println(" *No Lawyer added======");
		}

	}


	/****
	 * Add Lawyer to update submit
	 * @throws InterruptedException 
	 */

	public void addLawyerToupdateSubmit() throws InterruptedException
	{
		WebElement submit=driver.findElement(By.xpath("//button[@name='submit'][@class='btn btn-info ybigbtn smksubmit adminaddlawyer']"));
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, submit, 600);
		//submit.click();
	}

	/********
	 * Update lawyer details
	 * @throws InterruptedException 
	 */
	public void updateLawyerDetails() throws InterruptedException {
		WebElement viewlawyer = driver.findElement(By.cssSelector("a[class='adminviewlawyerdetail']"));
		CheckCheckBox.click();


		viewlawyer.click();
		WebElement updatedetails = driver.findElement(By.xpath("//h3[normalize-space()='Upload Lawyer Details']"));
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 400, updatedetails);
		Thread.sleep(2000);
	}
	private String previousFirstName;
	public void updateFirstLastName(String fName, String lName) throws InterruptedException {
		previousFirstName = FirstName.getText();

		FirstName.clear();
		Thread.sleep(1000);
		FirstName.sendKeys(fName);

		LastName.clear();
		Thread.sleep(1000);
		LastName.sendKeys(lName);	
	}
	public void updateEmailMobileNo(String email, String moNo) throws InterruptedException {
		EmailId.clear();
		Thread.sleep(1000);
		EmailId.sendKeys(email);

		MoblieNo.clear();
		Thread.sleep(1000);
		MoblieNo.sendKeys(moNo);
	}
	public void updateOtherDetails(String otherDetails) throws InterruptedException {
		OtherDetials.clear();
		Thread.sleep(1000);
		OtherDetials.sendKeys(otherDetails);
	}

	@FindBy(css="button[class='btn btn-info ybigbtn smksubmit adminupdatelawyer']")
	private WebElement Updatebtn;
	public void updatebtn() throws InterruptedException {
		Updatebtn.click();
		Thread.sleep(2000);

	}
	public void verifyUpdateLawyer() throws InterruptedException {
		ElementUtil.eu.pageRefresh(driver, 2);
		Thread.sleep(2000);
		WebElement ongoing = driver.findElement(By.cssSelector("span[class='nav-link-in']"));
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 600, ongoing);
		Thread.sleep(2000);

		updateLawyerDetails();
		String newFirstname = FirstName.getText();
		if(newFirstname.equals(previousFirstName)) {
			System.out.println("Successfully update lawyer details");
			Thread.sleep(2000);
		}else {
			System.out.println("Fails to update lawyer details");
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		actions.click().perform();

		ElementUtil.eu.pageRefresh(driver, 2);

	}
	
	/***********************************
	 * Delete Lawyer
	 */
	@FindBy(css="button[class='btn btn-danger dgbtn smksubmit admindeletelawyer']")
	private WebElement DeleteLawyer;
	
	@FindBy(css="")
	private WebElement StatusDeleteLawyer;
	
	public void deleteLawyer() {
		ElementUtil.eu.waitForElementToBeClickable(driver, DeleteLawyer, 4000);
		//DeleteLawyer.click();
	System.out.println(driver.switchTo().alert().getText()+" :=> Yes"); 
	driver.switchTo().alert().accept();
	System.out.println("Successfully deleted the lawyer ");
		//alert.accept();
		
	}
	/*****************************
	 * Claim Summary
	 */

	@FindBy(xpath="//button[text()='Claim Summary']")
	private WebElement ClaimSummerySelAct;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement ClaimDownloadedSuccessfully;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ClaimOkbtn;

	public void claimSummarysel() throws InterruptedException {
		ElementUtil.eu.waitForElementToBeClickable(driver, ClaimSummerySelAct, 600);
		Thread.sleep(2000);
		//ClaimSummerySelAct.click();
	}

	public void verifySuccessMassOk() {
		if(ClaimDownloadedSuccessfully.isDisplayed()) {
			System.out.println("Claim Summary Report downloaded successfully!");
			ClaimOkbtn.click();
		}else {
			System.out.println("Fail to download Claim Summary Report!");
			ClaimOkbtn.click();
		}
	}

	/*****************************
	 * Upload Party Reply
	 * @throws InterruptedException 
	 */

	@FindBy(css="button[id='adminpartyreply']")
	private WebElement UploadPartyReplySel;

	@FindBy(css="a[href='javascript:void(0)']")
	private WebElement  ViewDetailsDownload;

	@FindBy(css="input[id='party_name']")
	private WebElement PartyNameInput;

	@FindBy(css="textarea[id='reply']")
	private WebElement YourReply;

	@FindBy(css="input[id='attach_file']")
	private WebElement ChooseFiletoUpload;

	@FindBy(css="input[class='btn btn-primary  mb-4']")
	private WebElement SubmitPReply;

	@FindBy(css="div[class='swal2-success-ring']")
	private WebElement  VerifySuccessMassPR;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement OkPReply;

	/*//verifying party reply [not possible to achieve it.............]
	@FindBy(css="div[class='card-block']>table:nth-child(23)>tbody>tr:last-child>td:nth-child(2)")
	private WebElement  PartyReplyComp;


	//verifying party Name Added during party reply  
	@FindBy(css="div[class='card-block']>table:nth-child(23)>tbody>tr:last-child>td:nth-child(3)")
	private WebElement PartyNameAdded;

	@FindBy(css="div[class='card-block']>table:nth-child(23)>tbody>tr:last-child>td:nth-child(4)")
	private WebElement DownloadPartyReply;

	@FindBy(css="div[class='card-block']>table:nth-child(23)>tbody>tr:last-child>td:nth-child(5)")
	private WebElement DateOfReply;
	 */

	public void uploadPartyDetails() {
		UploadPartyReplySel.click();
	}
	public void viewDetailsCase() {
		ViewDetailsDownload.click();
	}
	public void partyName(String pName) {
		PartyNameInput.sendKeys(pName);

	}
	public void addPartyReply(String pReply) {
		YourReply.sendKeys(pReply);
	}
	public void addAttachment() {
		String path=System.getProperty("user.dir");
		ChooseFiletoUpload.sendKeys(path+"\\documents\\Important one.pdf");
	}
	public void partyReplySubmit() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtil.eu.clickByJS(driver, SubmitPReply);
		//SubmitPReply.click();
		Thread.sleep(2000);
		String locater="div[class='swal2-success-ring']";
		//fluentWaitForvisibilityOfElement(locater, 3, driver, "name");
		//fluentWait(10, locater, driver);

		if(VerifySuccessMassPR.isDisplayed()) {

			System.out.println("Party reply added successfully");
			Thread.sleep(2000);
			//OkPReply.click();

			Actions action = new Actions(driver);
			action.click().perform();
		}else {
			System.out.println("fails to add party reply");
		}
	}
	public void fluentWait(int time,String locater,WebDriver driver) {
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofMinutes(time))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locater)));

	}


	/*****************************
	 * Edit Party Details
	 * @throws InterruptedException 
	 */

	//Claimant
	@FindBy(css="button[class='btn btn-success  brfbtn']")
	private WebElement EditPartyDetailsSel;

	@FindBy(css="span[id='addrespothr'][class='btn btn-primary']")
	private WebElement AddClaimantPartyBtn ;

	@FindBy(css="input[name='oemailothr[]']")	
	private WebElement EmailIDClaim;

	@FindBy(css="input[name='oemobnoothr[]']")
	private WebElement MobileNoClaim;

	@FindBy(css="textarea[name='odetailsothr']")
	private WebElement EachClaimantsName;

	//Respondant 

	@FindBy(css="span[id='addresp'][class='btn btn-primary']")
	private WebElement AddRespondingPartyBtn;

	@FindBy(css="input[name='oemail[]']")
	private WebElement EmailIDRespondent;

	@FindBy(css="input[name='oemobno[]']")
	private WebElement MobileNoRespondent;

	@FindBy(css="textarea[name='odetails']")
	private WebElement EachRespondentsName;

	@FindBy(css="button[id='smkform']")
	private WebElement SubmitEditP_Details;

	@FindBy(css="h2[id='swal2-title']")
	private WebElement VerifySuccessMassageUpdatePartyD;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement OkBtnEditParDet;


	//========Check 
	@FindBy(css="a[href='/admin/arbitrator/casedetails?id=2432']")
	private WebElement CaseDetailsClick ;

	@FindBy(xpath="//td[normalize-space()='Other Claimant:']")
	private WebElement OtherClaimantAdded  ;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[3]//div[2]")
	private WebElement  GetClaimantEmailAdded ;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[3]//div[5]")
	private WebElement GetClaimantMobileNoAdded;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[3]//div[8]")
	private WebElement DetailsClaimant ;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[5]//td[1]")
	private WebElement OtherRespondentAdded;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[5]//td[2]//div[2]")
	private WebElement GetRespondentEmailAdded;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[5]//td[2]//div[5]")
	private WebElement GetRespondentMobileNoAdded;

	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-xs'])//tr[5]//td[2]//div[8]")
	private WebElement DetailsRespondent;


	/*
	 * @FindBy(xpath="") private WebElement ;
	 */

	public void editpartyDetailsSelAct() throws InterruptedException
	{
		EditPartyDetailsSel.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);
	}

	//=======Painding=============================
	public void claimPartyBtn() throws InterruptedException 
	{
		if(AddClaimantPartyBtn.isDisplayed()) {
			AddClaimantPartyBtn.click();
			Thread.sleep(2000);
		}else {
			System.out.println("It contain single party details added ");
			ElementUtil.eu.switchToNewSingleWindow(driver);
			Thread.sleep(2000);
			withdrawAction();

		}
		return;
	}


	public void claimantEmailAndMobile(String email, String mobileNo)
	{
		ElementUtil.eu.scrollByJS(driver, EmailIDClaim);
		EmailIDClaim.sendKeys(email);

		ElementUtil.eu.scrollByJS(driver, MobileNoClaim);
		MobileNoClaim.sendKeys(mobileNo);

	}
	public void addClaimantDetails(String details)
	{
		ElementUtil.eu.scrollByJS(driver, EachClaimantsName);
		EachClaimantsName.sendKeys(details);
	}

	//+++++======================
	public void addRespondant() {
		//ElementUtil.eu.scrollByJS(driver, AddRespondingPartyBtn);
		AddRespondingPartyBtn.click();
	}
	public void respondantEmailAndMobile(String email,String moNo)
	{
		ElementUtil.eu.scrollByJS(driver, EmailIDRespondent);
		EmailIDRespondent.sendKeys(email);

		ElementUtil.eu.scrollByJS(driver, MobileNoRespondent);
		MobileNoRespondent.sendKeys(moNo);
	}
	public void respondentDetails(String detailsR)
	{
		ElementUtil.eu.scrollByJS(driver, EachRespondentsName);
		EachRespondentsName.sendKeys(detailsR);
	}

	public void submitEditPDetails() {
		ElementUtil.eu.scrollByJS(driver, SubmitEditP_Details);
		SubmitEditP_Details.click();
	}
	public void successMassEditParty() 
	{
		if(VerifySuccessMassageUpdatePartyD.isDisplayed()) {
			System.out.println("Party details added Successfully");
			OkBtnEditParDet.click();
			driver.close();


		}else {
			System.out.println("Fails to add Party details ");
			driver.close();
		}
	}

	public void compareTheAddedPartyDetails() {
		ElementUtil.eu.pageRefresh(driver, 2);

		ElementUtil.eu.waitForElementToBeClickable(driver, CaseDetailsClick, 500);
		//CaseDetailsClick.click();
	}
	public void claimantDetailsVerify(String email,String MoNo,String Detail) 
	{
		String upemail=email;
		String upMoNo=MoNo;
		String upDetail=Detail;
		if(OtherClaimantAdded.isDisplayed()) {
			String caseEmail= GetClaimantEmailAdded.getText();
			String  caseMoNo= GetClaimantMobileNoAdded.getText();
			String caseDetail=	DetailsClaimant.getText();	
			if(upemail==caseEmail || upMoNo==caseMoNo ||upDetail== caseDetail) {
				System.out.println("Claimant details added Successfully");

			}else {
				System.out.println("Fails to add claimant details ");
			}
		}else {
			System.out.println("not added");
		}

	}
	/****************************************
	 * Delete party details added
	 * 
	 */
	@FindBy(css="span[class='btn btn-danger remrespothr']")
	private WebElement RemoveClaimant;
	
	@FindBy(css="span[id='remresp']")
	private WebElement RemoveRespondent;
	
//	@FindBy()
//	private WebElement 
//	
//	@FindBy()
//	private WebElement 
//	
	public void deletePartyDetails() {
	ElementUtil.eu.scrollByJS(driver, RemoveClaimant);	
	ElementUtil.eu.clickByJS(driver, RemoveClaimant);
	ElementUtil.eu.clickByJS(driver, RemoveRespondent);
	
	SubmitEditP_Details.click();
	ElementUtil.eu.waitForElementToBeClickable(driver, VerifySuccessMassageUpdatePartyD, 4000);
	ElementUtil.eu.waitForElementToBeClickable(driver, OkBtnEditParDet, 2000);
	System.out.println("Successfully deleted the party details added previously");
	}
	
	
	
	
	
	/*****************************
	 * Upload SOD
	 * 
	 */

	@FindBy(css="input[class='form-control form-control-sm'][type='search']")
	private WebElement SearchInput;
	//input[class='form-control form-control-sm'][type='search']
	//input[class='form-control form-control-sm']

	@FindBy(css="button[class=' btn btn-success fas fa-search']")
	private WebElement ClickSearch;

	@FindBy(css="button[id='dropdownMenuButton1']")
	private WebElement ActionBtn;

	@FindBy(xpath="//button[text()='Upload SOD']")
	private WebElement UploadSODSelect;

	@FindBy(css="input[id='soddoc']")
	private WebElement SocFile;

	@FindBy(css="button[id='sodupload']")
	private WebElement SocSubmit;

	@FindBy(css="h2[id='swal2-title']")
	private WebElement  SocSuccessMassage;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement SocOkbtn;


	@FindBy(xpath="//button[@class='btn btn-primary fa fa-refresh'][@id='clear_btn']") 
	private WebElement RefreshBtn;

	@FindBy(xpath="//td[@class='dataTables_empty'][text()='No data found']")
	private WebElement NoCaseFound;


	public void searchCaseid(String caseid) {
		SearchInput.sendKeys(caseid);
		ClickSearch.click();	
	}

	public void casestaus() throws InterruptedException {

		if(driver.findElement(By.xpath("//a[starts-with(@href,'/admin/arbitrator/casedetails?id=')]")).isDisplayed()) 
		{
			ActionBtn.click();
			ElementUtil.eu.waitForElementToBeClickable(driver, UploadSODSelect, 400);

		}else if(NoCaseFound.isDisplayed()) 
		{
			Thread.sleep(2000);
			//WebElement refresh= driver.findElement(By.xpath("//button[@id='clear_btn']"));
			//refresh.click();
			ElementUtil.eu.waitForElementToBeClickable(driver, RefreshBtn, 600);
			//ElementUtil.eu.pageRefresh(driver, 2);
			Thread.sleep(2000);
			List <WebElement> caseid = driver.findElements(By.xpath("//a[starts-with(@href,'/admin/arbitrator/casedetails?id=')]"));
			System.out.println("cases per page"+caseid.size());

			for(int i=0;i<=caseid.size();i++) 
			{
				ActionBtn.click();

				if(UploadSODSelect.isDisplayed()) {
					ElementUtil.eu.waitForElementToBeClickable(driver, UploadSODSelect, 400);
					break;
				}
				else {
					Actions actions = new Actions(driver);
					actions.moveByOffset(100, 200).click().perform();

				}

			}
			System.out.println("Case not present in ongoing page ");
		}else {
			System.out.println("in else condition");
		}


	}


	public void sodUploadAct() throws InterruptedException {
		casestaus();
		//ActionBtn.click();
		//ElementUtil.eu.waitForElementToBeClickable(driver, UploadSODSelect, 400);
	}
	public void sodZipFileSel() {
		String path= System.getProperty("user.dir");
		try {
			SocFile.sendKeys(path+"\\documents\\UploadSOD\\SOD.zip_Automation.zip");
		}catch(Exception fe) {

			fe.printStackTrace();

		}
	}
	public void sodSubmitbtn() {
		SocSubmit.click();
	}
	public void verifySocSuccessMassage(String oldMassage) {
		String MassageDisplay = SocSuccessMassage.getText();
		if(oldMassage.equals(MassageDisplay)) {

			System.out.println("SOD uploaded Successfully");
			SocOkbtn.click();
		}else {
			System.out.println(" Fails to upload SOD ");
		}
	}




	/*****************************
	 * View Document List
	 * 
	 */


	@FindBy(css="button[class='btn btn-info'][id='adminupddocument']")
	private WebElement ViewDocumentListSel;

	@FindBy(xpath="//div[@class=\"modal-header mb-0\"]//h3[1]")
	private WebElement CaseDetails;

	@FindBy(xpath="//div[@id=\"not_upload_document_details\"]//h4[1]")
	private WebElement VisibilityOfPage;


	public void viewDocList() {
		ViewDocumentListSel.click();

	}
	public void verifyTheCase() {
		ElementUtil.eu.waitForPageLoad(driver);
		if(VisibilityOfPage.isDisplayed()) {
			System.out.println("user able to see the document list");
		}else {
			System.out.println("user *Not able to see the document list");
		}

	}

	/*****************************
	 * Shared
	 * 
	 */


	@FindBy(xpath="//button[text()='shared ']")
	private WebElement ShareSel;


	@FindBy(css="input[class='form-control arbcomm']")
	private WebElement ShareAddComment;

	@FindBy(css="button[class='btn btn-default btn-success csendbtn']")
	private WebElement ShareSendBtn; 

	@FindBy(xpath="//div[@class='chatbox']")
	private WebElement AddedComment;

	@FindBy(css="h2[id='swal2-title']")
	private WebElement MassShareD ;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement ShareOkBtn ;

	public void shareSel() {

		ShareSel.click();
	}
	public void addShareComment() throws InterruptedException {
		ShareAddComment.sendKeys("Education is the key to unlock the golden door of freedom. ...\r\n"
				+ "Lost - yesterday, somewhere between sunrise and sunset, two golden hours, each set with sixty diamond minutes. ...\r\n"
				+ "Death is the golden key that opens the palace of eternity.");

		ShareSendBtn.click();

	}
	public  void verifyShareComment() {

		if(MassShareD.isDisplayed()) {
			System.out.println("Comment added successfully ");			
		}else {
			System.out.println("fail to added comment");
		}

	}
	
	
	/*****************************
	 * Private 
	 * 
	 */
	
	@FindBy(xpath="//button[text()='Private ']")
	private WebElement PrivateSel;
	
	@FindBy(css="input[class='form-control arbcomm']")
	private WebElement PrivateInput ;
	
	@FindBy(css="button[class='btn btn-default btn-success csendbtn']")
	private WebElement PrivateSave ;
	
	@FindBy(css="h2[class='swal2-title']")
	private WebElement PComment;
	
	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement  PSave;
	
	public void privateSel() {
		PrivateSel.click();
	}
    public void addPrivate() {
    	PrivateInput.sendKeys("Positive mind churns out Golden Thoughts which not only illuminates your life path but the World as well.");
    	PrivateSave.click();
    }
}
