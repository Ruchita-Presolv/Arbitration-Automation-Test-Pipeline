package org.pages;

import org.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class ArbitratorCloseP {
	private WebDriver driver;
	ArbitratorOngoingP Arb_Ong_obj= new ArbitratorOngoingP(DriverFactory.getDriver());

	public ArbitratorCloseP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	// bulk action using filter 

	@FindBy(css="#for_general")
	private WebElement GeneralfilAct;
	public void generalFilSel() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, GeneralfilAct);
		Thread.sleep(2000);
		GeneralfilAct.click();
		Thread.sleep(2000);
	} 

	@FindBy(css="button[id='dropdownMenuButton']")
	private WebElement BulkActCloseB;


	@FindBy(css="button[id='closed_download_Docs']")
	private WebElement DownloadDocBtn;

	@FindBy(css="button[id='arbclosedawrdsheet']")
	private WebElement ExportToExcel;

	public void bulkAct() {
		BulkActCloseB.click();
	}

	public void downloadDocuments() throws InterruptedException {
		if (DownloadDocBtn.isEnabled()) {
			System.out.println("successfully download the documents ");
			DownloadDocBtn.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Fails to download the documents ");
		}
	}

	public void exportToExcel() {
		if (ExportToExcel.isEnabled()) {

			System.out.println("successfully Export the document to Excel sheet  ");
		} else {
			System.out.println("Fails to Export the document to Excel sheet  ");
		}
	}

	//Actions 

	// Upload Direction

	@FindBy(xpath="//a[@id='dropdownMenuLink']")
	private WebElement Actiontn;

	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement UploadDirection;

	@FindBy(xpath="//input[@id='docu']")
	private WebElement userSelectFile;

	@FindBy(xpath="//button[@class='btn ybigbtn']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement SuccessMass;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement DirOkBtn;


	public void actiontnClick() {
		Actiontn.click();
	}

	public void uploadDirection() throws InterruptedException {
		UploadDirection.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);
		userSelectFile.sendKeys(System.getProperty("user.dir")+"\\documents\\Important one.pdf");
		SubmitBtn.click();
	}

	public void verifySuccesMass() {
		if (SuccessMass.isDisplayed()) {
			System.out.println("SuccessFully Send the direction ");
			DirOkBtn.click();

		} else {
			System.out.println("Fails to send the direction ");
		}
	}

	//View Disclosures

	@FindBy(xpath="//button[text()='View Disclosures1']")
	private WebElement ViewDisclosureBtn;

	@FindBy(xpath="//h4[text()='Arbitrator’s Consent and Disclosures by Arbitrator One']")
	private WebElement DisclosurePageDiplay;

	@FindBy(xpath="//a[@class='btn ybigbtn']")
	private WebElement DisclosurePageBackBtn;


	public void viewDisclosure() {
		ViewDisclosureBtn.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		if (DisclosurePageDiplay.isDisplayed()) {
			System.out.println("user able to see the disclosure of perticular case id ");
			System.out.println();
			System.out.println(DisclosurePageDiplay.getText());
		} else {

			System.out.println("user fails to see the  disclosure of perticular case id");
		}

	}
	public void disclosureBackBtn() {
		if (DisclosurePageBackBtn.isEnabled()) {
			System.out.println("Back button is working ");
		} else {
			System.out.println("Back button is Not working ");
		}

	}
	
	
	// Private
	

	@FindBy(xpath="//button[@class='btn btn-primary'][text()='Private']")
	private WebElement PrivateBtn;

	
	@FindBy(xpath="//input[@class='form-control arbcomm']")
	private WebElement CommentInput;

	@FindBy(xpath="//button[@class='btn btn-default btn-success csendbtn']")
	private WebElement SaveBtn;

	@FindBy(xpath="//button[@class='close'][text()='×']")
	private WebElement PopupCloseBtn;
	
	public void privateClick(String Comment) {
		PrivateBtn.click();
		CommentInput.sendKeys(Comment);
		
	}
	public void saveClosePopUp() {
		SaveBtn.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, PopupCloseBtn, 60);
		//PopupCloseBtn.click();
	}

	//Shared
	
	@FindBy(xpath="//button[@class='btn btn-success'][text()='Shared']")
	private WebElement SharedBtn;
	
	public void shareClick(String Comment) {
		SharedBtn.click();
		CommentInput.sendKeys(Comment);
	}
	
	//=================================
	@FindBy(css="span[id^='select2--']")
	private WebElement From;

	@FindBy(xpath="//span[@class='selection']//span[text()='To']")
	private WebElement To;

	@FindBy(xpath="//textarea[@class='select2-search__field']")
	private WebElement Except;

	@FindBy(css="ul[class='select2-results__options']>li:last-child")
	private WebElement FirstCase;

	@FindBy(css="ul[class='select2-results__options']>li:nth-child(200)")
	private WebElement SecondCase;
	//ul[class='select2-results__options']>li:nth-child(10)
	@FindBy(css="ul[class='select2-results__options']>li:nth-child(10)")
	private WebElement SecondExpCase;

	
	
	public void fromToCaseClose() throws InterruptedException {
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
	
}
