package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class UserUsability {
	private WebDriver driver; 

	public UserUsability(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this );
	}


	@FindBy(xpath="(//span[@class='lbl'][text()='Arbitration360'])[2]")
	private WebElement Arbitration360;

	@FindBy(xpath="//span[@class='lbl'][text()='For Admin Review']")
	private WebElement ForAdminReview;

	@FindBy(xpath=" (//span[normalize-space()='For Admin Review'])[2]")
	private WebElement ForadminPTitle;

	@FindBy(xpath="//span[@class='lbl'][text()='Ongoing']")
	private WebElement Ongoing;


	@FindBy(xpath="//span[@class='nav-link-in'][normalize-space()='Ongoing']")
	private WebElement OngoingPTitle;

	@FindBy(xpath="//span[@class='lbl'][text()='Closed']")
	private WebElement closed;

	@FindBy(xpath="//span[@class='nav-link-in'][normalize-space()='closed']") 
	private WebElement ClosedPTitle;

	public void arbitration360btn() throws InterruptedException {
		//Thread.sleep(2000);
		//Arbitration360.click();
		ElementUtil.eu.waitForPageLoad(driver);
	}
	public void arb360Btn() throws InterruptedException {
		Arbitration360.click();
		Thread.sleep(2000);
		
		ElementUtil.eu.waitForPageLoad(driver);

	}


	public void forAddminReview(String ptitle) {
		Arbitration360.click();
		ForAdminReview.click();
		if (ForadminPTitle.isDisplayed()) {
			System.out.println("page loaded successfully: "+ForadminPTitle.getText());			
		} else {
			System.out.println("Fails to load the page ForAddmin Review page");
		}

	}

	public void ongoing(String ptitle) {
		//Arbitration360.click();
		Ongoing.click();
		if (OngoingPTitle.isDisplayed()) {

			System.out.println("page loaded successfully: "+OngoingPTitle.getText());
		} else {
			System.out.println("Fails to load the page OngoingPage ");
		}
	}

	public void closed(String ptitle) {
		//Arbitration360.click();
		closed.click();
		if (ClosedPTitle.isDisplayed()) {

			System.out.println("page loaded successfully: "+ClosedPTitle.getText());
		} else {
			System.out.println("Fails to load the page ClosedPage");
		}
	}





	@FindBy(xpath="//span[@class='lbl'][text()='Share files']")
	private WebElement ShareFilebtn;

	@FindBy(xpath="//h4[text()='Share file']")
	private WebElement PageTitle;

	@FindBy(xpath="//input[@id='fileInput']")
	private WebElement FileInput;

	@FindBy(xpath="//button[@class='btn ybigbtn']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement SuccessStatus;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OkFile;

	/*
	 * @FindBy(xpath="") private WebElement
	 */
	public  void shareFile() {
		ElementUtil.eu.clickByJS(driver, ShareFilebtn);
		//ShareFilebtn.click() ;
	}
	public void pagetitle(String title) {
		ElementUtil.eu.switchToNewSingleWindow(driver);
		if (PageTitle.isDisplayed()) {
			System.out.println("Page loaded successfully "+PageTitle.getText());

		} else {
			System.out.println("Fails to load the page");
		} 
	}
	public void fileUploade() {
		FileInput.sendKeys(System.getProperty("user.dir")+"//documents//AdditionalDocument.zip");
		SubmitBtn.click();
		if (SuccessStatus.isDisplayed()) {
			System.out.println("file uploaded Successfully");
			OkFile.click();
		} else {
			System.out.println("Fails to upload file");
		}
	}


	//download excel Sheet

	@FindBy(xpath="//input[@id='selectallapp']")
	private WebElement SelectCheckBox;

	@FindBy(xpath="//button[@id='downloaddata']")
	private WebElement DownloadBtn;

	public void forAdminReview() throws InterruptedException {
		//Thread.sleep(2000);
		//Arbitration360.click();
		Thread.sleep(2000);
		ForAdminReview.click();

	}
	public void downloadExcelSheet() {
		ElementUtil.eu.scrollByJS(driver, SelectCheckBox);
		SelectCheckBox.click();
		if (DownloadBtn.isEnabled()) {
			System.out.println("Successfully download the excel sheet");

		} else {
			System.out.println("Fails to download the excel sheet");
		}

	}


	//update ref id 

	@FindBy(xpath="//a[text()='Update Reference Id']")
	private WebElement updateRefId;

	@FindBy(xpath="//textarea[@id='editref']")
	private WebElement AddNewRefId;

	@FindBy(xpath="//input[@value='Submit']")
	private WebElement SumitRef;

	public void clickOnRefId() {
		updateRefId.click();
	}

	public void updateRefId(String refId) {
		AddNewRefId.sendKeys(refId);
		SumitRef.click();
		System.out.println("Successfully update the ref id");
	}


	// single Case 

	@FindBy(xpath="//span[normalize-space()='Single Case']")
	private WebElement SingleCaseBtn ;


	@FindBy(xpath="//h3[normalize-space()='Case Registration']")
	private WebElement CaseRegPage ;

	@FindBy(xpath="//select[@id='Cat']//optgroup//option")
	private List <WebElement> TypeOfDisput ;

	@FindBy(xpath="//select[@id='Damount']//optgroup//option")
	private List <WebElement> DisputedAmount  ;

	@FindBy(xpath="//button[@id='arb_submit1']")
	private WebElement InvokeArbitrationBtn  ;

	//	@FindBy(xpath="")
	//	private WebElement  ;

	public void singleCaseBtn() throws InterruptedException {
		SingleCaseBtn.click();
		Thread.sleep(20000);
		if (CaseRegPage.isDisplayed()) {
			System.out.println("Case Registration page loaded successfully");
		} else {
			System.out.println("Fail to load Case Registration page ");
		}

	}

	public void typeOfDispute() {
		for (WebElement Disputetype : TypeOfDisput) {
			if (Disputetype.isEnabled()) {
				//System.out.println(Disputetype.getText());	
			} 
		}
		System.out.println("Any dispute type is selectable ");
	}

	public void amountOfDispute() {
		for (WebElement Amount : DisputedAmount) {
			Amount.isEnabled();
		}
		System.out.println("Any Amount type is selectable ");
	}

	public void invokeArbitration() {

		InvokeArbitrationBtn.click();


	}

	// Single case Registration 	

	@FindBy(xpath="//select[@id='Cat']")
	private WebElement TypeDis ;

	@FindBy(xpath="//select[@id='Damount']")
	private WebElement AmountRs ;

	@FindBy(xpath="//button[@id='arb_submit1']")
	private WebElement InvokeBtn  ;

	@FindBy(xpath="//h4[normalize-space()='Invoke Arbitration']")
	private WebElement PageT ;


	@FindBy(xpath="//input[@id='user2name']")
	private WebElement FullName ;

	@FindBy(xpath="//input[@id='user2email']")
	private WebElement Emailid ;

	@FindBy(xpath="//input[@id='user2contact']")
	private WebElement PhoneNo ;

	@FindBy(xpath="//input[@id='user2add1']")
	private WebElement AddressLine1 ;

	@FindBy(xpath="//input[@id='user2add2']")
	private WebElement AddressLine2 ;

	@FindBy(xpath="//input[@id='user2city']")
	private WebElement City ;

	@FindBy(xpath="//input[@id='user2pincode']")
	private WebElement PinCode ;

	@FindBy(xpath="//input[@id='user2state']")
	private WebElement State ;

	@FindBy(xpath="//input[@id='user2country']")
	private WebElement Country ;

	@FindBy(xpath="//input[@id='natureofagree']")
	private WebElement NatureOfAggrement ;

	@FindBy(xpath="//input[@id='arbiclause']")
	private WebElement  ArbitrationClauseNo;

	@FindBy(xpath="//input[@id='refId']")
	private WebElement  RefId;

	@FindBy(xpath="//input[@id='agreement']")
	private WebElement AggrementFile ;

	@FindBy(xpath="//textarea[@id='brief']")
	private WebElement BriefDescription ;

	@FindBy(xpath="//textarea[@id='sought']")
	private WebElement ReliefOrRemedySought ;

	@FindBy(xpath="(//div[@class='myTest custom-control custom-checkbox']/input)[1]")
	private WebElement FirstCheckBox ;

	@FindBy(xpath="(//div[@class='myTest custom-control custom-checkbox']/input)[2]")
	private WebElement  SecondCheckBox ;

	@FindBy(xpath="//button[@id='invoke']")
	private WebElement SubmitBtnInvo ;


	public void disputeType(String Dtype, String Amount) throws InterruptedException {
		Thread.sleep(1000);
		TypeDis.click();
		ElementUtil.eu.selectDropDownTextPresent(driver, TypeDis, Dtype);	
		Thread.sleep(1000);
		AmountRs.click();
		ElementUtil.eu.selectDropDownTextPresent(driver, AmountRs, Amount);	

	}

	public void invokeArbitration1() throws InterruptedException {
		InvokeBtn.click();
		Thread.sleep(2000);
	}

	public void pageTitle(String Title) {
		if (PageT.equals(Title)) {
			System.out.println("Form Successfully Loaded");
		} else {
			System.out.println("Fails to load the Form");
		}
	}
	public void respondentDetails(String FName,String EId, String PNo)  {
		FullName.sendKeys(FName);
		Emailid.sendKeys(EId);
		PhoneNo.sendKeys(PNo);

	}

	public void addressRespondent (String Ad1,String city, String Pin, String State1, String Country1) throws InterruptedException  {

		Thread.sleep(2000);
		AddressLine1.sendKeys(Ad1);
		City.sendKeys(city);
		PinCode.sendKeys(Pin);
		Thread.sleep(2000);
		State.sendKeys(State1);
		Country.sendKeys(Country1);
		Thread.sleep(2000);


	}

	public void aggrementType(String NatureAgg, String Clause1, String Refid1) {
		NatureOfAggrement.sendKeys(NatureAgg);
		ArbitrationClauseNo.sendKeys(Clause1);
		RefId.sendKeys(Refid1);

	}
	public void aggrementPdfUp() throws InterruptedException {

		AggrementFile.sendKeys(System.getProperty("user.dir")+"//documents//Dispatch_Proof (2).pdf");
		Thread.sleep(2000);
	}
	public void briefDis(String brief) {
		BriefDescription.sendKeys(brief);
	}

	public void relief(String relief) throws InterruptedException {

		ReliefOrRemedySought.sendKeys(relief);	
		Thread.sleep(2000);
	}
	public void checkedAndSubmit() throws InterruptedException {

		ElementUtil.eu.scrollByJS(driver, SubmitBtnInvo);
		Thread.sleep(2000);
		ElementUtil.eu.clickByJS(driver, FirstCheckBox);
		//FirstCheckBox.click();
		ElementUtil.eu.clickByJS(driver, SecondCheckBox);
		//SecondCheckBox.click();
		Thread.sleep(2000);
		SubmitBtnInvo.click();
	}


}
