package org.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class SomeBasicUsabilityOngoing {
	private WebDriver driver;

	public  SomeBasicUsabilityOngoing (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}


	/******************************
	 * Filter Based on Batch Name
	 */

	@FindBy(css="div[class='row mb-4']")
	private WebElement HederFilterDis;


	@FindBy(xpath="//span[@id='select2-batch_name_change-container']")
	private WebElement BatchNameDrop;
	//span[@id='select2-batch_name_change-container']
	//select[class='form-control filter_item'][name='batch_name_change']
	@FindBy(css="button[id='filter_search'][class=' btn btn-success fas fa-search ']")
	private WebElement  HederFilterSearch;

	@FindBy(css="tr[class='odd']>td:nth-child(3)>span:nth-child(3)")
	private WebElement GetBatchName;


	@FindBy(css="div[id='ongoing_info']")
	private WebElement NoOfCasesInBatch;

	@FindBy(css="span[class='d-block']")
	private WebElement  RowDisplayed;

	@FindBy(css="td[class='dataTables_empty']")
	private WebElement  NoRowDisplayed;

	public void hederFilter() {
		if(HederFilterDis.isDisplayed()) {
			System.out.println("user is able to see the Heder filter");
		}else {
			System.out.println("fails to see the heder filter");

		}

	}
	
	@FindBy(xpath="//li[contains(@id,'Bali_Roy_44')]")
	private WebElement  SelBName;
	public void batchSearch(String batchName) {
		BatchNameDrop.click();
		if(BatchNameDrop.isDisplayed()) {
			SelBName.click();
			//ElementUtil.eu.selectDropDownValue(driver, BatchNameDrop, batchName);
			System.out.println("Successfully selected the batch name ");
		}else {
			System.out.println("Fails to select the batch name ");

		}

	}
	public void hederFilterSearch(String BName) throws InterruptedException {
		Thread.sleep(2000);
		HederFilterSearch.click();
		Thread.sleep(2000);
		try {
			if(RowDisplayed.isDisplayed()) {
				ElementUtil.eu.waitForVisibilityByWebElement(driver, 200, GetBatchName);
				String casesBName= GetBatchName.getText();
				System.out.println("batch__"+casesBName);
				if(casesBName.contains(BName)) {
					System.out.println("The loaded cases on the page is as per our search like as the batch name we search");
					countOfCases();
				}else {
					System.out.println("batch filter Not working as per serch action inpute by user");
					//countOfCases();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void countOfCases() {
		System.out.println(" The Count of cases in this Batch : "+NoOfCasesInBatch.getText());
	}

	/******************************
	 * Filter Based on Arbitrator name
	 */

	@FindBy(css="span[id='select2-arbitrator_change-container']")
	private WebElement ArbiNameDrop;
	//span[id='select2-arbitrator_change-container']
	//select[class='form-control filter_item'][id='arbitrator_change']
	
	@FindBy(css="tr[class='odd']>td:nth-child(6)")
	private WebElement GetArbiName;

	@FindBy(css="ul[id='select2-arbitrator_change-results']>li:nth-child(2)")
	private WebElement ArbitratorOne; 
//ul[id='select2-arbitrator_change-results']>li:nth-child(2)
	//select[id='arbitrator_change']>option:nth-child(3)
	String arbSelected=null;
	public void arbitratorSel() throws InterruptedException {
		if(ArbiNameDrop.isDisplayed()) {
			//System.out.println("value "+arbName);
			ArbiNameDrop.click();
			Thread.sleep(2000);
			ArbitratorOne.click();
			//ElementUtil.eu.selectDropDownTextPresent(driver, ArbiNameDrop, arbName);
			//Thread.sleep(2000);
			System.out.println("Arbitrator name successfully selected as Arbitrator one" );
		}else {
			System.out.println("Fails to select the required arbitrator name ");
		}

	}

	public void arbSearch() throws InterruptedException {
		HederFilterSearch.click();
		Thread.sleep(2000);
		try {
			if(RowDisplayed.isDisplayed()) {
				ElementUtil.eu.waitForVisibilityByWebElement(driver, 200, GetArbiName);
				String casesArbiName = GetArbiName.getText();
				System.out.println("casesArbiName :"+casesArbiName);
				String Arbname = "Arbitrator one";
				if(Arbname!=casesArbiName) {
					System.out.println("Cases successfully loaded as per Arbitrator name");
					countOfCases();
				}else {
					System.out.println("Fails to load the cases ");
				}

			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	/******************************
	 * Filter Based on Organisation name
	 * 
	 */

	@FindBy(css="select[id='organisation_change']")
	private WebElement OrganisationDrop;

	@FindBy(css="select[id='organisation_change']>option:nth-child(4)")
	private WebElement OrgSel;

	@FindBy(css="table[id='ongoing']>tbody>tr:first-child>td:nth-child(5)>b:first-child")
	private WebElement GetOrganisationName;

	public void selOrganisation() throws InterruptedException {

		if(OrganisationDrop.isDisplayed()) {
			//System.out.println("value "+arbName);
			OrganisationDrop.click();
			Thread.sleep(2000);
			OrgSel.click();
			//ElementUtil.eu.selectDropDownTextPresent(driver, ArbiNameDrop, arbName);
			//Thread.sleep(2000);
			System.out.println("Organisation name successfully selected as Presolv360" );
		}else {
			System.out.println("Fails to select the required Organisation ");
		}

	}

	public void orgSearchFilter() throws InterruptedException {
		HederFilterSearch.click();
		Thread.sleep(2000);

		try {
			if(RowDisplayed.isDisplayed()) {
				ElementUtil.eu.waitForVisibilityByWebElement(driver, 200, GetOrganisationName);
				String OrganisationName = GetOrganisationName.getText();
				System.out.println("casesArbiName :"+OrganisationName);
				String orgName = "Bombay Blokes Respondent";
				if(orgName.equalsIgnoreCase (OrganisationName)) {
					System.out.println("Cases successfully loaded as per Organisation name");
					countOfCases();
				}else {
					System.out.println("Fails to load the cases ");
				}

			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	/******************************
	 * Filter Based on Date 
	 * @throws InterruptedException 
	 * 
	 */

	@FindBy(xpath="//input[@class='form-control filter_item'][@id='from_date']")
	private WebElement FromDate;

	@FindBy (xpath="//input[@class='form-control filter_item'][@id='to_date']")
	private WebElement ToDate;

	@FindBy(xpath="//tr[@class='odd']//td[4]") 
	private WebElement CaseDate;

	@FindBy(xpath="//tr[@class=\"odd\"]") 
	private WebElement CaseDisplay;

	@FindBy(xpath="//td[@class='dataTables_empty']") 
	private WebElement NoCase; 

	public void setDate(String d1, String d2) throws InterruptedException {
		FromDate.sendKeys(d1);
		Thread.sleep(2000);
		ToDate.sendKeys(d2);
		HederFilterSearch.click();	
		Thread.sleep(2000);
	}

	public void caseLoadedDate() {
		try{
			if(CaseDisplay.isDisplayed()) {
				String date= CaseDate.getText();
				System.out.println("date of loaded case on page as : "+date);
				System.out.println("Cases loaded successfully");
			}
		}catch(Exception e) {

			e.printStackTrace();
			System.out.println("No cases present for this date range entered ");
		}
	}	

	/******************************
	 * Search for case id and Refresh btn
	 * 
	 */

	@FindBy(xpath="//div[@class='card-block']")
	private WebElement CaseTable;

	@FindBy(xpath="(//a[contains(@href,'/admin/arbitrator/casedetails?id')])[4]")
	private WebElement AnyCaseId;


	@FindBy(xpath="(//a[contains(@href,'/admin/arbitrator/casedetails?id')])[1]")
	private WebElement CaseIdToSearch;

	@FindBy(xpath="//div[@id='ongoing_filter']//label[3]")
	private WebElement SearchInput;
	//div[@id='ongoing_filter']//label[3]
	//input[@class='form-control form-control-sm']
	
	@FindBy(xpath="//button[@class=' btn btn-success fas fa-search']")
	private WebElement SearchBtn;

	@FindBy(xpath="//button[@class='btn btn-primary fa fa-refresh']")
	private WebElement RefreshBtn;

	@FindBy(xpath="//a[contains(@href,'/admin/arbitrator/casedetails?id')]")
	private WebElement CaseIdAfterSearch;

	@FindBy(xpath="//div[@class='dataTables_info']")
	private WebElement CaseCount;

	public void caseTable() {
		CaseTable.isDisplayed();
		System.out.println("Case table loaded properly");
	}

	public void searchCaseId() throws InterruptedException {
		Thread.sleep(2000);
		String anyCaseid =AnyCaseId.getText();
		System.out.println("anyCaseid : "+anyCaseid);

		String caseidSerch= CaseIdToSearch.getText();
		System.out.println("caseidSerch : "+caseidSerch);

		SearchInput.sendKeys(caseidSerch);
		ElementUtil.eu.waitForElementToBeClickable(driver, SearchBtn, 400); 
		Thread.sleep(2000);
	}
	public void compareCaseid() {
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 400, CaseIdAfterSearch);

		ElementUtil.eu.waitForPageLoad(driver);
		String CaseIdAfterSea= CaseIdAfterSearch.getText();
		System.out.println("After CaseIdAfterSearch : "+CaseIdAfterSea);
		if(CaseIdAfterSearch.isDisplayed()) {
			System.out.println("search filter work for required caseId");
			ElementUtil.eu.scrollByJS(driver, CaseCount);
			System.out.println("Case count : "+CaseCount.getText());
		}else {
			System.out.println("Fails to load case as per search");
		}
	}
	public void refreshBtn() {
		RefreshBtn.click();
		if(AnyCaseId.isDisplayed()) {
			System.out.println("AnyCaseId : "+AnyCaseId.getText());
			System.out.println("The Refresh button works properly");
		}else {
			System.out.println("Refresh btn won't work");
		}
	}

	/******************************
	 * Search No of cases and next btn
	 * 
	 */
	@FindBy(xpath="//select[@class='form-control form-control-sm']")
	private WebElement CaseDropDown;

	public void loadNoOfCases(String case25,String case500,String case100) throws InterruptedException {
		casesPerPage(case25, CaseCount);
		casesPerPage(case500, CaseCount);
		casesPerPage(case100, CaseCount);
	}
	public void casesPerPage(String value,WebElement CaseCount) {
		ElementUtil.eu.selectDropDownValue(driver, CaseDropDown, value);
		ElementUtil.eu.waitForPageLoad(driver);
		ElementUtil.eu.scrollByJS(driver, CaseCount);
		System.out.println("No of cases per page is : "+CaseCount.getText()+" : "+value);
		caseComparision(value, CaseCount);
		ElementUtil.eu.pageRefresh(driver, 2);

	}

	public void caseComparision(String num,WebElement ele) {
		if(ele.getText().contains(num)) {
			System.out.println("Case loaded on the page as per the value select :" +num);

		}else {
			System.out.println("Fail to load cases as per value select");

		}

	}
	/******************************
	 * Search No of cases and next btn
	 * @throws InterruptedException 
	 * 
	 */

	@FindBy(css="li[class='paginate_button page-item previous disabled']>a")
	private WebElement PreviousBtn;

	@FindBy(css="li[class='paginate_button page-item ']>a")
	private WebElement Page2;

	@FindBy(css="li[class='paginate_button page-item next']>a")
	private WebElement NextBtn;

	@FindBy(css="li[class='paginate_button page-item previous disabled']")
	private WebElement Pagechange ;


	public void changePage() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, Pagechange);
		Thread.sleep(2000);
		Page2.click();
		String Case1 = AnyCaseId.getText();
		ElementUtil.eu.waitForPageLoad(driver);
		NextBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		String Case2 = AnyCaseId.getText();
		//PreviousBtn.click();

		System.out.println("Case1: "+Case1+" Case2 : "+Case2);
		if(Case1!=Case2) {
			System.out.println("page successfully change ");
		}else {
			System.out.println("Fails to change the page ");
		}
	}

	/******************************
	 * Case status change 
	 * @throws InterruptedException 
	 * 
	 */

	@FindBy(css="input[class='singlecs check_mark']")
	private WebElement CaseCheckBox; 

	@FindBy(css="span[class='slider round']")
	private WebElement StatusBtn;

	@FindBy(css="div[class='swal2-content']")
	private WebElement SuccessStatus;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement OkBtn;

	@FindBy(css="h2[id='swal2-title']")
	private WebElement AlertDisplay;

	@FindBy(css="div[class='swal2-buttonswrapper']>button:first-child")
	private WebElement ConfirmAlertBtn;

	@FindBy(css="div[class='swal2-buttonswrapper']>button:last-child")
	private WebElement NoAlertBtn;

	@FindBy(xpath="//a[text()='Upload Additional Doc']")
	private WebElement UploadAdditionalDoc;

	public void updateStatus() {
		StatusBtn.click();
		System.out.println("Case id :- "+CaseIdToSearch.getText());

		if(SuccessStatus.isDisplayed()) {
			System.out.print("========");
			System.out.println("Status:- "+SuccessStatus.getText()+"=================");
			OkBtn.click();
		}else {
			System.out.println("fails to pause case ");
		}
	}
	public void checkStatus() {
		ElementUtil.eu.waitForPageLoad(driver);
		CaseCheckBox.click();
		ElementUtil.eu.waitForPageLoad(driver);
		UploadAdditionalDoc.click();
		System.out.println(AlertDisplay.getText());
	}
	public void alertVerify() {
		try {
			if(AlertDisplay.isDisplayed()) {
				System.out.println("===Alert is visible paused by an Administrator, no further action can be taken.");
				NoAlertBtn.click();
				Thread.sleep(2000);
				StatusBtn.click();
				System.out.print("========");
				System.out.print("Again make case status as Active  ");
				System.out.println("=================");
			}else {
				System.out.println("Fails to load Alerts ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//====================Withdraw===========================

	public void withdrawPauseCase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='dropdown']")).click();
		ElementUtil.eu.waitForPageLoad(driver);
		driver.findElement(By.cssSelector("button[class='btn btn-danger label-success']")).click();
		try {
			if(AlertDisplay.isDisplayed()) {
				System.out.println("===Alert is visible paused by an Administrator, no further action can be taken.");
			}else {
				System.out.println("Fails to load Alerts ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//=============Uploade additional doc==========

	@FindBy(css="input[id='fileInput'][name='adoc']")
	private WebElement AdditionalDocUp; 

	@FindBy(css="input[class='p-2 btn btn-primary blkupdadocc1']")
	private WebElement SubmitDocUp;

	@FindBy(css="div[id='messd']")
	private WebElement SuccesAddMessage; 

	@FindBy(css="a[class='btn btn-danger btn-lg']")
	private WebElement CloseAdditionalDoc; 

	@FindBy(css="h2[id='swal2-title']")
	private WebElement AlertMassage;

	public void alertConfirm(String expMess) {
		ElementUtil.eu.waitForPageLoad(driver);
		String actmess= AlertMassage.getText();
		if(expMess.equals(actmess)){
			System.out.println("Alert is displayed ");
			ConfirmAlertBtn.click();
		}else {
			System.out.println("Fails to load alert");
		}
	}
	public void uploadAdditionalDoc() {
		AdditionalDocUp.sendKeys(System.getProperty("user.dir")+"\\documents\\Important one.pdf");
		SubmitDocUp.click();
		if(SuccesAddMessage.isDisplayed()) {
			System.out.println("file added successfully");
			CloseAdditionalDoc.click();
			ElementUtil.eu.waitForPageLoad(driver);
			checkStatus();
			ElementUtil.eu.waitForPageLoad(driver);
			alertVerify();	
		}else {
			System.out.println("fails to add file ");
		}
	}

	//+++++++Changes in Additional Documents ==============
	@FindBy(xpath="(//input[@id='fileInput' and @name='adoc'])[2]")
	private WebElement  UploadAdditonalDoc;

	@FindBy(xpath="(//textarea[@class='form-control description'])[2]")
	private WebElement Description;

	@FindBy(xpath="(//select[@class='form-control'])[3]/option")
	private List <WebElement> ModeOfommunication;

	@FindBy(xpath="//input[@class='p-2 btn btn-primary ']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//div[@id='mess_add']")
	private WebElement SuccessMass;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement Closebtn;



	public void pUploadDoc() throws InterruptedException {
		ElementUtil.eu.waitForPageLoad(driver);
		UploadAdditionalDoc.click();
		Thread.sleep(2000);
		//UploadAdditonalDoc.click();
		UploadAdditonalDoc.sendKeys(System.getProperty("user.dir")+"\\documents\\Important one.pdf");
	}

	public void discriptionAdd(String reply) throws InterruptedException {
		Description.sendKeys(reply);
		Thread.sleep(2000);
	}
	public void modeOfCommunicatio() {
		for (WebElement webElement : ModeOfommunication) {
			if (webElement.isEnabled()) {
				System.out.println(webElement.getText());
			}
		}
		ElementUtil.eu.scrollByJS(driver, SubmitBtn);
		SubmitBtn.click();

	}
	public void verifySuccessMass() throws InterruptedException {
		Thread.sleep(2000);
		if (SuccessMass.isDisplayed()) {
			Closebtn.click();
			System.out.println("Successfully uploaded the docu");
		} else {
			System.out.println("Fails to upload the document");
		}

	}


	//===================Action Butten and All Inside Action usability ============

	@FindBy(css="input[class='singlecs check_mark'][data-sprintid='A003852']")
	private WebElement CaseidA003852;


	@FindBy(xpath="//button[text()='Update Refrence ID']")
	private WebElement UpdateRefIdBtn;

	@FindBy(xpath="//button[normalize-space()='Arbitrator Log']")
	private WebElement ArbitratorLogBtn;

	@FindBy(xpath="//button[normalize-space()='Edit Party Details']")
	private WebElement EditPartyDetailsBtn;


	@FindBy(xpath="//button[normalize-space()='Assign']")
	private WebElement AssignBtn;

	@FindBy(xpath="//button[normalize-space()='Evidence Binder']")
	private WebElement EvidenceBinderBtn;

	@FindBy(xpath="//button[normalize-space()='Add Lawyer']")
	private WebElement AddLawyerBtn;

	@FindBy(xpath="//button[normalize-space()='Withdraw']")
	private WebElement WithdrawBtn;

	@FindBy(xpath="//button[normalize-space()='Upload SOD']")
	private WebElement UploadSODBtn;

	@FindBy(xpath="//button[normalize-space()='Diary']")
	private WebElement DiaryBtn;

	@FindBy(xpath="//button[normalize-space()='Private']")
	private WebElement PrivateBtn;

	@FindBy(xpath="//button[normalize-space()='shared']")
	private WebElement sharedBtn;

	@FindBy(xpath="//button[normalize-space()='Claim Summary']")
	private WebElement ClaimSummaryBtn;

	@FindBy(xpath="//button[normalize-space()='View Document List']")
	private WebElement ViewDocumentListBtn;

	@FindBy(xpath="//button[normalize-space()='Upload Party Reply']")
	private WebElement UploadPartyReplyBtn;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//a")
	private List<WebElement> TotalActionBtn; 

	@FindBy(xpath="//input[@class='selarbcaseall']")
	private WebElement selarbcaseallCheckBox;

	@FindBy(xpath="//button[@class='btn btn-secondary px-3 py-1 dropdown-toggle']")
	private WebElement ActionBtn;
	//
	//
	//@FindBy(xpath="")
	//private WebElement 

	public void actionBtn(String caseid) throws InterruptedException {
		SearchInput.sendKeys(caseid);
		SearchBtn.click();
		Thread.sleep(4000);
		ActionBtn.click();
		System.out.println("Total Actions : "+TotalActionBtn.size());

	}
	public void actionEnability() {
		for (WebElement button : TotalActionBtn) {
			if (button.isEnabled()) {
				System.out.println("Button is enabled: " + button.getText());
			} else {
				System.out.println("Button is disabled: " + button.getText());
			}
		}
	}

	public void selectAll() throws InterruptedException {
		ElementUtil.eu.clickByOffset(driver, RefreshBtn);
		RefreshBtn.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForPageLoad(driver);
		if(selarbcaseallCheckBox.isEnabled()) {
			selarbcaseallCheckBox.click();
			System.out.println("able to select all cases");		
		}else {
			System.out.println("Fails  to select all cases");		
		}
	}

	//=========================download consent=============================

	@FindBy(xpath="//a[normalize-space()='Arbitrator One']")
	private WebElement ArbitratorBtn;

	@FindBy(xpath="//h4[contains(text(),'Disclosure')]")
	private WebElement  DisclosurePage;

	@FindBy(xpath="//span[@class=' btn btn-sucess btn-xs']")
	private WebElement  ConsentDownload;

	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement DisclosureClose;

	public void downloadConsent() throws InterruptedException {

		try {
			ArbitratorBtn.click();
			Thread.sleep(2000);
			if(DisclosurePage.isDisplayed()) {
				if(ConsentDownload.isEnabled()) {
					System.out.println("==> Consent pdf option is clickable ");
					System.out.println("*Able to download Consent");		
					DisclosureClose.click();
				}else {
					System.out.println("*Fail to download Consent");
				}

			}else {
				System.out.println("*the popup not visible  ");
			}
		}catch(Exception e) {
			System.out.println("***Case not approved by Arbitrator ");
			// e.printStackTrace();
		}

	}



	//===================BulkActionOptions=================================

	@FindBy(css="input[id='for_random']")
	private WebElement RandomBtn;

	@FindBy(css="input[id='for_general']")
	private WebElement GeneralBtn;

	@FindBy(css="button[class='btn btn-secondary py-2 px-3 dropdown-toggle']")
	private WebElement BulkActionBtn;

	@FindBy(css="div[class='dropdown-menu show']>button")
	private List <WebElement> OptionsBulkAction;

	public void selectAllCases()
	{
		ElementUtil.eu.scrollByJS(driver, selarbcaseallCheckBox);
		//selarbcaseallCheckBox.click();
	}
	public void bulkAction() throws InterruptedException {
		System.out.println("Random Filter");
		filterSel(RandomBtn);
		Thread.sleep(2000);
		System.out.println("General Filter");
		filterSel(GeneralBtn);
	}
	public void filterSel(WebElement filName) {
		filName.click();
		ElementUtil.eu.waitForPageLoad(driver);
		BulkActionBtn.click();
		getAllActions(OptionsBulkAction);
	}
	public void getAllActions(List<WebElement> optionsBulkAction) {
		System.out.println("No. of Actions:- " +optionsBulkAction.size());
		for (WebElement button : optionsBulkAction) {
			if (button.isEnabled()) {
				System.out.println("Button is enabled: " + button.getText());
			} else {
				System.out.println("Button is disabled: " + button.getText());
			}

		}

	}

	//===================BulkActionOptions=================================

	@FindBy(css="button[class='btn btn-secondary py-2 px-3']")
	private WebElement BulkUpload;

	@FindBy(css="select[id='Schedule_type']")
	private WebElement SheduleType;

	@FindBy(css="div[class='col-md-12 mb-3']>div")
	private List<WebElement> BulkUploadOptions;

	public void bulkupload() throws InterruptedException {
		BulkUpload.click();
		ElementUtil.eu.waitForPageLoad(driver);
		System.out.println("Shedule working :- "+SheduleType.isEnabled());
		Thread.sleep(2000);
		getAllActions(BulkUploadOptions);
	}


}


